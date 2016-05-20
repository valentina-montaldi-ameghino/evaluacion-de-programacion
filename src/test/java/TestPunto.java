import org.junit.Assert;
import org.junit.Test;

/**
 * Created by alumno on 29/04/16.
 */
public class TestPunto {


    @Test
    public void desplazarEn10X() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(10);
        Assert.assertEquals(15, punto.x);
    }

    @Test
    public void desplazarEn25X() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(25);
        Assert.assertEquals(30, punto.x);
    }

    @Test
    public void desplazarEn55X() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(55);
        Assert.assertEquals(60, punto.x);
    }

    @Test
    public void desplazarEn20X() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(20);
        Assert.assertEquals(25, punto.x);
    }

    @Test
    public void desplazarEn30X() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(30);
        Assert.assertEquals(35, punto.x);
    }
    @Test
    public void desplazarEn101X() {
        Punto punto = new Punto();
        punto.x = 5;
        punto.desplazarEnX(101);
        Assert.assertEquals(106, punto.x);
    }


    @Test
    public void desplazar150EnX() {
        Punto punto = new Punto();
        punto.x = 50;
        punto.desplazarEnX(150);
        Assert.assertEquals(200, punto.x);
    }



   @Test
    public void desplazarEnY() {
        Punto punto = new Punto();
        punto.y = 4;
        punto.desplazarEnY(10);
        Assert.assertEquals(14, punto.y);

    }

    @Test
    public void crearPuntoSinConstructor() {
        Punto punto1 = new Punto();

        Assert.assertEquals(punto1.x, 0);
        Assert.assertEquals(punto1.y, 0);
    }
    @Test
    public void crearPuntoConConstructor() {
        Punto punto1 = new Punto(10, 23);

        Assert.assertEquals(10, punto1.x);
        Assert.assertEquals(23, punto1.y);
    }


    @Test
    public void crearPuntoConConstructor2() {
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(7,9);

        Assert.assertEquals(punto1.x, 1);
        Assert.assertEquals(punto1.y, 2);

        Assert.assertEquals(punto2.x, 7);
        Assert.assertEquals(punto2.y, 9);
    }


    @Test
    public void tercerPunto() {
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(2,3);

        Punto punto3 = punto1.sumarseConOtroPunto(punto2);


        Assert.assertEquals(punto3.x, 3);
        Assert.assertEquals(punto3.y, 5);
    }
    /**/

}
