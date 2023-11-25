package com.example.recyclerview11092023

import android.content.Context
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.style.ClickableSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookAdapter : RecyclerView.Adapter<BookAdapter.BookViewHolder>() {
    private var listBook: List<Book> = emptyList()

    fun setListBook(listBook: List<Book>) {
        this.listBook = listBook
    }

    class BookViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var image: ImageView = view.findViewById(R.id.image_view_book)
        private var tvName: TextView = view.findViewById(R.id.text_view_book_name)
        private var tvPostDateAndViewCount: TextView = view.findViewById(R.id.text_view_book_post_date_and_view_count)
        private var tvDescription: TextView = view.findViewById(R.id.text_view_book_description)

        fun bind(book: Book?) {
            book?.let {
                image.setImageResource(it.image)
                tvName.text = it.name
                var spannableStringBuilder = SpannableStringBuilder().apply {
//                    append("Ngày đăng ${it.postDate}")
//                    append(" - ")
                    append("Lượt xem: ${it.viewCount}", )
                }

                spannableStringBuilder.setSpan({

                }, 0, spannableStringBuilder.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.layout_item_book, parent, false)
        return BookViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(listBook.getOrNull(position))
    }
}