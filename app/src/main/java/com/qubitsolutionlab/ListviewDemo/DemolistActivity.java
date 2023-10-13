package com.qubitsolutionlab.ListviewDemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.qubitsolutionlab.Demowebview.Demo_webview;
import com.qubitsolutionlab.demo_widget.R;

import java.util.ArrayList;

public class DemolistActivity extends AppCompatActivity {

    ListView view;

    ArrayList<String> strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demolist);
        view = findViewById(R.id.listview_main);

        strings = new ArrayList<>();

        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");
        strings.add("ASDSD");

        ArrayAdapter adapter = new ArrayAdapter(DemolistActivity.this, R.layout.iteam_listmain, strings);
        view.setAdapter(adapter);

        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(DemolistActivity.this, Demo_webview.class));
            }
        });

    }

}