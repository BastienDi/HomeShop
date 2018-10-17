package com.bastien.homeshope;

public class Product {

    private String name;
    private String description;
    private double price;


    /**
     * display a full description of the product
     */
    public void look(){

        System.out.println(String.format(name + " : " + price + "%n" + description));

    }

    /**
     *
     * @param bill
     * @param quantity
     */
    public void buy(Bill bill, Integer quantity){

    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public double setPrice(double price){
        this.price = price;
    }

}