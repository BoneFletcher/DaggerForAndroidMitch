package com.sdv.daggerforandroidmitch.ui.auth;

import android.util.Log;

import javax.inject.Inject;

import androidx.lifecycle.ViewModel;

import static androidx.constraintlayout.widget.Constraints.TAG;

/**
 * Created by FrostEagle on 05.11.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
public class AuthViewModel extends ViewModel {

    @Inject
    public AuthViewModel() {
        Log.d(TAG, "AuthViewModel: wwww ");
    }
}
