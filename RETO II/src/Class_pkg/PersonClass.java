
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_pkg;

/**
 *
 * @author LORENA FAJARDO
 */
public class PersonClass {
    
 
    private String name;
    private String Surnames;
    private String document;
    private String email;
    
    public PersonClass() {
    }

    public PersonClass(String name, String Surnames, String document, String email) {
        this.name = name;
        this.Surnames = Surnames;
        this.document = document;
        this.email = email;
    }

    

    
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Surnames
     */
    public String getSurnames() {
        return Surnames;
    }

    /**
     * @param Surnames the Surnames to set
     */
    public void setSurnames(String Surnames) {
        this.Surnames = Surnames;
    }

    /**
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
