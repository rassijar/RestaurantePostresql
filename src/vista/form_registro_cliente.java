/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author JULIAN
 */
public class form_registro_cliente extends javax.swing.JFrame {

    /**
     * Creates new form form_registro_cliente
     */
    public form_registro_cliente() {
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

        fondo_reg = new javax.swing.JLabel();
        lbreg = new javax.swing.JLabel();
        lbidregcli = new javax.swing.JLabel();
        lbnomcli = new javax.swing.JLabel();
        txtidregcli = new javax.swing.JTextField();
        txtnombregcli = new javax.swing.JTextField();
        bntregistrarcli = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo_reg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registrocliente.jpg"))); // NOI18N
        getContentPane().add(fondo_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 26, -1, -1));

        lbreg.setForeground(new java.awt.Color(0, 0, 102));
        lbreg.setText("BIENVENIDO AL REGISTRO DEL CLIENTE");
        getContentPane().add(lbreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 6, -1, -1));

        lbidregcli.setText("Digite ID:");
        getContentPane().add(lbidregcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 307, -1, -1));

        lbnomcli.setText("Digite Nombre:");
        getContentPane().add(lbnomcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 333, -1, -1));
        getContentPane().add(txtidregcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 304, 98, -1));
        getContentPane().add(txtnombregcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 330, 98, -1));

        bntregistrarcli.setText("Registrar");
        getContentPane().add(bntregistrarcli, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 304, -1, -1));

        btn_cerrar.setText("Cerrar");
        getContentPane().add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 6, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

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
            java.util.logging.Logger.getLogger(form_registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_registro_cliente().setVisible(true);
            }
        });
    }

    public JButton getBtn_cerrar() {
        return btn_cerrar;
    }

    public void setBtn_cerrar(JButton btn_cerrar) {
        this.btn_cerrar = btn_cerrar;
    }

    public JButton getBntregistrarcli() {
        return bntregistrarcli;
    }

    public void setBntregistrarcli(JButton bntregistrarcli) {
        this.bntregistrarcli = bntregistrarcli;
    }

    public JLabel getFondo_reg() {
        return fondo_reg;
    }

    public void setFondo_reg(JLabel fondo_reg) {
        this.fondo_reg = fondo_reg;
    }

    public JLabel getLbidregcli() {
        return lbidregcli;
    }

    public void setLbidregcli(JLabel lbidregcli) {
        this.lbidregcli = lbidregcli;
    }

    public JLabel getLbnomcli() {
        return lbnomcli;
    }

    public void setLbnomcli(JLabel lbnomcli) {
        this.lbnomcli = lbnomcli;
    }

    public JLabel getLbreg() {
        return lbreg;
    }

    public void setLbreg(JLabel lbreg) {
        this.lbreg = lbreg;
    }

    public JTextField getTxtidregcli() {
        return txtidregcli;
    }

    public void setTxtidregcli(JTextField txtidregcli) {
        this.txtidregcli = txtidregcli;
    }

    public JTextField getTxtnombregcli() {
        return txtnombregcli;
    }

    public void setTxtnombregcli(JTextField txtnombregcli) {
        this.txtnombregcli = txtnombregcli;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntregistrarcli;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JLabel fondo_reg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbidregcli;
    private javax.swing.JLabel lbnomcli;
    private javax.swing.JLabel lbreg;
    private javax.swing.JTextField txtidregcli;
    private javax.swing.JTextField txtnombregcli;
    // End of variables declaration//GEN-END:variables
}
