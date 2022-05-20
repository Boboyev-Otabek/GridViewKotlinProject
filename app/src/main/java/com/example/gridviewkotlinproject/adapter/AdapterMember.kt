package com.example.gridviewkotlinproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gridviewkotlinproject.R
import com.example.gridviewkotlinproject.model.Member

class AdapterMember(var member:List<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount(): Int {
        return member.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.activity_item,parent,false)
        return Memberholder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var member=member.get(position)
        if(holder is Memberholder){
            holder.ism.setText(member.ism)
            holder.familiya.setText(member.familiya)
        }
    }

    class Memberholder(itemview :View):RecyclerView.ViewHolder(itemview){
        var ism=itemview.findViewById<TextView>(R.id.ism)
        var familiya=itemview.findViewById<TextView>(R.id.familiya)
    }
}