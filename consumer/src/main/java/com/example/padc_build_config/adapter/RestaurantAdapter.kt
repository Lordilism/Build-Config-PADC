package com.example.padc_build_config.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.padc_build_config.R
import com.example.padc_build_config.viewholder.RestaurantsViewHolder
import com.example.shared.data.Vo.ResponseVO

class RestaurantAdapter: RecyclerView.Adapter<RestaurantsViewHolder>() {

    private var mData: List<ResponseVO> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_restraurants,parent,false)
        return RestaurantsViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantsViewHolder, position: Int) {

        if (mData.isNotEmpty()){
            holder.bindData(mData[position])
        }


    }

    override fun getItemCount(): Int {
        return mData.count()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setNewData(restaurants:List<ResponseVO>){
        mData = restaurants
        notifyDataSetChanged()
    }
}