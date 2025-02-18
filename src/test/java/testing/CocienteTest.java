package testing;

import calculadora.Cociente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {
    private final Cociente cociente = new Cociente();

    @Test
    void dividirReales() {
        assertEquals(2.25, cociente.dividirReales(4.5, 2.0));
    }

    @Test
    void dividirEnteros() {
        assertEquals(2, cociente.dividirEnteros(4, 2));

    }

    @Test
    void inverso() {
        assertEquals(0.5, cociente.inverso(2));
    }

    @Test
    void inversoException(){
        assertThrows(ArithmeticException.class, () -> cociente.inverso(0));
    }

    @Test
    void raiz() {
        assertEquals(3, cociente.raiz(9));
    }

    @Test
    void raizException(){
        assertThrows(IllegalArgumentException.class, () -> cociente.raiz(-1));
    }
}