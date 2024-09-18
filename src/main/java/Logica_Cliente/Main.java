/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
import Helpers.HelperImpresion;
import Logica_Negocio.Agenda;
import Logica_Negocio.Contacto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1061688186
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        String Id, Nombre_agenda;
        String Telefono, Nombre;
        int num_contactos = 0;
        int opc = 0;
        Scanner scan = new Scanner(System.in);
        ArrayList listacontactosglobal;
        Contacto objContacto;
        Agenda objAgenda;
        ArrayList<Agenda> listaagendas = new ArrayList<>();
        int rta, conteo;
        
        do {
            System.out.println("1. Registrar Contactos");
            System.out.println("2. Mostrar Agenda");
            System.out.println("3. Salir");
            
            do {
                try {
                    
                    System.out.println("Digite una opcion valida");
                    opc = scan.nextInt();
                    
                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);
            
            switch (opc) {
                case 1:
                    ArrayList<Contacto> listacontactoslocal = new ArrayList<>();
                    do {
                        try {
                            
                            System.out.println("Digite el numero de contactos");
                            num_contactos = scan.nextInt();
                            
                        } catch (InputMismatchException e) {
                            System.out.println("Error");
                        }
                        scan.nextLine();
                        
                    } while (num_contactos <= 0);
                    
                    for (int i = 0; i < num_contactos; i++) {
                        
                        System.out.println("Digite el numero de telelefono del contacto");
                        Telefono = scan.next();
                        scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Telefono);
                        
                        while (rta > 0) {
                            System.out.println("Digite el numero de telelefono del contacto");
                            Telefono = scan.next();
                            scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(Telefono);
                        }
                        
                        conteo = HelperValidacion.ValidarTodoLetra(Telefono);
                        
                        while (conteo != 0) {
                            System.out.println("Digite el numero de telelefono del contacto");
                            Telefono = scan.next();
                            scan.nextLine();
                            conteo = HelperValidacion.ValidarTodoLetra(Telefono);
                        }
                        // Termina telefono

                        System.out.println("Digite el nombre del contacto");
                        Nombre = scan.next();
                        rta = HelperValidacion.ValidarVacio(Nombre);
                        
                        while (rta > 0) {
                            System.out.println("Digite el nombre del contacto");
                            Nombre = scan.next();
                            rta = HelperValidacion.ValidarVacio(Nombre);
                        }
                        
                        conteo = HelperValidacion.ValidarVacio(Nombre);
                        
                        while (conteo != 0) {
                            System.out.println("Digite el nombre del contacto");
                            Nombre = scan.next();
                            conteo = HelperValidacion.ValidarVacio(Nombre);
                        }
                        
                        scan.nextLine();
                        
                        objContacto = new Contacto(Telefono, Nombre); //aqui se hace la agregacion
                        listacontactoslocal.add(objContacto);
                    }
                    listacontactosglobal = listacontactoslocal;
                    listacontactoslocal = null;
                    
                    System.out.println("Digite el nombre de la agenda");
                    Nombre_agenda = scan.next();
                    rta = HelperValidacion.ValidarVacio(Nombre_agenda);
                    
                    while (rta > 0) {
                        System.out.println("Digite el nombre de la agenda");
                        Nombre_agenda = scan.next();
                        rta = HelperValidacion.ValidarVacio(Nombre_agenda);
                    }
                    
                    conteo = HelperValidacion.ValidarTodo(Nombre_agenda);
                    
                    while (conteo != 0) {                        
                        System.out.println("Digite el nombre de la agenda");
                        Nombre_agenda = scan.next();
                        conteo = HelperValidacion.ValidarTodo(Nombre_agenda);
                    }
                    //Termina Nombre_agenda
                    System.out.println("Digite el id de la agenda");
                    Id = scan.next();
                    scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(Id);
                    
                    while (rta > 0) {                        
                        System.out.println("Digite el id de la agenda");
                        Id = scan.nextLine();                 
                        rta = HelperValidacion.ValidarVacio(Id);
                    }
                    
                    conteo = HelperValidacion.ValidarTodoLetra(Id);
                    
                    while (conteo != 0) {                        
                        System.out.println("Digite el id de la agenda");
                        Id = scan.nextLine();                       
                        conteo = HelperValidacion.ValidarTodoLetra(Id);
                    }
                    //Termina id
                    objAgenda = new Agenda(Nombre_agenda, Id, listacontactosglobal);
                    listaagendas.add(objAgenda);
                    break;
                
                case 2:
                    HelperImpresion.ImprimirInformacionEquipo(listaagendas);
                    break;
                
                case 3:
                    break;
            }
            
        } while (opc != 3);
    }
    
}
