package sg.mirobotic.transport.utils.ext

import android.content.res.Resources
import android.util.TypedValue
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import kotlinx.coroutines.ExperimentalCoroutinesApi
import sg.mirobotic.transport.TransportApp

@OptIn(ExperimentalCoroutinesApi::class)
fun dpToPx(dp: Float): Int {
    return dpToPx(dp, TransportApp.instance.resources)
}

private fun dpToPx(dp: Float, resources: Resources): Int {
    val px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics)
    return px.toInt()
}

@OptIn(ExperimentalCoroutinesApi::class)
fun getColorCompat(resId: Int) = ContextCompat.getColor(TransportApp.instance, resId)

fun View.setVisible() {
    if(this.isVisible) {
        return
    }
    visibility = View.VISIBLE
}

fun View.setInvisible() {
    visibility = View.INVISIBLE
}

fun View.setGone() {
    if(this.isVisible) {
        visibility = View.GONE
    }
}

