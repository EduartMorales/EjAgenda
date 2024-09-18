/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1061688186
 */
public class Agenda {
    //Atributos
    private String Nombre_agenda;
    private String Id;
    public ArrayList<Contacto> lscontactos;

    //Constructor no parametrizado
    public Agenda() {
    }
    
    //Constructor parametrizado

    public Agenda(String Nombre_agenda, String Id, ArrayList<Contacto> lscontactos) {
        this.Nombre_agenda = Nombre_agenda;
        this.Id = Id;
        this.lscontactos = lscontactos;
    }
    //Setters and Getters

    public String getNombre_agenda() {
        return Nombre_agenda;
    }

    public void setNombre_agenda(String Nombre_agenda) {
        this.Nombre_agenda = Nombre_agenda;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ArrayList<Contacto> getLscontactos() {
        return lscontactos;
    }

    public void setLscontactos(ArrayList<Contacto> lscontactos) {
        this.lscontactos = lscontactos;
    }
}

    