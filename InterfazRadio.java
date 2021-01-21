/******************************************************************
InterfazRadio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 

Interfaz que establece los metodos que usara la clase Radio
estos simularan el funcionamiento de una radio.
******************************************************************/

public interface InterfazRadio {

  boolean isON();//Devuelve true o false dependiendo si la radio esta prendida o apagada.

  void encender();//Pone el estado de la radio en true (encendido).

  void apagar();//Pone el estado de la radio en false (apagada).

  void incrementar();//Incrementa el numero de la emisora.

  boolean asignar(int pos);//Asigna la emisora en la que se encuentra el usuario a uno de los 12 botones disponibles.

  boolean emisora(int pos);//retorna emisora guardada en uno de los 12 botones.
  
  void frecuencia();//Cambiar am y fm

}