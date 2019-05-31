package ir.riwi.epoxycomplexlist.model

import android.graphics.Color
import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import ir.riwi.epoxycomplexlist.R

import kotlinx.android.synthetic.main.item_card.view.*


@EpoxyModelClass(layout = R.layout.item_card)
abstract class CardModel : EpoxyModelWithHolder<CardModel.CardHolder>() {

    @EpoxyAttribute
    var color: Int = Color.RED

    @EpoxyAttribute(EpoxyAttribute.Option.DoNotHash)
    var clickListener: View.OnClickListener? = null

    override fun bind(holder: CardHolder) {
        holder.cardView.strokeColor = color
        clickListener?.let {
            holder.cardView.setOnClickListener(clickListener)
        }
    }

    inner class CardHolder : EpoxyHolder() {
        lateinit var cardView: MaterialCardView
        override fun bindView(itemView: View) {
            cardView = itemView.cardview
        }
    }
}