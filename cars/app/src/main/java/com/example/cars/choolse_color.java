package com.example.cars;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class choolse_color extends AppCompatActivity {
    ImageView img;
    Button red, yellow, green, grey,Confirm_color;
    String color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_choolse_color);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        red = findViewById(R.id.Red_btn);
        yellow = findViewById(R.id.yellow_btn);
        green = findViewById(R.id.button_green);
        grey = findViewById(R.id.button_grey);

        img = findViewById(R.id.imageView);
        Confirm_color = findViewById(R.id.confirm_color);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.red);
                color = "red";
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.yellow);
                color = "yellow";
            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.green);
                color = "green";
            }
        });
        grey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.grey);
                color = "grey";
            }
        });
        Confirm_color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (color == null) {
                    Toast.makeText(choolse_color.this, "Please select a color!!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(choolse_color.this, "Your color is "+color, Toast.LENGTH_SHORT).show();
                    String name = getIntent().getStringExtra("name");
                    String add = getIntent().getStringExtra("add");
                    String ph = getIntent().getStringExtra("ph");
                    String del = getIntent().getStringExtra("del");
                    Intent intent = new Intent(choolse_color.this,confirm_booking.class);
                    intent.putExtra("name",name);
                    intent.putExtra("add",add);
                    intent.putExtra("ph",ph);
                    intent.putExtra("del",del);
                    intent.putExtra("col",color);
                    startActivity(intent);
                }
            }
        });


    }
}