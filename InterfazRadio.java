/******************************************************************
InterfazRadio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 

Interfaz que establece los metodos que usara la clase Radio
estos simularan el funcionamiento de una radio.
******************************************************************/

public interface InterfazRadio {

  boolean isON();//Devuelve true o false dependiendo si la radio esta prendida o apagada.

  boolean encender();//Pone el estado de la radio en true (encendido).

  boolean apagar();//Pone el estado de la radio en false (apagada).

  void incrementar();//Incrementa el numero de la emisora.

  void asignar(int pos);//Asigna la emisora en la que se encuentra el usuario a uno de los 12 botones disponibles.

  void emisoras(int pos);//retorna emisora guardada en uno de los 12 botones.
  
  void frecuencias();//Cambiar am y fm

}