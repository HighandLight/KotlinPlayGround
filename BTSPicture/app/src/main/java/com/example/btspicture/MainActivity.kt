package com.example.btspicture

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener {
            Toast.makeText(this,"1번 클릭 완료", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.image_2)
        image2.setOnClickListener{
            Toast.makeText(this, "2번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this,Bts2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.image_3 )
        image3.setOnClickListener {
            Toast.makeText(this, "3번 사진 클릭, Toast short", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.image_4)
        image4.setOnClickListener{
            Toast.makeText(this, "4번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this,Bts4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.image_5)
        image5.setOnClickListener {
            Toast.makeText(this, "5번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.image_6)
        image6.setOnClickListener {
            Toast.makeText(this, "6번 사진 클릭", Toast.LENGTH_LONG).show()
            val intent = Intent(this,Bts6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.image_7)
        image7.setOnClickListener {
            Toast.makeText(this, "7번 사진 출력", Toast.LENGTH_LONG).show()
            val intent  = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}