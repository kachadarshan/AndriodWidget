package com.qubitsolutionlab.Tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.qubitsolutionlab.demo_widget.R;

public class Tablayout_example extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout_example);
        tabLayout = findViewById(R.id.tablayot);
        viewPager = findViewById(R.id.viewpager);

        tablay_adapter adapter = new tablay_adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

    }

}