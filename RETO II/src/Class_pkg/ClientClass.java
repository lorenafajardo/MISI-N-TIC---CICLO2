/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_pkg;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LORENA FAJARDO
 */
public class ClientClass extends PersonClass {

    private String address;
    private String telephone;

    static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_GREEN = "\u001B[32m";

    public ClientClass() {
    }

    public ClientClass(String name, String Surnames, String document, String email, String address, String telephone) {
        super(name, Surnames, document, email);
        this.address = address;
        this.telephone = telephone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void crud_clients() {

        ArrayList<ClientClass> client_list = new ArrayList<>();

        boolean exit_program = false;
        while (!exit_program) {
            System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
            System.out.println("\n  Selecciona una Opción:  \n");
            System.out.println("  1. Crear Cliente\n  2. Consultar clientes\n  3. Editar información del cliente\n  4. Eliminar cliente   ");
            System.out.println("  5. Salir");
            System.out.println("\nDigite su respuesta aqui:  ");

            int option = Integer.parseInt(inst_datos.nextLine());

            switch (option) {
                case 1:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN +"                                                        CREAR CLIENTES                                "+ANSI_RESET);
                    System.out.println("Cuantos clientes desea registrar");
                    int num_clients = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\nIngrese la siguiente información del cliente a registrar ");

                    for (int i = 1; i <= num_clients; i++) {
                        System.out.println(ANSI_BLUE+"\n                                                 Cliente " + i+ANSI_RESET);
                        System.out.println("Nombre del cliente:  ");
                        String name = inst_datos.nextLine();

                        System.out.println("\nApellidos del cliente:  ");
                        String surnames = inst_datos.nextLine();

                        System.out.println("\nDocumento de identidad:  ");
                        String document = inst_datos.nextLine();

                        System.out.println("\nCorreo electronico:  ");
                        String email = inst_datos.nextLine();

                        System.out.println("\nDirección:  ");
                        address = inst_datos.nextLine();

                        System.out.println("\nTelefono:  ");
                        telephone = inst_datos.nextLine();

                        ClientClass client = new ClientClass(name, surnames, document, email, address, telephone);
                        client_list.add(client);

                        System.out.println(ANSI_YELLOW_BACKGROUND + "\n                                      EL CLIENTE SE REGISTRO CON EXITO                                  "+ ANSI_RESET);
                        System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);

                    }

                    break;
                case 2:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "                                      BASE DE DATOS DE LOS CLIENTES          "+ ANSI_RESET);
                    for (int i = 0; i < client_list.size(); i++) {
                        ClientClass client = client_list.get(i);
                        System.out.println(" \nNombre: " + client.getName());
                        System.out.println(" Apellidos: " + client.getSurnames());
                        System.out.println(" Documento: " + client.getDocument());
                        System.out.println(" Email: " + client.getEmail());
                        System.out.println(" Dirección: " + client.getAddress());
                        System.out.println(" Telefono: " + client.getTelephone());
                    }
                    break;

                case 3:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "                                           EDITAR INFORMACIÓN DE LOS CLIENTES                    "+ANSI_RESET);
                    System.out.println("\n Ingrese el indice de cliente a editar:  ");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= client_list.size()) {
                        ClientClass client = client_list.get(index);
                        System.out.println(" \nNombre: " + client.getName());
                        System.out.println(" Apellidos: " + client.getSurnames());
                        System.out.println(" Documento: " + client.getDocument());
                        System.out.println(" Email: " + client.getEmail());
                        System.out.println(" Dirección: " + client.getAddress());
                        System.out.println(" Telefono: " + client.getTelephone());

                        System.out.println("\nCual campo desea editar?\n  1. Nombre\n  2. Apellidos\n  3. Documento de identidad\n  4. Email\n  5. Dirección\n  6. Telefono  ");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println("Nombre: ");
                                String new_name = inst_datos.nextLine();
                                client.setName(new_name);
                                break;
                            case 2:
                                System.out.println("Apellidos: ");
                                String new_surnames = inst_datos.nextLine();
                                client.setSurnames(new_surnames);
                                break;
                            case 3:
                                System.out.println("Documento nuevo: ");
                                String new_document = inst_datos.nextLine();
                                client.setDocument(new_document);
                                break;
                            case 4:
                                System.out.println("Email nuevo: ");
                                String new_email = inst_datos.nextLine();
                                client.setEmail(new_email);
                                break;
                            case 5:
                                System.out.println("Dirección nueva: ");
                                String new_address = inst_datos.nextLine();
                                client.setAddress(new_address);
                                break;
                            case 6:
                                System.out.println("Telefono nuevo: ");
                                String new_telephone = inst_datos.nextLine();
                                client.setTelephone(new_telephone);
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN+"                                            ELIMINAR CLIENTE DE LA BASE DE DATOS                          "+ANSI_RESET);
                    System.out.println("Ingrese el indice de cliente a elimiar:  ");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= client_list.size()) {
                        ClientClass client = client_list.get(index_remove);
                        System.out.println("\n                                                  Información del cliente a eliminar    ");
                        System.out.println(" \n\nNombre: " + client.getName());
                        System.out.println(" Apellidos: " + client.getSurnames());
                        System.out.println(" Documento: " + client.getDocument());
                        System.out.println(" Email: " + client.getEmail());
                        System.out.println(" Dirección: " + client.getAddress());
                        System.out.println(" Telefono: " + client.getTelephone());
                        System.out.println(" \n Esta seguro que desea eliminarlo? (si/no)");
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            client_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_YELLOW_BACKGROUND + "                                  PROCESO CANCELADO                                      "+ANSI_RESET);
                        }
                        System.out.println("                                                          Base de datos actualizada                   ");
                        for (int i = 1; i < client_list.size(); i++) {
                            System.out.println(ANSI_BLUE +"                                            Cliente " + i + ANSI_RESET);
                            System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                            System.out.println("Nombre del cliente:  ");
                            String name = inst_datos.nextLine();

                            System.out.println("\nApellidos del cliente:  ");
                            String surnames = inst_datos.nextLine();

                            System.out.println("\nDocumento de identidad:  ");
                            String document = inst_datos.nextLine();

                            System.out.println("\nCorreo electronico:  ");
                            String email = inst_datos.nextLine();

                            System.out.println("\nDirección:  ");
                            address = inst_datos.nextLine();

                            System.out.println("\nTelefono:  ");
                            telephone = inst_datos.nextLine();

                            System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                        }
                    }
                    break;
                case 5:
                    exit_program = true;
                    System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);
                    System.out.println(ANSI_GREEN+"                                                       SALIENDO DEL PROGRAMA       "+ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);
                    System.out.println(ANSI_YELLOW_BACKGROUND+ ANSI_RED+"                                    OPCIÓN INVALIDA"+ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "========================================================================================================="+ ANSI_RESET);

            }

        }

    }

}
