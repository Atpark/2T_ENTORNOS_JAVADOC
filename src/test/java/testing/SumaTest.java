package testing;

import calculadora.Suma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    private final Suma suma = new Suma();

    @Test
    void sumarReales() {
        assertEquals(4.2, suma.sumarReales(2.1, 2.1));
    }

    @Test
    void sumarEnteros() {
        assertEquals(4, suma.sumarEnteros(2, 2));

    }

    @Test
    void sumarTres() {
        assertEquals(6.2, suma.sumarTres(2.1, 2.1, 2));

    }

    @Test
    void sumarAcumulado() {
        suma.sumarAcumulado(10);
        assertEquals(15, suma.sumarAcumulado(5));
    }

}