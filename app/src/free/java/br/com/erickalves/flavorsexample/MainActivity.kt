package br.com.erickalves.flavorsexample

import android.os.Bundle
import android.widget.Toast
import br.com.erickalves.flavorsexample.MainActivityBase

class MainActivity : MainActivityBase() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        Toast.makeText(this, getText("free"), Toast.LENGTH_LONG).show()

    }


}
