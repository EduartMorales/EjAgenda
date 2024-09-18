/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Agenda;
import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class HelperImpresion {
    public static void ImprimirInformacionEquipo(ArrayList<Agenda> listaagendas) {
        for (int i = 0; i < listaagendas.size(); i++) {
            System.out.println("El nombre de la agenda es:" + "\t" + listaagendas.get(i).getNombre_agenda());
            System.out.println("El id de la agenda es: " + "\t" + listaagendas.get(i).getId());

            for (int j = 0; j < listaagendas.get(i).getLscontactos().size(); j++) {

                System.out.println("El telefono del contacto es:" + "\t" +"+57"+ listaagendas.get(i).getLscontactos().get(j).getTelefono());
                System.out.println("El nombre del contacto es" + "\t" + listaagendas.get(i).getLscontactos().get(j).getNombre());            
            }
        }

    }
}

