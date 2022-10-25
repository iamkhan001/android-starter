package sg.mirobotic.transport.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import sg.mirobotic.transport.databinding.ItemTextBinding
import sg.mirobotic.transport.interfaces.OnItemClickListener
import sg.mirobotic.transport.ui.adapters.diff.TextOptionsCallback

class TextListAdapter(private val optionSelectListener: OnItemClickListener<String>): RecyclerView.Adapter<TextListAdapter.MyViewHolder>() {

    private var list = ArrayList<String>()

    fun setData(list: ArrayList<String>?) {
        if (list == null)
            return
        val diffCallback = TextOptionsCallback(this.list, list)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.list.clear()
        this.list.addAll(list)
        diffResult.dispatchUpdatesTo(this)
    }

    class MyViewHolder(itemView: ItemTextBinding) : RecyclerView.ViewHolder(itemView.root) {
        val binding: ItemTextBinding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemTextBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val binding = holder.binding
        val item = list[position]

        binding.text.text = item

        binding.root.setOnClickListener{
            optionSelectListener.onCLick(item)
        }

    }

    override fun getItemCount(): Int = list.size

}