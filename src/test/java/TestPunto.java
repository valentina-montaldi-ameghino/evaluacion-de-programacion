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
    public void desplazarEnY() {
        Punto punto = new Punto();
        punto.y = 4;
        punto.desplazarEnY(10);
        Assert.assertEquals(14, punto.y);

    }

    @Test
    public void tercerPunto() {
        Punto punto1 = new Punto(1,2);
        Punto punto2 = new Punto(2,3);

        Punto punto3 = punto1.sumarPuntos(punto2);

        Assert.assertEquals(punto3.x, 3);
        Assert.assertEquals(punto3.y, 5);
    }


}
