package com.example.mynavigationapp.ui.android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mynavigationapp.databinding.FragmentAndroidBinding;
import com.example.mynavigationapp.databinding.FragmentNotificationsBinding;

public class androidFragment extends Fragment {

    private FragmentAndroidBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        androidViewModel androidViewModel =
                new ViewModelProvider(this).get(com.example.mynavigationapp.ui.android.androidViewModel.class);

        binding = FragmentAndroidBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAndroid;
        androidViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}