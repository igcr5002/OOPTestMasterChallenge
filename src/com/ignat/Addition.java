package com.ignat;

public class Addition {

    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private int numberOfAdditions;

    public Addition() {}

    public Addition(String addition1) {
        this.addition1 = addition1;
        numberOfAdditions=1;
    }

    public Addition(String addition1, String addition2) {
        this.addition1 = addition1;
        this.addition2 = addition2;
        numberOfAdditions=2;
    }

    public Addition(String addition1, String addition2, String addition3) {
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        numberOfAdditions=3;
    }

    public Addition(String addition1, String addition2, String addition3, String addition4) {
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        numberOfAdditions=4;
    }

    public int getNumberOfAdditions() {
        return numberOfAdditions;
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public String getAdditions() {

        switch (numberOfAdditions) {

            case 1: return "Additional item on the burger is: " +addition1 + "("+getAdditionalPrices(addition1) + "$).";
            case 2: return "Additional items on the burger are: " +addition1 + "("+getAdditionalPrices(addition1) + "$)" + " and " + addition2 + "("+getAdditionalPrices(addition2) + "$).";
            case 3: return "Additional items on the burger are: " +addition1 + "("+getAdditionalPrices(addition1) + "$)" + ", " + addition2 + "("+getAdditionalPrices(addition2) + "$)" + " and " + addition3 + "("+getAdditionalPrices(addition3) + "$).";
            case 4: return "Additional items on the burger are: " +addition1 + "("+getAdditionalPrices(addition1) + "$)" + ", " + addition2 + "("+getAdditionalPrices(addition2) + "$)" + ", " + addition3 + "("+getAdditionalPrices(addition3) + "$)" + " and " + addition4 + "("+getAdditionalPrices(addition4) + "$).";
            default: return "No additional items requested!";
        }

    }

    public void getTotalAdditionalPrice(double initialPrice) {

        double totalPrice;
        switch (numberOfAdditions) {

            case 1: {totalPrice= initialPrice + getAdditionalPrices(addition1);break;}
            case 2: {totalPrice= initialPrice + getAdditionalPrices(addition1)+getAdditionalPrices(addition2);break;}
            case 3: {totalPrice= initialPrice + getAdditionalPrices(addition1)+getAdditionalPrices(addition2)+getAdditionalPrices(addition3);break;}
            case 4: {totalPrice= initialPrice + getAdditionalPrices(addition1)+getAdditionalPrices(addition2)+getAdditionalPrices(addition3)+getAdditionalPrices(addition4);break;}
            default: {totalPrice= initialPrice + 0.00;break;}
        }

        System.out.println("Base price is " + initialPrice + "$, but with the additional item(s), the total price is " + totalPrice +"$.");

    }

    public double getAdditionalPrices (String addition) {
        switch(addition.toLowerCase()) {

            case "lettuce": return 0.30;
            case "tomato": return 0.50;
            case "carrot": return 0.35;
            case "cucumber": return 0.40;
            case "onions": return 0.25;
            case "corn": return 0.45;
            case "olives": return 0.50;
            case "peppers": return 0.35;
            case "cheese": return 0.65;
            case "bacon": return 0.75;
            case "pickles": return 0.40;
            default: return 0.00;

        }

    }


}
