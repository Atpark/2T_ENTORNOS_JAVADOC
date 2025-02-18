package testing;

import calculadora.Producto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    private final Producto producto = new Producto();

    @Test
    void multiplicarReales() {
        assertEquals(11.22, producto.multiplicarReales(5.1,2.2));
    }

    @Test
    void multiplicarEnteros() {
        assertEquals(10, producto.multiplicarEnteros(5,2));
    }

    @Test
    void multiplicarTresReales() {
        assertEquals(30, producto.multiplicarTresReales(5,2, 3));
    }

    @Test
    void potencia() {
        assertEquals(8, producto.potencia(2,3));
    }

    @Test
    void testPotenciaException(){
        assertThrows(IllegalArgumentException.class, () -> producto.potencia(0, -1));
    }
}