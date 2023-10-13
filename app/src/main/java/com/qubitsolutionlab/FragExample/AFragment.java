package com.qubitsolutionlab.FragExample;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.qubitsolutionlab.Bottomnavigation.Bottomnav_example;
import com.qubitsolutionlab.demo_widget.R;

public class AFragment extends Fragment {

    public AFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button button = view.findViewById(R.id.bottom_nav);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Bottomnav_example.class));
            }
        });
        return view;
    }

}