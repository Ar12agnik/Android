package com.example.intent_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login_activity extends AppCompatActivity {
    TextView View_name,View_email,View_phone;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        View_name = findViewById(R.id.view_name);
        View_email =findViewById(R.id.view_email);
        View_phone = findViewById(R.id.view_phone);
        back = findViewById(R.id.Back);
        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        View_name.setText(name);
        View_email.setText(email);
        View_phone.setText(phone);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View_name.setText(" ");
                View_email.setText(" ");
                View_phone.setText(" ");
                Intent intent = new Intent(login_activity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}