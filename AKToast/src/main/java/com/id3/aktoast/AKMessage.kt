package com.id3.aktoast

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.id3.aktoast.ui.MessageActivity

class AKMessage {
    companion object{
        val ARG_MESSAGE = "ARG_MESSAGE"

        fun showMessage(context: Context, message : String = "Bir hata oluştu."){
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }

        fun showMessageActivity(context: Context, message: String?) {
            val intent = Intent(context, MessageActivity::class.java)
            message?.let { intent.putExtra(ARG_MESSAGE, message) }
            context.startActivity(intent)
        }
    }
}