package com.example.exercise3

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class CarsViewHolder(view: View) : ViewHolder(view){

    val carsType: TextView = view.findViewById(R.id.textView)
    val carsImage: ImageView = view.findViewById(R.id.imageView)


}

class CarsAdapter(private val cars: List<Cars>) : RecyclerView.Adapter<CarsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarsViewHolder {
       val carsView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return CarsViewHolder(carsView)
    }


    override fun onBindViewHolder(holder: CarsViewHolder, position: Int) {
        val currentItem = cars [position]
        holder.carsType.text = currentItem.name
        holder.carsImage.setImageResource(currentItem.image)


    }

    override fun getItemCount(): Int {
        return cars.size
    }
}
