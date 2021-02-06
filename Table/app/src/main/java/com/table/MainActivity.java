package com.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.file.Watchable;

public class MainActivity extends AppCompatActivity {

    EditText table,start,end;
    TextView display;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        table = findViewById(R.id.table);
        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        display = findViewById(R.id.display);
        calculate = findViewById(R.id.calculate);
        display.setMovementMethod(new ScrollingMovementMethod());

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(table.getText() != null && start.getText() != null && end.getText() != null) {
                    int i = Integer.parseInt(start.getText().toString()), j = Integer.parseInt(end.getText().toString());
                    display.setText(null);
                    for (; i <= j; i++) {

                        display.setText(display.getText()+table.getText().toString()+ " X " + i + " = " + Integer.parseInt(table.getText().toString()) * i+"\n");

                    }
                }
                else
                    display.setText("Invalid Input!!!");
            }
        });
    }
}