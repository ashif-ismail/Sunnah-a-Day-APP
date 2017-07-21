package me.ashif.sunnahaday.di.builder;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.ashif.sunnahaday.di.modules.SalathFragmentModule;
import me.ashif.sunnahaday.di.modules.SunnahFragmentModule;
import me.ashif.sunnahaday.ui.salath.SalathListFragment;
import me.ashif.sunnahaday.ui.sunnah.SunnahListFragment;

/**
 * Created by Ashif on 21/7/17,July,2017
 * github.com/SheikhZayed
 */

@Module
public abstract class FragmentBuilder {
    //all fragments that are to be binded to
    // dagger should register here.
    @ContributesAndroidInjector(modules = SunnahFragmentModule.class)
    abstract SunnahListFragment providesSunnahFragment();

    @ContributesAndroidInjector(modules = SalathFragmentModule.class)
    abstract SalathListFragment providesSalathFramgent();
}
