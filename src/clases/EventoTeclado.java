package clases;

import java.awt.event.*;

/**
 *
 * @author Matias Abregú
 */
public class EventoTeclado extends KeyAdapter{
    
    static boolean w, s, a, d;
    
    @Override
    public void keyPressed(KeyEvent e){
        
        if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W'){
            
            w = true;
            
        } else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S'){
            
            s = true;
            
        } else if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A'){
            
            a = true;
            
        } else if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D'){
            
            d = true;
            
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        
         if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W'){
            
            w = false;
            
        } else if(e.getKeyChar() == 's' || e.getKeyChar() == 'S'){
            
            s = false;
            
        } else if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A'){
            
            a = false;
            
        } else if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D'){
            
            d = false;
            
        }
    }
}
