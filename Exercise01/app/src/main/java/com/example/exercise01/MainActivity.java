package com.example.exercise01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1,input2;
    Button addbtn;
    TextView output;

    double answer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.fnumber);
        input2 = (EditText) findViewById(R.id.snumber);
        addbtn = (Button) findViewById(R.id.btn);
        output = (TextView) findViewById(R.id.answerDisplay);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(input1.getText().toString());
                double n2 = Double.valueOf(input2.getText().toString());

                answer = n1+n2;
                output.setText("" +answer);

            }
        });
    }
}