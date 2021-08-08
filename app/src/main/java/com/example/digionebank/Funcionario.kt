package com.example.digionebank

abstract class Funcionario(
        name:String,
        cpf:String,
        val salario:Double
) : Pessoa(name, cpf) {
    protected abstract fun calculaAuxilio(): Double

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Salario: $salario
        Auxilio: ${calculaAuxilio()}
    """.trimIndent()
}