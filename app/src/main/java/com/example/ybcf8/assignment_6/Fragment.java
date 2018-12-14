package com.example.ybcf8.assignment_6;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment extends android.support.v4.app.Fragment {
    View baseView;
    ImageView mImage;
    int resID;

    public void setData(int resId) {
        this.resID = resId;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        baseView = inflater.inflate(R.layout.first_picture, container, false);

        mImage = baseView.findViewById(R.id.firstpicture);
        mImage.setImageResource(resID);

        return baseView;
    }
}
