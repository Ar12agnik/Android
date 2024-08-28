package com.example.loginreset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.loginreset.R;

public class MainActivity extends AppCompatActivity {
    Button Submit,Reset;
    EditText Email,Password;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit=findViewById(R.id.Login);
        Reset=findViewById(R.id.Reset);
        Email=findViewById(R.id.Email);
        Password=findViewById(R.id.Password);
        Result=findViewById(R.id.Result);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=Email.getText().toString();
                String password=Password.getText().toString();
                Result.setText("Email Id:"+email+"\nPassword: "+password);
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Email.setText("");
                Password.setText("");
                Result.setText("");
            }
        });
    }

}

