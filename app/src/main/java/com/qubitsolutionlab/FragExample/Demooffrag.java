package com.qubitsolutionlab.FragExample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.qubitsolutionlab.Tablayout.Tablayout_example;
import com.qubitsolutionlab.demo_widget.R;

public class Demooffrag extends AppCompatActivity {

    FrameLayout one, seconnd;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demooffrag);
        one = findViewById(R.id.framelayout);
        seconnd = findViewById(R.id.framelayout_second);
        button = findViewById(R.id.tablayout);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.framelayout, new AFragment());
        transaction.commit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Demooffrag.this, Tablayout_example.class));
            }
        });
    }
}