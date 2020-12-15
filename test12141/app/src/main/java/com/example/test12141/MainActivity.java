package com.example.test12141;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[]shuju={"1","2","3","4","5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),shuju);
        listView.setAdapter(myAdapter);
    }
}