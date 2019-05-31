package ir.riwi.epoxycomplexlist.model

import android.view.View
import androidx.annotation.DrawableRes
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.*
import ir.riwi.epoxycomplexlist.R
import kotlinx.android.synthetic.main.item_food.view.*



@EpoxyModelClass(layout = R.layout.item_food)
abstract class FoodModel : EpoxyModelWithHolder<FoodModel.FoodHolder>() {


    /*@EpoxyAttribute
    var id: Long = 0*/

    @EpoxyAttribute
    @DrawableRes
    var image: Int = 0

    @EpoxyAttribute
    var title: String? = ""

    @EpoxyAttribute
    var desc: String = ""


    override fun bind(holder: FoodHolder) {
        holder.imageView.setImageResource(image)
        holder.titleView.text = title
    }

    inner class FoodHolder : EpoxyHolder() {

        lateinit var imageView: AppCompatImageView
        lateinit var titleView: AppCompatTextView
        lateinit var descView: AppCompatTextView

        override fun bindView(itemView: View) {
            imageView = itemView.image
            titleView = itemView.title
            descView = itemView.desc
        }

    }
}