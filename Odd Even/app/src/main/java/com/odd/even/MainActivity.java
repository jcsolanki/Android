package com.odd.even;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText start,end;
    TextView odd,even;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        odd = findViewById(R.id.odd);
        even = findViewById(R.id.even);
        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        button = findViewById(R.id.button);

        odd.setMovementMethod(new ScrollingMovementMethod());
        even.setMovementMethod(new ScrollingMovementMethod());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                odd.setText("");
                even.setText("");
                odd.setText("Odd\n\n");
                even.setText("Even\n\n");
                int starting=Integer.parseInt(start.getText().toString()),ending=Integer.parseInt(end.getText().toString());

                for (;starting<=ending;starting++)
                    if(starting % 2==0)
                        even.setText(even.getText()+""+starting+"\n");
                    else
                        odd.setText(odd.getText()+""+starting+"\n");

            }
        });

    }
}