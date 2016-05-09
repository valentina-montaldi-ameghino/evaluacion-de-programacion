/**
 * Created by alumno on 29/04/16.
 */
public class Punto {

    int x;
    int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Punto() {
    }


    public void desplazarEnX(int i){
        this.x = this.x +i;
    }

    public void desplazarEnY(int j){
        this.y = this.y +j;
    }





    public Punto sumarPuntos(Punto punto2) {
        int xPunto2 = this.x + punto2.x;
        int yPunto2 = this.y + punto2.y;
        return new Punto(xPunto2, yPunto2);
    }
}
