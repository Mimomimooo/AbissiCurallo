/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abissicurallo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author lauma
 */
public class FinestraIniziale extends javax.swing.JFrame implements ActionListener {

    ArrayList< JLabel> al = new ArrayList< JLabel>();
    ArrayList< Float> fineGif = new ArrayList< Float>();
    ArrayList< Float> skipGif = new ArrayList< Float>();
    
    float sectot = 0;

    Timer timer;
    float sec = 0;
    int count = 0;

    /**
     * Creates new form FinestraIniziale
     */
    public FinestraIniziale() {

        timer = new Timer(100, this);
        timer.start();

        setUndecorated(true);
        initComponents();

        al.add(jLabel1);
        fineGif.add(18f);
        skipGif.add(0f);

        al.add(jLabel2);
        fineGif.add(5.5f); //durata di gif
        skipGif.add(1f); // inizi a skippare somma maggiore di sec di inizio

        al.add(jLabel3);
        fineGif.add(2.7f);
        skipGif.add(1f);//+2

        al.add(jLabel4);
        fineGif.add(1.6f);
        skipGif.add(1f);//1

        al.add(jLabel5);
        fineGif.add(7f);
        skipGif.add(2f);//2

        al.add(jLabel6);
        fineGif.add(1.5f);
        skipGif.add(0f);//6

        al.add(jLabel7);
        fineGif.add(2.7f);
        skipGif.add(1f);//1

        al.add(jLabel8);
        fineGif.add(2f);
        skipGif.add(1f);//1

        al.add(jLabel9);
        fineGif.add(16f);
        skipGif.add(2f);//4

        al.add(jinc1);
        fineGif.add(4f);
        skipGif.add(1f);//4

        al.add(jinc2);
        fineGif.add(3.7f);
        skipGif.add(2f);//4

        al.add(jinc3);
        fineGif.add(4f);
        skipGif.add(2f);//4

        al.add(jinc4);
        fineGif.add(12f);
        skipGif.add(7f);//4

        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);

        jLabelPremiSpazio.setVisible(false);

        jinc1.setVisible(false);
        jinc2.setVisible(false);
        jinc4.setVisible(false);
        jinc3.setVisible(false);

        dx1.setVisible(false);
        sx1.setVisible(false);
        errore1.setVisible(false);
        ottimo1.setVisible(false);
        jLabel10.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelPremiSpazio = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        errore1 = new javax.swing.JLabel();
        ottimo1 = new javax.swing.JLabel();
        dx1 = new javax.swing.JLabel();
        sx1 = new javax.swing.JLabel();
        jinc4 = new javax.swing.JLabel();
        jinc3 = new javax.swing.JLabel();
        jinc2 = new javax.swing.JLabel();
        jinc1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 153));
        setMaximumSize(new java.awt.Dimension(2147483647, 540));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabelPremiSpazio.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPremiSpazio.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        jLabelPremiSpazio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPremiSpazio.setText("SALTA CON BARRASPAZIATRICE");
        jLabelPremiSpazio.setBorder(new javax.swing.border.MatteBorder(null));
        jLabelPremiSpazio.setFocusable(false);
        jLabelPremiSpazio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelPremiSpazio);
        jLabelPremiSpazio.setBounds(130, 690, 310, 100);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frasegiù1 (1).gif"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 540, 810);

        errore1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/errore1.PNG"))); // NOI18N
        errore1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                errore1KeyPressed(evt);
            }
        });
        jPanel1.add(errore1);
        errore1.setBounds(0, 0, 540, 810);

        ottimo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/ottimo1.PNG"))); // NOI18N
        ottimo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ottimo1KeyPressed(evt);
            }
        });
        jPanel1.add(ottimo1);
        ottimo1.setBounds(0, 0, 540, 810);

        dx1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/1dx.gif"))); // NOI18N
        dx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dx1MouseClicked(evt);
            }
        });
        jPanel1.add(dx1);
        dx1.setBounds(280, 310, 440, 510);

        sx1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/1sx.gif"))); // NOI18N
        sx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sx1MouseClicked(evt);
            }
        });
        jPanel1.add(sx1);
        sx1.setBounds(0, 270, 390, 540);

        jinc4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/primo incontro/Frase11def.gif"))); // NOI18N
        jinc4.setText("jLabel11");
        jPanel1.add(jinc4);
        jinc4.setBounds(0, 0, 540, 810);

        jinc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/primo incontro/Frase12def.gif"))); // NOI18N
        jinc3.setText("jLabel11");
        jPanel1.add(jinc3);
        jinc3.setBounds(0, 0, 540, 810);

        jinc2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/primo incontro/Frase10def.gif"))); // NOI18N
        jinc2.setText("jLabel11");
        jPanel1.add(jinc2);
        jinc2.setBounds(0, 0, 540, 810);

        jinc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/primo incontro/Frase9def.gif"))); // NOI18N
        jinc1.setText("jLabel11");
        jPanel1.add(jinc1);
        jinc1.setBounds(0, 0, 540, 810);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Secdiscesadef.gif"))); // NOI18N
        jLabel9.setText("jLabel9");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 540, 810);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase8def.gif"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 540, 810);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase3.gif"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 540, 810);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase6def.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 540, 810);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase5def.gif"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 810);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase4def.gif"))); // NOI18N
        jLabel4.setText("jLabel5");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 540, 810);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase3.gif"))); // NOI18N
        jLabel3.setText("jLabel4");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 540, 810);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase2def.gif"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 830);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Definizio.gif"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 810);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {

            if (count < al.size() - 1) {
                if (sec > skipGif.get(count)) {
                    al.get(count + 1).setVisible(true);//gif successiva
                    al.get(count).setVisible(false);
                    jLabelPremiSpazio.setVisible(false);
                    sec = 0;
                    count++;
                }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void sx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sx1MouseClicked
        // TODO add your handling code here:
        
        errore1.setVisible(true);
        
    }//GEN-LAST:event_sx1MouseClicked

    private void dx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dx1MouseClicked
        // TODO add your handling code here:
        
        ottimo1.setVisible(true);
        
    }//GEN-LAST:event_dx1MouseClicked

    private void errore1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_errore1KeyPressed
        // TODO add your handling code here:
        
        jLabel10.setVisible(true);
        
    }//GEN-LAST:event_errore1KeyPressed

    private void ottimo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ottimo1KeyPressed
        // TODO add your handling code here:
        
         jLabel10.setVisible(true);
        
    }//GEN-LAST:event_ottimo1KeyPressed

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
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraIniziale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraIniziale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dx1;
    private javax.swing.JLabel errore1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelPremiSpazio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jinc1;
    private javax.swing.JLabel jinc2;
    private javax.swing.JLabel jinc3;
    private javax.swing.JLabel jinc4;
    private javax.swing.JLabel ottimo1;
    private javax.swing.JLabel sx1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        sec += 0.1;
        // System.out.println(sec);
        if (count < al.size() - 1) {
            if (sec > fineGif.get(count)) {
                al.get(count + 1).setVisible(true);
                al.get(count).setVisible(false);
                sec = 0;
                jLabelPremiSpazio.setVisible(false);
                count++;
            }
            if (sec >= skipGif.get(count)) {
                jLabelPremiSpazio.setVisible(true);

            }
        } else {
            jLabelPremiSpazio.setVisible(false);
        }
        System.out.println("scena" + count);
        System.out.println("secondi" + sec);

        sectot += 0.1 ;
        
        if (count==al.size()-1 && sec>2) {
        dx1.setVisible(true);
        sx1.setVisible(true);
        }
    }
}
