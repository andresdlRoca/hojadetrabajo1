/******************************************************************
RadioGeneral.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 1/21/2021

Interfaz que establece los metodos que usara la clase Radio
estos simularan el funcionamiento de una radio.
 @author Andres de la Roca
 @author Sebastian Aristondo
******************************************************************/


public interface RadioGeneral {

  /**
   * Devuelve true o false dependiendo si la radio esta prendida o apagada.
   */
  boolean isON();

  /**
   * Pone el estado de la radio en true (encendido).
   */

  void encender();

  /**
   * Pone el estado de la radio en false (apagada).
   */
  void apagar();

  /**
   * Incrementa el numero de la emisora.
   */
  void incrementar();

  /**
   * Asigna la emisora en la que se encuentra el usuario a uno de los 12 botones disponibles.
   * @param pos Posicion del boton al que se quiere asignar la emisora
   * @return true o false
   */
  boolean asignar(int pos);//

  /**
   * retorna emisora guardada en uno de los 12 botones.
   * @param pos Posicion del boton al que quiere ir
   * @return
   */
  boolean emisora(int pos);

  /**
   * Cambiar am y fm
   */
  void frecuencia();

}