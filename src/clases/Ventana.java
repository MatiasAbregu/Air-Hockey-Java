package clases;

import java.awt.*;

/**
 *
 * @author Matias Abregú
 */
public class Ventana extends javax.swing.JFrame {

    private Tablero tablero;
    private Hilo hilo;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Air Hockey - Desarrollado por Matias");
        
        tablero = new Tablero(); 
        tablero.setBounds(0,0,750,500);
        add(tablero);
        
        hilo = new Hilo(tablero);
        hilo.start();
        
        addKeyListener(new EventoTeclado());
        
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/logo.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jugador = new javax.swing.JLabel();
        IA = new javax.swing.JLabel();
        puntaje_J = new javax.swing.JLabel();
        puntaje_IA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(750, 500));

        Jugador.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Jugador.setForeground(new java.awt.Color(255, 255, 255));
        Jugador.setText("Jugador");

        IA.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        IA.setForeground(new java.awt.Color(255, 255, 255));
        IA.setText("IA");

        puntaje_J.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        puntaje_J.setForeground(new java.awt.Color(255, 255, 255));
        puntaje_J.setText("0");

        puntaje_IA.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        puntaje_IA.setForeground(new java.awt.Color(255, 255, 255));
        puntaje_IA.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jugador)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(puntaje_J)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IA)
                    .addComponent(puntaje_IA)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(IA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(puntaje_J)
                    .addComponent(puntaje_IA)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IA;
    private javax.swing.JLabel Jugador;
    private javax.swing.JLabel puntaje_IA;
    private javax.swing.JLabel puntaje_J;
    // End of variables declaration//GEN-END:variables
}
