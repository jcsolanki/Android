package com.actv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView actv;
    TextView textView;
    String name[] ={"Kapil Sharma","Narendra Modi","Elon Musk"};
    Integer image[] = {R.drawable.kapil_sharma,R.drawable.narendra_modi,R.drawable.elon_musk};
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, name);


        actv = findViewById(R.id.autoCompleteTextView);
        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        actv.setThreshold(1);
        actv.setAdapter(adapter);

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), ""+adapter.getItem(i), Toast.LENGTH_SHORT).show();
                textView.setText(""+adapter.getItem(i));

                for(int index=0;index<name.length;index++)
                    if(name[index].equals(adapter.getItem(i)))
                        imageView.setImageResource(image[index]);

            }
        });



    }
}