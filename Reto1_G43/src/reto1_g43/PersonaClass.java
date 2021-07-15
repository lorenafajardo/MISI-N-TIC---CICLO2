/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1_g43;

import java.util.Scanner;

/**
 *
 * @author LORENA FAJARDO
 */
public class PersonaClass {
    
    // Declaración de variables en forma privada-----------------------------------------

    private String nombre_completo;
    private String tipo_identificacion;
    private int numero_identificacion;   
    private int edad;
    private boolean termino_colegio;
    private boolean actualmente_estudia;
    private String area_conocimiento;
        
    // Constructor de la clase

    public PersonaClass(String nombre_completo, String tipo_identificacion, int numero_identificacion, int edad, boolean termino_colegio, boolean actualmente_estudia, String area_conocimiento) {
        this.nombre_completo = nombre_completo;
        this.tipo_identificacion = tipo_identificacion;
        this.numero_identificacion = numero_identificacion;
        this.edad = edad;
        this.termino_colegio = termino_colegio;
        this.actualmente_estudia = actualmente_estudia;
        this.area_conocimiento = area_conocimiento;
    }

   

    //  Encupsular las variables ----------------------------------------------------------    
   
    /**
     * @return the nombre_completo
     */
    public String getNombre_completo() {
        return nombre_completo;
    }

    /**
     * @param nombre_completo the nombre_completo to set
     */
    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    
    /**
     * @return the tipo_identificacion
     */
    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    /**
     * @param tipo_identificacion the tipo_identificacion to set
     */
    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    /**
     * @return the numero_identificacion
     */
    public int getNumero_identificacion() {
        return numero_identificacion;
    }

    /**
     * @param numero_identificacion the numero_identificacion to set
     */
    public void setNumero_identificacion(int numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the termino_colegio
     */
    public boolean isTermino_colegio() {
        return termino_colegio;
    }

    /**
     * @param termino_colegio the termino_colegio to set
     */
    public void setTermino_colegio(boolean termino_colegio) {
        this.termino_colegio = termino_colegio;
    }

    /**
     * @return the actualmente_estudia
     */
    public boolean isActualmente_estudia() {
        return actualmente_estudia;
    }

    /**
     * @param actualmente_estudia the actualmente_estudia to set
     */
    public void setActualmente_estudia(boolean actualmente_estudia) {
        this.actualmente_estudia = actualmente_estudia;
    }
    /**
     * @return the area_conocimiento
     */
    public String getArea_conocimiento() {
        return area_conocimiento;
    }

    /**
     * @param area_conocimiento the area_conocimiento to set
     */
    public void setArea_conocimiento(String area_conocimiento) {
        this.area_conocimiento = area_conocimiento;
    }

    
// Retornar o imprimir los Getter de la clase--------------------------------------------------------
    
    // Metodo 1. Mediante función que retorne los getter
    
    public String consulta_informacion_persona(){
        return "\n  Nombre del Usuario:  " + getNombre_completo()+ "\n  Tipo de Identificación (Cedula /Tarjeta de Identidad /Pasaporte/ Cedula Extranjera):  " + getTipo_identificacion() +"\n  Número de identificación:  " + getNumero_identificacion() + " \n  Edad:  "  + getEdad()+ "  \n  Actualmente esrudia:  " + isActualmente_estudia()+"\n  Termino el colegio (si/no):  " + isTermino_colegio() + "\n  En que area de estudio se destaca (Artes /Economia /Historia/ Matematicas/ Literatura/ Logica):  "+ getArea_conocimiento();
    }
    
    // Metodo 2. Mediante metodo que imprime los getter
    
    public void consulta_info_persona(){
        System.out.println("\n  Nombre del Usuario:  " + getNombre_completo()+ "\n  Tipo de Identificación (Cedula /Tarjeta de Identidad /Pasaporte/ Cedula Extranjera):  " + getTipo_identificacion() +"\n  Número de identificación:  " + getNumero_identificacion() + " \n  Edad:  "  + getEdad()+ "  \n  Actualmente esrudia:  " + isActualmente_estudia()+"\n  Termino el colegio (si/no):  " + isTermino_colegio() + "\n  En que area de estudio se destaca (Artes /Economia /Historia/ Matematicas/ Literatura/ Logica):  "+ getArea_conocimiento());
    }
   // Consultar información por número de Identificación
    public void consultar_por_numero_id(int id_suministrado){
        if(getNumero_identificacion() == id_suministrado){
            System.out.println("\n Los datos asociados al numero de identificación son los siguiente: \n  Nombre del Usuario:  " + getNombre_completo()+ "\n  Tipo de Identificación (Cedula /Tarjeta de Identidad /Pasaporte/ Cedula Extranjera):  " + getTipo_identificacion() + "\n  Número de identificación:  " + getNumero_identificacion() + "\n  Edad:  "  + getEdad()+ "\n  Actualmente esrudia:  " + isActualmente_estudia()+ "\n  Termino el colegio (si/no):  " + isTermino_colegio() + "\n  En que area de estudio se destaca (Artes /Economia /Historia/ Matematicas/ Literatura/ Logica):  "+ getArea_conocimiento());
        }else{
            System.out.println("\n El numero de identificación  "+ id_suministrado+ "  no se encuentra en el sistema");
        }    
    }
    
    public void consultar_por_id_suministrada(String id_suministrado){
        int numero_id_suministrado = Integer.parseInt(id_suministrado);
        if(getNumero_identificacion() == numero_id_suministrado){
            System.out.println("\n Los datos asociados al numero de identificación son los siguiente: \n  Nombre del Usuario:  " + getNombre_completo()+ "\n  Tipo de Identificación (Cedula /Tarjeta de Identidad /Pasaporte/ Cedula Extranjera):  " + getTipo_identificacion() + "\n  Número de identificación:  " + getNumero_identificacion() + "\n  Edad:  "  + getEdad()+ "\n  Actualmente esrudia:  " + isActualmente_estudia()+ "\n  Termino el colegio (si/no):  " + isTermino_colegio() + "En que area de estudio se destaca (Artes /Economia /Historia/ Matematicas/ Literatura/ Logica):  "+ getArea_conocimiento());
        }else{
            System.out.println("\n El numero de identificación  "+ id_suministrado + "  no se encuentra en el sistema");
        }    
    }
}
