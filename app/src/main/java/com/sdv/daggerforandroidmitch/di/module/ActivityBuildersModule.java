package com.sdv.daggerforandroidmitch.di.module;


import com.sdv.daggerforandroidmitch.di.auth.AuthModel;
import com.sdv.daggerforandroidmitch.di.auth.AuthViewModelsModule;
import com.sdv.daggerforandroidmitch.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by FrostEagle on 02.11.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModel.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
