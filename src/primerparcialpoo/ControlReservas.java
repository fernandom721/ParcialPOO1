/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Jorge
 */
public class ControlReservas {
    private String nombre;
    private String dui;
    private String forma;
    private String nombreT;
    private String fechaT;
    private int cantidadh;
    
    public ControlReservas() {
        nombre = "";
        dui = "";
        forma = "";
        
    }
    public ControlReservas(String nom1, String dui1, String forma, int cantih) {
        nombre = "";
        dui = "";
        forma = "";
        nombreT="";
        fechaT="";
        cantidadh=0;
    }
    
    public ControlReservas(String nombret, String fechat) {
        nombreT="";
        fechaT="";
    }
    public String getNombre() {
        return nombre;
    }

    public String getDui() {
        return dui;
    }

    public String getForma() {
        return forma;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    
    
    
    
    
    
}
