package ir.riwi.epoxycomplexlist.model

import android.content.Context
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.view.ContextThemeWrapper

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.airbnb.epoxy.Carousel
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import ir.riwi.epoxycomplexlist.R

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class VerticalGridCarousel(context: Context) :
    Carousel(ContextThemeWrapper(context, R.style.ScrollbarRecyclerView)) {

    override fun createLayoutManager(): RecyclerView.LayoutManager {
        return GridLayoutManager(context, 1, RecyclerView.HORIZONTAL, true)
    }


    @ModelProp(ModelProp.Option.DoNotHash)
    fun setColor(colorDrawable: ColorDrawable) {
        background = colorDrawable
    }



}