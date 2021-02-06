package com.like.dislike.counter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String msg;
    TextView LikeText,DislikeText;
    Button LikeIncreaseButton,LikeDecreaseButton,DislikeIncreaseButton,DislikeDecreaseButton;
    int  LikeCount=0,DislikeCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LikeIncreaseButton = (Button) findViewById(R.id.LikeIncreaseButton);
        LikeDecreaseButton = (Button) findViewById(R.id.LikeDecreaseButton);
        DislikeIncreaseButton = (Button) findViewById(R.id.DislikeIncreaseButton);
        DislikeDecreaseButton = (Button) findViewById(R.id.DislikeDecreaseButton);
        LikeText = (TextView) findViewById(R.id.LikeText);
        DislikeText = (TextView) findViewById(R.id.DislikeText);

        LikeIncreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LikeCount++;
                if(LikeCount>=0) {
                    msg = "Like : " + LikeCount;
                    LikeText.setText(msg);
                    showToast(msg);
                }
                else
                    LikeCount=0;

            }
        });

        LikeDecreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LikeCount--;
                if(LikeCount>=0) {
                    msg = "Like : " + LikeCount;
                    LikeText.setText(msg);
                    showToast(msg);
                }
                else
                    LikeCount=0;

            }
        });

        DislikeIncreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DislikeCount++;
                if(DislikeCount>=0) {
                    msg = "Dislike : " + DislikeCount;
                    DislikeText.setText(msg);
                    showToast(msg);
                }
                else
                    DislikeCount=0;
                DislikeText.setText(msg);
                showToast(msg);
            }
        });

        DislikeDecreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DislikeCount--;
                if(DislikeCount>=0) {
                    msg = "Dislike : " + DislikeCount;
                    DislikeText.setText(msg);
                    showToast(msg);
                }
                else
                    DislikeCount=0;

            }
        });

    }
    protected void showToast(String msg){
        Toast toast = Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG);
        toast.show();
    }

}