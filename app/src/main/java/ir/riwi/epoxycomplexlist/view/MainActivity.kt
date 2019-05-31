package ir.riwi.epoxycomplexlist.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.riwi.epoxycomplexlist.R
import ir.riwi.epoxycomplexlist.databinding.ActivityMainBinding
import ir.riwi.epoxycomplexlist.model.FoodDataFactory
import ir.riwi.epoxycomplexlist.model.SingleFoodController
import ir.riwi.epoxycomplexlist.model.TypedController

class MainActivity : AppCompatActivity() {


    val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    private val foodController: SingleFoodController by lazy {
        SingleFoodController()
    }


    private val asyncTypedController by lazy {
        TypedController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayoutManager = LinearLayoutManager(this)

        with(binding.rvEpoxy) {
            layoutManager = linearLayoutManager
            //adapter = foodController.adapter
            adapter = asyncTypedController.adapter
            addItemDecoration(DividerItemDecoration(this@MainActivity, RecyclerView.VERTICAL))
        }

        asyncTypedController.setData(FoodDataFactory.getFoodItems(100), true)
        asyncTypedController.isDebugLoggingEnabled = true
    }
}
