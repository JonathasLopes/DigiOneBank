package com.example.digionebank

class Analista(
        name:String,
        cpf:String,
        salario:Double
) : Funcionario(name, cpf, salario) {
    override fun calculaAuxilio() = salario * 0.1

}