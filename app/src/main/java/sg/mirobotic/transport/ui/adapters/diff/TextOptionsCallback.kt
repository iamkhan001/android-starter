package sg.mirobotic.transport.ui.adapters.diff

import androidx.recyclerview.widget.DiffUtil

class TextOptionsCallback(private val oldList: List<String>, private val newList: List<String>) :
    DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size
    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldCourse: Int, newPosition: Int): Boolean {
        val id1 = oldList[oldCourse]
        val id2 = newList[newPosition]
        return id1 == id2
    }


}