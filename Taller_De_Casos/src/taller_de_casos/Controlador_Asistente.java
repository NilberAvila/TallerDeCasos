/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_de_casos;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Controlador_Asistente 
{
    private static ArrayList<Asistente> ListaAsistentes = new ArrayList();    
    public static void Agregar(Asistente NuevoAsistente){
        ListaAsistentes.add(NuevoAsistente);
    }
    public static void MostrarAsistentes()
    {
        for (Asistente a : ListaAsistentes) {
            System.out.println(a + "\n-------------------------------------------------------------------");
        }
    }
    public static void BuscarPorDocIdentidad(int Doc) {
        for(Asistente a : ListaAsistentes){
            if (a.getDoc_Identidad() == Doc) {
                System.out.println("Se encontro a: " + a);
                return;
            }
            else{
                System.out.println("No existe el asistente");
            } 
        }
    }
    public static void Eliminar(int Doc){
        for (Asistente a : ListaAsistentes) {
            if (a.getDoc_Identidad() == Doc){
                System.out.println("Se Elimino a : " + a.MostrarNombreCompletoAsistente());
                ListaAsistentes.remove(a);
                return;
            }
            else{
               System.out.println("No existe el asistente");
            } 
        }
        if (ListaAsistentes.size() == 0) {
            System.out.println("No hay asistentes para eliminar");
        }
    }
}
