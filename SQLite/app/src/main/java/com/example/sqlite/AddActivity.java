package com.example.sqlite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sqlite.DBHandler;
import com.example.sqlite.employeecrud.Employee;

public class AddActivity extends AppCompatActivity {
    EditText name;
    EditText dept;
    EditText salary;
    Button btnadd;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        name = (EditText) findViewById(R.id.editName);
        dept = (EditText) findViewById(R.id.editDept);
        salary = (EditText) findViewById(R.id.editSalary);
        btnadd = (Button) findViewById(R.id.add);
        dbHandler = new DBHandler(this);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String empName = name.getText().toString();
                String empDept = name.getText().toString();
                String empSalary = name.getText().toString();

                Employee emp = new Employee(empName,empDept,empSalary);
                dbHandler.addEmployee(emp);
                Toast.makeText(getApplicationContext(),"Data Inserted",Toast.LENGTH_LONG).show();
            }
        });

    }

}
