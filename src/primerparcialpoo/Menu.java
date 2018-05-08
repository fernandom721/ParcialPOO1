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
 * @author Fernando Martínez
 */
public class Menu {
    
    
        static ArrayList<String> habitaciones;
        static ArrayList<String> Piso = new ArrayList<>();
        static ArrayList<String>  Habitacion= new ArrayList<>();
        static ArrayList<Reservacion> Reservaciones = new ArrayList<Reservacion>();
        static ArrayList<Paquetes> listaPaquetes = new ArrayList<Paquetes>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        menu_inicio();          
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        menus_secundarios(a);
        String arreglo[] = new String[10];
        int num[] = new int[10];
      
    }
    public static void reservaC(String nombre){
        
        
        
    
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
                                System.err.println("Ingrese un dato valido");
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
                switch(y)
                {
                    case 1:
                       
                        /*
                        Scanner leer = new Scanner(System.in);
                        ControlReservas reserva[] = new ControlReservas[10];
                        ControlReservas datosT[] = new ControlReservas[10];
                        Pisos Piso[] = new Pisos[6];
                        String nivel = "";
                        String nombre=" ";
                        String dui="";
                        String forma=" ";
                        String tarjeta=" ";
                        int cantidad;
                        String nombreT="";
                        String fecha="";
                        
                        System.out.println("Ingrese la cantidad de personas a hospedar");
                        cantidad = leer.nextInt();
                        for (int i=0;i<cantidad;i++){
                            System.out.println(" ");
                            System.out.println("Ingrese el nombre: ");
                            String salton = input.nextLine();
                            nombre = leer.nextLine();
                            System.out.println("Ingrese el DUI: ");
                            dui = leer.nextLine();
                            System.out.println("Forma de pago ");
                            System.out.println("1. Efectivo");
                            System.out.println("2. Tarjeta de debito");
                            cantidad = leer.nextInt();
                            switch(cantidad){
                                case 1:
                                        System.out.println("Su reservacion a sido agregada");
                                    break;
                                case 2:
                                        System.out.println("Ingrese el nombre del titular: ");
                                        String saltin = input.nextLine();
                                        nombreT= leer.nextLine();
                                        System.out.println("Ingrese la fecha del de expiracion: ");
                                        fecha= leer.nextLine();
                                             
                                    break;
                                default:
                                    System.err.println("Ingrese una opcion valida.");
                                    break;
                            }
                            int cantidah =0;
                            System.out.println("Ingrese la cantidad de habitaciones a reservar: ");
                            cantidah= leer.nextInt();
                            if(cantidah > 2){
                                System.err.println("Error, no se pueden reservar mas de dos habitaciones");
                                System.out.println("Cuantas Habitaciones desea Reservar: ");
                                if(cantidah <=2){
                                   System.out.println("Que habitacion desea? : ");
                                   int n_habs=0;
                            for(int hab=0; hab<n_habs; hab++){
                                System.out.print("Seleccione piso: ");
                                 nivel = leer.nextLine();
                                System.out.print("Seleccione Habitación: ");
                                int nhab = leer.nextInt();
                                System.out.print("Seleccione el Paquete para la habitacion(premiun, basico, ninguno): ");
                                String paquete = leer.nextLine();
                                
                            }
                                }
                            }
                            leer.nextLine();
                            reserva[i] = new ControlReservas(nombre,dui,forma, cantidah);
                            datosT[i] = new ControlReservas(nombreT,fecha);
                            Piso[i] = new Pisos(nivel);
                        }
                        */
                        
                        Scanner teclado=new Scanner(System.in);
                        Reservacion Reservacion = new Reservacion();
                        Reservaciones.add(Reservacion);
                        Cliente cliente = new Cliente();
                        input.nextLine();
                        System.out.print("Ingrese nombre de Cliente: ");
                        cliente.setNombre(input.nextLine());
                        System.out.print("Ingrese DUI del Cliente: ");
                        cliente.setDui(input.nextLine());
                        System.out.print("Forma de Pago del Cliente(Tarjeta o Efectivo): ");
                        cliente.setForma_pago(input.nextLine());
                        Reservacion.setCliente(cliente);
                        System.out.print("¿Cuantas habitaciones desea sreservar?: ");
                        int nhabs = input.nextInt();
                        if (nhabs >2)
                        {
                            System.err.println("Lo sentimos, no puede reservas mas de 2 habitaciones");
                            System.out.print("¿Cuantas habitaciones desea reservar?: ");
                            int n_habs = input.nextInt();
                            Reservacion.setCantidadDeHabitaciones(n_habs);
                            
                            System.out.println("Escoga la/las habitacion/es que desea");
                            for(int hab=0; hab<n_habs; hab++)
                            {
                                input.nextLine();
                                System.out.print("Seleccione piso: ");
                                Reservacion.setPiso(input.nextLine());
                                System.out.print("Seleccione Habitación: ");
                                Reservacion.setNumero_habitacion(input.nextLine());
                                System.out.print("Seleccione el Paquete para la habitacion(premiun, basico, ninguno): ");
                                Reservacion.setPaquete(input.next());
                                
                            }
                            
            
                            System.out.print("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if(dias > 7)
                            {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.print("Seleccione los días que desea reservar:");
                                Reservacion.setDias(input.nextInt());
                                
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
                            
                           
                            Reservacion.setCantidadDeHabitaciones(nhabs);
                            
                            System.out.println("Escoga la/las habitacion/es que desea");
                            for(int hab=0; hab<nhabs; hab++)
                            {
                                input.nextLine();
                                System.out.print("Seleccione piso: ");
                                Reservacion.setPiso(input.nextLine());
                                System.out.print("Seleccione Habitación: ");
                                Reservacion.setNumero_habitacion(input.nextLine());
                                System.out.print("Seleccione el Paquete para la habitacion(premiun, basico, ninguno): ");
                                Reservacion.setPaquete(input.next());
                                
                            }
                            
            
                            System.out.print("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if(dias > 7)
                            {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.print("Seleccione los días que desea reservar:");
                                Reservacion.setDias(input.nextInt());
                                
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
                        Reservaciones.forEach((reservacion) -> {
                            reservacion.mostrar();
                        });
                          menu_inicio();
                        int xx= input.nextInt();
                        menus_secundarios(xx);
                        break;
                    case 5:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            case 4:
                System.out.println("----Administrar----");
                System.out.println("1) Inicializar Valores");
                System.out.println("2) Agregar Paquete");
                System.out.println("3) Back");
                int z = input.nextInt();
                switch(z)
                {
                    case 1:
                        Habitacion Piso = new Habitacion();
///////////////////////////////////////AGREGAR PISOS///////////////////////                        
                        System.out.println("Seleccione la cantidad inicial de pisos, con un minimo de 6 y un maximo de 15:");
                        int AgPiso = input.nextInt();
                        
                        while (AgPiso < 6  || AgPiso > 15){
                            System.out.println("Coloque una opcion valida porfavor");
                            AgPiso = input.nextInt();
                        }
                        
                        Piso.AgregarPisoInicial(AgPiso);
                        System.out.println("Estos son los pisos obtenidos:");
                        Piso.MostrarPisos();
//////////////////////////////////AGREGAR HABITACIONES///////////////////////////                        
                        System.out.println("Seleccione la cantidad inicial de habitaciones, con un minimo de 10 y un maximo de 20:");
                        int AgCantHabitaciones = input.nextInt();
                        
                        while (AgCantHabitaciones < 10  || AgCantHabitaciones > 20){
                            System.out.println("Coloque una opcion valida porfavor");
                            AgPiso = input.nextInt();
                        }
                        
                        Piso.AgregarHabitaciones(AgCantHabitaciones);
                        System.out.println("Estos son los numeros de  habitacion obtenidos:");
                        Piso.MostrarNumeroHabitacion();
                        
                        break;
                    case 2:
                        
                        String nameBasic = "Basico";
                        String namePremium = "Premium";
                        listaPaquetes.add(new Paquetes("Acceso a buffet de desayuno, acceso ilimitado a la piscina, servicio a la habitación, acceso ilimitado al minibar y acceso a internet ilimitado","Premium",150));
                        listaPaquetes.add(new Paquetes("Acceso a la piscina y acceso a internet ilimitado","Basico",10));
                        System.out.println("Escriba el nombre del nuevo paquete: ");
                        String name = input.next();
                        if(name.equals(nameBasic)||name.equals(namePremium)){
                            System.err.println("El paquete ya existe. Inténtelo de nuevo.\n");
                            System.out.println("Escriba el nombre del nuevo paquete: ");
                            String nombre = input.next();
                            System.out.println("Escriba los beneficios del paquete "+name+": ");
                            String saltin = input.nextLine();
                            String benefits = input.nextLine();
                            System.out.println("Escriba su precio: ");
                            int price = input.nextInt();
                            listaPaquetes.add(new Paquetes(benefits,nombre,price));
                            System.out.println("--- ¡Paquete añadido exitosamente! ---\n\nPara ver los paquetes existentes pulse 1, si desea volver al menú principal pulse 2: ");
                            int boton = input.nextInt();
                            if(boton==1){
                                for(Paquetes e: listaPaquetes){
                                    System.out.println(e.mostrarLista());
                                }
                            }
                            else if(boton==2){
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            }
                        }
                        else{
                            System.out.println("Escriba los beneficios del paquete "+name+": ");
                            String saltin = input.nextLine();
                            String benefits = input.nextLine();
                            System.out.println("Escriba su precio: ");
                            int price = input.nextInt();
                            listaPaquetes.add(new Paquetes(benefits,name,price));
                            System.out.println("--- ¡Paquete añadido exitosamente! ---\n\nPara ver los paquetes existentes pulse 1, si desea volver al menú principal pulse 2: ");
                            int boton = input.nextInt();
                            if(boton==1){
                                for(Paquetes e: listaPaquetes){
                                    System.out.println(e.mostrarLista());
                                }
                            }
                            else if(boton==2){
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            }
                        }
                    case 3:
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


