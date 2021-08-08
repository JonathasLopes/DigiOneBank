package com.example.digionebank.testes

import com.example.digionebank.Cliente
import com.example.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
            name = "jose",
            cpf = "987.654.321-45",
            clienteTipo = ClienteTipo.PF,
            senha = "123"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)
}
