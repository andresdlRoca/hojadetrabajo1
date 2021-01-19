/******************************************************************
InterfazRadio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 


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