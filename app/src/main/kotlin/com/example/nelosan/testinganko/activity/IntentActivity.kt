package com.example.nelosan.testinganko.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * Created by manuelsanchez on 20/4/17.
 */
class IntentActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout {

            button {
                text = "Open new activity"
                onClick {
                    startActivity<GetDataActivity>("name" to "Dave", "age" to 23)
                }
            }

            button {
                text = "Open dialog"
                onClick {
                    alert("Hi, I'm a dialog", "Alert") {
                        positiveButton("Bye"){}
                    }.show()
                }
            }

            button {
                text = "Open selector dialog"
                onClick {
                    val countries = listOf("Option 1", "Option 2", "Option 3", "Option 4")
                    selector("Select an option", countries) { i ->
                        toast("The option selected is ${countries[i]}")
                    }
                }
            }
        }
    }

}