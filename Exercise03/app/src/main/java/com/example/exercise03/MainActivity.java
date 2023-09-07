package com.example.exercise03;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText username,password;
        Button logBtn;
        TextView display;
        String uname ="John";
        String pass = "Password123";


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        logBtn = (Button) findViewById(R.id.logBtn);
        display = (TextView) findViewById(R.id.display);

        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pw = password.getText().toString();

                if(uname.equals(user) && pass.equals(pw)){
                    display.setText("Login successful");
                }else{
                    display.setText("Invalid user");
                }
            }
        });

    }
}