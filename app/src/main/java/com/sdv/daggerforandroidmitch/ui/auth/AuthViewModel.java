package com.sdv.daggerforandroidmitch.ui.auth;

import android.util.Log;

import javax.inject.Inject;

import androidx.annotation.MainThread;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;

import com.sdv.daggerforandroidmitch.models.User;
import com.sdv.daggerforandroidmitch.network.auth.AuthAPI;

import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by FrostEagle on 05.11.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";
    private final AuthAPI authAPI;

    private MediatorLiveData<User> authUser = new MediatorLiveData<>();

    @Inject
    public AuthViewModel(AuthAPI authAPI) {
        this.authAPI = authAPI;
    }

    public void authenticateWithId(int userId){
        final LiveData<User> source = LiveDataReactiveStreams.fromPublisher(
                authAPI.getUser(userId)
                .subscribeOn(Schedulers.io()));

        authUser.addSource(source, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                authUser.setValue(user);
                authUser.removeSource(source);
            }
        });
    }

    public LiveData<User> observeUser(){
        return authUser;
    }
}
