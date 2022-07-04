/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abissicurallo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author lauma
 */
public class FinestraIniziale extends javax.swing.JFrame implements ActionListener {

    ArrayList< JLabel> al = new ArrayList< JLabel>();
    ArrayList< Integer> fineGif = new ArrayList< Integer>();

    ArrayList< Integer> skipGif = new ArrayList< Integer>();

    Timer timer;
    int sec = 0;
    int count = 0;

    /**
     * Creates new form FinestraIniziale
     */
    public FinestraIniziale() {
        timer = new Timer(1000, this);
        timer.start();

        setUndecorated(true);
        initComponents();

        al.add(jLabel1);
        fineGif.add(18);
        skipGif.add(0);

        al.add(jLabel2);
        fineGif.add(5); //durata di gif
        skipGif.add(2); // inizi a skippare somma maggiore di sec di inizio

        al.add(jLabel3);
        fineGif.add(2);
        skipGif.add(1);//+2

        al.add(jLabel4);
        fineGif.add(1);
        skipGif.add(1);//1

        al.add(jLabel5);
        fineGif.add(7);
        skipGif.add(3);//2

        al.add(jLabel6);
        fineGif.add(0);
        skipGif.add(0);//6

        al.add(jLabel7);
        fineGif.add(1);
        skipGif.add(1);//1

        al.add(jLabel8);
        fineGif.add(1);
        skipGif.add(1);//1

        al.add(jLabel9);
        fineGif.add(4);
        skipGif.add(2);//4

        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        jLabel9.setVisible(false);
        jLabelPremiSpazio.setVisible(false);
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
        dx1 = new javax.swing.JLabel();
        sx1 = new javax.swing.JLabel();
        jLabelPremiSpazio = new javax.swing.JLabel();
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
        setMaximumSize(new java.awt.Dimension(2147483647, 540));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setLayout(null);

        dx1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/after effect/1dx.png"))); // NOI18N
        jPanel1.add(dx1);
        dx1.setBounds(270, 430, 270, 270);

        sx1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/after effect/1sx.png"))); // NOI18N
        jPanel1.add(sx1);
        sx1.setBounds(10, 500, 310, 310);

        jLabelPremiSpazio.setText("laura ti meno");
        jLabelPremiSpazio.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabelPremiSpazio);
        jLabelPremiSpazio.setBounds(190, 640, 130, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Secdiscesadef.gif"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 540, 810);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase8def.gif"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 540, 810);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase3.gif"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-3, 6, 550, 810);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase6def.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 540, 810);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase5def.gif"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 810);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Def4frase (1).gif"))); // NOI18N
        jLabel4.setText("jLabel5");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-3, -4, 540, 820);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Def3frase (1).gif"))); // NOI18N
        jLabel3.setText("jLabel4");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 540, 810);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/abissicurallo/Frase2def.gif"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

            if(count < al.size()-1){
        if(sec > skipGif.get(count)){
            al.get(count+1).setVisible(true) ;//gif successiva
            jLabelPremiSpazio.setVisible(false);
            sec = 0;
            count++;
        }
    }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel sx1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        sec++;
        // System.out.println(sec);
        if(count < al.size()-1){
        if(sec > fineGif.get(count)){
            al.get(count+1).setVisible(true);
            sec = 0;
            jLabelPremiSpazio.setVisible(false);
            count++;
        }
        if(sec >= skipGif.get(count)){
            jLabelPremiSpazio.setVisible(true);
            
        }
    }else{
        jLabelPremiSpazio.setVisible(false);
    }
    }
}
