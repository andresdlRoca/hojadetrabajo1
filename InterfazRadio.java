/******************************************************************
InterfazRadio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 

Interfaz que establece los metodos que usara la clase Radio
estos simularan el funcionamiento de una radio.
******************************************************************/

public interface InterfazRadio {

  boolean isON();

  void encender();

  void apagar();

  void incrementar();

  void disminuir();

  void asignar(int pos);

  void emisoras(int pos);//retorna emisora guardada

  //int emisoras(int pos);
  
  void frecuencias();//Cambiar am y fm

}