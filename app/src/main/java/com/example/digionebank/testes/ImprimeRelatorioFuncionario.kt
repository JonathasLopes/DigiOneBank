package com.example.digionebank.testes

import com.example.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                    funcionario.toString()
            )
        }
    }
}