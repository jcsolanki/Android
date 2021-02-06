package com.prime.number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number;
    Button button;
    TextView textView;
    int n,flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 textView.setText("");
                 flag=0;
                 n = Integer.parseInt(number.getText().toString());

                 for (int i= 2; i<n/2;i++)
                     if(flag==1)
                         break;
                     else if(n%i==0)
                         flag=1;

                 if (flag==1)
                     textView.setText("Not Prime");
                 else
                     textView.setText("Prime");
             }
         });



    }
}