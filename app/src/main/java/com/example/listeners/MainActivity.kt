package com.example.listeners

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import com.example.listeners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var valorActual = 0
    var colorVerde=ColorStateList.valueOf(Color.parseColor("#40F506"))
    var colorRojo=ColorStateList.valueOf(Color.parseColor("#F50614"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.editTextTextPersonName2.setOnFocusChangeListener { view, b ->
            if (b) {
                binding.button.backgroundTintList = colorVerde
                binding.button2.backgroundTintList = colorRojo
            }

        }

        binding.button.setOnClickListener { suma () }
        binding.button2.setOnClickListener { resta() }
    }

    fun suma(){
        var editT= binding.editTextTextPersonName2
        var textV= binding.textView2
        valorActual += editT.text.toString().toInt()
        textV.text= valorActual.toString()
    }
    fun resta(){
        var editT= binding.editTextTextPersonName2
        var textV= binding.textView2
        valorActual -= editT.text.toString().toInt()
        if (valorActual< 0){
            valorActual=0
            textV.text= "0"
        }else{
            textV.text= valorActual.toString()
        }
    }


}