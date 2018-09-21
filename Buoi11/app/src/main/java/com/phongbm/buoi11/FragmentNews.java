package com.phongbm.buoi11;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phongbm.buoi11.databinding.UiNewsBinding;

public class FragmentNews extends Fragment {
    private static FragmentNews instance;
    private UiNewsBinding binding;
    private int number = 0;

    public static FragmentNews getInstance() {
        if (instance == null) {
            instance = new FragmentNews();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = UiNewsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void setNumber() {
        number++;
        binding.tvNumber.setText(number + "");
    }
}
