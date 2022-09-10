package edu.cvr.kotlinretrofitdemo

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdaptor(val context:Context, val userList: List<MyDataItem>): RecyclerView.Adapter<MyAdaptor.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var userId: TextView
        lateinit var title: TextView
        init {
            userId = itemView.findViewById(R.id.id)
            title = itemView.findViewById(R.id.title)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.userId.text=userList[position].userId.toString()
        holder.title.text=userList[position].title.toString()
    }

    override fun getItemCount(): Int {
        return userList.count()
    }
}