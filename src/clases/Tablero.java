package clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

/*
 *
 * @author Matias Abregú
 */
public class Tablero extends javax.swing.JPanel {

    private Disco disco;
    private Mazo mazo1;
    private Mazo mazo2;
    Arco arcoJ = new Arco(0, 130);
    Arco arcoI = new Arco(722, 130);
    boolean colisionM1 = false, colisionM2 = false, puntoJ = false, puntoI = false;
    public int pJ = 0, pI = 0, x = 700;

    public Tablero() {
        initComponents();
        setBackground(Color.white);
        inicializar();
    }

    public void inicializar() {
        disco = new Disco(320, 190);
        mazo1 = new Mazo(35, 200);
        mazo2 = new Mazo(640, 200);
    }

    public boolean Victoria(){
        if(pJ == 5){
            return true;
        } else if(pI == 5){
            return true;
        }
        return false;
    }
    
    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.fill(new RoundRectangle2D.Double(-1, 0, 740, 23, 4, 4));
        g2.fill(new RoundRectangle2D.Double(-1, 440, 740, 23, 4, 4));
        g2.fill(new RoundRectangle2D.Double(370, 10, 5, 500, 3, 3));

        g2.setStroke(new BasicStroke(4));
        g2.draw(new Ellipse2D.Double(295, 155, 150, 150));

        g2.setStroke(new BasicStroke(2));
        
        if(pJ < 5 && pI < 5){
        dibujar(g2);
        actualizar();
        }

        if (puntoJ == true) {
            puntaje_J.setText("" + pJ);
            inicializar();
            dibujar(g2);
        } else if (puntoI == true) {
            puntaje_IA.setText("" + pI);
            inicializar();
            dibujar(g2);
        }
        
        if(pJ == 5){
            g2.setColor(Color.blue);
            g2.setFont(new Font("Segoe UI Black", 2, 38));
            g2.drawString("Fin del juego.", 80, 220);
            g2.drawString("Ganador: Jugador", 360, 320);
        } else if(pI == 5){
            g2.setColor(Color.green);
            g2.setFont(new Font("Segoe UI Black", 2, 38));
            g2.drawString("Fin del juego.", 80, 220);
            g2.drawString("Ganador: IA", 360, 320);
        }
        // Mas simple: g2.draw(new Ellipse2D.Double(30,30,30,30)); //PD: lo hice yo solito, estoy orgulloso
    }

    public void dibujar(Graphics2D g) {

        g.setColor(Color.red);
        g.fill(disco.getDisco());
        g.setColor(Color.black);
        g.draw(disco.getDisco());

        g.setColor(Color.blue);
        g.fill(mazo1.getMazo());
        g.setColor(Color.black);
        g.draw(mazo1.getMazo());

        g.setColor(Color.green);
        g.fill(mazo2.getMazo());
        g.setColor(Color.black);
        g.draw(mazo2.getMazo());

        g.setColor(Color.red);
        g.fill(arcoJ.getArco());

        g.setColor(Color.red);
        g.fill(arcoI.getArco());
        
    }

    public void actualizar() {
        disco.mover(ColisionM1(), ColisionM2());
        disco.puntoJ(ColisionPuntoJ());
        disco.puntoI(ColisionPuntoI());
        mazo1.mover();
        moverIA();
    }

    public void moverIA() {
        if (disco.y < mazo2.y) {
            mazo2.y += -0.3;
        } else if (disco.y > mazo2.y) {
            mazo2.y += +0.3;
        }

        if (disco.x > 305) {
            mazo2.x += -0.1;
        } else if (disco.x < 310) {
            if (mazo2.x > 725) {
                mazo2.x += 0.0;
            } else {
                mazo2.x += +0.1;
            }
        }
    }

    public boolean ColisionM1() {
        if (mazo1.getMazo().getBounds2D().intersects(disco.getDisco().getBounds2D())) {
            return colisionM1 = true;
        } else {
            return colisionM1 = false;
        }
    }

    public boolean ColisionM2() {
        if (mazo2.getMazo().getBounds2D().intersects(disco.getDisco().getBounds2D())) {
            return colisionM2 = true;
        } else {
            return colisionM2 = false;
        }
    }

    public boolean ColisionPuntoJ() {
        if (disco.getDisco().getBounds2D().intersects(arcoI.getArco().getBounds2D())) {
            pJ++;
            return puntoJ = true;
        } else {
            return puntoJ = false;
        }
    }

    public boolean ColisionPuntoI() {
        if (disco.getDisco().getBounds2D().intersects(arcoJ.getArco().getBounds2D())) {
            pI++;
            return puntoI = true;
        } else {
            return puntoI = false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jugador = new javax.swing.JLabel();
        puntaje_J = new javax.swing.JLabel();
        IA = new javax.swing.JLabel();
        puntaje_IA = new javax.swing.JLabel();

        Jugador.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        Jugador.setForeground(new java.awt.Color(255, 255, 255));
        Jugador.setText("Jugador");
        Jugador.setToolTipText("");
        Jugador.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        puntaje_J.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        puntaje_J.setForeground(new java.awt.Color(51, 153, 255));
        puntaje_J.setText("0");

        IA.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        IA.setForeground(new java.awt.Color(255, 255, 255));
        IA.setText("IA");
        IA.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        puntaje_IA.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        puntaje_IA.setForeground(new java.awt.Color(153, 255, 153));
        puntaje_IA.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(puntaje_J)
                        .addGap(164, 164, 164)
                        .addComponent(puntaje_IA))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(Jugador)
                        .addGap(142, 142, 142)
                        .addComponent(IA)))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(puntaje_J)
                            .addComponent(puntaje_IA))))
                .addContainerGap(428, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IA;
    private javax.swing.JLabel Jugador;
    private javax.swing.JLabel puntaje_IA;
    private javax.swing.JLabel puntaje_J;
    // End of variables declaration//GEN-END:variables
}
