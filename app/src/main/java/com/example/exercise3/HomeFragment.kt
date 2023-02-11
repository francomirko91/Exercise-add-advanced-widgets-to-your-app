package com.example.exercise3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var adapter: CarsAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var carsList: ArrayList<Cars>
    lateinit var carsImage: Array<Int>
    lateinit var carsType: Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView = view.findViewById(R.id.my_recycler_view)
        recyclerView.layoutManager = layoutManager
        adapter = CarsAdapter(carsList)
        recyclerView.adapter = adapter
    }


    private fun dataInitialize() {
        carsList = ArrayList()

        carsImage = arrayOf(
            R.drawable.black_lambo,
            R.drawable.green_lambo,
            R.drawable.grey_lambo,
            R.drawable.white_lambo,
            R.drawable.yellow_lambo,
        )

        carsType = arrayOf(
            "Black Lambo",
            "Green Lambo",
            "Grey Lambo",
            "White Lambo",
            "Yellow Lambo",
        )

        for (i in carsImage.indices) {
            val cars = Cars(carsImage[i], carsType[i])
            carsList.add(cars)
        }


    }
}