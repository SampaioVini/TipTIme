package com.ds.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ds.tiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calcularBotao.setOnClickListener{ calcularGorjeta() }
    }
    fun calcularGorjeta() {
        val stringInTextField = binding.custoDeServiO.text.toString()
        val cost = stringInTextField.toDouble()
        val selecionarId = binding.opcoes.checkedRadioButtonId
        val tipoPercentagem = when (selecionarId) {
            R.id.opcao_vinte_porcento -> 0.20
            R.id.opcao_dezoito_porcento -> 0.18
            else
            -> 0.15
        }
        var tipo = tipoPercentagem * cost
    }
}