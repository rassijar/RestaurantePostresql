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
public class Fomr_ingredietne extends javax.swing.JFrame {

    /**
     * Creates new form Fomr_ingredietne
     */
    public Fomr_ingredietne() {
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

        jLabel2 = new javax.swing.JLabel();
        lbfondoreceta = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_nom = new javax.swing.JLabel();
        txt_nom = new javax.swing.JTextField();
        btn_ing = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_medi = new javax.swing.JLabel();
        txt_med = new javax.swing.JTextField();
        lbl_cant = new javax.swing.JLabel();
        txt_cant = new javax.swing.JTextField();
        btn_cerrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        lbfondoreceta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/receta.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_id.setText("Digite la id Ingrediente");

        lbl_nom.setText("Digite nombre");

        btn_ing.setText("Registrar Ingrediente");

        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ingrediente");

        lbl_medi.setText("Medida");

        lbl_cant.setText("Cantaidad");

        btn_cerrar.setText("Cerrar");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingrediente.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_cerrar)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_nom)
                                    .addComponent(txt_nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_medi)
                                    .addComponent(lbl_cant)
                                    .addComponent(txt_med, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(72, 72, 72))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(btn_ing)
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btn_cerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_nom)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_medi)
                        .addGap(18, 18, 18)
                        .addComponent(txt_med, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cant)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(btn_ing)
                .addContainerGap(54, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Fomr_ingredietne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fomr_ingredietne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fomr_ingredietne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fomr_ingredietne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fomr_ingredietne().setVisible(true);
            }
        });
    }

    public JButton getBtn_cerrar() {
        return btn_cerrar;
    }

    public void setBtn_cerrar(JButton btn_cerrar) {
        this.btn_cerrar = btn_cerrar;
    }

    public JButton getBtn_ing() {
        return btn_ing;
    }

    public void setBtn_ing(JButton btn_ing) {
        this.btn_ing = btn_ing;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getLbfondoreceta() {
        return lbfondoreceta;
    }

    public void setLbfondoreceta(JLabel lbfondoreceta) {
        this.lbfondoreceta = lbfondoreceta;
    }

    public JLabel getLbl_cant() {
        return lbl_cant;
    }

    public void setLbl_cant(JLabel lbl_cant) {
        this.lbl_cant = lbl_cant;
    }

    public JLabel getLbl_id() {
        return lbl_id;
    }

    public void setLbl_id(JLabel lbl_id) {
        this.lbl_id = lbl_id;
    }

    public JLabel getLbl_medi() {
        return lbl_medi;
    }

    public void setLbl_medi(JLabel lbl_medi) {
        this.lbl_medi = lbl_medi;
    }

    public JLabel getLbl_nom() {
        return lbl_nom;
    }

    public void setLbl_nom(JLabel lbl_nom) {
        this.lbl_nom = lbl_nom;
    }

    public JTextField getTxt_cant() {
        return txt_cant;
    }

    public void setTxt_cant(JTextField txt_cant) {
        this.txt_cant = txt_cant;
    }

    public JTextField getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(JTextField txt_id) {
        this.txt_id = txt_id;
    }

    public JTextField getTxt_med() {
        return txt_med;
    }

    public void setTxt_med(JTextField txt_med) {
        this.txt_med = txt_med;
    }

    public JTextField getTxt_nom() {
        return txt_nom;
    }

    public void setTxt_nom(JTextField txt_nom) {
        this.txt_nom = txt_nom;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_ing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbfondoreceta;
    private javax.swing.JLabel lbl_cant;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_medi;
    private javax.swing.JLabel lbl_nom;
    private javax.swing.JTextField txt_cant;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_med;
    private javax.swing.JTextField txt_nom;
    // End of variables declaration//GEN-END:variables
}
