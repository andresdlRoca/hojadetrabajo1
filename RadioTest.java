import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @org.junit.jupiter.api.Test
    void isON() {

        Radio prueba = new Radio();
        boolean Resultado =prueba.isON();
        assertFalse(Resultado);
        

    }

    @org.junit.jupiter.api.Test
    void asignar() {
        Radio prueba = new Radio();
        prueba.encender();
        boolean asignacion = prueba.asignar(12);
        assertTrue(asignacion);
    }

    @org.junit.jupiter.api.Test
    void emisora() {
        Radio prueba = new Radio();
        prueba.encender();
        boolean guardado = prueba.emisoras(12);
        assertTrue(guardado);

    }


}