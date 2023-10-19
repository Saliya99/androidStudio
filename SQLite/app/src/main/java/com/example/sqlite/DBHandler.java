package com.example.sqlite;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sqlite.employeecrud.Employee;

public class DBHandler extends SQLiteOpenHelper {

    // Database name and version
    private static final String DATABASE_NAME = "employee_details";
    private static final int DATABASE_VERSION = 1;

    // Constructor
    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        // Create your database tables here
        String sql = "CREATE TABLE employee(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,dep TEXT, salary TEXT);";
        // You can use the `db.execSQL()` method to execute SQL statements
        sqLiteDatabase.execSQL(sql);
        // for table creation.
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        // Upgrade your database if the version changes
        // Typically, you would drop existing tables and recreate them
        String sql = "DROP TABLE IF EXISTS employee_details;";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
    public void addEmployee(Employee employee) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("name", employee.getName());
        contentValues.put("dep", employee.getDepartment());
        contentValues.put("salary", employee.getSalary());

        sqLiteDatabase.insert("employee",null,contentValues);
        sqLiteDatabase.close();
    }
}
