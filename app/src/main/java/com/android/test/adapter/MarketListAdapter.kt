package com.android.test.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.test.R

import com.android.test.network.Result
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.recycler_list_row.view.*

class MarketListAdapter: RecyclerView.Adapter<MarketListAdapter.MyViewHolder>() {

    var marketListData = ArrayList<Result>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketListAdapter.MyViewHolder {
       val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recycler_list_row, parent, false )
        return MyViewHolder(inflater)

    }

    override fun onBindViewHolder(holder: MarketListAdapter.MyViewHolder, position: Int) {
            holder.bind(marketListData[position])
    }

    override fun getItemCount(): Int {
        return marketListData.size
    }

    class   MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvTitle = view.tvSymbol
        val tvSymbol = view.tvMarket
        val tvShortname = view.tvShortname
        //val thumbImageView = view.thumbImageView

        fun bind(data : Result){
            tvTitle.text = data.symbol
            tvSymbol.text = data.marketState
            tvShortname.text = data.shortName

//            val url  = data .volumeInfo?.imageLinks.smallThumbnail
//            Glide.with(thumbImageView)
//                .load(url)
//                .circleCrop()
//                .into(thumbImageView)
        }
    }
}