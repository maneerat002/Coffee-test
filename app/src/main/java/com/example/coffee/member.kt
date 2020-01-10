package com.example.member

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coffee.R

class member : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.member)
        supportActionBar?.hide()

}
}
