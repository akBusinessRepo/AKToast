package com.id3.aktoast.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.id3.aktoast.AKMessage.Companion.ARG_MESSAGE
import com.id3.aktoast.R

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        setup()
    }

    private fun setup(){
        val bundle = intent.extras

        bundle?.let {
            val message = it.getString(ARG_MESSAGE)
            setupViews(message = message)
        } ?: kotlin.run {
            setupViews()
        }
    }

    private fun setupViews(message : String? = "Bir problem ile karşılaşıldı"){
        findViewById<TextView>(R.id.textView).text = message
    }


}