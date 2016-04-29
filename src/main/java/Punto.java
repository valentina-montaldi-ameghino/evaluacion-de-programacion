/**
 * Created by alumno on 29/04/16.
 */
public class Punto {
    public int x;
    public int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public void desplazarEnX(int i) {
        this.x = this.x + i;
    }

    public void desplazarEnY(int j) {
        this.y = this.y + j;
    }

    public Punto sumarPuntos(Punto punto2) {
        int i = this.x + punto2.x;
        int j = this.y + punto2.y;

        return new Punto(i,j);
    }

}
