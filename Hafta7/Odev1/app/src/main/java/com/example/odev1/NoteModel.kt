package com.example.odev1

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class NoteModel(
    var note_id: String? = "",
    val note_header: String? = "",
    val note_detail: String? = ""
) {


}