/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fop.assignment;

/**
 *
 * @author User
 */
public class FillTheField extends javax.swing.JFrame {

    /**
     * Creates new form FillTheField
     */
    public FillTheField() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BackMerchandisePage = new javax.swing.JButton();
        BackTreePage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fop/assignment/Warning_icon.svg_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 90));

        jPanel2.setBackground(new java.awt.Color(197, 222, 203));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 93, 93));
        jLabel2.setText("Please fill in all the field !");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        BackMerchandisePage.setText("Back to Merchandise Page");
        BackMerchandisePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMerchandisePageActionPerformed(evt);
            }
        });
        jPanel2.add(BackMerchandisePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        BackTreePage.setText("Back to Tree Page");
        BackTreePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackTreePageActionPerformed(evt);
            }
        });
        jPanel2.add(BackTreePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMerchandisePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMerchandisePageActionPerformed
        this.dispose();
        MerchandisePage x = new MerchandisePage();
        x.setVisible(true);
    }//GEN-LAST:event_BackMerchandisePageActionPerformed

    private void BackTreePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackTreePageActionPerformed
        this.dispose();
        PlantTreePage x = new PlantTreePage();
        x.setVisible(true);
    }//GEN-LAST:event_BackTreePageActionPerformed

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
            java.util.logging.Logger.getLogger(FillTheField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillTheField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillTheField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillTheField.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FillTheField().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMerchandisePage;
    private javax.swing.JButton BackTreePage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
