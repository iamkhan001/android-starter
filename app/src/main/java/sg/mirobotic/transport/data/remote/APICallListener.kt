package sg.mirobotic.transport.data.remote

interface APICallListener {

    fun onProgress()

    fun onSuccess(msg: String)

    fun onError(msg: String)

}