package com.example.cars;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.TextView;

public class confirm_booking extends AppCompatActivity {
    TextView Name,Adr,Ph,Date,color;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_confirm_booking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Name = findViewById(R.id.Name_val);
        Adr = findViewById(R.id.Adr_val);
        Ph = findViewById(R.id.ph_val);
        Date = findViewById(R.id.Date_val);
        color = findViewById(R.id.color_val);
        String name = getIntent().getStringExtra("name");
        String add = getIntent().getStringExtra("add");
        String ph = getIntent().getStringExtra("ph");
        String del = getIntent().getStringExtra("del");
        String col = getIntent().getStringExtra("col");
        Name.setText(name);
        Adr.setText(add);
        Ph.setText(ph);
        Date.setText(del);
        color.setText(col);
    }
}