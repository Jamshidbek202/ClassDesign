package com.example.classdesign

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.classdesign.databinding.ItemViewpagerBinding

class ViewPagerAdapter(
    private val context: Context,
    private val imgList: MutableList<Int>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding = ItemViewpagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val image = imgList[position]
        holder.bind(image)
    }

    override fun getItemCount(): Int {
        return imgList.size
    }

    class ViewPagerHolder(private var itemViewpagerBinding: ItemViewpagerBinding) :
        RecyclerView.ViewHolder(itemViewpagerBinding.root) {

        fun bind(img: Int) {
            itemViewpagerBinding.vpImage.setImageResource(img)
        }
    }
}
