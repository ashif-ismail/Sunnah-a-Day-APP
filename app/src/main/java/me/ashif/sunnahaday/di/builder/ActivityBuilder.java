package me.ashif.sunnahaday.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.ashif.sunnahaday.di.modules.MainActivityModule;
import me.ashif.sunnahaday.ui.MainActivity;

/**
 * Created by Ashif on 21/7/17,July,2017
 * github.com/SheikhZayed
 */

@Module
public abstract class ActivityBuilder {
    //all activities that are to be binded to
    // dagger should register here.
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity providesMainActivity();
}
