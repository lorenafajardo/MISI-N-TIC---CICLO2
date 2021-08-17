/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LORENA FAJARDO
 */
public class StocktakingClass {
    private String name_product;
    private int price_product;
    private int quantity_product;

    //************CONSTRUCTOR********************

    public StocktakingClass(String name_product, int price_product, int quantity_product) {
        this.name_product = name_product;
        this.price_product = price_product;
        this.quantity_product = quantity_product;
    }
    
    //****************GET AND SET****************
    /**
     * @return the name_product
     */
    public String getName_product() {
        return name_product;
    }

    /**
     * @param name_product the name_product to set
     */
    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    /**
     * @return the price_product
     */
    public int getPrice_product() {
        return price_product;
    }

    /**
     * @param price_product the price_product to set
     */
    public void setPrice_product(int price_product) {
        this.price_product = price_product;
    }

    /**
     * @return the quantity_product
     */
    public int getQuantity_product() {
        return quantity_product;
    }

    /**
     * @param quantity_product the quantity_product to set
     */
    public void setQuantity_product(int quantity_product) {
        this.quantity_product = quantity_product;
    }
    
}
