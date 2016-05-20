public class Punto {

    public int x;
    public int y;


    public Punto() {}

    public Punto(int i, int i1) {
        this.x = i;
        this.y = i1;
    }

    public void desplazarEnX(int i) {
        this.x = this.x +i;
    }

    public void desplazarEnY(int i) {
        this.y = this.y + i;
    }

    public Punto sumarseConOtroPunto(Punto punto) {

        return new Punto(this.x + punto.x, this.y + punto.y);

    }
}
