package me.ashif.sunnahaday.ui.sunnah;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.ashif.sunnahaday.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SunnahListFragment extends Fragment {

    public SunnahListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sunnah_list, container, false);
    }

}
