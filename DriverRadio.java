/******************************************************************
DriverRadio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 1/21/2021

Esta clase es el driver del programa que simula el funcionamiento
de una radio, toma metodos de la clase Radio para su funcionamiento
******************************************************************/
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase driver del programa que simula el funcionamiento de una radio, toma metodos de la clase Radio para su funcionamiento
 * @author Andres de la Roca
 * @author Sebastian Aristondo
 */
public class DriverRadio {
  /**
   * Metodo main
   * @param args
   */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    Radio radio = new Radio();
    boolean run = true;

    while (run) {

      //Loop de while si la radio esta prendida
      while(radio.isON()) {
        try {
          System.out.println("\nMenu Principal de radio");
          System.out.println("1. Apagar la radio");
          System.out.println("2. Aumentar No. de emisora");
          System.out.println("3. Asignar una emisora a boton");
          System.out.println("4. Seleccionar emisora");
          System.out.println("5. Cambiar de frecuencia\n");

          int eleccionmenu = scan.nextInt();

          switch(eleccionmenu) {
            
            //Apagar la radio
            case 1 : {
              //Cambio de isON a false
              radio.apagar();
              break;
            }

            //Aumenta el numero de la emisora
            case 2 : {
              radio.incrementar();
              break;
            }

            //Asignar una emisora a uno de los 12 botones
            case 3 : {
              boolean menuasignar = true;

              while (menuasignar) {
                try {
                  System.out.println("Ingrese el boton donde quiera guardar la emisora (1-12)");
                  int boton = scan.nextInt();
                  if (boton < 0 || boton > 12) {
                    System.out.println("No ingreso una opcion valida, intentelo de nuevo");
                  } else {
                    radio.asignar(boton);
                    menuasignar= false;
                  }
                  
                } catch (InputMismatchException e) {
                  System.out.println("Ingreso una opcion incorrecta, intentelo de nuevo");
                  scan.nextLine();
                }
              }

              break;
            }
            
            //Selecciona emisora de alguno de los botones
            case 4 : {
              
              boolean menuemisora = true;

              while (menuemisora) {
                try {
                  System.out.println("Ingrese el boton correspondiente de la emisora que quiere escuchar (1-12)");

                  int boton = scan.nextInt();
                  if (boton < 0 || boton > 12) {
                    System.out.println("No ingreso una opcion valida, intentelo de nuevo");
                  } else {
                    radio.emisora(boton);
                    menuemisora= false;
                  }
                  
                } catch (InputMismatchException e) {
                  System.out.println("Ingreso una opcion incorrecta, intentelo de nuevo");
                  scan.nextLine();
                }
              }

              break;
            }

            //Cambiar frecuencias de AM a FM
            case 5 : {
              radio.frecuencia();
              break;
            }

            default : {
              System.out.println("Se ingreso una opcion incorrecta, intentelo nuevamente");
              scan.nextLine();
            }

          }

        } catch (InputMismatchException e) {
          scan.nextLine();
          System.err.println("Se ingreso una opcion invalida, intentelo de nuevo");
        }
      }

      //Loop de while si la radio esta apagada
      while (!radio.isON()) {
        try {
          System.out.println("\nMenu Principal de radio apagada");
          System.out.println("1. Encender la radio\n");
          
          int menueleccion = scan.nextInt();

          switch(menueleccion) {

            //Encender la radio
            case 1 : {
              System.out.println("Radio encendida");
              radio.encender();
              break;
            }

            default : {
              System.out.println("Ingreso una opcion invalida, intentelo de nuevo");
              scan.nextLine();
            }

          }

        } catch (InputMismatchException e) {
          scan.nextLine();
          System.err.println("Ingreso una opcion incorrecta, intentelo de nuevo");
        }
      }
    }
  }
}