package id.ac.amikom.appmanga.ui.auth

import android.content.Context
import id.ac.amikom.appmanga.data.model.ActionState
import id.ac.amikom.appmanga.data.repository.AuthRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object AppmangaAuth {

    fun logout(context: Context, callback: ((ActionState<Boolean>)-> Unit)? = null){
        val repo = AuthRepository(context)
        CoroutineScope(Dispatchers.IO).launch{
            val resp = repo.logout()
            withContext(Dispatchers.Main){
                if(callback != null) callback.invoke(resp)
            }
        }
    }
}