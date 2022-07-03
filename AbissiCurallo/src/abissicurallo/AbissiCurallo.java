/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abissicurallo;

/**
 *
 * @author murat
 */
public class AbissiCurallo {
     
    public static FinestraIniziale FI ;
     public static FinestraAudio FA;
         
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FI = new FinestraIniziale();
        FI.setLocation(590, 90);
        FI.setVisible(true);
        
        FA = new FinestraAudio();
        FA.setLocation(0, 0);
        FA.setVisible(false);

    }
    
}
