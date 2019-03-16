package com.ignat;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBreadRoll() {
        return this.breadRoll;
    }

    public String getMeat() {
        return this.meat;
    }

    public double getPrice() {
        return this.price;
    }

    public void getBurgerDetails() {

        System.out.println("Burger's name is: " + getName() + ", and it is in " + getBreadRoll() + " with " + getMeat() + " meat.");

    }



}
