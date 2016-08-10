package com.tomato.z.androidday29headerparalexdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ParallaxListView listView;
    private String[] indexArr = { "A", "B", "C", "D", "E", "F", "G", "H",
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z" };
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ParallaxListView) findViewById(R.id.listView);
        View headerView = View.inflate(this, R.layout.header_view, null);
        imageView = (ImageView) headerView.findViewById(R.id.imageView);
        listView.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
        listView.setParallaxImageView(imageView);
        listView.addHeaderView(headerView);
        listView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, indexArr));
    }

}
