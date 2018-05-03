/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primerparcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */

public class Paquete {
    private String Beneficios, nombrePaquete;
    private int precio;

    public Paquete(String Beneficios, String nombrePaquete, int precio){
        this.Beneficios = Beneficios;
        this.nombrePaquete = nombrePaquete;
        this.precio = precio;
    }

    public String getBeneficios() {
        return Beneficios;
    }
    public void setBeneficios(String Beneficios) {
        this.Beneficios = Beneficios;
    }
    public String getPaquete() {
        return nombrePaquete;
    }
    public void setPaquete(String Paquete) {
        this.nombrePaquete = Paquete;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //Lista que nos servirá para añadir un nuevo paquete.
    ArrayList<Paquete> addPaquete = new ArrayList<Paquete>();
    
    //Clases de tipo de paquete
    private static class Premium {
        private String habitacion, nombre;
        private int precioT;

        public Premium(String nombre, String habitacion, int precioT) {
            this.habitacion = habitacion;
            this.nombre = nombre;
            this.precioT = precioT;
        }
    }
    private static class Basic {
        private String habitacion, nombre;
        private int precioT;

        public Basic(String nombre, String habitacion, int precioT) {
            this.habitacion = habitacion;
            this.nombre = nombre;
            this.precioT = precioT;
        }
    }
 // Listas que guardarán los clientes que hayan adquirido uno de los tipos de paquete.
    ArrayList<Premium> clientesP = new ArrayList<Premium>();
    ArrayList<Basic> clientesB = new ArrayList<Basic>(); 
}