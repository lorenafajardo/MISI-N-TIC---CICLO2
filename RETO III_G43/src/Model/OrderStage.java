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
public class OrderStage {
    
    private String client_name;
    private String card_number;
    private int total_value;

    public OrderStage(String client_name, String card_number, int total_value) {
        this.client_name = client_name;
        this.card_number = card_number;
        this.total_value = total_value;
    }

    public OrderStage(String client_name, CardClass card_number, int total_value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

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
     * @return the card_number
     */
    public String getCard_number() {
        return card_number;
    }

    /**
     * @param card_number the card_number to set
     */
    public void setCard_number(String card_number) {
        this.card_number = card_number;
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
    
    
    
}
