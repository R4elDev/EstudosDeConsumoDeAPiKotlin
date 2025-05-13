package br.senai.sp.jandira.rickandmorty.model
// Essa classe vai conter a lista de personagens
data class Result (
    var results: List<Character>? = null // Importa a lista de personagens do nosso outro arquivo e inicialmente é uma lista vazia
)