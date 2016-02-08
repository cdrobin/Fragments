package edu.dtcc.crobin57.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.EditText;

public class InputFragment extends Fragment {

    private static EditText weightInput;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.input_fragment, container, false);

        weightInput = (EditText) view.findViewById(R.id.weightInput);

        weightInput.setOnFocusChangeListener(
            new View.OnFocusChangeListener() {
                public void onFocusChange(View v, boolean hasFocus) {

                }
            }
        );

        return view;
    }
}
