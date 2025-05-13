package br.senai.sp.jandira.rickandmorty.model

// Esse cria personagem por personagem e o outro cria uma lista desses personagens
data class Character(
    // Quando formos criar um personagem, é necessario fornecer os seguintes atributos
    // O nome do atributo no kotlin tem que ser o mesmo que no json da API
    var id: Int = 0, // No kotlin é necessario iniciar a variavel 0 ou vazia
    var name: String = "",
    var status: String = "",
    var species: String = "",
    var image: String = ""
)