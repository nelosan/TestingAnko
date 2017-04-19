package com.example.nelosan.testinganko.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity


import org.jetbrains.anko.*

/**
 * Created by manuelsanchez on 18/4/17.
 */
class DSLActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {

            val textview = textView {
                text = "Hello World!"
                padding = dip(16)
            }

            button {
                text = "Click"
                onClick {
                    toast("Text changed")
                    textview.text = "Button clicked"
                }
            }
        }
    }

}