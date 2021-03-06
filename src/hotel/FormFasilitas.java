/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.mysql.jdbc.Connection;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ara
 */
public class FormFasilitas extends javax.swing.JFrame implements Master{
    String sql;
    Statement st;
    Connection con;
    ResultSet rs;

    /**
     * Creates new form FormFasilitas
     */
    public FormFasilitas() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdFasilitas = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtFasilitas = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        txtJenisKmr = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Form Fasilitas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("ID Fasilitas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Fasilitas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Jenis Kamar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Harga");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Stock");

        txtIdFasilitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdFasilitasKeyPressed(evt);
            }
        });

        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHargaKeyPressed(evt);
            }
        });

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStockKeyPressed(evt);
            }
        });

        txtFasilitas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ball Room", "Meeting Room", "Kolam Renang", "Kamar" }));
        txtFasilitas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFasilitasKeyPressed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        btnTambah.setText("ADD");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSimpan.setText("SAVE");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("CLEAR");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setText("DELETE");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("EXIT");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtJenisKmr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJenisKmrKeyPressed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnKeluar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtJenisKmr)
                                    .addComponent(txtHarga)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(26, 26, 26)
                                .addComponent(btnSimpan)
                                .addGap(33, 33, 33)
                                .addComponent(btnBatal)
                                .addGap(29, 29, 29)
                                .addComponent(btnHapus))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJenisKmr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnSimpan)
                    .addComponent(btnBatal)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        tambahData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        bersihForm();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtIdFasilitasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdFasilitasKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            tampilData();
            txtFasilitas.requestFocus();
        }
    }//GEN-LAST:event_txtIdFasilitasKeyPressed

    private void txtFasilitasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFasilitasKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            txtJenisKmr.requestFocus();
        }
    }//GEN-LAST:event_txtFasilitasKeyPressed

    private void txtHargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            txtStock.requestFocus();
        }
    }//GEN-LAST:event_txtHargaKeyPressed

    private void txtStockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            btnSimpan.requestFocus();
        }
    }//GEN-LAST:event_txtStockKeyPressed

    private void txtJenisKmrKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJenisKmrKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            txtHarga.requestFocus();
        }
    }//GEN-LAST:event_txtJenisKmrKeyPressed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        Connection con = koneksi.getCon();
        try {
            sql = "select * from fasilitas where kodeFsl='"+txtIdFasilitas.getText()+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                ubahData();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "pesan kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        tampilTabel();
        bersihForm();
        tambahData();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        hapusdata();
        tampilTabel();
        bersihForm();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        tampilTabel();
    }//GEN-LAST:event_formWindowActivated

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        FormMenu menu = new FormMenu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void tampilTabel () {
        DefaultTableModel tb = new DefaultTableModel ();
        tb.addColumn("ID Fasilitas");
        tb.addColumn("Fasilitas");
        tb.addColumn("Jenis Kamar");
        tb.addColumn("Harga");
        tb.addColumn("Stock");
        
        try {
            con = koneksi.getCon();
            sql = "SELECT * from fasilitas";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            tb.setRowCount(0);
            int i = 1;
            while (rs.next()){
                Object[] data = new Object[5];
                data [0] = rs.getString("kodeFsl");
                data [1] = rs.getString("fasilitas");
                data [2] = rs.getString("jenisKmr");
                data [3] = rs.getString("harga");
                data [4] = rs.getString("jumlah");
                tb.addRow(data);
                i++;
            }
            tabel.setModel (tb);
        } catch (Exception e) {
            System.out.print("terjadi kesalahan dalam pengambilan data"+e);
        }
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
            java.util.logging.Logger.getLogger(FormFasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFasilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFasilitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JComboBox txtFasilitas;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtIdFasilitas;
    private javax.swing.JTextField txtJenisKmr;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tambahData() {
        Connection con = koneksi.getCon();
        try {
            sql ="INSERT INTO fasilitas values ('"+ txtIdFasilitas.getText()+"', '"+txtFasilitas.getSelectedItem().toString()+"',"
                    + "'"+ txtJenisKmr.getText()+"', '"+txtHarga.getText()+"', '"+txtStock.getText()+"' )";
            System.out.println(sql);
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            System.out.println("tidak dilakukan insert");
        }
    }

    @Override
    public void ubahData() {
        Connection con = koneksi.getCon();
        try {
            sql = "update fasilitas set fasilitas='"+txtFasilitas.getSelectedItem().toString()+"', jenisKmr='"+txtJenisKmr.getText()+"', harga='"+txtHarga.getText()+"', jumlah='"+txtStock.getText()+"'";
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "pesan kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public void hapusdata() {
        con = koneksi.getCon();
        try {
            sql="delete from fasilitas where kodeFsl='"+txtIdFasilitas.getText()+"'";
            st = con.createStatement();
            st.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "pesan kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        tampilTabel();
    }

    @Override
    public void tampilData() {
        Connection con = koneksi.getCon();
        try {
            sql = "select * from fasilitas where kodeFsl= '"+txtIdFasilitas.getText()+"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txtJenisKmr.setText(rs.getString("jenisKmr"));
                txtHarga.setText(rs.getString("harga"));
                txtStock.setText(rs.getString("jumlah"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "pesan kesalahan", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public void bersihForm() {
        txtIdFasilitas.setText("");
        txtJenisKmr.setText("");
        txtHarga.setText("");
        txtStock.setText("");
    }
}
