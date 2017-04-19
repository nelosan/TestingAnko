package com.example.nelosan.testinganko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.doAsync

/**
 * Created by manuelsanchez on 18/4/17.
 */
class AsynkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        doAsync {

        }
    }

}