package com.example.nelosan.testinganko.components

import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * Created by manuelsanchez on 19/4/17.
 */
class AnkoUiComponent: AnkoComponent<AppCompatActivity> {
    override fun createView(ui: AnkoContext<AppCompatActivity>) = with(ui) {
        verticalLayout {
            val textview = textView {
                text = "Activity with dsl component"
                padding = dip(16)
            }

            button {
                text = "Click if like it"
                onClick {
                    toast("Thanks!")
                }
            }
        }
    }
}