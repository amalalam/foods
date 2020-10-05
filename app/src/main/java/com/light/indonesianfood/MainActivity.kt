package com.light.indonesianfood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.ProxyFileDescriptorCallback
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Foods> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_food.setHasFixedSize(true)

        list.addAll(FoodsData.listData)
        showRecyclerList()
    }



    private fun showRecyclerList() {
        rv_food.layoutManager = LinearLayoutManager(this)
        val listFoodsAdapter = ListFoodsAdapter(list)
        rv_food.adapter = listFoodsAdapter

        listFoodsAdapter.setOnItemClickCallback(object: ListFoodsAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Foods) {
                showSelectedFoods(data)
            }
        })
    }

    private fun showSelectedFoods(foods: Foods) {
        val listFoods: ArrayList<Foods>
        Toast.makeText(this, "Kamu memilih " + foods.name, Toast.LENGTH_SHORT).show()
//        when(foods.name){
//            "Zeus" -> {val intent = Intent(this, Zeus::class.java)
//                startActivity(intent)
//            }
//            "Poseidon" -> {val intent = Intent(this, Poseidon::class.java)
//                startActivity(intent)
//            }
//            "Ares" -> {val intent = Intent(this, Ares::class.java)
//                startActivity(intent)}
//
//            "Hera" -> {val intent = Intent(this, Hera::class.java)
//                startActivity(intent)}
//
//            "Hermes" -> {val intent = Intent(this, Hermes::class.java)
//                startActivity(intent)}
//
//            "Aphrodite" -> {val intent = Intent(this, Aphrodite::class.java)
//                startActivity(intent)}
//
//            "Athena" -> {val intent = Intent(this, Athena::class.java)
//                startActivity(intent)}
//
//            "Apollo" -> {val intent = Intent(this, Apollo::class.java)
//                startActivity(intent)}
//
//            "Hephaestus" -> {val intent = Intent(this, Hephaestus::class.java)
//                startActivity(intent)}
//
//            "Hestia" -> {val intent = Intent(this, Hestia::class.java)
//                startActivity(intent)}
//
//            "Demeter" -> {val intent = Intent(this, Demeter::class.java)
//                startActivity(intent)}
//
//            "Artemis" -> {val intent = Intent(this, Artemis::class.java)
//                startActivity(intent)}
//        }
    }


}