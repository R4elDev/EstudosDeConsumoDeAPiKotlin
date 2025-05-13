package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.Character
import br.senai.sp.jandira.rickandmorty.model.Result
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


// Criando os caminhos do endPoint

interface CharacterService {

    @POST("character")
    fun insert(@Body character: Character): Call<Character>

    @POST("character")
    fun update(@Body character: Character): Call<Character>



    @GET("character")
    fun listAllCaharacters(): Call<Result>


    // Path serve para pegar a part que precisa ser filtrada para na url, o exemplo baixo fica obvio o seu funcionamento
    @GET("character/{id}")
    fun getCharacterById( @Path("id") id:Int ): Call<Character>
}