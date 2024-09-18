/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class Contacto {
    //Atributos
    public String Telefono;
    public String Nombre;
    //Constructor no parametrizado

    public Contacto() {
    }
    //Constructo parametrizado

    public Contacto(String Telefono, String Nombre) {
        this.Telefono = Telefono;
        this.Nombre = Nombre;
    }
    //Setters and getters

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
