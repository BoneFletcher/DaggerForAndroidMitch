package com.sdv.daggerforandroidmitch.di;

import androidx.lifecycle.ViewModelProvider;
import dagger.Binds;
import dagger.Module;

/**
 * Created by FrostEagle on 05.11.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);

}
