package com.sdv.daggerforandroidmitch.di.auth;

import com.sdv.daggerforandroidmitch.di.ViewModelKey;
import com.sdv.daggerforandroidmitch.ui.auth.AuthViewModel;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by FrostEagle on 05.11.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);

}
