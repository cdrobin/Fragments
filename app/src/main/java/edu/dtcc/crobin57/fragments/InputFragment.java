package edu.dtcc.crobin57.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.app.Activity;
import android.widget.EditText;

public class InputFragment extends Fragment {

    // Fields
    private static EditText weightInput;

    // Interface to interact with activity
    public interface InFragListener {
        void focusChanged(String weight);
    }

    InFragListener activityCommander;

    // Handler called when fragment is attached to activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // Initialize interface object
        try {
            activityCommander = (InFragListener) context;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout
        View view = inflater.inflate(R.layout.input_fragment, container, false);

        // Get reference to weightInput
        weightInput = (EditText) view.findViewById(R.id.weightInput);

        // Focus is changed listener
        weightInput.setOnFocusChangeListener(
            new View.OnFocusChangeListener() {
                public void onFocusChange(View v, boolean hasFocus) {
                    focusChanged(v);
                }
            }
        );

        return view;
    }

    // Method to handle focus change
    public void focusChanged(View view) {
        activityCommander.focusChanged(weightInput.getText().toString());
    }
}
