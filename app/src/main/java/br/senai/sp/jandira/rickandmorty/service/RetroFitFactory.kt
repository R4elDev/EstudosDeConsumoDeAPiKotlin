package br.senai.sp.jandira.rickandmorty.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetroFitFactory {
    private val BASE_URL = "https://rickandmortyapi.com/api/"


    //  Builder é quem controi a conexão para esse servidor
    //  addConverterFactory() --> converte para JSON
    private val retroFitFactory = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()


    // Retorna um character Service ou seja metodos que retornam a funçao, pegando o resultado do ENDPOINT

    fun getCharacterService(): CharacterService {
        return retroFitFactory.create(CharacterService::class.java)
    }


}