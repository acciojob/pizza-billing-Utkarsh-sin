package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraTopping;
    private boolean isExtraCheese;
    private boolean isExtraTopping;
    private boolean isTakeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true) {
            this.price=300;
            this.extraTopping=70;
        }
        else {
            this.price =400;
            this.extraTopping=120;
        }
        this.isExtraCheese=false;
        this.isExtraTopping=false;
        this.isTakeAway=false;
        this.bill="";
        this.bill+="Base Price Of The Pizza: "+ this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese){
            this.price = price+80;
            isExtraCheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping){
            this.price = price+extraTopping;
            isExtraTopping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price = price+20;
            isTakeAway=true;
        }
    }

    public String getBill(){
        // your code goes here
            if(isExtraCheese) this.bill+="Extra Cheese Added: 80\n";
            if(isExtraTopping) this.bill+="Extra Toppings Added: "+extraTopping+"\n";
            if(isTakeAway) this.bill+="Paperbag Added: 20\n";
            this.bill+="Total Price: "+this.price+"\n" ;
        return this.bill;
    }
}
