package com.example.designlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListMakanan extends AppCompatActivity{

    AdapterMakanan adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food_rico);

        // data to populate the RecyclerView with
        ArrayList<Item> NamaFood = new ArrayList<>();
        NamaFood.add(new Item("Nasi Goreng", R.drawable.nasgor));
        NamaFood.add(new Item("Nasi Lemak", R.drawable.naslemak));
        NamaFood.add(new Item("Nasi Krawu", R.drawable.naskraw));
        NamaFood.add(new Item("Nasi Padang", R.drawable.naspad));


//        NamaFood.add("Nasi Rames");
//        NamaFood.add("Mie Godog");
//        NamaFood.add("Mie Goreng");
//        NamaFood.add("Nasi Kuning");
//        NamaFood.add("Nasi Gila");
//        NamaFood.add("Mie Ayam");
//        NamaFood.add("Soto Kebo");
//        NamaFood.add("Babi Guling");
//        NamaFood.add("Ayam Geprek");
//        NamaFood.add("Ayam Bakar");
//        NamaFood.add("Bothok Mercon");


        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.RVListFood10PPLG1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new AdapterMakanan(getApplicationContext(),NamaFood));
    }

}
