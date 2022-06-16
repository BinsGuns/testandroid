package com.android.test.network

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface RetroService {

    @GET("market/v2/get-summary")
    fun getMarketApi(@Header("X-RapidAPI-Key") rapidApiKey: String ,
                     @Header("X-RapidAPI-Host") rapidApiHost: String ,
                     @Query("q") query: String): Observable<MarketModel>

    @GET("stock/v2/get-summary")
    fun getStockApi(@Header("X-RapidAPI-Key") rapidApiKey: String ,
                     @Header("X-RapidAPI-Host") rapidApiHost: String ,
                     @Query("symbol") symbol: String,
                    @Query("region") region: String)
}