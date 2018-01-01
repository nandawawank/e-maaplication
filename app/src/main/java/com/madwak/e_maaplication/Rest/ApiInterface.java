package com.madwak.e_maaplication.Rest;

import com.madwak.e_maaplication.Model.getEvent;
import com.madwak.e_maaplication.Model.PostPutDelEvent;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

/**
 * Created by nandawk on 1/1/18.
 */

public class ApiInterface {
    @GET("db_dkm_android")
    Call<getEvent> getEvent() {
        return null;
    }

    @FormUrlEncoded
    @POST("db_dkm")
    Call<PostPutDelEvent> postEvent(@Field("id_event") String id_event,
                                    @Field("nama_event") String nama_event,
                                    @Field("pemateri") String pemateri,
                                    @Field("lokasi_event") String lokasi_event,
                                    @Field("tlp_event") String tlp_event,
                                    @Field("waktu_event") String waktu_event) {
        return null;
    }

    @FormUrlEncoded
    @PUT("db_dkm")
    Call<PostPutDelEvent> putEvent(@Field("id_event") String id_event,
                                   @Field("nama_event") String nama_event,
                                   @Field("pemateri") String pemateri,
                                   @Field("lokasi_event") String lokasi_event,
                                   @Field("tlp_event") String tlp_event,
                                   @Field("waktu_event") String waktu_event) {
        return null;
    }

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "db_dkm", hasBody = true)
    Call<PostPutDelEvent> deleteEvent(@Field("id_event") String id) {
        return null;
    }
}
