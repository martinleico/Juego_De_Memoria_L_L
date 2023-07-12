package Frame;

import Methods.Match;
import Methods.Utilities;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Principal extends javax.swing.JFrame implements ActionListener {

    private int dificultad; // Variable de nivel de dificulad
    public int getDificultad(){
        return dificultad;
    }
    private int segundosRestantes = 25; // Asumiendo un valor inicial de 25 segundos
    private javax.swing.Timer timer; // Temporizador para contar el tiempo
    private boolean partidaTerminada = false; // Indica si la partida termino o continua

    public void mostrarMensajeDerrota() {
        partidaTerminada = true; // Indicar que la partida ya termino
        JLabel mensaje = new JLabel("¡Perdiste, intentalo nuevamente!");
        setLayout(new FlowLayout());
        add(mensaje);
        pack();
        setLocationRelativeTo(null); // Centra el frame en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar la aplicación al cerrar el frame
        setVisible(true); // Mostrar el frame

        // Deshabilitar los botones de las cartas
        btn01.setEnabled(false);
        btn02.setEnabled(false);
        btn03.setEnabled(false);
        btn04.setEnabled(false);
        btn05.setEnabled(false);
        btn06.setEnabled(false);
        btn07.setEnabled(false);
        btn08.setEnabled(false);
    }

    public void stopTimer() {
        timer.stop();
    }
    public void resetTimer(){
        segundosRestantes = 25;
        timer.restart();
    }

    public void actionPerformed(ActionEvent e) {
        if (!partidaTerminada) { // Verificar si la partida no termino
            if (segundosRestantes > 0) {
                segundosRestantes--;
                // Actualizar la visualización del contador de tiempo
                System.out.println("Tiempo restante: " + segundosRestantes + " segundos");
            } else {
                // El tiempo ha terminado, el jugador pierde
                System.out.println("Tiempo agotado. ¡Perdiste, intentalo nuevamente!");
                // Llamo al método mostrarMensajeDerrota() en la clase Principal
                mostrarMensajeDerrota();
                timer.stop(); // Detener el temporizador después de que el jugador pierde
            }


        }
    }
    int clic =0; //contador de clics en cartas/botones

    Utilities u = new Utilities();

    int nivelDificultad = 1; // Ajusta el nivel de dificultad según lo que necesito

    List<Integer> next = u.rowsTableAll(nivelDificultad);

    public Principal() {
        initComponents();
        this.setTitle("Juego de Memoria");
        this.setLocationRelativeTo(this);
        u.imgStart();

        int nivelDificultad = 1; // Ajusto el nivel de dificultad aca

        List<Integer> next = new ArrayList<>();

        // Establece el tamaño del tablero según el nivel de dificultad
        if (nivelDificultad == 1) {
            next.addAll(u.rowsTable()); // Fácil: Agrega una fila
        } else if (nivelDificultad == 2) {
            next.addAll(u.rowsTable()); // Medio: Agrega una fila
            next.addAll(u.rowsTable()); // Medio: Agrega una fila adicional
        } else if (nivelDificultad == 3) {
            next.addAll(u.rowsTable()); // Difícil: Agrega una fila
            next.addAll(u.rowsTable()); // Difícil: Agrega una fila adicional
            next.addAll(u.rowsTable()); // Difícil: Agrega una fila adicional
        }

        // Crea el temporizador con una duración de 1 segundo inicial
        timer = new javax.swing.Timer(1000, this);
        timer.start(); // Inicia el temporizador
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn01.setForeground(new java.awt.Color(240, 240, 240));
        btn01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn01.setMaximumSize(new java.awt.Dimension(64, 64));
        btn01.setMinimumSize(new java.awt.Dimension(64, 64));
        btn01.setPreferredSize(new java.awt.Dimension(64, 64));
        btn01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn01MouseClicked(evt);
            }
        });

        btn02.setForeground(new java.awt.Color(240, 240, 240));
        btn02.setMaximumSize(new java.awt.Dimension(64, 64));
        btn02.setMinimumSize(new java.awt.Dimension(64, 64));
        btn02.setPreferredSize(new java.awt.Dimension(64, 64));
        btn02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn02MouseClicked(evt);
            }
        });

        btn03.setForeground(new java.awt.Color(240, 240, 240));
        btn03.setMaximumSize(new java.awt.Dimension(64, 64));
        btn03.setMinimumSize(new java.awt.Dimension(64, 64));
        btn03.setPreferredSize(new java.awt.Dimension(64, 64));
        btn03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn03MouseClicked(evt);
            }
        });

        btn04.setForeground(new java.awt.Color(240, 240, 240));
        btn04.setMaximumSize(new java.awt.Dimension(64, 64));
        btn04.setMinimumSize(new java.awt.Dimension(64, 64));
        btn04.setPreferredSize(new java.awt.Dimension(64, 64));
        btn04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn04MouseClicked(evt);
            }
        });

        btn05.setForeground(new java.awt.Color(240, 240, 240));
        btn05.setMaximumSize(new java.awt.Dimension(64, 64));
        btn05.setMinimumSize(new java.awt.Dimension(64, 64));
        btn05.setPreferredSize(new java.awt.Dimension(64, 64));
        btn05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn05MouseClicked(evt);
            }
        });

        btn06.setForeground(new java.awt.Color(240, 240, 240));
        btn06.setMaximumSize(new java.awt.Dimension(64, 64));
        btn06.setMinimumSize(new java.awt.Dimension(64, 64));
        btn06.setPreferredSize(new java.awt.Dimension(64, 64));
        btn06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn06MouseClicked(evt);
            }
        });

        btn07.setForeground(new java.awt.Color(240, 240, 240));
        btn07.setMaximumSize(new java.awt.Dimension(64, 64));
        btn07.setMinimumSize(new java.awt.Dimension(64, 64));
        btn07.setPreferredSize(new java.awt.Dimension(64, 64));
        btn07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn07MouseClicked(evt);
            }
        });

        btn08.setForeground(new java.awt.Color(240, 240, 240));
        btn08.setMaximumSize(new java.awt.Dimension(64, 64));
        btn08.setMinimumSize(new java.awt.Dimension(64, 64));
        btn08.setPreferredSize(new java.awt.Dimension(64, 64));
        btn08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn08MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn01MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn01);
            m.setNumberBtn(1);
            m.setValueMatch(next.get(0));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn01MouseClicked

    private void btn02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn02MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn02);
            m.setNumberBtn(2);
            m.setValueMatch(next.get(1));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn02MouseClicked

    private void btn03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn03MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn03);
            m.setNumberBtn(3);
            m.setValueMatch(next.get(2));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn03MouseClicked

    private void btn04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn04MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn04);
            m.setNumberBtn(4);
            m.setValueMatch(next.get(3));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn04MouseClicked

    private void btn05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn05MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn05);
            m.setNumberBtn(5);
            m.setValueMatch(next.get(4));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn05MouseClicked

    private void btn06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn06MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn06);
            m.setNumberBtn(6);
            m.setValueMatch(next.get(5));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn06MouseClicked

    private void btn07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn07MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn07);
            m.setNumberBtn(7);
            m.setValueMatch(next.get(6));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn07MouseClicked

    private void btn08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn08MouseClicked
        if (!partidaTerminada) { // Verifica si la partida no termino
            Match m = new Match();
            m.setBtn(btn08);
            m.setNumberBtn(8);
            m.setValueMatch(next.get(7));
            u.getMatch().add(m);
            u.paintMatch();
            u.match();
        }
    }//GEN-LAST:event_btn08MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn01;
    public static javax.swing.JButton btn02;
    public static javax.swing.JButton btn03;
    public static javax.swing.JButton btn04;
    public static javax.swing.JButton btn05;
    public static javax.swing.JButton btn06;
    public static javax.swing.JButton btn07;
    public static javax.swing.JButton btn08;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
