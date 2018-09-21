package com.phongbm.buoi11;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phongbm.buoi11.databinding.UiNewsBinding;
import com.phongbm.buoi11.databinding.UiSavedBinding;

public class FragmentSaved extends Fragment{
    private static FragmentSaved instance;
    private UiSavedBinding binding;

    public static FragmentSaved getInstance() {
        if (instance == null){
            instance = new FragmentSaved();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = UiSavedBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
