/**
 * Clase que implementa operaciones de multiplicación a la calculadora.
 * @autor Juan Antonio Galván Arroyo
 * GitHub: https://github.com/Atpark/2T_ENTORNOS_JAVADOC
 * @version 1.0
 */
package calculadora;

public class Producto {
    /**
     * Multiplica dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la multiplicación (a * b).
     */
    public double multiplicarReales(double a, double b) {
        return a * b;
    }

    /**
     * Multiplica dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la multiplicación (a * b).
     */
    public int multiplicarEnteros(int a, int b) {
        return a * b;
    }

    /**
     * Multiplica tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la multiplicación (a * b * c).
     */
    public double multiplicarTresReales(double a, double b, double c) {
        return a * b * c;
    }

    /**
     * Calcula la potencia de un número.
     * @param base Base de la potencia.
     * @param exponente Exponente de la potencia.
     * @return Resultado de base^exponente.
     * @throws IllegalArgumentException Si la base es 0 y el exponente es negativo (indeterminado).
     */
    public double potencia(double base, double exponente) {
        if (base == 0 && exponente < 0) {
            throw new IllegalArgumentException("No se puede elevar 0 a un exponente negativo.");
        }
        return Math.pow(base, exponente);
    }
}
