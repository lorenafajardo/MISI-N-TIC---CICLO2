/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_pkg;

import java.util.Scanner;

/**
 *
 * @author LORENA FAJARDO
 */
public class AdministrativeClass {

    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private String category;
    private int num_subordinates;

    public AdministrativeClass() {
    }
    
    public AdministrativeClass(String category, int num_subordinates) {
        this.category = category;
        this.num_subordinates = num_subordinates;
    }

    
    public void crud_administrative() {
        
        System.out.println(" \nEscriba la categoria a la que corresponde:  ");
        category = inst_datos.nextLine();
        
        System.out.println(" \nEscriba el numero de subordinados a su cargo:  ");
        num_subordinates  = Integer.parseInt(inst_datos.nextLine());
        
        AdministrativeClass administrative = new AdministrativeClass(category, num_subordinates);
        
        System.out.println(ANSI_BLUE + " \n           El empleado hace parte del área administrativa, con categoria "+ category + " y "+ num_subordinates +" subordinados a su cargo " +ANSI_RESET);

       
    }
}
