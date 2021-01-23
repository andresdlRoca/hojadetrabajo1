/******************************************************************
Radio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 1/21/2021

Clase que simula con su metodos el funcionamiento de una radio.
******************************************************************/
import java.text.DecimalFormat;

/**
 * Clase que simula con su metodos el funcionamiento de una radio.
 * @author Andres de la Roca
 * @author Sebastian Aristondo
 */
public class Radio implements RadioGeneral {

//Intancia de atributos
//-----------------------------
int [] EmisorasAM;
float [] EmisorasFM;
float frecuencuaFM = 87.9f;
int frecuencuaAM = 530;
boolean estado;
boolean AMFM;
//------------------------------
DecimalFormat df = new DecimalFormat("#.#");
//df.setRoundingMode(RoundingMode.CEILING);

  public Radio()
  {
    estado =false;
    AMFM = false;//Am = falso / Fm=true;
    EmisorasAM = new int[12];
    EmisorasFM = new float[12];
  }

  /**
   * Pone el estado de la radio en true (encendido).
   */
  public void encender()
  {
    estado=true;
  }

  /**
   * Pone el estado de la radio en false (apagada).
   */
  public void apagar()
  {
    estado=false;
  }

  /**
   * Devuelve true o false dependiendo si la radio esta prendida o apagada.
   */
  public boolean isON()
  {
    return estado;
  }

  /**
   * Incrementa el numero de la emisora.
   */
  public void incrementar()
  {
    
    if(AMFM)
    {
      incrementarFM();
    }
    else
    {
      incrementarAM();
    }

    
  }

  /**
   * Incrementa las emisoras en la frecuencia AM
   */
  private void incrementarAM()
  {
    frecuencuaAM+=10;
    if(frecuencuaAM>1610)
    {
      frecuencuaAM=530;
    }
    System.out.println(frecuencuaAM);
  }

  /**
   * Incrementa las emisoras en la frecuencia FM
   */
  private void incrementarFM()
  {
    frecuencuaFM+=0.2f;
    
    if(frecuencuaFM>107.9f)
    {
      frecuencuaFM=87.9f;
    }
    System.out.println(df.format(frecuencuaFM));
  }

  /**
   * Asigna la emisora en la que se encuentra el usuario a uno de los 12 botones disponibles.
   * @param pos Posicion del boton al que se quiere asignar la emisora
   * @return
   */
  public boolean asignar(int pos)
  {
    if(AMFM)
    {//FM
      EmisorasFM[pos-1]=frecuencuaFM;
      return true;
    }
    else
    {//AM
      EmisorasAM[pos-1]=frecuencuaAM;
      return true;
    }
  }

  /**
   * retorna emisora guardada en uno de los 12 botones.
   * @param pos Posicion del boton al que quiere ir
   * @return
   */
  public boolean emisora(int pos)
  {
    if(AMFM)
    {//FM
      String emisora = df.format(EmisorasFM[pos-1]);
      System.out.println(emisora+"");
      return true;
    }
    else
    {//AM
      System.out.println(EmisorasAM[pos-1]+"");
      return true;
    }
  }

  /**
   * Cambiar am y fm
   */
  public void frecuencia()
  {
    AMFM=!AMFM;
  }
  
}