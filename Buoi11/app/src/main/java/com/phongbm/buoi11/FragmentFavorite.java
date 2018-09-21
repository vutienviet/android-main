package com.phongbm.buoi11;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.phongbm.buoi11.databinding.UiFavoriteBinding;
import com.phongbm.buoi11.databinding.UiSavedBinding;

public class FragmentFavorite extends Fragment{
    private static FragmentFavorite instance;
    private UiFavoriteBinding binding;

    public static FragmentFavorite getInstance() {
        if (instance == null){
            instance = new FragmentFavorite();
        }
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = UiFavoriteBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
