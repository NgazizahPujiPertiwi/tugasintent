package com.example.tugasintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val NIM = findViewById<EditText>(R.id.nim)
        val Nama= findViewById<EditText>(R.id.nama)
        val Nilai = findViewById<EditText>(R.id.nilai)
        val btn_proses = findViewById<Button>(R.id.btn_proses)

        btn_proses.setOnClickListener {
            val NIM = NIM.text.toString()
            val Nama= Nama.text.toString()
            val Nilai = Nilai.text.toString()

            val intent = Intent(this@MainActivity, activitykedua::class.java)
            intent.putExtra("NIM", NIM)
            intent.putExtra("Nama", Nama)
            intent.putExtra("Nilai", Nilai)
            startActivity(intent)

        }
    }
}
