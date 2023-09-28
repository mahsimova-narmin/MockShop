package com.narminmahsimova.mockshop.service

import com.narminmahsimova.mockshop.model.ShopModel
import io.reactivex.Observable
import retrofit2.http.GET

interface ShopAPI {

    //https://fakestoreapi.com/
    // products

    @GET("products")

    fun getData(): Observable<List<ShopModel>>
}