package me.ashif.sunnahaday.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import me.ashif.sunnahaday.R;
import me.ashif.sunnahaday.databinding.ActivityMainBinding;
import me.ashif.sunnahaday.ui.favourites.FavouriteFragment;
import me.ashif.sunnahaday.ui.notifications.NotificationFragment;
import me.ashif.sunnahaday.ui.salath.SalathListFragment;
import me.ashif.sunnahaday.ui.sunnah.SunnahListFragment;

public class MainActivity extends AppCompatActivity implements HasSupportFragmentInjector {

    private ActivityMainBinding mBinding;
    private DispatchingAndroidInjector<Fragment> mFragmentDispatchingAndroidInjector;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_sunnah:
                    selectedFragment = SunnahListFragment.newInstance();
                    break;
                case R.id.navigation_salath:
                    selectedFragment = SalathListFragment.newInstance();
                    break;
                case R.id.navigation_notifications:
                    selectedFragment = NotificationFragment.newInstance();
                    break;
                case R.id.navigation_favourites:
                    selectedFragment = FavouriteFragment.newInstance();
                    break;
            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.parent, selectedFragment);
            transaction.commit();
            return true;
        }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //ViewUtils.removeShiftMode(mBinding.navigation);
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return mFragmentDispatchingAndroidInjector;
    }
}
