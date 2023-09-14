package clases;

import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Matias Abregú
 */
public class Disco {

    public double x, y;
    private double Vx = 0.05, Vy = 0.05;
    private final int Ancho = 50, Alto = 50;

    public Disco(int x, int y) {
        this.x = x;
        this.y = y;
        getRandomDireccion();
    }

    public Ellipse2D getDisco() {
        return new Ellipse2D.Double(x, y, Ancho, Alto);
    }

    public void mover(boolean colisionM1, boolean colisionM2) {
      x += Vx;
      y += Vy;
      
      if(colisionM1 ==  true){
          Vx += +0.05;
          x += 0.1;
      } else if (colisionM2 == true){
          Vx += -0.05;
          x += -0.1;
      }
      
      if(x>700){
          Vx += -0.0005;
      }    
      if(y>390){
          Vy += -0.0005;
          Vy += -0.0001;
      }
      if(x<5){
          Vx += +0.0005;
      } 
      if(y<27){
          Vy += +0.0005;
          Vx += +0.0001; 
      }
    }
    
    public int getRandomDireccion(){
        int rand = (int) (Math.random() * 2);
        if(rand == 1){
           Vx = 0.05;
        } else  {
           Vx = -0.05;
        }
        return 0;
    }
    
    public void puntoJ(boolean puntoJ){
    }
    
    public void puntoI(boolean puntoI){
    }
}
