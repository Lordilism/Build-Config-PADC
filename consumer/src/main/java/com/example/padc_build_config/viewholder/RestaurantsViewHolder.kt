package com.example.padc_build_config.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.shared.data.Vo.ResponseVO
import kotlinx.android.synthetic.main.viewholder_restraurants.view.*

class RestaurantsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(data:ResponseVO){
        Glide.with(itemView.context)
            .load(data.image_url)
            .into(itemView.ivFoodPoster)

        itemView.tvRestaurantName.text = data.name

        itemView.tvCategory.text = data.category

        itemView.tvPrice.text = data.delivery_price.toString()
        itemView.tvRating.text = data.rating.toString()




    }


}