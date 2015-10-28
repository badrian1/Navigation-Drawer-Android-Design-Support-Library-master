package com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrary.Fragment;

/**
 * Created by Boris on 27-10-2015.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrary.MainActivity;
import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrary.R;


public class MediFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_medi, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Medicamentos");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentMedi);

        final TextView textViewMediFragment = (TextView) view.findViewById(R.id.textViewMediFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewMediFragment.setText("wena wena");
                textViewMediFragment.setTextColor(getResources().getColor(R.color.md_yellow_800));

            }
        });

        return view;
    }

}
