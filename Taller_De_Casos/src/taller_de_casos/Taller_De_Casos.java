/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_de_casos;

import java.util.Scanner;

/**
 *
 * @author apnil
 */
public class Taller_De_Casos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            try{
                System.out.println("Menu:");
                System.out.println("1. Agregar Usuarios");
                System.out.println("2. Ver Asistentes");
                System.out.println("3. Buscar Asistente");
                System.out.println("4. Eliminar Asistente");
                System.out.println("5: Salir");
                System.out.println("Ingrese una opcion");
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        Asistente asistente =  new Asistente();
                        boolean estado = false;
                        do {
                            try{
                                System.out.println("Ingrese el nombre del Asistente:");
                                asistente.setNombre(sc.nextLine());
                                estado = true;
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        
                        //--------------
                        estado = false;
                        do {
                            try{
                                System.out.println("Ingrese el Apellido Paterno del Asistente:");
                                asistente.setApellido_Paterno(sc.nextLine());
                                estado = true;
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        //--------------
                        estado = false;
                        do {
                            try{
                                System.out.println("Ingrese el Apellido Materno del Asistente:");
                                asistente.setApellido_Materno(sc.nextLine());
                                estado = true;
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        //--------------
                        estado = false;
                        do {
                            try{
                                System.out.println("Ingrese la edad del Asistente:");
                                asistente.setEdad(Integer.parseInt(sc.nextLine()));
                                estado = true;
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        //--------------
                        estado = false;
                        do {
                            try{
                                System.out.println("Ingrese el Documento de identidad del Asistente:");
                                asistente.setDoc_Identidad(Integer.parseInt(sc.nextLine()));
                                estado = true;
                            }catch(NumberFormatException e){
                                System.out.println("Asegurece de ingresar correctametne el numero de identidad");
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        //--------------
                        estado = false;
                        do {
                            try{
                                System.out.println("Ingrese el Telefono del Asistente:");
                                asistente.setTelefono(sc.nextLine());
                                estado = true;
                            }catch(NumberFormatException e){
                                System.out.println("Asegurece de ingresar correctametne el numero de telefono");
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        //--------------
                        estado = false;
                        do {
                            try{
                                System.out.println("Ingrese el Correo del Asistente:");
                                asistente.setCorreo(sc.nextLine());
                                estado = true;
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (!estado);
                        asistente.Asignar_Categoria(asistente.getEdad());
                        asistente.Identificar_TipoDoc(asistente.getDoc_Identidad());
                        Controlador_Asistente.Agregar(asistente);
                        break;
                    case 2: 
                        Controlador_Asistente.MostrarAsistentes();
                        break;
                    case 3:
                        System.out.println("Ingrese el Docimento de Identidad a Buscar");
                        int Buscar = Integer.parseInt(sc.nextLine());
                        Controlador_Asistente.BuscarPorDocIdentidad(Buscar);
                        break;
                    case 4:
                        System.out.println("Ingrese el Docimento de Identidad del asistente a Eliminar");
                        int Eliminar = Integer.parseInt(sc.nextLine());
                        Controlador_Asistente.Eliminar(Eliminar);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                }
           }catch(NumberFormatException e){
                System.out.println("Aasegurece de ingresar el formato correspondiente a las opciones");
           }
        }while (opcion !=  5);
    }  
}
