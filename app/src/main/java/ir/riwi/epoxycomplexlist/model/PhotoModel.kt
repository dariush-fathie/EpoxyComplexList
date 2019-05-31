package ir.riwi.epoxycomplexlist.model

import com.airbnb.epoxy.EpoxyModel
import ir.riwi.epoxycomplexlist.R

abstract class PhotoModel : EpoxyModel<Button>() {
    override fun getDefaultLayout(): Int {
        return R.layout.item_food
    }


}