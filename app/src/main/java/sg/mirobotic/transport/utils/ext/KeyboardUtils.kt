package sg.mirobotic.transport.utils.ext

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment

object KeyboardUtils {

    fun show(context: Context) {
        val imm: InputMethodManager? =
            context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?
        imm?.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, 0)
    }

    fun hide(context: Context) {
        val imm: InputMethodManager? =
            context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager?
        imm?.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0)
    }

}

fun View.showKbd() {
    (this.context as? Activity)?.showKbd()
}

fun View.hideKbd() {
    (this.context as? Activity)?.hideKbd()
}

fun Fragment.showKbd() {
    activity?.showKbd()
}

fun Fragment.hideKbd() {
    activity?.hideKbd()
}

fun Context.showKbd() {
    (this as? Activity)?.showKbd()
}

fun Context.hideKbd() {
    (this as? Activity)?.hideKbd()
}

fun Activity.showKbd() {
    WindowInsetsControllerCompat(window, window.decorView).show(WindowInsetsCompat.Type.ime())
}

fun Activity.hideKbd() {
    WindowInsetsControllerCompat(window, window.decorView).hide(WindowInsetsCompat.Type.ime())
}