/**
 * Created by damian on 18/05/16.
 */

public class Calculadora {
    public int elemento1;
    public int elemento2;
    public int resultado;
    public int ultimoCalculo;

    public void guardarValorEnElemento1(int i) {
        elemento1=i;
    }

    public void guardarValorEnElemento2(int i) {
        elemento2=i;
    }

    public void sumar() {
        this.resultado = this.elemento1 + this.elemento2;
        this.ultimoCalculo= resultado;
    }
}