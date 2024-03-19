package com.example.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.cn, R.string.chinese, R.string.chineseCNY, R.string.Beijing));
        list.add(new DataFlags(R.drawable.jp, R.string.japanese, R.string.japaneseJPY, R.string.Tokyo));
        list.add(new DataFlags(R.drawable.kp, R.string.northK, R.string.northKPW, R.string.Pyongyang));
        list.add(new DataFlags(R.drawable.kr, R.string.southK, R.string.southKRW, R.string.Seul));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);
    }

}