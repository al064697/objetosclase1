/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetosclase1;

import java.util.ArrayList;
import models.estados;
import models.moneda;
import models.municipio;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Objetosclase1 {
    /**
     * @param args the command line arguments
     */
    static ArrayList<municipio> municipios= new ArrayList<>();
    static ArrayList<estados> estados= new ArrayList<>();
    static ArrayList<moneda> monedas = new ArrayList<>();
    static Scanner entradaDato = new Scanner(System.in);

    public static void llenarmunicipio(){
       municipios.add(new municipio(1,"campeche"));
       municipios.add(new municipio(2,"calkini"));
       municipios.add(new municipio(3,"carmen"));
       municipios.add(new municipio(4,"champoton"));

       System.out.println(municipios.toString());
    }
    public static void llenarestados(){
       estados.add(new estados(1,"campeche",10000,20.0001,20.000002));
       estados.add(new estados(2,"yucatan",20000,15.1234,19.23654));
       System.out.println(estados.toString());
     }
        
    public static void borrarmunicipio(int id){
        municipios.remove(id-1);
    }
    
    public static void llenarmonedas(){
            monedas.add(new moneda (1,"peso","$",1));
            monedas.add(new moneda (2,"dollar","$",19));
            monedas.add(new moneda (3,"euro","e",25));
            System.out.println(monedas.toString());

}
    
    public static void menu(){
        System.out.println("1. Crear moneda");
        System.out.println("2. Listar moneda");
        System.out.println("3. Actualizar moneda");
        System.out.println("4. Borrar moneda");
        System.out.println("5. Salir");

        
    }
    
    public static void opciones(int opcion){
            switch (opcion){
                case 1: agregarmonedas(); break;
                case 2: System.out.println("monedas.toString"); break;
                case 3:leerregistroactualizar(); break;
                case 4: leerRegistroBorrar(); break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: System.out.println("Adios...");
                default: System.out.println("PROCESO CONCLUIDO"); break;
            }
    }
    
    public static void agregarmonedas(){
        System.out.println("Ingrese los datos de la nueva moneda");
        System.out.print("ID: ");
        int IDmoneda=entradaDato.nextInt();
        System.out.print("Nombre: ");
        String monedanombre=entradaDato.next();
        System.out.print("símbolo: ");
        String monedasimbolo=entradaDato.next();
        System.out.print("Valor: ");
        double monedavalor=entradaDato.nextDouble();
        monedas.add(new moneda (IDmoneda ,monedanombre,monedasimbolo,monedavalor));
    }
    
    public static void borrarmonedas(int id){
        monedas.remove(id);
    }
    
    public static void leerRegistroBorrar(){
        System.out.println("Ingrese el ID de la moneda a eliminar");
        System.out.print("ID: ");
        int monedaID=entradaDato.nextInt();
        borrarmonedas(monedaID);
    }
    
    public static void leerregistroactualizar(){
        System.out.println("Ingrese el ID de la moneda a actualizar");        
        int IDmoneda=entradaDato.nextInt();
        System.out.print("Nombre: ");
        String monedanombre=entradaDato.next();
        System.out.print("símbolo: ");
        String monedasimbolo=entradaDato.next();
        System.out.print("Valor: ");
        double monedavalor=entradaDato.nextDouble();
    }

    public static void actualizarmoneda(int ID, String nombremoneda, String simbolo, double valor){
        monedas.get(ID).setId(ID);        
        monedas.get(ID).setNombremoneda(nombremoneda);
        monedas.get(ID).setSimbolo(simbolo);
        monedas.get(ID).setValorenpesos(valor);
        

    }
    public static void main(String[] args) {
        int opcion; 
        do {
            menu();
            opcion = entradaDato.nextInt();
            opciones(opcion);
        } while (opcion != 3);
        
    }
}
         
         /*borrarmunicipio(4);
         System.out.println(municipios.toString());
         
         llenarmonedas();
    }
}
         /*moneda pesos = new moneda(1,"peso","$",1);
         System.out.println(pesos.toString());
         
         moneda dollar = new moneda(2,"dollar","$",19);
         System.out.println(pesos.toString());
         
         moneda euro = new moneda(3,"euro","e",15);
         System.out.println(euro.toString());
 
        // TODO code application logic here
        String mivariable=new String();
        mivariable= "12345";
        
        String varimplicita=new String("ABCDEF");
        
        municipio campeche=new municipio();
        campeche.setId(1);
        campeche.setNombre("campeche");
        System.out.println(campeche.toString());
        
        municipio calkini=new municipio(2,"calkini");
        System.out.println(calkini.toString());
        
        municipio camen=new municipio();
         campeche.setId(3);
        campeche.setNombre("camen");
        System.out.println(camen.toString());
        
        municipio hopelchen=new municipio(4,"hopelchen");
        System.out.println(calkini.toString()); */
