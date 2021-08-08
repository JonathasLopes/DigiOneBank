package com.example.digionebank.testes

import com.example.digionebank.Gerente

fun main() {
    val joao = Gerente("Joao", "123.456.789-78", 5000.0, "123")

    ImprimeRelatorioFuncionario.imprime(joao);

    TesteAutenticacao().autentica(joao)
}