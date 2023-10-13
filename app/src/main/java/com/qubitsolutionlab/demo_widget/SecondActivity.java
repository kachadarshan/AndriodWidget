package com.qubitsolutionlab.demo_widget;

import static android.Manifest.permission.CALL_PHONE;
import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.qubitsolutionlab.FragExample.Demooffrag;

public class SecondActivity extends AppCompatActivity {

    TextView view, getView;

    Button btn1, btn2, btn3, demofrga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        view = findViewById(R.id.txt);
        getView = findViewById(R.id.txt_sec);
        btn1 = findViewById(R.id.onebald);
        btn2 = findViewById(R.id.twobald);
        btn3 = findViewById(R.id.threebald);
        demofrga = findViewById(R.id.demofrga);

        Bundle bundle = getIntent().getExtras();
        String onnf = bundle.getString("Dk");
        String ind = bundle.getString("DK1");

        view.setText(String.valueOf(onnf));
        getView.setText(ind);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(SecondActivity.this);
                alertDialog.setIcon(R.drawable.ic_launcher_background);
                alertDialog.setTitle("Its Happening");
                alertDialog.setMessage("Working Working ");

                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SecondActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SecondActivity.this, "NO", Toast.LENGTH_SHORT).show();

                    }
                });
                alertDialog.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(SecondActivity.this);
                alertDialog.setIcon(R.drawable.ic_launcher_background);
                alertDialog.setTitle("Its Happening");
                alertDialog.setMessage("Working Working ");

                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SecondActivity.this, "Yes", Toast.LENGTH_SHORT).show();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SecondActivity.this, "NO", Toast.LENGTH_SHORT).show();

                    }
                });
                alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SecondActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog.show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel: +918780098183"));

                if (ContextCompat.checkSelfPermission(SecondActivity.this, CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(intent);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });


        demofrga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, Demooffrag.class));
            }
        });
    }
}