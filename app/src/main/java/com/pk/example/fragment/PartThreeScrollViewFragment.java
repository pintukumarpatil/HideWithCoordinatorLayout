package com.pk.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pk.example.R;

public class PartThreeScrollViewFragment extends Fragment {

    public final static String ITEMS_COUNT_KEY = "PartThreeRecyclerViewFragment$ItemsCount";

    public static PartThreeScrollViewFragment createInstance(int itemsCount) {
        PartThreeScrollViewFragment partThreeFragment = new PartThreeScrollViewFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ITEMS_COUNT_KEY, itemsCount);
        partThreeFragment.setArguments(bundle);
        return partThreeFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate( R.layout.scroll_view, container, false);
        setupView(view);
        return view;
    }

    private void setupView(View view) {

    }

}
