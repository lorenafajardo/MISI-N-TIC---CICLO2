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
public class CompanyClass {

    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private String company_name;
    private int nit;
    private String company_address;

    public CompanyClass() {
    }

    public CompanyClass(String company_name, int nit, String company_address) {
        this.company_name = company_name;
        this.nit = nit;
        this.company_address = company_address;
    }

    /**
     * @return the inst_datos
     */
    public static Scanner getInst_datos() {
        return inst_datos;
    }

    /**
     * @param aInst_datos the inst_datos to set
     */
    public static void setInst_datos(Scanner aInst_datos) {
        inst_datos = aInst_datos;
    }

    /**
     * @return the company_name
     */
    public String getCompany_name() {
        return company_name;
    }

    /**
     * @param company_name the company_name to set
     */
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    /**
     * @return the nit
     */
    public int getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * @return the company_address
     */
    public String getCompany_address() {
        return company_address;
    }

    /**
     * @param company_address the company_address to set
     */
    public void setCompany_address(String company_address) {
        this.company_address = company_address;
    }

    public void crud_company() {
        System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);
        System.out.println(ANSI_GREEN + "                                                INFORMACIÓN DE LA EMPRESA          "+ ANSI_RESET);
        System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);
        
        System.out.println("Nombre de la empresa: ");
        company_name = inst_datos.nextLine();
        System.out.println("NIT: ");
        nit = Integer.parseInt(inst_datos.nextLine());
        System.out.println("Dirección: ");
        company_address = inst_datos.nextLine();

        CompanyClass company = new CompanyClass(company_name, nit, company_address);

        System.out.println(ANSI_BLUE+"\n             La empresa " + company_name + " con Número de Identificación Tributaria (NIT) " + nit + " se encuentra ubicada en la dirección " + company_address +ANSI_RESET);
    }
}
