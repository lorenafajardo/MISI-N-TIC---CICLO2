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
public class Reto1_G43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inst_datos_entrada = new Scanner(System.in);
                
        
        // Instanciar clase
        PersonaClass inst_Persona = new PersonaClass("Lorena", "cedula", 1036665973, 25, true, true, "Logica");
        
        System.out.println("=============================================================================================");
        System.out.println("                         INFORMACIÓN DEL USUARIO                                             ");
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
        System.out.println("                     Metodo 1. Retornar GETTER mediante función                              ");
        System.out.println(inst_Persona.consulta_informacion_persona());
        System.out.println("=============================================================================================");
        System.out.println("                     Metodo 2. Imprimir GETTER mediante Metodo                               ");
        inst_Persona.consulta_info_persona();
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
        System.out.println("                 CONSULTAR INFORMACIÓN POR NÚMERO DE IDENTIICACIÓN                           ");
        System.out.println("=============================================================================================");
        System.out.println("                Opción 1. Número de identificación digitado en el codigo                     ");                         
        inst_Persona.consultar_por_numero_id(1036665973);
        System.out.println("=============================================================================================");
        System.out.println("           Opción 2. Número de identificación suministrado por el usuario                    "); 
 
        System.out.println("\n Ingrese el numero de identificación a consultar:  ");
        String numero_identificacion = inst_datos_entrada.nextLine();
        inst_Persona.consultar_por_id_suministrada(numero_identificacion);
        System.out.println("=============================================================================================");
        System.out.println("=============================================================================================");
        
        
        
    }
    
}
