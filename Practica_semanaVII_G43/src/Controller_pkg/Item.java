/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_pkg;

/**
 *
 * @author LORENA FAJARDO
 */
public class Item {
    private int idOwner;
    private String owner;
    private int idhospital;
    private String hospital;

    public Item(int idOwner, String owner) {
        this.idOwner = idOwner;
        this.owner = owner;
    }

    public Item() {
        this.idhospital = idhospital;
        this.hospital = hospital;
    }
    
    

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    

    /**
     * @return the idhospital
     */
    public int getIdhospital() {
        return idhospital;
    }

    /**
     * @param idhospital the idhospital to set
     */
    public void setIdhospital(int idhospital) {
        this.idhospital = idhospital;
    }

    /**
     * @return the hospital
     */
    public String getHospital() {
        return hospital;
    }

    /**
     * @param hospital the hospital to set
     */
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return getOwner();
        
    }
    
}
