/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;
import java.util.Scanner;

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
                switch(y)
                {
                    case 1:
                        System.out.print("Ingrese nombre de Cliente: ");
                        String salto = input.nextLine();
                        String nombre = input.nextLine();
                        System.out.print("Ingrese DUI del Cliente: ");
                        int dui = input.nextInt();
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
                                System.out.println("----Su Reserva se ha completado con exito----\n\n");
                            }
                            else
                            {
                                // agregar reservacion
                            }
                            System.out.println("----Su Reserva se ha completado con exito----\n\n");
                            
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
                System.out.println("3) Back");
                int z = input.nextInt();
                switch(z)
                {
                    case 2:
                        Habitacion Piso = new Habitacion();
                        Piso.AgregarPisoInicial();
                        Piso.MostrarPisos();
                    case 3:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 5:
                break;
            default:
                System.out.println("ERROR!!! Esa opcion no esta disponible \n \n");
                menu_inicio();
                int b = input.nextInt();
                menus_secundarios(b);
        }
    }
}
