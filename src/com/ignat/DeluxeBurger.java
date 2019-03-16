package com.ignat;

public class DeluxeBurger extends Hamburger {

    private String chips;
    private String drink;

    public DeluxeBurger(String name, String breadRoll, String meat, double price, String chips, String drink) {
        super(name, breadRoll, meat, price);
        this.chips = chips;
        this.drink = drink;
    }

    @Override
    public double getPrice() {
        String price="Base price is " + super.getPrice() + "$";
        System.out.println(price);
        return super.getPrice();
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void getBurgerDetails() {
        System.out.println("Burger's name is: " + getName() + ", and it is in " + getBreadRoll() + " with " + getMeat() + " meat. On the side there is a " + getChips() + " portion of chips and a " + getDrink() + ".");

    }
}
