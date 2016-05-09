import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alumno on 29/04/16.
 */
public class TestPunto {

    @Test
    public void desplazarEnX() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(10);
        Assert.assertEquals(15, punto.x);
    }

    @Test
    public void desplazarEnX2() {
        Punto punto = new Punto();
        punto.x = 100;
        punto.desplazarEnX(50);
        Assert.assertEquals(150, punto.x);
    }


    @Test
    public void desplazarEnY() {
        Punto punto = new Punto();
        punto.y = 4;
        punto.desplazarEnY(10);
        Assert.assertEquals(14, punto.y);

    }

   @Test
    public void tercerPunto() {
        Punto punto1 = new Punto(9,4);
        Punto punto2 = new Punto(2,3);

        Punto punto3 = punto1.sumarPuntos(punto2);

        Assert.assertEquals(punto3.x, 11);
        Assert.assertEquals(punto3.y, 7);
    }

    @Test
    public void generarCnstructorVacio() {
        Punto punto1 = new Punto();

        Assert.assertEquals(punto1.x, 0);
        Assert.assertEquals(punto1.y, 0);
    }

    @Test
    public void tercerPunto2() {
        Punto punto1 = new Punto(10,20);
        Punto punto2 = new Punto(50,70);

        Punto punto3 = punto1.sumarPuntos(punto2);

        Assert.assertEquals(punto3.x, 60);
        Assert.assertEquals(punto3.y, 90);
    }

}
