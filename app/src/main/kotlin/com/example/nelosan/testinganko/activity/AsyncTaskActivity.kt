package com.example.nelosan.testinganko.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * Created by manuelsanchez on 18/4/17.
 */
class AsyncTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            button {
                text = "Click to run new thread"
                onClick {
                    toast("Start thread")
                    doAsync {
                        Thread.sleep(5000)
                        uiThread {
                            toast("End thread")
                        }
                    }
                }
            }
        }

    }

}