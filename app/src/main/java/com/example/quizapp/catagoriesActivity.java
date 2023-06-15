package com.example.quizapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class catagoriesActivity extends AppCompatActivity
{

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagories);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("catagories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView=findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<CatagoryModel> list=new ArrayList<>();
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));
        list.add(new CatagoryModel("","catagoty1"));

        CatagoryAdaptar adaptar=new CatagoryAdaptar(list);
        recyclerView.setAdapter(adaptar);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}