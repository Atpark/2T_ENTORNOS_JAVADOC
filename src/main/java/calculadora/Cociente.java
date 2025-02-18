/**
 * Clase que implementa operaciones de división a la calculadora.
 * @autor Juan Antonio Galván Arroyo
 * GitHub: https://github.com/Atpark/2T_ENTORNOS_JAVADOC
 * @version 1.0
 */
package calculadora;

public class Cociente {
    /**
     * Divide dos números reales.
     * @param dividendo Número a dividir.
     * @param divisor Número por el cual se divide.
     * @return Resultado de la división (dividendo / divisor).
     * @throws ArithmeticException Si el divisor es 0.
     */
    public double dividirReales(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return dividendo / divisor;
    }

    /**
     * Divide dos números enteros.
     * @param dividendo Número a dividir.
     * @param divisor Número por el cual se divide.
     * @return Resultado de la división (dividendo / divisor).
     * @throws ArithmeticException Si el divisor es 0.
     */
    public int dividirEnteros(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return dividendo / divisor;
    }

    /**
     * Calcula el inverso de un número real.
     * @param numero Número del cual se quiere obtener el inverso.
     * @return Resultado de 1/numero.
     * @throws ArithmeticException Si el número es 0.
     */
    public double inverso(double numero) {
        if (numero == 0) {
            throw new ArithmeticException("El inverso de 0 no está definido.");
        }
        return 1 / numero;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * @param numero Número del cual se quiere calcular la raíz.
     * @return Resultado de la raíz cuadrada de numero.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double raiz(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(numero);
    }
}
