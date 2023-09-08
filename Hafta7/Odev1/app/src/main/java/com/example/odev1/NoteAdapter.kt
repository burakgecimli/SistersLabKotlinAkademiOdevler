package com.example.odev1

import android.app.AlertDialog
import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText
import android.widget.PopupMenu

import androidx.recyclerview.widget.RecyclerView
import com.example.odev1.databinding.NoteCardBinding
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.database.DatabaseReference


class NoteAdapter(
    private val mContext: Context,
    private val noteList: List<NoteModel>,
    private val refNotes: DatabaseReference
) :
    RecyclerView.Adapter<NoteAdapter.NoteCardViewHolder>() {


    class NoteCardViewHolder(val binding: NoteCardBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteCardViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = NoteCardBinding.inflate(layoutInflater, parent, false)
        return NoteCardViewHolder(binding)
    }

    override fun getItemCount() = noteList.size


    override fun onBindViewHolder(holder: NoteCardViewHolder, position: Int) {
        val note = noteList[position]
        holder.binding.textViewHeader.text = note.note_header
        holder.binding.textViewDetail.text = note.note_detail

        val color: Array<Int> = arrayOf(
            Color.CYAN,
            Color.GREEN,
            Color.MAGENTA,
            Color.YELLOW,
            Color.RED,
            Color.TRANSPARENT
        )
        holder.binding.cardview.setBackgroundColor(color[position % 8])


        holder.binding.imageViewDot.setOnClickListener {
            val popUpMenu = PopupMenu(mContext, holder.binding.imageViewDot)
            popUpMenu.menuInflater.inflate(R.menu.popup_menu, popUpMenu.menu)

            popUpMenu.setOnMenuItemClickListener { menuItem ->

                when (menuItem.itemId) {

                    R.id.item_delete -> {
                        Snackbar.make(
                            holder.binding.imageViewDot, "Are you sure you want to delete \"${note.note_header}\"",

                            Snackbar.LENGTH_LONG
                        )
                            .setAction("Yes") {
                                refNotes.child(note.note_id!!).removeValue()
                            }.show()
                        true
                    }

                    R.id.item_update -> {
                        alertShow(note)
                        true
                    }

                    else -> false

                }
            }

            popUpMenu.show()
        }
    }

    fun alertShow(noteModel: NoteModel) {
        val design = LayoutInflater.from(mContext).inflate(R.layout.alert_design, null)

        val editTextNoteHeader = design.findViewById(R.id.editTextNoteHeader) as EditText
        val editTextNoteDeatil = design.findViewById(R.id.editTextNoteDetail) as EditText

        editTextNoteHeader.setText(noteModel.note_header)
        editTextNoteDeatil.setText(noteModel.note_detail)

        val name = AlertDialog.Builder(mContext)
        name.setTitle("Note Uptade")
        name.setView(design)
        name.setPositiveButton("Uptade") { dialogInterface, i ->

            val noteHeader = editTextNoteHeader.text.toString().trim()
            val noteDeatil = editTextNoteDeatil.text.toString().trim()

            val noteInfo = HashMap<String, Any>()
            noteInfo.put("note_header", noteHeader)
            noteInfo.put("note_detail", noteDeatil)

            refNotes.child(noteModel.note_id!!).updateChildren(noteInfo)
        }

        name.setNegativeButton("Cancel") { dialogInterface, i ->
        }
        name.create().show()
    }


}
