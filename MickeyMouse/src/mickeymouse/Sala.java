/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mickeymouse;

import java.awt.Graphics;
import java.awt.Point;



/**
 *
 * @author pwightman
 */
public class Sala extends javax.swing.JFrame{

    int x,y;
    int x2,y2;
    int dx,dy;
    int rad;
    int side;
    int ini;
    boolean move;
    
    /**
     * Creates new form Sala
     */
    public Sala() {
        x=0;
        y=0;
        x2=y2=40;
        dx=10;
        dy=7;
        rad = 10;
        move=true;
        side=430;
        ini=40;
        
        new Thread(){
            public void run(){
                while(true){
                    if(move){
                        x2=x2+dx;
                        y2=y2+dy;

                        if(x2+dx+rad-ini>side || x2+dx-rad<ini)
                            dx = dx*-1;
                        
                        if(y2+dy+rad-ini>side || y2+dy-rad<ini)
                            dy = dy*-1;
                        try{
                        this.sleep(30);
                        }catch(Exception ex){ex.printStackTrace();}
                        repaint();
                    }
                }
            }
        }.start();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mickey Mouse");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("X=0, Y=0");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 146, 14);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mickeymouse/images/250px-Mickey_Mouse.svg.png"))); // NOI18N
        jLabel2.setDoubleBuffered(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(97, 70, 75, 87);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
               
    x = evt.getX();
    y = evt.getY();
    
    jLabel1.setText("X="+x+", Y="+y);
    
    repaint();
    
    }//GEN-LAST:event_formMouseMoved

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        
        move=!move;
        repaint();

    }//GEN-LAST:event_formMouseReleased

    public void paint(Graphics g){
        super.paint(g);
    
        if(move)
            jLabel2.setLocation(x, y); 
        
        g.drawRect(ini, ini, side, side);
        g.drawOval(x2-rad, y2-rad, rad*2, rad*2);
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Sala().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
