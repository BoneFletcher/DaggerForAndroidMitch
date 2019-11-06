package com.sdv.daggerforandroidmitch;


import com.sdv.daggerforandroidmitch.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by FrostEagle on 15.09.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}
