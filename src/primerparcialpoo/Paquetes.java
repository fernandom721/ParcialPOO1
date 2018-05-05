/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primerparcialpoo;

/**
 *
 * @author Rodrigo Cruz <00115417@uca.edu.sv>
 */

public class Paquetes {
    private String Beneficios, nombrePaquete;
    private int precio;
    
    public Paquetes(){
        
        this.Beneficios="";
        this.nombrePaquete="";
        this.precio=0;
    }

    public Paquetes(String Beneficios, String nombrePaquete, int precio){
        this.Beneficios = Beneficios;
        this.nombrePaquete = nombrePaquete;
        this.precio = precio;
    }
    
    public String mostrarLista(){
        return "Nombre del paquete: " + nombrePaquete + ".\n" + "Costo: $" + precio + " del valor inicial por día.\n" + "Beneficios: " + Beneficios + ".\n";
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
        this.nombrePaquete = nombrePaquete;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}