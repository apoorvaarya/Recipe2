package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);


        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("Vegetable Biryani", "Biryani is a world-renowned Indian dish, Vegetables and basmati rice cooked in layers, flavored with saffron, served with yogurt raita and mirchi-ka-salan.", "$22", "write recipe1", R.drawable.image1);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Thai Fried Rice", "Thai-style sweet and spicy pineapple fried rice with red bell pepper, cashews and cilantro. This is a healthy and quick, vegetarian weeknight dinner!", "$18", "write recipe2", R.drawable.image2);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Thai Green Curry Burritos", "Crispy baked tofu, tender eggplant, and snow peas simmered in a spicy green curry sauce team up with cilantro rice to make these delicious vegan Thai green curry burritos.", "$25", "write recipe3", R.drawable.image3);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Sago Pearl Khichdi", "A pulao made with sago pearls! This vegan and gluten-free dish is extremely popular in India during the fasting season of Navratri.", "$15", "write recipe4", R.drawable.image4);
        myFoodList.add(mFoodData);

        RecyclerAdapater recyclerAdapater = new RecyclerAdapater(MainActivity.this, myFoodList);
        mRecyclerView.setAdapter(recyclerAdapater);


    }
}