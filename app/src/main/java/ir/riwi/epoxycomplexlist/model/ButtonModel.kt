package ir.riwi.epoxycomplexlist.model

import android.view.View
import androidx.appcompat.widget.AppCompatButton
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import ir.riwi.epoxycomplexlist.R
import kotlinx.android.synthetic.main.item_btn.view.*


@EpoxyModelClass(layout = R.layout.item_btn)
abstract class ButtonModel : EpoxyModelWithHolder<ButtonModel.ButtonHolder>() {


    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: ButtonHolder) {
        holder.button.text = title
    }


    inner class ButtonHolder : EpoxyHolder() {
        lateinit var button: AppCompatButton
        override fun bindView(itemView: View) {
            button = itemView.mbn
        }
    }

}