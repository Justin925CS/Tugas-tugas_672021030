/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class FrameSuhu extends javax.swing.JFrame {

    /**
     * Creates new form FrameSuhu
     */
    public FrameSuhu() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width - this.getWidth())/2, (screenSize.height - this.getHeight())/2);
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
        suhuawal = new javax.swing.JTextField();
        suhu1 = new javax.swing.JComboBox<>();
        suhu2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        suhuakhir = new javax.swing.JTextField();
        konversi = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 48)); // NOI18N
        jLabel1.setText("KONVERSI SUHU");

        jLabel2.setText("Suhu Awal");

        suhu1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Reamur", "Fahrenheit", "Kelvin" }));

        suhu2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celcius", "Reamur", "Fahrenheit", "Kelvin" }));

        jLabel3.setText("Dikonversi ke");

        jLabel4.setText("Suhu Akhir");

        suhuakhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suhuakhirActionPerformed(evt);
            }
        });

        konversi.setText("Konversi");
        konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiActionPerformed(evt);
            }
        });

        exit.setText("Log Off");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel5.setText("Aplikasi Konversi Suhu by Justin Clarence Setiawan");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(suhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(suhu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(suhuakhir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(suhu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(konversi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suhuawal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suhu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suhu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suhuakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(konversi)
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suhuakhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suhuakhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suhuakhirActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        FrameLogin frame = new FrameLogin();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_exitActionPerformed

    private void konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiActionPerformed
        if(suhu1.getSelectedIndex() == 0 && suhu2.getSelectedIndex() == 1){
            float c = Float.parseFloat(suhuawal.getText());
            float r = c*8/10;
            suhuakhir.setText(String.valueOf(r));
        } else if(suhu1.getSelectedIndex() == 0 && suhu2.getSelectedIndex() == 2){
            float c = Float.parseFloat(suhuawal.getText());
            float f = c*18/10 + 32;
            suhuakhir.setText(String.valueOf(f));
        } else if(suhu1.getSelectedIndex() == 0 && suhu2.getSelectedIndex() == 3){
            float c = Float.parseFloat(suhuawal.getText());
            float k = c + 273;
            suhuakhir.setText(String.valueOf(k));
        } else if(suhu1.getSelectedIndex() == 1 && suhu2.getSelectedIndex() == 0){
            float r = Float.parseFloat(suhuawal.getText());
            float c = r*125/100;
            suhuakhir.setText(String.valueOf(c));
        } else if(suhu1.getSelectedIndex() == 1 && suhu2.getSelectedIndex() == 2){
            float r = Float.parseFloat(suhuawal.getText());
            float f = r*225/100 + 32;
            suhuakhir.setText(String.valueOf(f));
        } else if(suhu1.getSelectedIndex() == 1 && suhu2.getSelectedIndex() == 3){
            float r = Float.parseFloat(suhuawal.getText());
            float k = r*125/100 + 273;
            suhuakhir.setText(String.valueOf(k));
        } else if(suhu1.getSelectedIndex() == 2 && suhu2.getSelectedIndex() == 0){
            float f = Float.parseFloat(suhuawal.getText());
            float c = (f-32)*10/18;
            suhuakhir.setText(String.valueOf(c));
        } else if(suhu1.getSelectedIndex() == 2 && suhu2.getSelectedIndex() == 1){
            float f = Float.parseFloat(suhuawal.getText());
            float r = (f-32)*100/225;
            suhuakhir.setText(String.valueOf(r));
        } else if(suhu1.getSelectedIndex() == 2 && suhu2.getSelectedIndex() == 3){
            float f = Float.parseFloat(suhuawal.getText());
            float k = (f-32)*10/18+273;
            suhuakhir.setText(String.valueOf(k));
        } else if(suhu1.getSelectedIndex() == 3 && suhu2.getSelectedIndex() == 0){
            float k = Float.parseFloat(suhuawal.getText());
            float c = k-273;
            suhuakhir.setText(String.valueOf(c));
        } else if(suhu1.getSelectedIndex() == 3 && suhu2.getSelectedIndex() == 1){
            float k = Float.parseFloat(suhuawal.getText());
            float r = (k-273)*8/10;
            suhuakhir.setText(String.valueOf(r));
        } else if(suhu1.getSelectedIndex() == 3 && suhu2.getSelectedIndex() == 2){
            float k = Float.parseFloat(suhuawal.getText());
            float f = (k-273)*18/10+32;
            suhuakhir.setText(String.valueOf(f));
        } else {
            JOptionPane.showMessageDialog(this, "Suhu Tidak Valid!!!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_konversiActionPerformed

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
            java.util.logging.Logger.getLogger(FrameSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton konversi;
    private javax.swing.JComboBox<String> suhu1;
    private javax.swing.JComboBox<String> suhu2;
    private javax.swing.JTextField suhuakhir;
    private javax.swing.JTextField suhuawal;
    // End of variables declaration//GEN-END:variables
}
