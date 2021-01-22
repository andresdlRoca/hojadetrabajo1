/******************************************************************
Radio.java
Autores: Andrés de la Roca (20332) y Sebastian Aristondo ()
Última modificación: 1/21/2021

Clase que simula con su metodos el funcionamiento de una radio.
******************************************************************/
import java.text.DecimalFormat;

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


  public void encender()
  {
    estado=true;
  }

  public void apagar()
  {
    estado=false;
  }
  
  public boolean isON()
  {
    return estado;
  }
  //  Distribución de responsabilidad, la función unicamente se encarga de llamar al metodo según la frecuencia
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

  private void incrementarAM()
  {
    frecuencuaAM+=10;
    if(frecuencuaAM>1610)
    {
      frecuencuaAM=530;
    }
    System.out.println(frecuencuaAM);
  }

  private void incrementarFM()
  {
    frecuencuaFM+=0.2f;
    
    if(frecuencuaFM>107.9f)
    {
      frecuencuaFM=87.9f;
    }
    System.out.println(df.format(frecuencuaFM));
  }

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
  
  public void frecuencia()
  {
    AMFM=!AMFM;
  }
  
}