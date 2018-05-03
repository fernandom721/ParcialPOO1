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

public class Paquete {
    private String Beneficios, Paquete;
    private int precio;

    public Paquete(String Beneficios, String Paquete, int precio){
        this.Beneficios = Beneficios;
        this.Paquete = Paquete;
        this.precio = precio;
    }

    public String getBeneficios() {
        return Beneficios;
    }
    public void setBeneficios(String Beneficios) {
        this.Beneficios = Beneficios;
    }
    public String getPaquete() {
        return Paquete;
    }
    public void setPaquete(String Paquete) {
        this.Paquete = Paquete;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void TipoPaquete(String Paquete, int precio){
           
    }

}