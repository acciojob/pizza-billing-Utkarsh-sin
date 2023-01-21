package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int takeAwayCount=0;
    private int addTopping =0;
    private int addCheese =0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true) price=300;
        else price =400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.getClass().equals(DeluxePizza.class)==false) {
            addCheese++;
            if (addCheese == 1)
                price = price + 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.getClass().equals(DeluxePizza.class)==false) {
            addTopping++;
            if (isVeg == true && addTopping == 1) {
                price = price + 70;
            } else if (addTopping == 1) {
                price = price + 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeAwayCount++;
        if(takeAwayCount==1)
            price=price+20;
    }

    public String getBill(){
        // your code goes here
        boolean DP=false;
        if(this.getClass().equals(DeluxePizza.class)){
            DP=true;
        }
        if(isVeg) {
            bill = "Base Price Of The Pizza: 300 \n";
            if(addCheese>=1 && DP==false) bill+="Extra Cheese Added: 80 \n";
            if(addTopping>=1 && DP==false) bill+="Extra Toppings Added: 70 \n";
            if(takeAwayCount>=1) bill+="Paperbag Added: 20 \n";
            bill+="Total Price: "+price ;
        }
        else{
            bill = "Base Price Of The Pizza: 400 \n";
            if(addCheese>=1 && DP==false) bill+="Extra Cheese Added: 80 \n";
            if(addTopping>=1 && DP==false) bill+="Extra Toppings Added: 120 \n";
            if(takeAwayCount>=1) bill+="Paperbag Added: 20 \n";
            bill+="Total Price: "+price;
        }
        return this.bill;
    }
}
