package com.example.recyclerview11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var bookAdapter: BookAdapter
    private var listBook: MutableList<Book> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerview_book)
        bookAdapter = BookAdapter()
        listBook = Book.getListBooks().toMutableList()
        bookAdapter.setListBook(listBook)
        recyclerView.adapter = bookAdapter

        bookAdapter.setOnLongClickListener { position ->
            listBook.removeAt(position)
            bookAdapter.notifyItemRemoved(position)
        }
    }
}

// Update