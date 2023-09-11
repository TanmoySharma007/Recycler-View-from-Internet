package com.example.custom_recycler_view_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List <Photo> photoList;
    RecyclerView photoRecycler;
    PhotoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        photoList = new ArrayList<>();
        photoRecycler = findViewById(R.id.photoRecycler);

        photoList.add(new Photo("https://images.pexels.com/photos/10671403/pexels-photo-10671403.jpeg","Landscape","Very Beautiful"));
        photoList.add(new Photo("https://images.pexels.com/photos/18277131/pexels-photo-18277131/free-photo-of-city-street-building-house.jpeg","Door of Heaven","Very Beautiful"));
        photoList.add(new Photo("https://images.pexels.com/photos/17809399/pexels-photo-17809399/free-photo-of-marina-city-car-park-in-chicago-united-states.jpeg","Car Parking","Very Beautiful"));
        photoList.add(new Photo("https://images.pexels.com/photos/17815958/pexels-photo-17815958/free-photo-of-branch-of-wild-blackberry.jpeg","BlackBerry","Very Beautiful"));


        adapter = new PhotoAdapter(MainActivity.this, photoList);
        photoRecycler.setAdapter(adapter);

    }
}