package com.kazimasum.ecommdemo;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface apiset
{
     @FormUrlEncoded
     @POST("signup")
    Call<signup_response_model> getregister(
          @Field("name") String name,
          @Field("email") String email,
          @Field("password") String password,
          @Field("mobile") String mobile,
          @Field("address") String address
     );

}
