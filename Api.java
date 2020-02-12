package com.example.finalprojesi;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {


   /* @HTTP(method = "DELETE", path = "deleteAdvertise", hasBody = true)
    Call<ResponseBody> deleteAdvertise(
            @Field("id") String id
    );
*/

    @FormUrlEncoded
    @POST("createAdvertise")
    Call<ResponseBody> createAdvertise(
            @Field("category") String category,
            @Field("type") String type,
            @Field("adress") String adress,
            @Field("price") String price,
            @Field("room") String room,
            @Field("size") String size

    );

    @FormUrlEncoded
    @PUT("updateAdvertise")
    Call<ResponseBody> updateAdvertise(
            @Field("id") String id,
            @Field("category") String category,
            @Field("type") String type,
            @Field("adress") String adress,
            @Field("price") String price,
            @Field("room") String room,
            @Field("size") String size

    );
    @FormUrlEncoded
    @PUT("deleteAdvertise")
    Call<ResponseBody> deleteAdvertise(
            @Field("id") String id
    );

    @GET("getAll")
    Call<AdversiteResponse> getUsers();
}
