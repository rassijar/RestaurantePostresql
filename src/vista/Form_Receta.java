/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JULIAN
 */
public class Form_Receta extends javax.swing.JFrame {

    /**
     * Creates new form Receta
     */
    public Form_Receta() {
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

        lbfondoreceta = new javax.swing.JLabel();
        lb_id_receta = new javax.swing.JLabel();
        txt_id_receta = new javax.swing.JTextField();
        lb_descr_receta = new javax.swing.JLabel();
        txt_desc_receta = new javax.swing.JTextField();
        btn_receta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbfondoreceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/receta.jpg"))); // NOI18N
        getContentPane().add(lbfondoreceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 177, 182));

        lb_id_receta.setText("Digite la id de la receta:");
        getContentPane().add(lb_id_receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 50, -1, -1));
        getContentPane().add(txt_id_receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 70, 113, -1));

        lb_descr_receta.setText("Digite la descripccion:");
        getContentPane().add(lb_descr_receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 96, -1, -1));
        getContentPane().add(txt_desc_receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 116, 113, -1));

        btn_receta.setText("Registrar Receta");
        getContentPane().add(btn_receta, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 169, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("RECETA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 11, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        btn_cerrar.setText("Cerrar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(327, Short.MAX_VALUE)
                .addComponent(btn_cerrar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_cerrar)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
            java.util.logging.Logger.getLogger(Form_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Receta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Receta().setVisible(true);
            }
        });
    }

    public JButton getBtn_cerrar() {
        return btn_cerrar;
    }

    public void setBtn_cerrar(JButton btn_cerrar) {
        this.btn_cerrar = btn_cerrar;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JButton getBtn_receta() {
        return btn_receta;
    }

    public void setBtn_receta(JButton btn_receta) {
        this.btn_receta = btn_receta;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLb_descr_receta() {
        return lb_descr_receta;
    }

    public void setLb_descr_receta(JLabel lb_descr_receta) {
        this.lb_descr_receta = lb_descr_receta;
    }

    public JLabel getLb_id_receta() {
        return lb_id_receta;
    }

    public void setLb_id_receta(JLabel lb_id_receta) {
        this.lb_id_receta = lb_id_receta;
    }

    public JLabel getLbfondoreceta() {
        return lbfondoreceta;
    }

    public void setLbfondoreceta(JLabel lbfondoreceta) {
        this.lbfondoreceta = lbfondoreceta;
    }

    public JTextField getTxt_desc_receta() {
        return txt_desc_receta;
    }

    public void setTxt_desc_receta(JTextField txt_desc_receta) {
        this.txt_desc_receta = txt_desc_receta;
    }

    public JTextField getTxt_id_receta() {
        return txt_id_receta;
    }

    public void setTxt_id_receta(JTextField txt_id_receta) {
        this.txt_id_receta = txt_id_receta;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_receta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_descr_receta;
    private javax.swing.JLabel lb_id_receta;
    private javax.swing.JLabel lbfondoreceta;
    private javax.swing.JTextField txt_desc_receta;
    private javax.swing.JTextField txt_id_receta;
    // End of variables declaration//GEN-END:variables
}
