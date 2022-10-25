package sg.mirobotic.transport.utils

import android.app.Activity
import dev.shreyaspatil.MaterialDialog.MaterialDialog
import sg.mirobotic.transport.R


object DialogUtils {

    fun showAlertDialog(activity: Activity?, title: String, message: String,  clickListener: () -> (Unit)) {
        activity?.let {
            val mDialog = MaterialDialog.Builder(it)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(it.getString(R.string.ok)) { dialogInterface, _ ->
                    dialogInterface.dismiss()
                    clickListener()
                }
                .setNegativeButton(it.getString(R.string.cancel)) { dialogInterface, _ -> dialogInterface.dismiss() }
                .build()
            mDialog.show()
        }
    }

    fun showAlert(activity: Activity?, title: String, message: String,  clickListener: () -> (Unit)) {
        activity?.let {
            val mDialog = MaterialDialog.Builder(it)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(it.getString(R.string.ok)) { dialogInterface, _ ->
                    dialogInterface.dismiss()
                    clickListener()
                }
                .build()
            mDialog.show()
        }
    }
}