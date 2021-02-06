package com.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imageView;
    TextView textView;
    String[] name={"Select Option...","Kapil Sharma","Narendra Modi","Elon Musk"};
    Integer image[] = {R.drawable.kapil_sharma,R.drawable.narendra_modi,R.drawable.elon_musk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,name);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(parent.getSelectedItem().toString().equals("Select Option...")){}
                else {
                    Toast.makeText(MainActivity.this, "" + parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
                    imageView.setImageResource(image[parent.getSelectedItemPosition()-1]);
                    textView.setText(parent.getSelectedItem().toString());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}