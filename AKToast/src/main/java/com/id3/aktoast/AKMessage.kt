package com.id3.aktoast

import android.content.Context
import android.widget.Toast

class AKMessage {

    companion object{
        fun showMessage(context: Context, message : String = "Bir hata oluştu."){
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}