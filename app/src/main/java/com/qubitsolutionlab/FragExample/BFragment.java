package com.qubitsolutionlab.FragExample;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qubitsolutionlab.demo_widget.R;
import com.qubitsolutionlab.navigationdrawer.Navigationdrawer_example;

public class BFragment extends Fragment {


    public BFragment() {

    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        AppCompatButton button = view.findViewById(R.id.navigation_drawer_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Navigationdrawer_example.class));
            }
        });
        return view;
    }
}