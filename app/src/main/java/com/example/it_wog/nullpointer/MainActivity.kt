package com.example.it_wog.nullpointer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zahl : Int = 0
        val wort : String = ""

        val zahlnull : Int? = null //? damit Wert null annehmen kann
        if (zahlnull == null) Log.i("Test", "zahlnull hat den wert $zahlnull")
        else Log.i("Test", "zahlnull ist nicht null")
    }
}