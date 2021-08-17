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
public class OrderClass {

    private String client_name;
    private String product_ordered;
    private int quantity_ordered; 
    
    //********** CONSTRUCTOR ******************

    public OrderClass(String client_name, String product_ordered, int quantity_ordered) {
        this.client_name = client_name;
        this.product_ordered = product_ordered;
        this.quantity_ordered = quantity_ordered;
    }

    //************ GET AND SET *******************
    /**
     * @return the client_name
     */
    public String getClient_name() {
        return client_name;
    }

    /**
     * @param client_name the client_name to set
     */
    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    /**
     * @return the product_ordered
     */
    public String getProduct_ordered() {
        return product_ordered;
    }

    /**
     * @param product_ordered the product_ordered to set
     */
    public void setProduct_ordered(String product_ordered) {
        this.product_ordered = product_ordered;
    }

    /**
     * @return the quantity_ordered
     */
    public int getQuantity_ordered() {
        return quantity_ordered;
    }

    /**
     * @param quantity_ordered the quantity_ordered to set
     */
    public void setQuantity_ordered(int quantity_ordered) {
        this.quantity_ordered = quantity_ordered;
    }

}
