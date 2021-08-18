/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;



/**
 *
 * @author LORENA FAJARDO
 */
public class DataDB {
    private int idOwner;
    private String owner;
    private int idhospital;
    private String hospital;
    
   

    
    public DataDB() {
        this.idOwner = 0;
        this.owner = "";   
    }
    
    /**
     *
     */
    public DataDB(int idhospital, String hospital) {
        this.idhospital = 0;
        this.hospital = "";   
    }

    
    /**
     * @return the idOwner
     */
    public int getIdOwner() {
        return idOwner;
    }

    /**
     * @param idOwner the idOwner to set
     */
    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
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

    /**
     * @return the id_pet
     */
    
    
}
