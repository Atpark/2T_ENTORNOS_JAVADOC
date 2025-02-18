/**
 * Clase que implementa operaciones de suma a la calculadora.
 * @autor Juan Antonio Galván Arroyo
 * GitHub: https://github.com/Atpark/2T_ENTORNOS_JAVADOC
 * @version 1.0
 */
package calculadora;

public class Suma {
    private double acumulado;
    

    /**
     * Realiza la suma de dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return La suma de a y b.
     */
    public double sumarReales(double a, double b){
        return a + b;
    }

    /**
     * Realiza la suma de dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de a y b.
     */
    public int sumarEnteros(int a, int b){
        return a + b;
    }

    /**
     * Realiza la suma de tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return La suma de a, b y c.
     */
    public double sumarTres(double a, double b, double c){
        return a + b + c;
    }

    /**
     * Suma un valor acumulado.
     * @param valor número a sumar al acumulado.
     */
    public double sumarAcumulado(double valor){
        acumulado += valor;
        return this.acumulado;
    }

}
