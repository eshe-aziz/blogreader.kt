package com.akirachix.myblogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var bookList: List<Blog>): RecyclerView.Adapter<BooksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blog_reader_item, parent, false)
        return BooksViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val blog = bookList[position]
        holder.tvAuthor.text = blog.author
        holder.tvTitle.text = blog.title
        holder.tvDate.text = blog.date

    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}

class BooksViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvAuthor = itemView.findViewById<TextView>(R.id.tvAuthor)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
}
