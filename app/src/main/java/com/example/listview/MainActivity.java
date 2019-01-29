package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.mylistview);

        final ArrayList<String> myFamily =new ArrayList<String>();

        myFamily.add("kelvin");
        myFamily.add("cheng");
        myFamily.add("man");
        myFamily.add("kelly");
        myFamily.add("mum");

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Person tabbed",myFamily.get(position));
            }
        });

        //display this names in listview array adapter used to display content to our list iew

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);


    }
}
