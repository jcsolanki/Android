package com.combo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class combo extends AppCompatActivity {
    Button actvbtn,spinnerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combo);

        actvbtn = findViewById(R.id.actvbtn);
        spinnerbtn = findViewById(R.id.spinnerbtn);

        actvbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                new Thread() {
                    public void run() {
                        try {
                                Intent intent = new Intent(getApplicationContext(), ACTV.class);
                                startActivity(intent);
                        }catch(Exception e){}
                    }
                }.start();

            }
        });

        spinnerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                new Thread() {
                    public void run() {
                        try {
                            Intent intent = new Intent(getApplicationContext(), SpinnerActivity.class);
                            startActivity(intent);
                        }catch(Exception e){}
                    }
                }.start();

            }
        });
    }
}