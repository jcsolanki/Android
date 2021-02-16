package com.combo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    TextView process;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);
        process = findViewById(R.id.process);

        new Thread() {
            public void run() {
                int i = 0;
                try {
                    while (i < 100) {

                        if (i < 50) {
                            progressBar.setProgress(i);
                            process.setText("Fatching AutoCompleteTextView. ( " +i+"% )");
                            sleep(100);
                        }
                        else {
                            progressBar.setProgress(i);
                            process.setText("Fatching Spinner. ( " +i+"% )");
                            sleep(100);
                        }
                        i++;

                    }
                    if (i == 100) {
                        Intent intent = new Intent(getApplicationContext(), combo.class);
                        startActivity(intent);
                    }


                }catch(Exception e){}
            }
        }.start();
    }
}
