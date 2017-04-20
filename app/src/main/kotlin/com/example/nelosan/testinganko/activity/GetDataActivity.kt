package com.example.nelosan.testinganko.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.textView
import org.jetbrains.anko.verticalLayout

/**
 * Created by manuelsanchez on 20/4/17.
 */
class GetDataActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val age = intent.extras.getInt("age")
        val name = intent.extras.getString("name")
        verticalLayout {
            textView {
                text = name
            }
            textView {
                text = age.toString()
            }
        }
    }

}