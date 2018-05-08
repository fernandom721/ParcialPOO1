/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.Scanner;
import java.util.ArrayList;
import primerparcialpoo.Reservacion;

/**
 * @author Fernando Martínez
 */
public class Menu {

    static ArrayList<String> habitaciones;
    static ArrayList<String> Piso = new ArrayList<>();
    static ArrayList<String> Habitacion = new ArrayList<>();
    //static ArrayList<Reservacion> Reservaciones = new ArrayList<Reservacion>();
    static ArrayList<Paquetes> listaPaquetes = new ArrayList<Paquetes>();
    static ArrayList<Habitacion> habilitado = new ArrayList<Habitacion>();
    static ArrayList<Reservacion> ListaReservaciones = new ArrayList<Reservacion>();

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

    public static void menu_inicio() {
        System.out.println("----Hotel Viña Rafinha----");
        System.out.println("Seleccione una Opción");
        System.out.println("1) Mostrar habitaciones disponibles");
        System.out.println("2) Precios");
        System.out.println("3) Reservas");
        System.out.println("4) Administrar");
        System.out.println("5) Salir");
    }

    public static void menus_secundarios(int a) {

        Scanner input = new Scanner(System.in);

        switch (a) {
            //////////////////////////////////////////////////////////////////// HABITACIONES
            case 1:
                System.out.println("----Habitaciones----");
                System.out.println("1) Mostrar habitaciones");
                System.out.println("2) Back");
                int w = input.nextInt();
                switch (w) {
                    case 1:
                        Habitacion hotel = new Habitacion();
                        hotel.AgregarPisoInicial(6);
                        hotel.AgregarHabitaciones(10);
                        System.out.println("Gracias por preferir el Hotel Viña Rafinha.\n");
                        System.out.println("Nuestro hotel se divide por pisos; si lo ve en la lista,¡estará completamente a su disposición!");
                        hotel.MostrarPisos();
                        System.out.println("\n");
                        System.out.println("Ahora le mostraremos las habitaciones que están disponibles por pisos. Ya sabe si lo mira, puede disponer de él.");
                        hotel.MostrarNumeroHabitacion();
                        System.out.println("\n");
                        System.out.println("Ahora lo regresaremos al menú principal para que pueda realizar su reserva, o consultar nuestros precios.");
                        System.out.println("\n");
                    case 2:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);

                }
                break;
            //////////////////////////////////////////////////////////////////// PRECIOS
            case 2:
                System.out.println("----Precios----");
                System.out.println("1) Modificar Precio de Habitaciones");
                System.out.println("2) Modificar Precio de Paquetes");
                System.out.println("3) Back");
                int x = input.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Ingrese nuevo precio de habitacion");
                        int PrecioDeHabitacion = input.nextInt();

                        break;

                    case 2:
                        System.out.println("Ingrese paquete a modificar precio");
                        System.out.println("1) Modificar Paquete Basico");
                        System.out.println("2) Modificar Paquete Premium");
                        System.out.println("3) Back");
                        Paquetes paquete = new Paquetes();
                        int TipoDePaquete = input.nextInt();
                        switch (TipoDePaquete) {
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
            //////////////////////////////////////////////////////////////////// RESERVAS
            case 3:
                System.out.println("----Reservas----");
                System.out.println("1) Agregar Reserva");
                System.out.println("2) Modificar Reserva");
                System.out.println("3) Eliminar Reserva");
                System.out.println("4) Mostrar Reservaciones");
                System.out.println("5) Back");
                int y = input.nextInt();
                switch (y) {
                    case 1:

                        //Cliente cliente = new Cliente();
                        Reservacion cliente = new Reservacion();
                        input.nextLine();
                        int total = 40;
                        System.out.print("Ingrese nombre de Cliente: ");
                        String nombre = input.nextLine();
//                        cliente.setNombre(nombre);
                        System.out.print("Ingrese DUI del Cliente: ");
                        int dui = input.nextInt();
                        //                      cliente.setDui(dui);
                        System.out.print("Forma de Pago del Cliente(Tarjeta o Efectivo): ");
                        String saltin = input.nextLine();
                        String pago = input.nextLine();
                        //                    cliente.setForma_pago(pago);
                        cliente.datosCliente(nombre, dui, pago);
                        System.out.print("¿Cuantas habitaciones desea reservar?: ");
                        int nhabs = input.nextInt();
                        if (nhabs > 2) {
                            System.err.println("Lo sentimos, no puede reservas mas de 2 habitaciones");
                            System.out.print("¿Cuantas habitaciones desea reservar?: ");
                            int n_habs = input.nextInt();

                            System.out.println("Escoga la/las habitacion/es que desea");
                            for (int hab = 0; hab < n_habs; hab++) {
                                input.nextLine();
                                System.out.print("Seleccione piso: ");
                                String piso = input.nextLine();
                                System.out.print("Seleccione Habitación: ");
                                int habi = input.nextInt();
                                System.out.print("Seleccione el Paquete para la habitacion(premium, basico, ninguno): ");
                                String packt = input.next();
                                if (!packt.equals("premiun") || !packt.equals("basico") || !packt.equals("Premium") || !packt.equals("Basico") || !packt.equals("ninguno") || !packt.equals("Ninguno") || !packt.equals("NONE") || !packt.equals("NULL") || !packt.equals("none") || !packt.equals("null")) {
                                    System.err.println("No existe un paquete con ese nombre");
                                    System.out.print("Seleccione el Paquete para la habitacion(premium, basico, ninguno): ");
                                    
                                }

                            }

                            System.out.print("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if (dias > 7) {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.print("Seleccione los días que desea reservar:");
                                int dia = input.nextInt();
                                System.out.println("Confirme piso de habitación: ");
                            String fl = input.next();
                            System.out.println("Confirme número de habitación: ");
                            int habit = input.nextInt();
                            System.out.println("Confirme paquete deseado");
                            String pack = input.next();

                                //agregar reservacion
                                System.out.println("-----Su Reserva se ha completado con exito-----");
                                System.out.print("Su total a pagar es de :");
                                System.out.println("$"+total*dias+"\n");
                                //mostrar precio final
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            } else {
                                System.out.println("Confirme piso de habitación: ");
                            String fl = input.next();
                            System.out.println("Confirme número de habitación: ");
                            int habit = input.nextInt();
                            System.out.println("Confirme paquete deseado");
                            String pack = input.next();
                            System.out.println("----Su Reserva se ha completado con exito----");
                            System.out.print("Su total a pagar es de :");
                            System.out.println("$"+total*dias+"\n");
                            //mostrar precio final                              
                                
                                
                            menu_inicio();
                            int b = input.nextInt();
                            menus_secundarios(b);
                            }
                            

                        } else {
                            System.out.println("Escoga la/las habitacion/es que desea");
                            for (int hab = 0; hab < nhabs; hab++) {
                                input.nextLine();
                                System.out.print("Seleccione piso: ");
                                String piso = input.nextLine();
                                System.out.print("Seleccione Habitación: ");
                                int habi = input.nextInt();
                                System.out.print("Seleccione el Paquete para la habitacion(1)premium,2) basico, 3)ninguno): ");
                                String pack = input.next();
                                if (!pack.equals("premiun") || !pack.equals("basico") || !pack.equals("Premium") || !pack.equals("Basico") || !pack.equals("ninguno") || !pack.equals("Ninguno") || !pack.equals("NONE") || !pack.equals("NULL") || !pack.equals("none") || !pack.equals("null")) {
                                    System.err.println("No existe un paquete con ese nombre");
                                    System.out.print("Seleccione el Paquete para la habitacion(premium, basico, ninguno): ");
                                    String packt = input.next();
                                }

                            }

                            System.out.print("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if (dias > 7) {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.print("Seleccione los días que desea reservar:");
                                int dia = input.nextInt();
                                System.out.println("Confirme piso de habitación: ");
                                String fl = input.next();
                                System.out.println("Confirme número de habitación: ");
                                int habit = input.nextInt();
                                System.out.println("Confirme paquete deseado");
                                String pack = input.next();
                                //agregar reservacion
                                System.out.println("-----Su Reserva se ha completado con exito-----");
                                System.out.print("Su total a pagar es de :");
                                System.out.println("$"+total*dias+"\n");
                                //mostrar precio final
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            } else {
                                // agregar reservacion
                            System.out.println("Confirme piso de habitación: ");
                            String fl = input.next();
                            System.out.println("Confirme número de habitación: ");
                            int habit = input.nextInt();
                            System.out.println("Confirme paquete deseado");
                            String pack = input.next();
                            System.out.println("----Su Reserva se ha completado con exito----");
                            System.out.print("Su total a pagar es de :");
                            System.out.println("$"+total*dias+"\n");
                            //mostrar precio final
                            menu_inicio();
                            int b = input.nextInt();
                            menus_secundarios(b);
                            }
                            
                            /*
                            System.out.println("Escoga la/las habitacion/es que desea");
                            for (int hab = 0; hab < nhabs; hab++) {
                                input.nextLine();
                                System.out.print("Seleccione piso: ");
                                String fl = input.next();
                                System.out.print("Seleccione Habitación: ");
                                String habi = input.next();
                                System.out.print("Seleccione el Paquete para la habitacion(premium, basico, ninguno): ");
                                String pack = input.next();
                                if (!pack.equals("premium") || !pack.equals("basico") || !pack.equals("Premium") || !pack.equals("Basico") || !pack.equals("ninguno") || !pack.equals("Ninguno") || !pack.equals("NONE") || !pack.equals("NULL") || !pack.equals("none") || !pack.equals("null")) {
                                    System.err.println("No existe un paquete con ese nombre");
                                    System.out.print("Seleccione el Paquete para la habitacion(premium, basico, ninguno): ");
                                    String packt = input.next();
                                }
                            }

                            System.out.print("Seleccione los días que desea reservar:");
                            int dias = input.nextInt();
                            if (dias > 7) {
                                System.err.println("Lo Sentimos, no puede reservar mas de 7 dias");
                                System.out.print("Seleccione los días que desea reservar:");
                                //agregar reservacion
                                System.out.println("-----Su Reserva se ha completado con exito-----\n\n");
                                System.out.print("Su total a pagar es de $");
                                //mostrar precio final
                                menu_inicio();
                                int b = input.nextInt();
                                menus_secundarios(b);
                            } else {
                                // agregar reservacion
                            }
                            System.out.println("Confirme piso de habitación: ");
                            String fl = input.next();
                            System.out.println("Confirme número de habitación: ");
                            int habit = input.nextInt();
                            System.out.println("Confirme paquete deseado");
                            String pack = input.next();
                            //mostrar precio final
                            if (pack.equals("premium") || pack.equals("Premium")) {
                                total = total + 150;
                                ListaReservaciones.add(new Reservacion(nombre, dui, pago,habit, fl, dias, pack, total));
                                System.out.println("----Su Reserva se ha completado con exito----\n\n");
                                System.out.print("Su total a pagar es de $");
                                Reservacion.getListaReservaciones(pago);
                                System.out.println(total);
                                System.out.println("\n");
                                System.out.println("Su ticket:\n");
                                ListaReservaciones.forEach((e) -> {
                                    System.out.println(e.mostrarReservacion());
                                });
                                }
                            else if (pack.equals("basico") || pack.equals("Basico")){
                                total = total+10;
                                ListaReservaciones.add(new Reservacion(nombre, dui, pago,habit, fl, dias, pack, total));
                                System.out.println("----Su Reserva se ha completado con exito----\n\n");
                                System.out.print("Su total a pagar es de :");
                                Reservacion.getListaReservaciones(pago);
                                System.out.println(total);
                                System.out.println("\n");
                                System.out.println("Su ticket:\n");
                                ListaReservaciones.forEach((e) -> {
                                    System.out.println(e.mostrarReservacion());
                                });
                                System.out.println("\n");
                            }
                            menu_inicio();
                            int b = input.nextInt();
                            menus_secundarios(b);*/
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
                        switch (cambio) {
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
                        String Busca = input.nextLine();
                        int i = 0;
                        while (i < Reservacion.ListaReservaciones.size()) {
                            if (Busca.equals(Reservacion.ListaReservaciones.get(i))) {
                                Reservacion.ListaReservaciones.remove(i);
                            }
                            i++;
                        }
                        System.out.println("---Se ha eliminado la reserva---");
                        break;
                    case 4:
                        //Reservacion.ListaReservaciones.forEach((reservacion) -> {
                            //reservacion.mostrar();
                        //});
                        Reservacion.ListaReservaciones.remove(0);
                        menu_inicio();
                        int xx = input.nextInt();
                        menus_secundarios(xx);
                        break;
                    case 5:
                        menu_inicio();
                        int b = input.nextInt();
                        menus_secundarios(b);
                }
                break;
            //////////////////////////////////////////////////////////////////// ADMINISTRACIÓN
            case 4:
                System.out.println("----Administrar----");
                System.out.println("¡Bienvenido administrador!\nPor favor ingrese su usuario y contraseña");
                String usuario = "admin";
                String contra = "rasen";
                System.out.println("Usuario: ");
                String user = input.next();
                System.out.println("Contraseña: ");
                String pass = input.next();
                if (user.equals(usuario) && pass.equals(contra)) {
                    System.out.println("\n¡Qué bueno verlo de regreso, administrador!");
                    System.out.println("1) Inicializar Valores");
                    System.out.println("2) Agregar Paquete");
                    System.out.println("3) Habilitar o deshabilitar habitación");
                    System.out.println("4) Habilitar o deshabilitar piso");
                    System.out.println("5) Back");
                    int z = input.nextInt();
                    Habitacion Piso = new Habitacion();
                    switch (z) {
                        case 1:

///////////////////////////////////////AGREGAR PISOS///////////////////////                        
                            System.out.println("Seleccione la cantidad inicial de pisos, con un minimo de 6 y un maximo de 15:");
                            int AgPiso = input.nextInt();

                            while (AgPiso < 6 || AgPiso > 15) {
                                System.out.println("Coloque una opcion valida porfavor");
                                AgPiso = input.nextInt();
                            }

                            Piso.AgregarPisoInicial(AgPiso);
                            System.out.println("Estos son los pisos obtenidos:");
                            Piso.MostrarPisos();
//////////////////////////////////AGREGAR HABITACIONES///////////////////////////                        
                            System.out.println("Seleccione la cantidad inicial de habitaciones, con un minimo de 10 y un maximo de 20:");
                            int AgCantHabitaciones = input.nextInt();

                            while (AgCantHabitaciones < 10 || AgCantHabitaciones > 20) {
                                System.err.println("Coloque una opcion valida porfavor");
                                AgPiso = input.nextInt();
                            }

                            Piso.AgregarHabitaciones(AgCantHabitaciones);
                            System.out.println("Estos son los números de  habitación obtenidos:");
                            Piso.MostrarNumeroHabitacion();
                            System.out.println("\n");
                            menu_inicio();
                            int j = input.nextInt();
                            menus_secundarios(j);
                            break;
                        case 2:

                            String nameBasic = "Basico";
                            String namePremium = "Premium";
                            listaPaquetes.add(new Paquetes("Acceso a buffet de desayuno, acceso ilimitado a la piscina, servicio a la habitación, acceso ilimitado al minibar y acceso a internet ilimitado", "Premium", 150));
                            listaPaquetes.add(new Paquetes("Acceso a la piscina y acceso a internet ilimitado", "Basico", 10));
                            System.out.println("Escriba el nombre del nuevo paquete: ");
                            String nombre = input.next();
                             {
                                String name = null;
                                System.out.println("Escriba los beneficios del paquete " + name + ": ");
                            }
                            String saltin = input.nextLine();
                            String benefits = input.nextLine();
                            System.out.println("Escriba su precio: ");
                            int price = input.nextInt();
                            listaPaquetes.add(new Paquetes(benefits, nombre, price));
                            System.out.println("--- ¡Paquete añadido exitosamente! ---\n\nPara ver los paquetes existentes pulse 1, si desea volver al menú principal pulse 2: ");
                            int boton = input.nextInt();
                            if (boton == 1) {
                                listaPaquetes.forEach((e) -> {
                                    System.out.println(e.mostrarLista());
                                });
                            }
                        case 3:
                            int desh;
                            System.out.println("Verifique el número de habitaciones existentes:");
                            int AgCantH = input.nextInt();
                            System.out.println("\n");
                            Piso.AgregarHabitaciones(AgCantH);
                            Piso.MostrarNumeroHabitacion();
                            System.out.println("\nPara las anteriormente mostradas, si desea deshabilitar alguna escriba 1, si desea habilitar alguna escriba 2");
                            int d = input.nextInt();
                            if (d == 1) {
                                System.out.println("Escriba el número de habitación que desea deshabilitar: ");
                                desh = input.nextInt();
                                int number = Piso.CantHabitaciones[desh];
                                boolean Disponibilidad = Piso.Disponible(number);
                                if (desh > AgCantH) {
                                    System.err.println("El dato introducido excede a la cantidad de habitaciones que posee éste piso. No se puede completar la acción.");
                                }
                                if (Disponibilidad = true) {
                                    System.out.println("Habitación deshabilitada");
                                } else {
                                    System.err.println("No se pudo realizar la acción");
                                }
                            }
                            if (d == 2) {
                                System.out.println("Escriba el número de habitación que desea habilitar: ");
                                desh = input.nextInt();
                                int number = Piso.CantHabitaciones[desh];
                                boolean Disponibilidad = Piso.Disponible(number);
                                if (Disponibilidad = false) {
                                    System.out.println("Habitación habilitada");
                                } else {
                                    System.err.println("No se pudo realizar la acción debido a que no existe ningún piso deshabilitado.");
                                }
                            }
                            menu_inicio();
                            int bbb = input.nextInt();
                            menus_secundarios(bbb);
                            break;
                        case 4:
                            int desp;
                            System.out.println("Verifique el número de pisos existentes: (mayor a 6, menor a 27)");
                            int AgCantP = input.nextInt();
                            if (AgCantP >= 6 && AgCantP <= 27) {
                                System.out.println("\n");
                                Piso.AgregarPisoInicial(AgCantP);
                                Piso.MostrarPisos();
                                System.out.println("\nPara las anteriormente mostradas, si desea deshabilitar alguno escriba 1, si desea habilitar alguno escriba 2");
                                int g = input.nextInt();
                                if (g == 1) {
                                    System.out.println("Escriba el número de piso que desea deshabilitar: (Éstos se ordenan de la A a la Z. Numéricamente del 1 al 27)");
                                    desp = input.nextInt();
                                    int number = Piso.CantHabitaciones[desp];
                                    boolean Disponibilidad = Piso.Disponible(number);
                                    if (desp > 27) {
                                        System.err.println("El dato introducido excede a la cantidad de pisos que posee el edificio actualmente. No se puede completar la acción.");
                                    }
                                    if (Disponibilidad = true) {
                                        System.out.println("Piso deshabilitado");
                                    } else {
                                        System.err.println("No se pudo realizar la acción");
                                    }
                                }
                                if (g == 2) {
                                    System.out.println("Escriba el número de habitación que desea habilitar: ");
                                    desp = input.nextInt();
                                    int number = Piso.CantHabitaciones[desp];
                                    boolean Disponibilidad = Piso.Disponible(number);
                                    if (desp > 27) {
                                        System.err.println("El dato introducido excede a la cantidad de pisos que posee el edificio actualmente. No se puede completar la acción.");
                                    }
                                    if (Disponibilidad = false) {
                                        System.out.println("Piso habilitado");
                                    } else {
                                        System.err.println("No se pudo realizar la acción debido a que no existe ningún piso deshabilitado.");
                                    }
                                }
                            } else {
                                System.err.println("Datos introducidos inválidos. No se puede completar la acción.");
                            }
                            menu_inicio();
                            int bb = input.nextInt();
                            menus_secundarios(bb);
                            break;
                        case 5:
                            menu_inicio();
                            int b = input.nextInt();
                            menus_secundarios(b);
                            break;
                    }

                } else {
                    System.err.println("Nombre de usuario ó contraseña inválidos. No se pudo iniciar sesión.");
                    menu_inicio();
                    int b = input.nextInt();
                    menus_secundarios(b);
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
