package com.example.tugasintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activitykedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitykedua)

        var intent = intent
        val NIM = intent.getStringExtra("NIM")
        val Nama = intent.getStringExtra("Nama")
        var Nilai = intent.getStringExtra("Nilai")

        val hasil = findViewById<TextView>(R.id.hasil)
        hasil.text = "NIM : "+NIM+"\nNama: "+Nama+"\nNilai: "+Nilai

        val ket = findViewById<TextView>(R.id.keterangan)
        if (Nilai >= 80.toInt().toString() || Nilai == 100.toInt().toString()) {
            ket.text = "Keterangan : A"
        }
        else if (Nilai >= 60.toInt().toString()) {
            ket.text = "Keterangan : B"
        }
        else if (Nilai >= 40.toInt().toString()) {
            ket.text = "Keterangan : C"
        }
        else if (Nilai >= 20.toInt().toString()) {
            ket.text = "Keterangan : D"
        }
        else if (Nilai >= 0.toInt().toString()) {
            ket.text = "Keterangan : E"
        }
    }
}

