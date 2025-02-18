/**
 * Clase que implementa operaciones de resta a la calculadora.
 * @autor Juan Antonio Galván Arroyo
 * GitHub: https://github.com/Atpark/2T_ENTORNOS_JAVADOC
 * @version 1.0
 */
package calculadora;

public class Resta {
    private double acumulado;

    /**
     * Constructor de la clase, inicializa el valor acumulado en 0.
     */
    public Resta() {
        this.acumulado = 0;
    }


    /**
     * Realiza la resta dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la resta (a - b).
     */
    public double restarReal(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la resta de dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la resta (a - b).
     */
    public int restarEntero(int a, int b) {
        return a - b;
    }

    /**
     * Realiza la resta de tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la resta (a - b - c).
     */
    public double restarTres(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Resta un número al valor acumulado.
     * @param valor Número a restar.
     * @return Nuevo valor acumulado.
     */
    public double restarAcumulado(double valor) {
        this.acumulado -= valor;
        return this.acumulado;
    }
}
