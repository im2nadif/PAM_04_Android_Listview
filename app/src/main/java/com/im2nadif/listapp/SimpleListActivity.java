package com.im2nadif.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListActivity extends AppCompatActivity {
    private ListView lvItem;
    private String[] players = new String[]{
            "Ilham Mafani Nadif", "Wisnu Agung Laksono", "Aditya Fajar",
            "Muhammad Solihan", "Alfian Prayoga", "Henry Perdana", "Mukhsin Syafaat",
            "Muhammad Fauzan Zen",  "Ilham Mafani Nadif", "Wisnu Agung Laksono", "Aditya Fajar",
            "Muhammad Solihan", "Alfian Prayoga", "Henry Perdana", "Mukhsin Syafaat",
            "Muhammad Fauzan Zen",  "Ilham Mafani Nadif", "Wisnu Agung Laksono", "Aditya Fajar",
            "Muhammad Solihan", "Alfian Prayoga", "Henry Perdana", "Mukhsin Syafaat",
            "Muhammad Fauzan Zen"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);

        lvItem = (ListView) findViewById(R.id.lv_simple);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SimpleListActivity.this,
                android.R.layout.simple_list_item_1, android.R.id.text1, players);

        lvItem.setAdapter(adapter);


    }
}