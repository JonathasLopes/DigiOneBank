package com.example.digionebank.testes

import com.example.digionebank.Banco

fun main () {
    val digiOneBank = Banco( nome = "DigiOne", numero = 12 )

    println(digiOneBank.nome)
    println(digiOneBank.numero)
}