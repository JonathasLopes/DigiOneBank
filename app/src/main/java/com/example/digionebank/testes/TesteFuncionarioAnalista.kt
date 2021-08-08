package com.example.digionebank.testes

import com.example.digionebank.Analista

fun main() {
    val jonathas = Analista("Jonathas", "123.456.789-78", 2000.0)

    ImprimeRelatorioFuncionario.imprime(jonathas);
}