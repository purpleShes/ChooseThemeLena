package com.example.katya.choosesubject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> themename = new ArrayList<>();
    ArrayList<String> amountOfTasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        themename.clear();
        amountOfTasks.clear();

        themename.add("Морфологія");
        amountOfTasks.add("10 тестів");


        themename.add("Лексикологія");
        amountOfTasks.add("41 тест");


        themename.add("Фразеологія");
        amountOfTasks.add("30 тестів");


        themename.add("Орфографія");
        amountOfTasks.add("20 тестів");

        recyclerView = findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new ThemesAdapter(getApplicationContext(), themename, amountOfTasks);
        recyclerView.setAdapter(mAdapter);
    }
}