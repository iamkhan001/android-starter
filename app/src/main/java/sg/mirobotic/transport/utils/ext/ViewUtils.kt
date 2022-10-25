package sg.mirobotic.transport.utils.ext

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import sg.mirobotic.transport.R


fun View.show() {
    visibility = View.VISIBLE
}

fun View.hide() {
    visibility = View.GONE
}

fun View.getColor(id: Int) = ContextCompat.getColor(this.context, id)

//LinearLayoutManager.VERTICAL or LinearLayoutManager.HORIZONTAL
fun RecyclerView.addDivider(orientation: Int) {
    addItemDecoration(
        DividerItemDecoration(
            context,
            orientation
        )
    )
}

fun RecyclerView.addDivider(context: Context, drawable: Int = R.drawable.divider) {
    val dividerItemDecoration = DividerItemDecoration(
        context,
        LinearLayoutManager.VERTICAL
    )
    dividerItemDecoration.setDrawable(ContextCompat.getDrawable(context, drawable)!!)
    this.addItemDecoration(dividerItemDecoration)
}

fun ImageView.loadArticleImage(url: String?) {
    if (url.isNullOrEmpty()) {
        this.hide()
        return
    }
    if (!this.isVisible) {
        this.show()
    }
    Glide.with(this).load(url).into(this)
}