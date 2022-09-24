package com.example.diufacultyinfo.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Name: Md. Toukir Ahmed Mehedi\nId: 171-15-1194\nSection: PC - D\nDepartment of CSE\nDaffodil International University\nPhone: 01521301749\nEmail: toukir15-1194@diu.edu.bd\nDIU Faculty Ifo app is a Education type app.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}