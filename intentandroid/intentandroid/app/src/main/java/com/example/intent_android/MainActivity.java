package com.example.intent_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,email,passwd,phone;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.edittext_name_xml);
        email = findViewById(R.id.edittext_email_xml);
        passwd = findViewById(R.id.edittext_password_xml);
        phone = findViewById(R.id.edittext_phone_xml);
        submit = findViewById(R.id.button_login_xml);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name_view = name.getText().toString();
                String email_view = email.getText().toString();
                String phone_view = phone.getText().toString();
                if (name_view.isEmpty()||email_view.isEmpty()||phone_view.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter The details properly ", Toast.LENGTH_SHORT).show();
                }
                else{
                Intent intent = new Intent(MainActivity.this,login_activity.class);
                intent.putExtra("name",name_view);
                intent.putExtra("email",email_view);
                intent.putExtra("phone",phone_view);
                startActivity(intent);
                }



            }
        }

        );
    }
}