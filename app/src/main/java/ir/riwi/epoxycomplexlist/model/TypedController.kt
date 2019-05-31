package ir.riwi.epoxycomplexlist.model

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import com.airbnb.epoxy.CarouselModel_
import ir.riwi.epoxycomplexlist.CustomLayoutWithDataBindingBindingModel_
import kotlin.random.Random

class TypedController : AsyncTypedController<List<Food>, Boolean>() , View.OnClickListener {

    override fun onClick(v: View?) {
        Log.e("itemClicked"," ... ")
    }

    override fun buildModels(data1: List<Food>, data2: Boolean) {
        var i: Long = 0

        CardModel_()
            .id("cardModel")
            .color(Color.BLACK)
            .addTo(this)

        val buttonList = Array(100) {
            ButtonModel_()
                .id(Random.nextInt())
                .title("this is button model")
        }

        val cardList = Array(100) {
            CardModel_()
                .id(Random.nextInt())
                .clickListener(this)
                .color(Color.BLACK)
        }

        val list = arrayListOf<FoodModel_>()
        data1.forEach { food ->
            list.add(
                FoodModel_()
                    .id(i++)
                    .image(food.image)
                    .title(food.title)
            )
        }

        CarouselModel_()
            .id("first")
            .models(list)
            .hasFixedSize(true)
            .addTo(this)

        CarouselModel_()
            .id("second")
            .models(list)
            .hasFixedSize(true)
            .addTo(this)

        CarouselModel_()
            .id("third")
            .models(buttonList.toList())
            .hasFixedSize(true)
            .addTo(this)

        CarouselModel_()
            .id("forth")
            .models(cardList.toList())
            .hasFixedSize(true)
            .addTo(this)


        CarouselModel_()
            .id("fgdg")
            .models(list)
            .hasFixedSize(true)
            .addTo(this)

        CarouselModel_()
            .id("secdfggdgond")
            .models(list)
            .hasFixedSize(true)
            .addTo(this)

        CarouselModel_()
            .id("thireteterd")
            .models(buttonList.toList())
            .hasFixedSize(true)
            .addTo(this)

        CarouselModel_()
            .id("foetertetrth")
            .models(cardList.toList())
            .hasFixedSize(true)
            .addTo(this)


        VerticalGridCarouselModel_()
            .id("vgc")
            .apply {
                color(ColorDrawable(Color.LTGRAY))
            }
            .models(cardList.toList())
            .hasFixedSize(true)
            .addTo(this)

        GroupExample_(
            listOf(
                CarouselModel_()
                    .id("foetertetfsdfsdfssfffsfrth")
                    .models(cardList.toList())
                    .hasFixedSize(true)
                , CardModel_()
                    .id("cardModel")
                    .color(Color.BLACK)
            )
        ).apply {
            backgroundColor(Color.BLUE)
        }
            .addTo(this)

        CustomLayoutWithDataBindingBindingModel_()
            .id("custom layout with binding")
            .url("this is some url")
            .addTo(this)
    }

}