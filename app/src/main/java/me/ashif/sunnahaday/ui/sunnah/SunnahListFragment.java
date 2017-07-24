package me.ashif.sunnahaday.ui.sunnah;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.ashif.sunnahaday.R;
import me.ashif.sunnahaday.databinding.FragmentSunnahListBinding;
import me.ashif.sunnahaday.di.components.Injectable;

/**
 * A simple {@link Fragment} subclass.
 */
public class SunnahListFragment extends Fragment implements Injectable {

    private FragmentSunnahListBinding mFragmentSunnahListBinding;

    public SunnahListFragment() {
        // Required empty public constructor
    }

    public static SunnahListFragment newInstance() {
        return new SunnahListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mFragmentSunnahListBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_sunnah_list, container, false);
        return mFragmentSunnahListBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setupView();
    }

    private void setupView() {

    }
}
