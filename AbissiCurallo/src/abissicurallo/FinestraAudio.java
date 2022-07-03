/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abissicurallo;

import javax.sound.sampled.Clip;

/**
 *
 * @author lauma
 */
public class FinestraAudio extends javax.swing.JFrame {

    public MiaClipAudio  MC1 ;
    public MiaClipAudio  MC2 ;
    public MiaClipAudio  MC3 ;
    public MiaClipAudio  MC4 ;
    public MiaClipAudio  MC5 ;
    public MiaClipAudio  MC6 ;
    public MiaClipAudio  MC7 ;
    
    
    /**
     * Creates new form FinestraAudio
     */
    public FinestraAudio() {
        initComponents();
        
        //MC1 = new MiaClipAudio ("C:\\Users\\lauma\\Downloads\\lamantino-ok.wav" );
        //MC1 = new MiaClipAudio ("C:\\Users\\lauma\\Downloads\\lamantino-ok.wav" );
        
        String path = getClass().getResource("").toString().replace("build/classes/abissicurallo/", "src/abissicurallo/").replace("file:/", "");
        MC1 = new MiaClipAudio (path+"lamantino-ok.wav");
        
        MC1.start();
        //MC1.loop  (  Clip.LOOP_CONTINUOUSLY  );
        
        //MC1 = new MiaClipAudio ("media/audio1.wav");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAudio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbAudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAudioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAudioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbAudioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAudioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAudioMouseEntered

    
    private void lbAudioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAudioMouseExited
        // TODO add your handling code here:        
    }//GEN-LAST:event_lbAudioMouseExited

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
            java.util.logging.Logger.getLogger(FinestraAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinestraAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinestraAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinestraAudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinestraAudio().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAudio;
    // End of variables declaration//GEN-END:variables
}
