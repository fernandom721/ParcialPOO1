/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;

/**
 *
 * @author Steven Diaz
 */
public class Reservacion {

    static void getListaReservaciones(String pago) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private float TotalAPagar;
    private Cliente Cliente;
    private String Inf_huesped;
    private int dias_reservados;
    private String Numero_habitacion;
    private String paquete;
    private String formapago;
    static ArrayList <Reservacion> ListaReservaciones = new ArrayList <Reservacion>();
    
    public Reservacion (){}

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public String getInf_huesped() {
        return Inf_huesped;
    }

    public void setInf_huesped(String Inf_huesped) {
        this.Inf_huesped = Inf_huesped;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }
    
    public Reservacion (String cliente, String formapago, String habitaciones, int dias, String paquete ,int pago)
    {
        this.Cliente.getNombre();
        this.Cliente.getForma_pago();
        this.Numero_habitacion = habitaciones;
        this.dias_reservados = dias;
        this.TotalAPagar = pago;
        this.paquete = paquete;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public static ArrayList<Reservacion> getListaReservaciones() {
        return ListaReservaciones;
    }

    public int getDias_reservados() {
        return dias_reservados;
    }

    public void setDias_reservados(int dias_reservados) {
        this.dias_reservados = dias_reservados;
    }

    public String getNumero_habitacion() {
        return Numero_habitacion;
    }

    public void setNumero_habitacion(String Numero_habitacion) {
        this.Numero_habitacion = Numero_habitacion;
    }

    public float getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
    public void mostrar() {
        System.out.println("Cliente: " + Cliente.getNombre());
        System.out.println("DUI: " + Cliente.getDui());
        System.out.println("Forma: " + Cliente.getForma_pago());
        System.out.println("Tipo de paquete: " + paquete);
        
    }
    
    
}
