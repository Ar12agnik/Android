package com.example.cars;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button Book_now;
    EditText Name,address,phone,delivery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Book_now = findViewById(R.id.book_now);
        Name = findViewById(R.id.edit_name);
        address = findViewById(R.id.edit_address);
        phone = findViewById(R.id.edit_Phone);
        delivery = findViewById(R.id.edit_Date);
        Book_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Name.getText().toString();
                String add = address.getText().toString();
                String ph = phone.getText().toString();
                String del = delivery.getText().toString();
                Intent intent = new Intent(MainActivity.this,choolse_color.class);
                intent.putExtra("name",name);
                intent.putExtra("add",add);
                intent.putExtra("ph",ph);
                intent.putExtra("del",del);
                startActivity(intent);
            }
        });
    }
}