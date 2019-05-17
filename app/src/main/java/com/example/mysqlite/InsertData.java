package com.example.mysqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertData extends AppCompatActivity {

    EditText t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_data);

        t1 = (EditText)findViewById(R.id.t1);
        t2 =(EditText)findViewById(R.id.t2);
    }

    public void addRecord(View view)
    {
   DBmanager db=new DBmanager(this);
   String res= db.Addrecord(t1.getText().toString(),t2.getText().toString());

        Toast.makeText(this,res,Toast.LENGTH_LONG).show();

        t1.setText("");
        t2.setText("");
    }
}
