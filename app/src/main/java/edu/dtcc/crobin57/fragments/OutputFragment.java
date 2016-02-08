package edu.dtcc.crobin57.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OutputFragment extends Fragment {

    private static TextView baseCost;
    private static TextView addedCost;
    private static TextView totalCost;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.output_fragment, container, false);

        // Get references
        baseCost = (TextView) view.findViewById(R.id.baseCostOutput);
        addedCost = (TextView) view.findViewById(R.id.addedCostOutput);
        totalCost = (TextView) view.findViewById(R.id.totalCostOutput);

        return view;
    }

    public void setMyText(String weight) {
        // Logic
    }

}
