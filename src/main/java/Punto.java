/**
 * Created by alumno on 29/04/16.
 */
public class Punto {

    public int x;
    public int y;

    public Punto(int i, int i1) {
        this.x= i;
        this.y= i1;
    }

    public Punto() {
    }

    public void desplazarEnX(int i) {
        this.x= this.x + i;
    }

    public void desplazarEnY(int i) {
        this.y= this.y + i;
    }

    public Punto sumarPuntos(Punto Punto2) {
        return new Punto (this.x + Punto2.x, this.y + Punto2.y);
    }
}
