package com.sdv.daggerforandroidmitch.di;

import android.app.Application;

import com.sdv.daggerforandroidmitch.BaseApplication;
import com.sdv.daggerforandroidmitch.di.module.ActivityBuildersModule;
import com.sdv.daggerforandroidmitch.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by FrostEagle on 02.11.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ActivityBuildersModule.class,
                AppModule.class,
                ViewModelFactoryModule.class,
        }
)
public interface AppComponent extends AndroidInjector<BaseApplication> {
        @Component.Builder
        interface Builder{
                @BindsInstance
                Builder application(Application application);
                AppComponent build();
        }
}
