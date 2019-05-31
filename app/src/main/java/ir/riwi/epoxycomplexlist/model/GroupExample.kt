package ir.riwi.epoxycomplexlist.model

import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModel
import com.airbnb.epoxy.EpoxyModelGroup
import com.airbnb.epoxy.ModelGroupHolder

import ir.riwi.epoxycomplexlist.R

open class GroupExample(models: Collection<EpoxyModel<*>>) :
    EpoxyModelGroup(R.layout.group_layout, models) {

    @EpoxyAttribute
    open var backgroundColor: Int = 0


    override fun bind(holder: ModelGroupHolder) {
        super.bind(holder)
        holder.rootView.setBackgroundColor(backgroundColor);
    }


}