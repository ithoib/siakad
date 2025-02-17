/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package siakad;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ithoib
 */
public class dasbor extends javax.swing.JFrame {

    /**
     * Creates new form dasbor
     */
    public dasbor() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sMenuBar = new javax.swing.JMenuBar();
        mMaster = new javax.swing.JMenu();
        mFakultas = new javax.swing.JMenuItem();
        mProdi = new javax.swing.JMenuItem();
        mMahasiswa = new javax.swing.JMenuItem();
        mDosen = new javax.swing.JMenuItem();
        mMatkul = new javax.swing.JMenuItem();
        mTA = new javax.swing.JMenuItem();
        mPengaturan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mMaster.setText("Master");

        mFakultas.setText("Fakultas");
        mFakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mFakultasActionPerformed(evt);
            }
        });
        mMaster.add(mFakultas);

        mProdi.setText("Program Studi");
        mProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProdiActionPerformed(evt);
            }
        });
        mMaster.add(mProdi);

        mMahasiswa.setText("Mahasiswa");
        mMahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMahasiswaActionPerformed(evt);
            }
        });
        mMaster.add(mMahasiswa);

        mDosen.setText("Dosen");
        mDosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDosenActionPerformed(evt);
            }
        });
        mMaster.add(mDosen);

        mMatkul.setText("Mata Kuliah");
        mMatkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMatkulActionPerformed(evt);
            }
        });
        mMaster.add(mMatkul);

        mTA.setText("Tahun Akademik");
        mTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTAActionPerformed(evt);
            }
        });
        mMaster.add(mTA);

        sMenuBar.add(mMaster);

        mPengaturan.setText("Pengaturan");
        sMenuBar.add(mPengaturan);

        setJMenuBar(sMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProdiActionPerformed
        // TODO add your handling code here:
        new prodi().setVisible(true);
    }//GEN-LAST:event_mProdiActionPerformed

    private void mMahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMahasiswaActionPerformed
        // TODO add your handling code here:
        mahasiswanew mahasiswa = new mahasiswanew();
        mahasiswa.setVisible(true);
    }//GEN-LAST:event_mMahasiswaActionPerformed

    private void mFakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mFakultasActionPerformed
        // TODO add your handling code here:
        fakultas fakultas = new fakultas();
        fakultas.setVisible(true);
    }//GEN-LAST:event_mFakultasActionPerformed

    private void mDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDosenActionPerformed
        // TODO add your handling code here:
        dosen dosen = new dosen();
        dosen.setVisible(true);
    }//GEN-LAST:event_mDosenActionPerformed

    private void mMatkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMatkulActionPerformed
        // TODO add your handling code here:
        mata_kuliah mata_kuliah = new mata_kuliah();
        mata_kuliah.setVisible(true);
    }//GEN-LAST:event_mMatkulActionPerformed

    private void mTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTAActionPerformed
        // TODO add your handling code here:
        tahun_akademik tahun_akademik = new tahun_akademik();
        tahun_akademik.setVisible(true);
    }//GEN-LAST:event_mTAActionPerformed

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
            java.util.logging.Logger.getLogger(dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dasbor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dasbor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem mDosen;
    private javax.swing.JMenuItem mFakultas;
    private javax.swing.JMenuItem mMahasiswa;
    private javax.swing.JMenu mMaster;
    private javax.swing.JMenuItem mMatkul;
    private javax.swing.JMenu mPengaturan;
    private javax.swing.JMenuItem mProdi;
    private javax.swing.JMenuItem mTA;
    private javax.swing.JMenuBar sMenuBar;
    // End of variables declaration//GEN-END:variables
}
