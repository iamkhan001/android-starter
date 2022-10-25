package sg.mirobotic.transport.utils.ext

import android.content.Context
import android.os.Build
import android.text.Html
import android.text.Spanned
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.navigation.NavController
import com.google.android.material.snackbar.Snackbar
import java.util.*
import java.util.regex.Pattern

fun String?.toHtml(): Spanned? {
    if (this.isNullOrEmpty()) return null
    return HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_COMPACT)
}

fun String?.toNoHtml(): String? {
    if (this.isNullOrEmpty()) return null
    return HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_LEGACY).toString()
}

fun Float.roundUp(): Float {
    return String.format(Locale.US, "%.2f", this).toFloat()
}

fun String.removeHtml(): String = this.replace("<.*?>".toRegex(), "")

fun NavController.lifeCycleNavigate(lifecycle : LifecycleCoroutineScope, resId :Int) =
    lifecycle.launchWhenResumed {
        navigate(resId)
    }

fun TextView.setHtml(text: String) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        this.text = Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT)
    }
}

fun View.showSnackbar(text: String?) {
    text?.let {
        Snackbar.make(this, text, Snackbar.LENGTH_SHORT).show()
    }
}

fun TextView.setColorText(color: Int) {
    this.setTextColor(ContextCompat.getColor(this.context, color))
}

fun Context.showToast(text: String?) {
    text?.let {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}

private val EMAIL_ADDRESS_PATTERN = Pattern.compile(
    "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+"
)
fun isValidEmail(str: String): Boolean{
    return EMAIL_ADDRESS_PATTERN.matcher(str).matches()
}

