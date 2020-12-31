package id.ac.amikom.appmanga.data.model

data class NewsList(
        val data: List<News> = arrayListOf(),
        val status: String = ""
)
