/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siakad;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ithoib
 */
public class fakultas extends javax.swing.JFrame {

    /**
     * Creates new form fakultas
     */
    public fakultas() {
        initComponents();
        load_table_fakultas();
        kosongi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jNFakultas = new javax.swing.JTextField();
        jDekanFakultas = new javax.swing.JTextField();
        jTambahFakultas = new javax.swing.JButton();
        jUbahFakultas = new javax.swing.JButton();
        jHapusFakultas = new javax.swing.JButton();
        jResetFakultas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jIDFak = new javax.swing.JTextField();
        bTutupFakultas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFakultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Fakultas"));

        jLabel1.setText("Nama Fakultas");

        jLabel2.setText("Dekan");

        jNFakultas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jNFakultas.setOpaque(true);

        jDekanFakultas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jDekanFakultas.setOpaque(true);

        jTambahFakultas.setText("Tambah");
        jTambahFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTambahFakultasActionPerformed(evt);
            }
        });

        jUbahFakultas.setText("Ubah");
        jUbahFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUbahFakultasActionPerformed(evt);
            }
        });

        jHapusFakultas.setText("Hapus");
        jHapusFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHapusFakultasActionPerformed(evt);
            }
        });

        jResetFakultas.setText("Reset");
        jResetFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetFakultasActionPerformed(evt);
            }
        });

        jLabel3.setText("ID Fakultas");

        jIDFak.setEditable(false);
        jIDFak.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jIDFak.setFocusable(false);
        jIDFak.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTambahFakultas)
                        .addGap(18, 18, 18)
                        .addComponent(jUbahFakultas)
                        .addGap(18, 18, 18)
                        .addComponent(jHapusFakultas)
                        .addGap(18, 18, 18)
                        .addComponent(jResetFakultas))
                    .addComponent(jNFakultas)
                    .addComponent(jDekanFakultas)
                    .addComponent(jIDFak, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jIDFak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jNFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jDekanFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTambahFakultas)
                    .addComponent(jUbahFakultas)
                    .addComponent(jHapusFakultas)
                    .addComponent(jResetFakultas))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 620, 170));

        bTutupFakultas.setText("Tutup");
        bTutupFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTutupFakultasActionPerformed(evt);
            }
        });
        getContentPane().add(bTutupFakultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));

        tFakultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFakultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tFakultas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 620, 190));

        setSize(new java.awt.Dimension(643, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTambahFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTambahFakultasActionPerformed
        // TODO add your handling code here:
        int idFak = Integer.parseInt(jIDFak.getText());
        String namaFakultas = jNFakultas.getText();
        String namaDekan = jDekanFakultas.getText();
        try {
            String sql = "INSERT INTO fakultas(id_fakultas,nama_fakultas,dekan) VALUES(" + idFak + ",'" + namaFakultas + "','" + namaDekan + "')";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table_fakultas();
        kosongi();
    }//GEN-LAST:event_jTambahFakultasActionPerformed

    private void bTutupFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTutupFakultasActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bTutupFakultasActionPerformed

    private void jResetFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetFakultasActionPerformed
        // TODO add your handling code here:
        kosongi();
    }//GEN-LAST:event_jResetFakultasActionPerformed

    private void tFakultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFakultasMouseClicked
        // TODO add your handling code here:
        // ngambil data per baris pas diklik
        int baris = tFakultas.rowAtPoint(evt.getPoint());
        String IDFakultas = tFakultas.getValueAt(baris, 0).toString();
        jIDFak.setText(IDFakultas);
        String namaFakultas = tFakultas.getValueAt(baris, 1).toString();
        jNFakultas.setText(namaFakultas);
        String namaDekan = tFakultas.getValueAt(baris, 2).toString();
        jDekanFakultas.setText(namaDekan);

    }//GEN-LAST:event_tFakultasMouseClicked

    private void jUbahFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUbahFakultasActionPerformed
        // TODO add your handling code here:
        int idFak = Integer.parseInt(jIDFak.getText());
        String namaFakultas = jNFakultas.getText();
        String namaDekan = jDekanFakultas.getText();
        
        try {
            String sql = "UPDATE fakultas SET nama_fakultas='" + namaFakultas + "', dekan='" + namaDekan + "' WHERE id_fakultas=" + idFak + "";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table_fakultas();
        kosongi();
    }//GEN-LAST:event_jUbahFakultasActionPerformed

    private void jHapusFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHapusFakultasActionPerformed
        // TODO add your handling code here:
        int idFak = Integer.parseInt(jIDFak.getText());
        
        try {
            String sql = "DELETE FROM fakultas WHERE id_fakultas='" + idFak + "'";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table_fakultas();
        kosongi();
        
    }//GEN-LAST:event_jHapusFakultasActionPerformed

    private void load_table_fakultas() {
        DefaultTableModel modelfak = new DefaultTableModel();
        modelfak.addColumn("ID");
        modelfak.addColumn("Nama Fakultas");
        modelfak.addColumn("Dekan");
        try {
  
            String sql = "SELECT * FROM fakultas";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                modelfak.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
            }
            tFakultas.setModel(modelfak);
        } catch (Exception e) {
        }

    }
    
    
    private String last_fID() {

        try {
  
            String sql = "SELECT MAX(id_fakultas)+1 AS last FROM fakultas";
            java.sql.Connection conn = koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                if(res.getString("last")!=null)
                    return res.getString("last");
                else 
                    return "1";
            }
        } catch (Exception e) {
        }
        return "";
    }
    private void kosongi() {
        
        jIDFak.setText(last_fID());
        jNFakultas.setText(null);
        jDekanFakultas.setText(null);
    }

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
            java.util.logging.Logger.getLogger(fakultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fakultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fakultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fakultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fakultas().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bTutupFakultas;
    private javax.swing.JTextField jDekanFakultas;
    private javax.swing.JButton jHapusFakultas;
    private javax.swing.JTextField jIDFak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jNFakultas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jResetFakultas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jTambahFakultas;
    private javax.swing.JButton jUbahFakultas;
    private javax.swing.JTable tFakultas;
    // End of variables declaration//GEN-END:variables
}
