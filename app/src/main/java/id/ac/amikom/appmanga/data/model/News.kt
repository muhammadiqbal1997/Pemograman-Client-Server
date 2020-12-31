package id.ac.amikom.appmanga.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class News(
        val id: String = "",
        val name: String = "",
        val slug: String = "",
        val abbr: String = "",
        val logos: String = "",
        val light: String = "",
        val dark: String = ""
) : Parcelable
