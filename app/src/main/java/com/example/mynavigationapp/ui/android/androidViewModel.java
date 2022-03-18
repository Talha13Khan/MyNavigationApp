package com.example.mynavigationapp.ui.android;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class androidViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public androidViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Android fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}