package com.qubitsolutionlab.Bottomnavigation;

import static com.qubitsolutionlab.demo_widget.R.id.status;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.qubitsolutionlab.FragExample.AFragment;
import com.qubitsolutionlab.FragExample.BFragment;
import com.qubitsolutionlab.FragExample.CFragment;
import com.qubitsolutionlab.demo_widget.R;

public class Bottomnav_example extends AppCompatActivity {

    BottomNavigationView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottomnav_example);

        view = findViewById(R.id.bottom_navg);

        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.home) {
                    Loadfrag(new AFragment(), 0);
                } else if (id == R.id.chat) {
                    Loadfrag(new BFragment(), 1);
                    new BFragment();
                } else if (id == R.id.video) {
                    Loadfrag(new CFragment(), 1);
                    new CFragment();
                } else if (id == status) {
                    Loadfrag(new AFragment(), 1);
                } else { //profile
                    Loadfrag(new BFragment(), 1);
                }
                return true;
            }
        });

    }

    public void Loadfrag(Fragment fragment, int flag) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (flag == 0) {
            transaction.add(R.id.container_bottom, fragment);
        } else {
            transaction.replace(R.id.container_bottom, fragment);
        }
        transaction.commit();
    }


}