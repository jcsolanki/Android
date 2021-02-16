package com.nested.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBarCoc,ratingBarCod,ratingBarTp,ratingBarFs;
    TextView textViewRatingCoc,textViewRatingCod,textViewRatingTp,textViewRatingFs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBarCoc = findViewById(R.id.ratingBarCoc);
        ratingBarCod = findViewById(R.id.ratingBarCod);
        ratingBarTp = findViewById(R.id.ratingBarTp);
        ratingBarFs = findViewById(R.id.ratingBarFs);
        textViewRatingCoc = findViewById(R.id.textViewRatingCoc);
        textViewRatingCod = findViewById(R.id.textViewRatingCod);
        textViewRatingTp = findViewById(R.id.textViewRatingTp);
        textViewRatingFs = findViewById(R.id.textViewRatingFs);

        ratingBarCoc.setMax(2);
        ratingBarCod.setMax(3);
        ratingBarTp.setMax(4);
        ratingBarFs.setMax(5);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);

        ratingBarCoc.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textViewRatingCoc.setText("Rating "+df.format(ratingBar.getRating()));
            }
        });
        ratingBarCod.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textViewRatingCod.setText("Rating: "+df.format(ratingBar.getRating()));
            }
        });
        ratingBarTp.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textViewRatingTp.setText("Rating: "+df.format(ratingBar.getRating()));
            }
        });
        ratingBarFs.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                textViewRatingFs.setText("Rating: "+df.format(ratingBar.getRating()));
            }
        });
        
    }
}