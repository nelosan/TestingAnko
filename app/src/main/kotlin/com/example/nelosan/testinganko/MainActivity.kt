package com.example.nelosan.testinganko

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.widget.DividerItemDecoration


/**
 * Created by manuelsanchez on 10/4/17.
 */
class MainActivity : AppCompatActivity() {

    val options: List<MenuItem> = mutableListOf(MenuItem("Create view with dsl", DSLActivity::class.java))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        list.adapter = MenuAdapter(options){
            startActivity(Intent(this, it.activity))
        }
    }

}