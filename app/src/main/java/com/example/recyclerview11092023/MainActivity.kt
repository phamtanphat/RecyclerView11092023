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
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val date2011 = convertDateToMillisecond("20/11/2023")
        val date1311 = convertDateToMillisecond("13/11/2023")
        val date0911 = convertDateToMillisecond("09/11/2023 ")
        val date1306 = convertDateToMillisecond("13/06/2023")
        val date0301 = convertDateToMillisecond("03/01/2023")
        val date1101 = convertDateToMillisecond("11/01/2023")

        Log.d("pphat", date2011.toString())
        Log.d("pphat", date1311.toString())
        Log.d("pphat", date0911.toString())
        Log.d("pphat", date1306.toString())
        Log.d("pphat", date0301.toString())
        Log.d("pphat", date1101.toString())



        findViewById<TextView>(R.id.text_view_test)?.let {
            val spannableStringBuilder = SpannableStringBuilder().apply {
                append("Lượt xem: abc")
            }

            spannableStringBuilder.setSpan(object : ClickableSpan() {
                override fun onClick(p0: View) {
                    Toast.makeText(this@MainActivity, "Click text", Toast.LENGTH_SHORT).show()
                }

                override fun updateDrawState(ds: TextPaint) {
                    ds.color = resources.getColor(R.color.black)
                }
            }, 0, spannableStringBuilder.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

            it.movementMethod = LinkMovementMethod.getInstance()
            it.text = spannableStringBuilder
        }
    }

    fun convertDateToMillisecond(date: String): Long {
        return SimpleDateFormat("dd/MM/yyyy").parse(date).time
    }
}