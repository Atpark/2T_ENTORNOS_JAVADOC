package testing;

import calculadora.Resta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RestaTest {
    private final Resta resta = new Resta();
    @Test
    void restarReal() {
    }

    @Test
    void restarEntero() {
        assertEquals(5, resta.restarEntero(10,5), "10 - 5 debería ser 5");
        assertEquals(-2, resta.restarEntero(5, 7), "5 - 7 debería ser -2");
    }

    @Test
    void restarTres() {
        assertEquals(1, resta.restarTres(10,5, 4));
    }

    @Test
    void restarAcumulado() {
        resta.restarAcumulado(10);
        assertEquals(-15, resta.restarAcumulado(5));
    }
}