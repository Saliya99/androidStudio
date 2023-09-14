package com.example.ex2;

import static com.example.ex2.MainActivity.MY_RQUEST_CODE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText1= (EditText) findViewById(R.id.editText1);
        button1= (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String massage = editText1.getText().toString();
                Intent intent= new Intent();
                intent.putExtra("MeSSAGE","message");
                setResult(MY_RQUEST_CODE,intent);
                finish();
            }
        });
    }
}