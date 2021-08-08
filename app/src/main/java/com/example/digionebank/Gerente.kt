package com.example.digionebank

class Gerente(
        name:String,
        cpf:String,
        salario:Double,
        val senha:String
) : Funcionario(name = name, cpf = cpf, salario = salario), Logavel {
    override fun calculaAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "123" == senha
}