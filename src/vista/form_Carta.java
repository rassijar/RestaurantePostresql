/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author JULIAN
 */
public class form_Carta extends javax.swing.JFrame {

    /**
     * Creates new form form_Carta
     */
    public form_Carta() {
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

        lbl_titulo = new javax.swing.JLabel();
        btn_crear = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        lbl_vig = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_vig = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setText("CREAR CARTA");

        btn_crear.setText("CREAR CARTA");

        Cerrar.setText("Cerrar");

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carta.png"))); // NOI18N

        lbl_id.setText("Digite la Id:");

        lbl_vig.setText("Digite la Vigencia:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_titulo)
                .addGap(146, 146, 146)
                .addComponent(Cerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_vig)
                            .addComponent(lbl_id))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txt_vig)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn_crear)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo)
                    .addComponent(Cerrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(fondo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_id)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_vig)
                            .addComponent(txt_vig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addComponent(btn_crear)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(82, 82, 82))
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
            java.util.logging.Logger.getLogger(form_Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Carta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Carta().setVisible(true);
            }
        });
    }

    public JButton getCerrar() {
        return Cerrar;
    }

    public void setCerrar(JButton Cerrar) {
        this.Cerrar = Cerrar;
    }

    public JButton getBtn_crear() {
        return btn_crear;
    }

    public void setBtn_crear(JButton btn_crear) {
        this.btn_crear = btn_crear;
    }

    public JLabel getFondo() {
        return fondo;
    }

    public void setFondo(JLabel fondo) {
        this.fondo = fondo;
    }

    public JLabel getLbl_id() {
        return lbl_id;
    }

    public void setLbl_id(JLabel lbl_id) {
        this.lbl_id = lbl_id;
    }

    public JLabel getLbl_titulo() {
        return lbl_titulo;
    }

    public void setLbl_titulo(JLabel lbl_titulo) {
        this.lbl_titulo = lbl_titulo;
    }

    public JLabel getLbl_vig() {
        return lbl_vig;
    }

    public void setLbl_vig(JLabel lbl_vig) {
        this.lbl_vig = lbl_vig;
    }

    public JTextField getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(JTextField txt_id) {
        this.txt_id = txt_id;
    }

    public JTextField getTxt_vig() {
        return txt_vig;
    }

    public void setTxt_vig(JTextField txt_vig) {
        this.txt_vig = txt_vig;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton btn_crear;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_vig;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_vig;
    // End of variables declaration//GEN-END:variables
}
