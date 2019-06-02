package org.niralmehta.camerauploadexample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cardview_item.view.*
import org.niralmehta.camerauploadexample.R
import org.niralmehta.camerauploadexample.data.CardViewItem

class MyRequestAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val cardViewItems = ArrayList<CardViewItem>()

    init {
        // 추가할 파일

        cardViewItems.add(CardViewItem(R.drawable.profile, "가나다라", "$100", "asdf"))
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): RecyclerView.ViewHolder {

        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview_item, viewGroup, false)
        return RowCell(view)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        (viewHolder as RowCell).imageView.setImageResource(cardViewItems[position].imageView)
        viewHolder.title.text = cardViewItems[position].title
        viewHolder.price.text = cardViewItems[position].price
        viewHolder.date.text = cardViewItems[position].date
    }

    override fun getItemCount(): Int {
        return cardViewItems.size
    }

    private inner class RowCell(view: View) : RecyclerView.ViewHolder(view) {

        var imageView: ImageView = view.findViewById(R.id.cardView_ImageView)
        var title: TextView = view.findViewById(R.id.title)
        var price: TextView = view.findViewById(R.id.price)
        var date: TextView = view.findViewById(R.id.date)

    }

}