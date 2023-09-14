package clases;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author Matias Abregú
 */
public class Arco {
    
    public double x, y;
    private final int Ancho = 12, Alto = 200;

    public Arco(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Rectangle2D getArco(){
        return new Rectangle2D.Double(x, y, Ancho, Alto);
    }
}
