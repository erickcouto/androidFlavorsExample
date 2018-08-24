package br.com.erickalves.flavorsexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

open class MainActivityBase : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    open fun getText(text:String): String {

        return text

    }
}
