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
public class CompoundClass extends OrderClass {

    private int price;
    private int total_value;

    public CompoundClass(String client_name, String product_ordered, int quantity_ordered, int price, int total_value) {
        super(client_name, product_ordered, quantity_ordered);
        this.price = price;
        this.total_value = total_value;
    }

    /**
     * @return the total_value
     */
    public int getTotal_value() {
        return total_value;
    }

    /**
     * @param total_value the total_value to set
     */
    public void setTotal_value(int total_value) {
        this.total_value = total_value;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
