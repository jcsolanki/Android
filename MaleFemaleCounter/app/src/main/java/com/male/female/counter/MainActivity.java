package com.male.female.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView maleTextView,femaleTextView;
    Button maleButton,femaleButton;
    static int maleCounter=0,femaleCounter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maleTextView = findViewById(R.id.maleTextView);
        femaleTextView = findViewById(R.id.femaleTextView);
        maleButton = findViewById(R.id.maleButton);
        femaleButton = findViewById(R.id.femaleButton);

        maleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maleTextView.setText("Male: "+(++maleCounter));
                Toast.makeText(getApplicationContext(), "Male: "+maleCounter, Toast.LENGTH_SHORT).show();
            }
        });

        femaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                femaleTextView.setText("Female: "+(++femaleCounter));
                Toast.makeText(getApplicationContext(), "Female: "+femaleCounter, Toast.LENGTH_SHORT).show();
            }
        });
    }
}