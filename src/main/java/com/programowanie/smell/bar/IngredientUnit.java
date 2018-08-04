package com.programowanie.smell.bar;

public enum IngredientUnit {
    ONE_BEER(74), ONE_CIDER(103), A_PROPER_CIDER(110), GIN(85), TONIC_WATER(20), GREEN_STUFF(10), RUM(65), GRENADINE(10), LIME_JUICE(10);

    private int price;

    IngredientUnit(int price) {
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}
