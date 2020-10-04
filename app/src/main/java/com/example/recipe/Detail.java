package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView foodDescription;
    ImageView foodImage;
    TextView foodRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDescription = (TextView)findViewById(R.id.txtDescription);
        foodImage = (ImageView)findViewById(R.id.ivImage2);
        foodRecipe = (TextView)findViewById(R.id.txtRecipe);

        //foodRecipe.setText(FoodData.class.g);
        //FoodData foodData = ;
        //foodData.getRecipe();

        Bundle mBundle = getIntent().getExtras();

        foodRecipe.setText(mBundle.getString("Recipe"));
        if(mBundle!=null)
        {
            foodDescription.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));
            //foodRecipe.setText(FoodData.getRecipe());
        }



    }
}