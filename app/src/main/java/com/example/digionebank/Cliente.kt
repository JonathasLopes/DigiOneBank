package com.example.digionebank

class Cliente(
        name: String,
        cpf: String,
        val clienteTipo: ClienteTipo,
        val senha: String
) : Pessoa(name, cpf), Logavel {
    override fun login(): Boolean = "123" == senha

    override fun toString(): String = """
        Nome: $name
        CPF: $cpf
        Tipo: ${clienteTipo.descricao}
    """.trimIndent()
}