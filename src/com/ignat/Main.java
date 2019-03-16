package com.ignat;

public class Main {

    public static void main(String[] args) {

        Hamburger special = new Hamburger("Special burger", "Sesame bread roll", "beef", 5.00);
        Addition additions = new Addition("Tomato","cheese","bacon");

        System.out.println(additions.getAdditions());
        additions.getTotalAdditionalPrice(special.getPrice());
        DeluxeBurger deluxe = new DeluxeBurger("Deluxe Hamburger","white bread roll", "pork",6.00,"large size", "Coca-Cola");

        deluxe.getBurgerDetails();
        deluxe.getPrice();


    }



}
