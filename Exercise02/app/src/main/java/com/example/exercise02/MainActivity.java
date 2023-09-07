package com.example.exercise02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1,input2;
    Button addbtn,subbtn,divbtn,mulbtn,resetbtn;
    TextView output;

    double answer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.fnumber);
        input2 = (EditText) findViewById(R.id.snumber);
        addbtn = (Button) findViewById(R.id.addbtn);
        subbtn = (Button) findViewById(R.id.subtractionbtn);
        divbtn = (Button) findViewById(R.id.divisionbtn);
        mulbtn = (Button) findViewById(R.id.multiplicationbtn);
        resetbtn =(Button) findViewById(R.id.resetbtn);
        output = (TextView) findViewById(R.id.answerDisplay);

        //add btn function
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(input1.getText().toString());
                double n2 = Double.valueOf(input2.getText().toString());

                    answer = n1+n2;
                    output.setText("" +answer);
            }
        });

        //subtraction btn function
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(input1.getText().toString());
                double n2 = Double.valueOf(input2.getText().toString());

                answer = n1-n2;
                output.setText("" +answer);
            }
        });

        //division btn function
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(input1.getText().toString());
                double n2 = Double.valueOf(input2.getText().toString());

                answer = n1/n2;
                output.setText("" +answer);
            }
        });

        //multiplication btn function
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(input1.getText().toString());
                double n2 = Double.valueOf(input2.getText().toString());

                answer = n1*n2;
                output.setText("" +answer);
            }
        });

        //reset btn function
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input1.setText("");
                input2.setText("");
            }
        });




    }
}