package com.ikbalghozali.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listAdapter (private val listLanguage: ArrayList<Language>) : RecyclerView.Adapter<listAdapter.ListViewHolder>(){

    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val language = listLanguage[position]

        Glide.with(holder.itemView.context)
            .load(language.photo)
            .apply(RequestOptions().override(75, 75))
            .into(holder.imgPhoto)

        holder.tvName.text = language.name
        holder.tvDetail.text = language.detail
    }

    override fun getItemCount(): Int {
        return listLanguage.size
    }

}