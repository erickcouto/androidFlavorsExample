package br.com.erickalves.flavorsexample

import android.os.Bundle
import android.widget.Toast

class MainActivity : MainActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, getText("Premium"), Toast.LENGTH_LONG).show()

    }
    override fun getText(text:String):String{
        return text + " override"
    }

}
