package com.example.recipe;

public class FoodData {

    private String recipe;
    private String itemName;
    private String itemDesc;
    private String itemPrice;
    private int itemImage;

    public FoodData(String itemName, String itemDesc, String itemPrice, String recipe, int itemImage) {
        this.itemName = itemName;
        this.itemDesc = itemDesc;
        this.itemPrice = itemPrice;
        this.recipe = recipe;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getRecipe() {
        return recipe;
    }

    public int getItemImage() {
        return itemImage;
    }
}
