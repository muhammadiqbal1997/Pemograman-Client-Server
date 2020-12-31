package id.ac.amikom.appmanga.data.repository

import id.ac.amikom.appmanga.data.model.ActionState
import id.ac.amikom.appmanga.data.model.News
import id.ac.amikom.appmanga.data.remote.NewsService
import id.ac.amikom.appmanga.data.remote.RetrofitApi
import retrofit2.await
import java.lang.Exception

class NewsRepository {
    private val newsService: NewsService by lazy { RetrofitApi.newsService() }

    suspend fun listNews() : ActionState<List<News>>{
        return try {
            val list = newsService.listNews().await()
            ActionState(list.data)
        } catch (e: Exception) {
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun detailNews(url: String) : ActionState<News>{
        return try {
            val list = newsService.detailNews(url).await()
            ActionState(list.data.first())
        } catch (e: Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }
}