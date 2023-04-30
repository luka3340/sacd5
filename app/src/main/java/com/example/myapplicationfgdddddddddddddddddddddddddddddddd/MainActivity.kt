package com.example.myapplicationfgdddddddddddddddddddddddddddddddd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var button1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var p = 0
//
//       button1 = findViewById(R.id.button1)
//
//        button1.setOnClickListener {
//            var i = p++
//            Toast.makeText(this,"${i}",Toast.LENGTH_SHORT).show()
//        }
//

        button1 = findViewById(R.id.button1)

        button1.setOnClickListener {

            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

}
}




//        var button = findViewById<Button>(R.id.button1)
//
//        button.setOnClickListener {
//
//            val intent = Intent(this, MainActivity2::class.java)
//            startActivity(intent)
//        }


