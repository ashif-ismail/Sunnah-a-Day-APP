package me.ashif.sunnahaday.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.ashif.sunnahaday.util.AppUtils;

/**
 * Created by Ashif on 20/7/17,July,2017
 * github.com/SheikhZayed
 */

@Module
public class AppModule {
    //all the dependencies for the complete app should go here

    @Singleton
    @Provides
    public AppUtils providesAppUtils() {
        return new AppUtils();
    }
}
