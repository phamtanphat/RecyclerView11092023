package com.example.recyclerview11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    }

    fun convertDateToMillisecond(date: String): Long {
        return SimpleDateFormat("dd/MM/yyyy").parse(date).time
    }
}