package ir.riwi.epoxycomplexlist.model

import com.airbnb.epoxy.AsyncEpoxyController

abstract class AsyncTypedController<T : Any, U : Any> :
    AsyncEpoxyController(true, true) {

    private lateinit var data1: T
    private lateinit var data2: U
    private var allowModelBuildRequests: Boolean = false

    fun setData(data1: T, data2: U) {
        this.data1 = data1
        this.data2 = data2
        allowModelBuildRequests = true
        requestModelBuild()
        allowModelBuildRequests = false
    }

    override fun requestModelBuild() {
        if (!allowModelBuildRequests) {
            throw IllegalStateException(
                "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a "
                        + "model refresh with new data."
            )
        }
        super.requestModelBuild()
    }

    override fun moveModel(fromPosition: Int, toPosition: Int) {
        allowModelBuildRequests = true
        super.moveModel(fromPosition, toPosition)
        allowModelBuildRequests = false
    }


    override fun requestDelayedModelBuild(delayMs: Int) {
        if (!allowModelBuildRequests) {
            throw IllegalStateException(
                "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a "
                        + "model refresh with new data."
            )
        }
        super.requestDelayedModelBuild(delayMs)
    }

    override fun buildModels() {
        if (!allowModelBuildRequests) {
            throw IllegalStateException(
                "You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a "
                        + "model refresh with new data."
            )
        }

        buildModels(data1, data2)
    }

    protected abstract fun buildModels(data1: T, data2: U)


}
