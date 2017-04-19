package com.example.nelosan.testinganko

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_menu.view.*

/**
 * Created by manuelsanchez on 18/4/17.
 */
class MenuAdapter(val items: List<MenuItem>, val listener: (MenuItem) -> Unit): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) = holder!!.bind(items[position], listener)

    override fun getItemCount() = items.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(item: MenuItem, listener: (MenuItem) -> Unit) = with(itemView) {
            menu_title.text = item.title
            setOnClickListener { listener(item) }
        }
    }
}