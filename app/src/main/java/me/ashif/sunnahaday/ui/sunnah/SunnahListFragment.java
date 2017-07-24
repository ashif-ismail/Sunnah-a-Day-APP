package me.ashif.sunnahaday.ui.sunnah;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.ashif.sunnahaday.R;
import me.ashif.sunnahaday.di.components.Injectable;

/**
 * A simple {@link Fragment} subclass.
 */
public class SunnahListFragment extends Fragment implements Injectable {

    public SunnahListFragment() {
        // Required empty public constructor
    }

    public static SunnahListFragment newInstance() {
        return new SunnahListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sunnah_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("tag", "onViewCreated: Sunnah Fragment");
    }
}
