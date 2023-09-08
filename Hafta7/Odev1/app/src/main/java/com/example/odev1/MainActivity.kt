package com.example.odev1

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.LayoutInflater
import android.view.Menu
import android.widget.EditText
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odev1.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    private lateinit var binding: ActivityMainBinding

    private lateinit var adapter: NoteAdapter
    private lateinit var refNotes: DatabaseReference
    private lateinit var noteList: ArrayList<NoteModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            toolbar.title = "Note App"
            val textColor = ContextCompat.getColor(this@MainActivity, R.color.white)
            toolbar.setTitleTextColor(textColor)
            setSupportActionBar(toolbar)
        }

        val db = FirebaseDatabase.getInstance()
        refNotes = db.getReference("notes")

        noteList = ArrayList()

        binding.rv.setHasFixedSize(true)
        binding.rv.layoutManager = LinearLayoutManager(this)
        adapter = NoteAdapter(this, noteList, refNotes)

        binding.rv.adapter = adapter
        getAllNotes()

        binding.fab.setOnClickListener {
            alertShow()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        val item = menu?.findItem(R.id.action_search)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onQueryTextSubmit(p0: String): Boolean {
        search(p0)
        return true
    }

    override fun onQueryTextChange(p0: String): Boolean {
        search(p0)
        return true
    }

    fun search(searchedWord: String) {

        refNotes.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                noteList.clear()

                for (c in snapshot.children) {
                    val note = c.getValue(NoteModel::class.java)

                    if (note != null) {
                        if (note.note_header!!.contains(searchedWord)) {
                            note.note_id = c.key
                            noteList.add(note)
                        }
                    }
                }
                adapter.notifyDataSetChanged()

            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }
        })
    }

    fun getAllNotes() {
        refNotes.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                noteList.clear()

                for (c in snapshot.children) {
                    val note = c.getValue(NoteModel::class.java)

                    if (note != null) {
                        note.note_id = c.key
                        noteList.add(note)
                    }
                }
                adapter.notifyDataSetChanged()

            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
    }

    fun alertShow() {
        val design = LayoutInflater.from(this).inflate(R.layout.alert_design, null)
        val editTextNoteHeader = design.findViewById(R.id.editTextNoteHeader) as EditText
        val editTextNoteDeatil = design.findViewById(R.id.editTextNoteDetail) as EditText

        val name = AlertDialog.Builder(this)
        name.setTitle("Note Add")
        name.setView(design)
        name.setPositiveButton("Add") { dialogInterface, i ->

            val noteHeader = editTextNoteHeader.text.toString().trim()
            val noteDeatil = editTextNoteDeatil.text.toString().trim()

            val noteModel = NoteModel("", noteHeader, noteDeatil)
            refNotes.push().setValue(noteModel)
        }
        name.setNegativeButton("Cancel") { dialogInterface, i ->

        }
        name.create().show()
    }


}