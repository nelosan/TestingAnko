package com.example.nelosan.testinganko.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.nelosan.testinganko.components.AnkoUiComponent
import org.jetbrains.anko.setContentView

/**
 * Created by manuelsanchez on 19/4/17.
 */
class DSLComponentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AnkoUiComponent().setContentView(this)
    }

}