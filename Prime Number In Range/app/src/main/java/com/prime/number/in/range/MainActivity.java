package com.prime.number.in.range;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText start, end;
    Button button;
    TextView prime,notPrime;
    int startn,endn,flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        end = findViewById(R.id.end);
        button = findViewById(R.id.button);
        prime = findViewById(R.id.prime);
        notPrime = findViewById(R.id.notPrime);
        prime.setMovementMethod(new ScrollingMovementMethod());
        notPrime.setMovementMethod(new ScrollingMovementMethod());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                prime.setText("");
                notPrime.setText("");
                prime.setText("Prime\n\n");
                notPrime.setText("Not Prime\n\n");

                startn = Integer.parseInt(start.getText().toString());
                endn = Integer.parseInt(end.getText().toString());

                for(int i=startn;startn<=endn;startn++){
                    flag=0;
                    for (int j=2;j<startn/2;j++)
                        if(flag==1)
                            break;
                        else if(startn%j==0)
                            flag=1;

                    if(flag==1)
                        notPrime.setText(notPrime.getText().toString()+""+startn+"\n");
                    else
                        prime.setText(prime.getText().toString()+""+startn+"\n");
                }

            }
        });


    }
}