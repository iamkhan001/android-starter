package sg.mirobotic.transport.interfaces

interface OnItemClickListener<T> {

    fun onCLick(item: T)

    fun onClick(index: Int, item: T) {}

}