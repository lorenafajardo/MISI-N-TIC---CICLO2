/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.ii;

import Class_pkg.*;

import java.util.Scanner;

/**
 *
 * @author LORENA FAJARDO
 */
public class MAIN {
    
    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_GREEN = "\u001B[32m";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CompanyClass company = new CompanyClass();
        company.crud_company();
        
        
        System.out.println("\nSeleccione una opción:  \n1.Cliente  \n2.Empleados  \n\n Digite su respuesta aqui: ");
        int answer = Integer.parseInt(inst_datos.nextLine());
        
        if (answer == 1) {
            System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);
            ClientClass client = new ClientClass();
            client.crud_clients();
        } else {
            System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);
            EmployeeClass employee = new EmployeeClass();
            employee.crud_employee();
        
    }
                
        
        // TODO code application logic here
    }
    
}
