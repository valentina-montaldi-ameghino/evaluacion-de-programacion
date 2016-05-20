/**
 * Created by damian on 20/05/16.
 */
public class Cuadrilatero {


    public Punto esquinaInferiorIzquierda;
    public Punto esquinaSuperiorDerecha;

    public Cuadrilatero(Punto p1, Punto p2) {
        this.esquinaInferiorIzquierda = p1;
        this.esquinaSuperiorDerecha = p2;
    }

    public int perimetro() {

        int ladoX = Math.abs(this.esquinaInferiorIzquierda.x - this.esquinaSuperiorDerecha.x);
        int ladoY = Math.abs(this.esquinaInferiorIzquierda.y - this.esquinaSuperiorDerecha.y);
        return ladoX * 2 + ladoY * 2;
    }
}
