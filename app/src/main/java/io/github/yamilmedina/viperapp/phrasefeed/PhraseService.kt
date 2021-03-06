package io.github.yamilmedina.viperapp.phrasefeed

import io.github.yamilmedina.viperapp.data.PhraseResultEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface PhraseService {

    @GET("random/{quantity}/limitTo=[nerdy,%20explicit]?escape=javascript")
    suspend fun fetchRandomPhrase(@Path("quantity") quantity: Int): PhraseResultEntity
}