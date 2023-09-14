package clases;

import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Matias Abregú
 */
public class Mazo {

    public double x, y;
    private final int Ancho = 60, Alto = 60;

    public Mazo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ellipse2D getMazo() {
        return new Ellipse2D.Double(x, y, Ancho, Alto);
    }

    public void mover() {
        int limitesXmin = 15, limitesXman = 310, limitesYmin = 23, limitesYmax = 380;
        
        if (EventoTeclado.w == true && y > limitesYmin) {
            y += -0.12;
        } else if (EventoTeclado.s == true && y < limitesYmax) {
            y += +0.12;
        } else if (EventoTeclado.a == true && x > limitesXmin) {
            x += -0.12;
        } else if (EventoTeclado.d == true && x < limitesXman){
            x += +0.12;
        }
    }
}
