package com.sdv.daggerforandroidmitch.network.auth;

import com.sdv.daggerforandroidmitch.models.User;

import io.reactivex.Flowable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AuthAPI {

    @GET("users/{id}")
    Flowable<User> getUser(@Path("id") int id);
}
