package me.ashif.sunnahaday.ui.salath;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import me.ashif.sunnahaday.R;
import me.ashif.sunnahaday.databinding.FragmentSalathListBinding;
import me.ashif.sunnahaday.di.components.Injectable;

/**
 * A simple {@link Fragment} subclass.
 */
public class SalathListFragment extends Fragment implements Injectable {

    private FragmentSalathListBinding mFragmentSalathListBinding;

    public SalathListFragment() {
        // Required empty public constructor
    }

    public static SalathListFragment newInstance() {
        return new SalathListFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mFragmentSalathListBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_salath_list, container, false);
        return mFragmentSalathListBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupView();
    }

    private void setupView() {
        ImageView backgroundImage = mFragmentSalathListBinding.getRoot().findViewById(R.id.backdrop);
        backgroundImage.setImageResource(R.drawable.madeena_two);

        Toolbar toolbar = mFragmentSalathListBinding.getRoot().findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.text_salath);
    }
}
