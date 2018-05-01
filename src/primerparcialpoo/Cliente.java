/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

/**
 *
 * @author Fernando Martínez
 */
public class Cliente {
    
    private String Nombre;
    private char sexo;
    private int dui;
    private String Forma_pago;
    
    public Cliente(){}
    
    public Cliente (String nombre, char sexo, int dui, String forma_pago)
    {
        this.Nombre = nombre;
        this.sexo = sexo;
        this.dui = dui;
        this.Forma_pago = forma_pago;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public String getForma_pago() {
        return Forma_pago;
    }

    public void setForma_pago(String Forma_pago) {
        this.Forma_pago = Forma_pago;
    }
    
    
}




