package com.example.iteradmin.brodecastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBrodecastReceiver:BroadcastReceiver(){
    override fun onReceive(context:Context?, intent: Intent?) {
        val s:String? = intent?.action
        when(s){
            Intent.ACTION_POWER_CONNECTED -> {
                Toast.makeText(context,"charging connected",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_POWER_DISCONNECTED ->{
                Toast.makeText(context,"charging disconnected",Toast.LENGTH_LONG).show()
            }
            Intent.ACTION_AIRPLANE_MODE_CHANGED ->{
                Toast.makeText(context," airplane mode",Toast.LENGTH_LONG).show()


            }


        }


    }

}