package com.example.image_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button sinchan,jerry,tom;
    TextView ctTom,ctJerry,ctShinchan;
    private int cT=0;
    private int cJ=0;
    private int cS=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        img = findViewById(R.id.image);
        sinchan=findViewById(R.id.s);
        tom=findViewById(R.id.T);
        jerry=findViewById(R.id.J);
        ctJerry = findViewById(R.id.JerryClicked);
        ctTom = findViewById(R.id.Tomclicked);
        ctShinchan = findViewById(R.id.SinchanClicked);

        sinchan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.shinchan);
                cS ++;
                ctShinchan.setText(String.valueOf(cS));
            }
        });
        tom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.tom);
                cT ++;
                ctTom.setText(String.valueOf(cT));
            }
        });
        jerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.jerry);
                cJ ++;
                ctJerry.setText(String.valueOf(cJ));
            }
        });
    }
}