package ir.riwi.epoxycomplexlist.model

import android.graphics.Color
import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import ir.riwi.epoxycomplexlist.CustomLayoutWithDataBindingBindingModel_
import kotlin.random.Random

class SingleFoodController : EpoxyController() {

    var foodItems: List<Food>

    init {
        foodItems = FoodDataFactory.getFoodItems(50)
    }

    override fun buildModels() {
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
                .color(Color.BLACK)
        }

        val list = arrayListOf<FoodModel_>()
        foodItems.forEach { food ->
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


        CustomLayoutWithDataBindingBindingModel_()
            .id("custom layout with binding")
            .url("this is some url")
            .addTo(this)

    }

}