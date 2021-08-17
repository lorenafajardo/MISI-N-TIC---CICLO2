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
public class CardClass {
    private String name_client;
    private String number_card;
    private int amount_card;

    public CardClass(String name_client, String number_card, int amount_card) {
        this.name_client = name_client;
        this.number_card = number_card;
        this.amount_card = amount_card;
    }
    
    
    
    
    /**
     * @return the number_card
     */
    public String getNumber_card() {
        return number_card;
    }

    /**
     * @param number_card the number_card to set
     */
    public void setNumber_card(String number_card) {
        this.number_card = number_card;
    }

    /**
     * @return the amount_card
     */
    public int getAmount_card() {
        return amount_card;
    }

    /**
     * @param amount_card the amount_card to set
     */
    public void setAmount_card(int amount_card) {
        this.amount_card = amount_card;
    }

    /**
     * @return the name_client
     */
    public String getName_client() {
        return name_client;
    }

    /**
     * @param name_client the name_client to set
     */
    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    
    
    

    
    
    
    
    
    
    
    

    }
