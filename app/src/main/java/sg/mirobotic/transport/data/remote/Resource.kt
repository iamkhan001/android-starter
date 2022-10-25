package sg.mirobotic.transport.data.remote

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}

data class Resource<out T>(
    val status: Status,
    val data: T?,
    val message:String?
){
    companion object{

        fun <T> success(data: T?, msg: String? = null): Resource<T> {
            return Resource(Status.SUCCESS, data, msg)
        }

        fun <T> error(msg: String, data: T? = null): Resource<T> {
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T? = null): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }

    }
}