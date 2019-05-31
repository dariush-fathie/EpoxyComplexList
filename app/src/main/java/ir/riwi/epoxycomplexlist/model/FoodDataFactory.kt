package ir.riwi.epoxycomplexlist.model

import androidx.annotation.StringRes
import ir.riwi.epoxycomplexlist.R
import java.util.*

object FoodDataFactory{

    //region Random Data Generators
    private val random = Random()

    private val titles = arrayListOf<String>("Nachos", "Fries", "Cheese Balls", "Pizza")

    private fun randomTitle() : String {
        val title = random.nextInt(4)
        return titles[title]
    }

    private fun randomPicture() : Int{
        val grid = random.nextInt(7)

        return R.drawable.ic_launcher_background
    }
    //endregion

    fun getFoodItems(count:Int) : List<Food>{
        var foodItems = mutableListOf<Food>()
        repeat(count){
            val image = randomPicture()
            val title = randomTitle()
            @StringRes val desc = R.string.lorem
            foodItems.add(Food(image,title,desc.toString()))
        }
        return foodItems
    }
}