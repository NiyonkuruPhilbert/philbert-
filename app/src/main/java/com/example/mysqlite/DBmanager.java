package com.example.mysqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class DBmanager extends SQLiteOpenHelper
{
 private static final String dbname="student.db";

    public DBmanager( Context context)
    {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String qry="create table tb_student (id integer primary key autoincrement , name text , password text)";
        db.execSQL(qry);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
     db.execSQL("DROP TABLE IF EXISTS tb_student");
     onCreate(db);
    }
    public String Addrecord(String p1, String p2)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();
        cv.put("name",p1);
        cv.put("password", p2);
        long res= db.insert("tb_student",null, cv);
        if (res==1)
            return "failed";
        else
            return "sucessfully inserted";

    }
}
