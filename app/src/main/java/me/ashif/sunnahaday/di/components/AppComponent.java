package me.ashif.sunnahaday.di.components;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import me.ashif.sunnahaday.app.SunnahApp;
import me.ashif.sunnahaday.di.builder.ActivityBuilder;
import me.ashif.sunnahaday.di.modules.AppModule;

/**
 * Created by Ashif on 20/7/17,July,2017
 * github.com/SheikhZayed
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent {
    void inject(SunnahApp app);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
