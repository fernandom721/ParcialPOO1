/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

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
    private String piso_habitacion;
    private String paquete;
    private String formapago;
    private String nombre;
    private int dui;
    private int habitacion;
    private String forma_pago;
//    static ArrayList <Reservacion> ListaReservaciones = new ArrayList <Reservacion>();
    
    public Reservacion (){}
/*
    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    */
 
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
    
    public Reservacion (String nombre, int dui, String forma_pago,int numeroHabitacion ,String habitaciones, int dias, String paquete ,int pago)
    {
        this.nombre = nombre;
        this.dui = dui;
        this.forma_pago = forma_pago;
        this.piso_habitacion = habitaciones;
        this.dias_reservados = dias;
        this.TotalAPagar = pago;
        this.paquete = paquete;
        this.habitacion = numeroHabitacion;
    }

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public int getDias_reservados() {
        return dias_reservados;
    }

    public void setDias_reservados(int dias_reservados) {
        this.dias_reservados = dias_reservados;
    }

    public String getpiso_habitacion() {
        return piso_habitacion;
    }

    public void setpiso_habitacion(String Numero_habitacion) {
        this.piso_habitacion = Numero_habitacion;
    }

    public float getTotalAPagar() {
        return TotalAPagar;
    }

    public void setTotalAPagar(float TotalAPagar) {
        this.TotalAPagar = TotalAPagar;
    }
    
    public void datosCliente(String name, int dui, String forma_pago){
        Cliente datos = new Cliente();
        name = datos.getNombre();
        dui = datos.getDui();
        forma_pago = datos.getForma_pago();
    }
    
    public String mostrarReservacion(){
        return "Nombre del cliente: " + nombre + "     /     " + dui + "\nForma de pago: " + forma_pago + "\nHabitación solicitada: " + habitacion+piso_habitacion + "\nDías reservados: "+dias_reservados;
    }
    /*
    public void mostrar() {
        System.out.println("Cliente: " + Cliente.getNombre());
        System.out.println("DUI: " + Cliente.getDui());
        System.out.println("Forma: " + Cliente.getForma_pago());
        System.out.println("Tipo de paquete: " + paquete);
        
    }*/

    static class ListaReservaciones {

        static int size() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        static Object get(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        static void remove(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public ListaReservaciones() {
        }
    }
    
    
}
