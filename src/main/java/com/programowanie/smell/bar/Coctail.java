package com.programowanie.smell.bar;

public class Coctail implements Beverege {

    private int price;

    public Coctail withIngredient(IngredientUnit ingredientUnit) {
        return withIngredient(ingredientUnit, 1);
    }

    public Coctail withIngredient(IngredientUnit ingredientUnit, double amount) {
        price += (ingredientUnit.getPrice() * amount);
        return this;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isAmountLimited() {
        return true;
    }

    @Override
    public boolean isEligableForStudentDiscount() {
        return false;
    }
}
