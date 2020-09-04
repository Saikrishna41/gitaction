package com.sk41.androiddemodatamanage.requests

import com.sk41.androiddemodatamanage.data.Monster
import retrofit2.Response
import retrofit2.http.GET

interface MonsterService {

    @GET("feeds/")
    suspend fun getMonsterData() : Response<List<Monster>>
    }
