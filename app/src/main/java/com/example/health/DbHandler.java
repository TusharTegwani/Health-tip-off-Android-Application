package com.example.health;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHandler extends SQLiteOpenHelper {
    public DbHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create="CREATE TABLE mycustomer(sno INTEGER PRIMARY KEY,f_name TEXT,l_name TEXT,age INTEGER,email TEXT,dob TEXT,mobile TEXT)";
        sqLiteDatabase.execSQL(create) ;

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String upGrade=String.valueOf("DROP TABLE IF EXISTS");
        sqLiteDatabase.execSQL(upGrade,new String[]{"mycustomer"});
        onCreate(sqLiteDatabase);
    }

    public void addCustomer(Customer customer){
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("f_name",customer.getF_name());
        values.put("l_name",customer.getL_name());
        values.put("age",customer.getAge());
        values.put("email",customer.getEmail());
        values.put("dob",customer.getDob());
        values.put("mobile",customer.getMobile());
        long k=sqLiteDatabase.insert("mycustomer",null,values);
        Log.d("mytag",Long.toString(k));
        sqLiteDatabase.close();

    }

    public void getCustomer(int sno){
        SQLiteDatabase sqLiteDatabase=this.getReadableDatabase();
        Cursor cursor=sqLiteDatabase.query("mycustomer",new String[]{"sno","f_name","l_name","age","email","dob","mobile"},
                "sno=?",new String[]{"sno"},null,null,null);
        if(cursor!=null && cursor.moveToFirst()){
            Log.d("mytag",cursor.getString(1));
            Log.d("mytag",cursor.getString(2));
            Log.d("mytag",cursor.getString(3));
            Log.d("mytag",cursor.getString(4));
            Log.d("mytag",cursor.getString(5));
            Log.d("mytag",cursor.getString(6));

        }
        else {
            Log.d("mytag","Some Error occurred");
        }

    }
}
