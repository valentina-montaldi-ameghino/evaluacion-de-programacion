import org.junit.Assert;
import org.junit.Test;

/**
 * Created by damian on 20/05/16.
 */
public class TestCuadrilatero {

    @Test
    public void crearCuadrilatero() {
        Punto esquinaInferiorIzquierda = new Punto(6, 2);
        Punto esquinaSuperiorDerecha = new Punto(8, 4);

        Cuadrilatero cuadradado = new Cuadrilatero(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        //Chequeo si el X y el Y concuerdan con los valores
        Assert.assertEquals(6, cuadradado.esquinaInferiorIzquierda.x);
        Assert.assertEquals(2, cuadradado.esquinaInferiorIzquierda.y);

        //Chequeo si el X y el Y concuerdan con los valores
        Assert.assertEquals(8, cuadradado.esquinaSuperiorDerecha.x);
        Assert.assertEquals(4, cuadradado.esquinaSuperiorDerecha.y);

    }


    @Test
    public void calcularPerimetro() {
        Punto esquinaInferiorIzquierda = new Punto(6, 2);
        Punto esquinaSuperiorDerecha = new Punto(8, 4);

        Cuadrilatero cuadradado = new Cuadrilatero(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        Assert.assertEquals(8, cuadradado.perimetro());

    }

    @Test
    public void calcularPerimetro2() {
        Punto esquinaInferiorIzquierda = new Punto(0, 0);
        Punto esquinaSuperiorDerecha = new Punto(5, 10);

        Cuadrilatero cuadradado = new Cuadrilatero(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        Assert.assertEquals(30, cuadradado.perimetro());
    }

    @Test
    public void calcularArea() {
        Punto esquinaInferiorIzquierda = new Punto(0, 0);
        Punto esquinaSuperiorDerecha = new Punto(5, 10);

        Cuadrilatero cuadradado = new Cuadrilatero(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        Assert.assertEquals(50, cuadradado.area());
    }

    @Test
    public void extenderCuadrilatero() {
        Punto esquinaInferiorIzquierda = new Punto(0, 0);
        Punto esquinaSuperiorDerecha = new Punto(5, 10);

        Cuadrilatero cuadradado = new Cuadrilatero(esquinaInferiorIzquierda, esquinaSuperiorDerecha);

        cuadradado.extenderCuadrilatero();

        Assert.assertEquals(50, cuadradado.extenderCuadrilatero());
    }



}
