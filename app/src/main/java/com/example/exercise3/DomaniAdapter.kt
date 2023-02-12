package com.example.exercise3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView


class DomaniViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val ora: TextView = view.findViewById(R.id.ora)
    val image: ImageView = view.findViewById(R.id.iv_luna)
    val gradi: TextView = view.findViewById(R.id.gradi)
    val image2: ImageView = view.findViewById(R.id.iv_goccia)
    val percentuale: TextView = view.findViewById(R.id.percentuale)
    val percepita: TextView = view.findViewById(R.id.percepita)
    val constraintLayout : ConstraintLayout = itemView.findViewById(R.id.expanded_layout)
    val relativeFirst : RelativeLayout = itemView.findViewById(R.id.relative_first)


    class DomaniAdapter(private val domani: List<Domani>) :
        RecyclerView.Adapter<DomaniViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DomaniViewHolder {
            val domaniView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_domani, parent, false)
            return DomaniViewHolder(domaniView)
        }


        override fun onBindViewHolder(holder: DomaniViewHolder, position: Int) {
            val currentItem = domani[position]
            holder.ora.text = currentItem.ora
            holder.image.setImageResource(currentItem.image)
            holder.image2.setImageResource(currentItem.image2)
            holder.gradi.text = currentItem.gradi
            holder.percentuale.text = currentItem.percentuale
            holder.percepita.text = currentItem.percepita

            val isVisible :Boolean = currentItem.visibility
            holder.constraintLayout.visibility = if (isVisible) View.VISIBLE else View.GONE

            holder.relativeFirst.setOnClickListener {

                currentItem.visibility = !currentItem.visibility
                notifyItemChanged(position)

            }







        }

        override fun getItemCount(): Int {
            return domani.size
        }
    }
}