/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import java.awt.Graphics;

/**
 *
 * @author pwightman
 */
public class ElTablero extends javax.swing.JPanel {

    Elemento[] losElementos = new Elemento[5];
    int cont=0;
    
    /**
     * Creates new form ElTablero
     */
    public ElTablero() {
        
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
        jButton1 = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1);
        jLabel1.setBounds(160, 55, 70, 57);

        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2);
        jLabel2.setBounds(85, 55, 70, 57);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(310, 260, 73, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        losElementos[cont] = new Elemento(50*(cont+1),50*(cont+1));
        cont++;
        repaint();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public void paint(Graphics g){
        super.paint(g);
        
        for(int i=0;i<cont;i++){
        
            g.drawImage(losElementos[i].imagen.getImage(), losElementos[i].x, losElementos[i].y, this);
            
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
