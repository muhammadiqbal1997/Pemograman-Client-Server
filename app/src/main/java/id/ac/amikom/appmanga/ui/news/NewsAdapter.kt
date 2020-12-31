package id.ac.amikom.appmanga.ui.news

import android.content.Context
import android.content.Intent
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import id.ac.amikom.appmanga.R
import id.ac.amikom.appmanga.data.model.News
import id.ac.amikom.appmanga.databinding.ItemNewsBinding
import id.ac.amikom.appmanga.ui.base.BaseAdpater


class NewsAdapter(val context: Context) : BaseAdpater<News>(R.layout.item_news) {
    override fun onBind(binding: ViewDataBinding?, data: News) {
        val mBinding = binding as ItemNewsBinding
        Glide.with(context).load(data.logos).into(mBinding.itemPoster)
    }

    override fun onCLick(binding: ViewDataBinding?, data: News) {
        val intent = Intent(context, NewsActivity::class.java)
        intent.putExtra(NewsActivity.OPEN_NEWS, data)
        context.startActivity(intent)

    }
}