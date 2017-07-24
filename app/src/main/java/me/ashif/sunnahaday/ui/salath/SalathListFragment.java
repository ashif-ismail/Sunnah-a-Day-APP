package me.ashif.sunnahaday.ui.salath;


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
public class SalathListFragment extends Fragment implements Injectable {

    public SalathListFragment() {
        // Required empty public constructor
    }

    public static SalathListFragment newInstance() {
        return new SalathListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_salath_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("tag", "onViewCreated: Salath Fragment");
    }
}
