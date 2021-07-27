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
public class PositionClass {

    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private String position_name;
    private String hierarchical_level;

    public PositionClass() {
    }

    public PositionClass(String name_position, String hierarchical_level) {
        this.position_name = name_position;
        this.hierarchical_level = hierarchical_level;
    }
    
    public void crud_position(){
        
        System.out.println("\nNombre del cargo en la empresa: ");
        position_name = inst_datos.nextLine();
        
        System.out.println("\nNivel jerarquico al que pertenece: ");
        hierarchical_level = inst_datos.nextLine();
        
        PositionClass position = new PositionClass(position_name, hierarchical_level);
        
        System.out.println(ANSI_BLUE + "            El cargo del empleado es "  + position_name + "y el nivel jerarquico corresponde a " + hierarchical_level + ANSI_RESET);
        
        
    
} 
    
    
}
    