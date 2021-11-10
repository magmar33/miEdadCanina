package com.hackaprende.miedadcanina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hackaprende.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCalcular.setOnClickListener{
            val ageString = binding.etEdad.text.toString()
            if(ageString.isNotEmpty()){
                val ageInt = ageString.toInt()
                val result = ageInt*7
                binding.tvEdad.text= getString(R.string.resultado,result)
            }
            else{
                //Toast.makeText(this,"Llene el campo de edad",Toast.LENGTH_LONG).show()
                toast(R.string.restriccion)
            }
        }
    }
    fun toast(texto: Int){
        Toast.makeText(this,getString(texto),Toast.LENGTH_LONG).show()
    }

}