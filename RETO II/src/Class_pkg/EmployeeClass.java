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
public class EmployeeClass extends PersonClass {

    private int salary;

    private static Scanner inst_datos = new Scanner(System.in);
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static final String ANSI_GREEN = "\u001B[32m";

    public EmployeeClass() {
    }

    public EmployeeClass(String name, String Surnames, String document, String email, int salary) {
        super(name, Surnames, document, email);
        this.salary = salary;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void crud_employee() {

        ArrayList<EmployeeClass> employee_list = new ArrayList<>();
        boolean exit_program = false;
        while (!exit_program) {
            System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
            System.out.println("\n  Selecciona una Opción:  \n");
            System.out.println("  1. Crear empleado\n  2. Consultar empleado\n  3. Editar información del empleado\n  4. Eliminar empleado   ");
            System.out.println("  5. Salir");
            System.out.println("\nIngrese su respuesta:  ");

            int option = Integer.parseInt(inst_datos.nextLine());

            switch (option) {
                case 1:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "                                                        CREAR CLIENTES                                " + ANSI_RESET);

                    System.out.println("\nCuantos empleados desea registrar");
                    int num_employees = Integer.parseInt(inst_datos.nextLine());
                    System.out.println("\nIngrese la siguiente información de los empleados a registrar ");

                    System.out.println(ANSI_GREEN + "\n                                                   INFORMACIÓN PERSONAL" + ANSI_RESET);
                    for (int i = 1; i <= num_employees; i++) {
                        System.out.println(ANSI_BLUE + "\n                                                    Empleado " + i + ANSI_RESET);
                        System.out.println("Nombre del empleado:  ");
                        String name = inst_datos.nextLine();

                        System.out.println("\nApellidos del empleado:  ");
                        String surnames = inst_datos.nextLine();

                        System.out.println("\nDocumento de identidad:  ");
                        String document = inst_datos.nextLine();

                        System.out.println("\nCorreo electronico:  ");
                        String email = inst_datos.nextLine();

                        System.out.println("\nSalario:  ");
                        salary = Integer.parseInt(inst_datos.nextLine());

                        System.out.println(ANSI_GREEN + "\n                                               INFORMACIÓN LABORAL                 " + ANSI_RESET);

                        PositionClass position = new PositionClass();
                        position.crud_position();

                        System.out.println("\nEl empleado es administrativo? (si/no)");
                        String answer = inst_datos.nextLine();

                        if (answer.toUpperCase().equals("SI") || answer.toUpperCase().equals("SÍ")) {
                            AdministrativeClass administrative = new AdministrativeClass();
                            administrative.crud_administrative();
                        }

                        EmployeeClass employee = new EmployeeClass(name, surnames, document, email, salary);
                        employee_list.add(employee);

                        System.out.println(ANSI_YELLOW_BACKGROUND + "\n                           EL EMPLEADO SE REGISTRO CON EXITO                       " + ANSI_RESET);

                    }

                    break;

                case 2:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);

                    System.out.println(ANSI_GREEN + "                                              BASE DE DATOS DE EMPLEADOS          " + ANSI_RESET);
                    for (int i = 0; i < employee_list.size(); i++) {
                        EmployeeClass employee = employee_list.get(i);
                        System.out.println(" \n\nNombre: " + employee.getName());
                        System.out.println(" Apellidos: " + employee.getSurnames());
                        System.out.println(" Documento: " + employee.getDocument());
                        System.out.println(" Email: " + employee.getEmail());
                        System.out.println(" Salario: " + employee.getSalary());
                    }
                    break;

                case 3:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "                                            EDITAR INFORMACIÓN DE LOS EMPLEADOS          " + ANSI_RESET);
                    System.out.println(" Ingrese el indice de empleado a editar:  ");
                    int index = Integer.parseInt(inst_datos.nextLine());
                    if (index >= 0 && index <= employee_list.size()) {
                        EmployeeClass employee = employee_list.get(index);
                        System.out.println(" \n\nNombre: " + employee.getName());
                        System.out.println(" Apellidos: " + employee.getSurnames());
                        System.out.println(" Documento: " + employee.getDocument());
                        System.out.println(" Email: " + employee.getEmail());
                        System.out.println(" Salario: " + employee.getSalary());

                        System.out.println("\nCual campo desea editar?\n  1. Nombre\n  2. Apellidos\n  3. Documento de identidad\n  4. Email \nIngrese su respuesta aqui:  ");
                        int edit_field = Integer.parseInt(inst_datos.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.println("Nombre: ");
                                String new_name = inst_datos.nextLine();
                                employee.setName(new_name);
                                break;
                            case 2:
                                System.out.println("Apellidos: ");
                                String new_surnames = inst_datos.nextLine();
                                employee.setSurnames(new_surnames);
                                break;
                            case 3:
                                System.out.println("Documento nuevo: ");
                                String new_document = inst_datos.nextLine();
                                employee.setDocument(new_document);
                                break;
                            case 4:
                                System.out.println("Email nuevo: ");
                                String new_email = inst_datos.nextLine();
                                employee.setEmail(new_email);
                                break;
                            case 5:
                                System.out.println("Salario: ");
                                int new_salary = Integer.parseInt(inst_datos.nextLine());
                                employee.setSalary(new_salary);
                                break;
                        }

                    }

                    break;
                case 4:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    System.out.println(ANSI_GREEN + "                                                ELIMINAR EMPLEADO DE LA BASE DE DATOS          " + ANSI_RESET);
                    System.out.println("\n Ingrese el indice del empleado a elimiar:  ");
                    int index_remove = Integer.parseInt(inst_datos.nextLine());
                    if (index_remove >= 0 && index_remove <= employee_list.size()) {
                        EmployeeClass employee = employee_list.get(index_remove);
                        System.out.println("\nInformación del empleado a eliminar  ");
                        System.out.println(" \nNombre: " + employee.getName());
                        System.out.println(" Apellidos: " + employee.getSurnames());
                        System.out.println(" Documento: " + employee.getDocument());
                        System.out.println(" Email: " + employee.getEmail());
                        System.out.println(" Salario: " + employee.getSalary());

                        System.out.println(" \n Esta seguro que desea eliminarlo? (si/no)");
                        String remove = inst_datos.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            employee_list.remove(index_remove);
                        } else {
                            System.out.println(ANSI_YELLOW_BACKGROUND + "                                PROCESO CANCELADO                                 " + ANSI_RESET);
                        }
                        
                    }
                    break;
                case 5:
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
                    exit_program = true;
                    System.out.println(ANSI_GREEN + "                                                   SALIENDO DEL PROGRAMA.....       " + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_YELLOW_BACKGROUND + ANSI_BLUE + "                            Opción Invalida " + ANSI_RESET);
                    System.out.println(ANSI_PURPLE + "=========================================================================================================" + ANSI_RESET);
            }

        }

    }

}
