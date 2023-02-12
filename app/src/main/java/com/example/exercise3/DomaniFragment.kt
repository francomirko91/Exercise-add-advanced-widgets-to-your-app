package com.example.exercise3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DomaniFragment : Fragment() {

    private lateinit var adapter: DomaniViewHolder.DomaniAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var domaniList: ArrayList<Domani>
    lateinit var ora: Array<String>
    lateinit var image: Array<Int>
    lateinit var gradi: Array<String>
    lateinit var image2: Array<Int>
    lateinit var percentuale: Array<String>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_domani, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView = view.findViewById(R.id.domani_Recycler_View)
        recyclerView.layoutManager = layoutManager
        adapter = DomaniViewHolder.DomaniAdapter(domaniList)
        recyclerView.adapter = adapter
    }


    private fun dataInitialize() {
        domaniList = ArrayList()

        ora = arrayOf(
            "00.00",
            "01.00",
            "02.00",
            "03.00",
            "04.00",
            "05.00",
            "06.00",
        )

        image = arrayOf(
            R.drawable.moon,
            R.drawable.moon,
            R.drawable.moon,
            R.drawable.moon,
            R.drawable.moon,
            R.drawable.moon,
            R.drawable.moon,
        )

        gradi = arrayOf(
            "14°",
            "15°",
            "16°",
            "16°",
            "16°",
            "17°",
            "17°",
        )

        image2 = arrayOf(
            R.drawable.goccia,
            R.drawable.goccia,
            R.drawable.goccia,
            R.drawable.goccia,
            R.drawable.goccia,
            R.drawable.goccia,
            R.drawable.goccia,

        )

        percentuale = arrayOf(
            "80%",
            "50%",
            "52%",
            "46%",
            "49%",
            "55%",
            "50%",
        )

        for (i in image.indices) {
            val domani = Domani(ora[i], image[i],gradi[i],image2[i],percentuale[i])
            domaniList.add(domani)
        }


    }
}