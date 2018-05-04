/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;
import java.util.ArrayList;
import primerparcialpoo.Paquetes;
/**
 *
 * @author Fernando Martínez
 */
public class Menu {
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        menu_inicio();          
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        menus_secundarios(a);
        ArrayList<String> habitaciones;
        ArrayList<String> Piso = new ArrayList<>();
        ArrayList<String>  Habitacion= new ArrayList<>();
        
    }
    public static void menu_inicio () {
        System.out.println("----Hotel Viña Rafinha----");
        System.out.println("Seleccione una Opción");
        System.out.println("1) Habitaciones");
        System.out.println("2) Precios");
        System.out.println("3) Reservas");
        System.out.println("4) Administrar");
        System.out.println("5) Salir");
    }
    
    public static void menus_secundarios(int a)
    {
        Scanner input = new Scanner(System.in);
        switch(a)
        {
            case 1:
                System.out.println("----Habitaciones----");
                System.out.println("1) Habilitar/Desabilitar habitaciones");
                System.out.println("2) Habilitar/Desabilitar pisos");
                System.out.println("3) Mostrar Habitaciones");
                System.out.println("4) Back");
                int w = input.nextInt();
                switch (w)
                {
                    case 1:
                        System.out.println("1) Habilitar/Desabilitar habitaciones");
                        String piso = input.nextLine();
                        Habitacion habitacion = new Habitacion();
                        habitacion.Disponibilidad(piso);
                       case 2:
                        System.out.println("1) Habilitar/Desabilitar pisos");
                        
                    case 3:
                        System.out.println("1) Mostrar habitaciones");
                    case 4:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                        
                }
                break;
            case 2:
                System.out.println("----Precios----");
                System.out.println("1) Modificar Precio de Habitaciones");
                System.out.println("2) Modificar Precio de Paquetes");
                System.out.println("3) Back");
                int x = input.nextInt();
                switch (x)
                {
                    case 1:
                        System.out.println("Ingrese nuevo precio de habitacion");
                        int salto = input.nextInt();
                        int PrecioDeHabitacion = input.nextInt();
                        
                        break;
                    
                    case 2:
                        System.out.println("Ingrese paquete a modificar precio");
                        System.out.println("1) Modificar Paquete Basico");
                        System.out.println("2) Modificar Paquete Premium");
                        System.out.println("3) Back");
                        Paquetes paquete = new Paquetes ();
                        int TipoDePaquete = input.nextInt();
                        switch (TipoDePaquete){
                            case 1:
                                System.out.println("Ingrese nuevo precio de Paquete");
                                int PrecioPaqueteBasico = input.nextInt();
                                paquete.setPrecio(PrecioPaqueteBasico);
                                System.out.println("El nuevo precio del paquete Basico en dolares es de :" + paquete.getPrecio());
                                break;
                            case 2:
                                System.out.println("Ingrese nuevo precio de Paquete");
                                int PrecioPaquetePremium = input.nextInt();
                                paquete.setPrecio(PrecioPaquetePremium);
                                System.out.println("El nuevo precio del paquete Premium en dolares es de :" + paquete.getPrecio());
                                
                                
                                break;
                            case 3:
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                                break;
                                
                            default:
                                System.out.println("Ingrese un dato valido");
                                menu_inicio();
                                int s = input.nextInt();
                                menus_secundarios(s);
                                break;
                        }
                        
                    case 3:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 3:
                System.out.println("----Reservas----");
                System.out.println("1) Agregar Reserva");
                System.out.println("2) Modificar Reserva");
                System.out.println("3) Eliminar Reserva");
                System.out.println("4) Mostrar Reservaciones");
                System.out.println("5) Back");
                int y = input.nextInt();
                ArrayList<Cliente> listadoClientes = new ArrayList<>();
                switch(y)
                {
                    case 1:
                        Scanner teclado=new Scanner(System.in);
                        String dui;
                        System.out.print("Ingrese nombre de Cliente: ");
                        String salto = input.nextLine();
                        String nombre = input.nextLine();
                        System.out.print("Ingrese DUI del Cliente: ");
                        dui=teclado.nextLine();
                        System.out.print("Forma de Pago del Cliente(Tarjeta o Efectivo): ");
                        String pago = input.next();
                        Cliente cliente = new Cliente();
                        cliente.setDui(dui);
                        cliente.setForma_pago(pago);
                        cliente.setNombre(nombre);
                        System.out.print("¿Cuantas habitaciones desea reservar?: ");
                        int nhabs = input.nextInt();
                        if (nhabs >2)
                        {
                            System.err.println("Lo sentimos, no puede reservas mas de 2 habitaciones");
                            System.out.print("¿Cuantas habitaciones desea reservar?: ");
                            int n_habs = input.nextInt();
                            
                            System.out.println("Escoga la/las habitacion/es que desea");
                            for(int hab=0; hab<n_habs; hab++)
                            {
                                System.out.print("Seleccione piso: ");
                                String piso = input.next();
                                System.out.print("Seleccione Habitación: ");
                                int nhab = input.nextInt();
                                System.out.print("Seleccione el Paquete para la habitacion(premiun, basico, ninguno): ");
                                String paquete = input.next();
                                
                            }
                            System.out.print("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if(dias > 7)
                            {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.print("Seleccione los días que desea reservar:");
                                int ndias = input.nextInt();
                                //agregar reservacion
                                System.out.println("-----Su Reserva se ha completado con exito-----\n\n");
                                System.out.print("Su total a pagar es de :");
                                //mostrar precio final
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            }
                            else
                            {
                                // agregar reservacion
                            }
                            System.out.println("----Su Reserva se ha completado con exito----\n\n");
                            System.out.print("Su total a pagar es de :");
                                //mostrar precio final
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            
                        }
                        else
                        {
                            System.out.println("Escoga la/las habitacion/es que desea");
                            for(int hab=0; hab<nhabs; hab++)
                            {
                                System.out.println("Seleccione piso: ");
                                String piso = input.next();
                                System.out.println("Seleccione Habitación: ");
                                int nhab = input.nextInt();
                                System.out.println("Seleccione el Paquete para la habitacion(premiun, basico, ninguno): ");
                                String paquete = input.next();
                            }
                            System.out.println("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if(dias > 7)
                            {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.println("Seleccione los días que desea reservar:");
                                int ndias = input.nextInt();
                                //agregar reservacion
                                System.out.println("----Su Reserva se ha completado con exito----\n\n");
                                System.out.print("Su total a pagar es de :");
                                //mostrar precio final
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            }
                            else
                            {
                                // agregar reservacion
                            }
                            System.out.println("----Su Reserva se ha completado con exito----");
                            menu_inicio();
                            int b = input.nextInt();
                            menus_secundarios(b);
                        }
                        break;
                    case 2:
                        System.out.println("¿Que reserva desea modificar?");
                        System.out.print("Ingrese el nombre del Cliente: ");
                        String skip = input.nextLine();
                        String ncliente = input.nextLine();
                        System.out.println("¿Qué desea Modificar?");
                        System.out.println("1) Habitaciones");
                        System.out.println("2) Paquetes");
                        System.out.println("3) Dias Reservados");
                        int cambio = input.nextInt();
                        switch (cambio)
                        {
                            case 1:
                                System.out.print("Seleccione Nuevas Habitaciones: ");
                                String nuevahab = input.next();
                                //modificar habitacion
                                break;
                            case 2:
                                System.out.print("Seleccione nuevo paquete para las habitaciones: ");
                                //modificar paquetes
                                break;
                            case 3:
                                System.out.print("Seleccione los dias que reservara: ");
                                // modificar dias
                                break;
                        }
                        break;
                    case 3:
                        System.out.print("Seleccione el nombre del Cliente: ");
                        // eliminar reserva
                        System.out.println("---Se ha eliminado la reserva---");
                        break;
                    case 4:
                        //mostrar arrayList de reservas
                        break;
                    case 5:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 4:
                System.out.println("----Administrar----");
                System.out.println("1) Agregar Habitación");
                System.out.println("2) Agregar Piso");
                System.out.println("3) Agregar Paquete");
                System.out.println("4) Back");
                int z = input.nextInt();
                switch(z)
                {
                    case 1:
                        ArrayList<String> PISO = new ArrayList<>();
                        
                        ArrayList<String>  Habitacion= new ArrayList<>();
                        System.out.println("Agregar piso (Habitación)");
                        PISO.add("A");
                        PISO.add("B");
                        PISO.add("C");
                        PISO.add("D");
                        PISO.add("F");
                        PISO.add("G");
                        
                        int size=PISO.size();
                   
                        for(int i=0; i<PISO.size(); i++) {
                            System.out.println(PISO.get(i));
                        }
                      
                    case 2:
                        Habitacion Piso = new Habitacion();
                        Piso.AgregarPisoInicial();
                        Piso.MostrarPisos();
                        
                        System.out.println("Agregar piso extra?");
                        System.out.println("1) Si");
                        System.out.println("2) No");
                        int s = input.nextInt();
                        switch(s){
                            case 1:
                                Habitacion habitacion = new Habitacion();
                                habitacion.recibirNuevoPiso();
                                Piso.MostrarPisos();
//                                for(int i = 0; i < Piso.size(); i++) 
//                                    System.out.println(Piso.get(i));
                                break;
                            case 2:
                                break;
                            default:
                                break;
                        }
                        
                        break;
                    case 3:
                        //Definiendo en nombre

                        System.out.println("Escriba el nombre del nuevo paquete a agregar: ");
                        String salto = input.nextLine();
                        //String e = input.nextLine();
                        
                        /*
                        for(int q=0; q<nombrePaquete.size();q++){
                            System.out.println("Se ha guardado el nombre: " + nombrePaquete.get(q));
                        }*/
                        //Definiendo el precio
                        ArrayList<Integer> precio = new ArrayList<>();
                        System.out.println("Escriba el precio: ");       
                        int p = input.nextInt();
                        for(int i=0; i<500; i++){
                            precio.add(p);
                        }
                        System.out.println("Se ha guardado el precio: $" + precio.get(p));
                    case 4:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                        break;
                }
                break;
            case 5:
                break;
            default:
                System.err.println("ERROR!!! Esa opcion no esta disponible \n \n");
                menu_inicio();
                int b = input.nextInt();
                menus_secundarios(b);
        }
    }
}
