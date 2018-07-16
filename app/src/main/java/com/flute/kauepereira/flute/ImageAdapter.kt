package com.flute.kauepereira.flute

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

// references to our images
private val mThumbIds = arrayOf<Int>(
        R.drawable.ave, R.drawable.cena,
        R.drawable.darude, R.drawable.fox,
        R.drawable.hobbit, R.drawable.hp,
        R.drawable.illuminati, R.drawable.indiana,
        R.drawable.jurassic, R.drawable.mcdonald,
        R.drawable.mission, R.drawable.naruto,
        R.drawable.spongebob, R.drawable.starwars,
        R.drawable.titanic) //, R.drawable.sample_1,
        //R.drawable.sample_2, R.drawable.sample_3,
        //R.drawable.sample_4, R.drawable.sample_5,
        //R.drawable.sample_6, R.drawable.sample_7)

class ImageAdapter(private val mContext: Context) : BaseAdapter() {

    override fun getCount(): Int = mThumbIds.size

    override fun getItem(position: Int): Any? = null

    override fun getItemId(position: Int): Long = 0L

    // create a new ImageView for each item referenced by the Adapter
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val imageView: ImageView
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = ImageView(mContext)
            imageView.layoutParams = ViewGroup.LayoutParams(350, 350)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }

        imageView.setImageResource(mThumbIds[position])
        return imageView
    }
}