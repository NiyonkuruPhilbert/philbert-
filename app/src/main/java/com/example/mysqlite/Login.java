package com.example.mysqlite;

import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
    ListView ListView;
    ListView Adapter;
    String [] title;
    String [] description;
    int [] icon;
    ArrayList<ColorSpace.Model>arrayList=new ArrayList<ColorSpace.Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        title=new String[]{"twitter","facebook"};
        description=new String[]{"twitter details..","facebook details.."};
        icon=new int[]{R.drawable.twitter,R.drawable.hi};

        ListView=(ListView)findViewById(R.id.ListView);
    }
}
