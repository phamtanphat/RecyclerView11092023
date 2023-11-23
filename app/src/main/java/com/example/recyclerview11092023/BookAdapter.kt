package com.example.recyclerview11092023

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter: RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private var image: ImageView = view.findViewById(R.id.image_view_book)
        private var tvName: TextView = view.findViewById(R.id.text_view_book_name)
        private var tvPostDateAndViewCount: TextView = view.findViewById(R.id.text_view_book_post_date_and_view_count)
        private var tvDescription: TextView = view.findViewById(R.id.text_view_book_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}