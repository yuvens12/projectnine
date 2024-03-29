/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package busku;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rully Rosadi
 */
public class ManageBus extends javax.swing.JFrame {
    
    static Connection conn;
    private Statement st;
    static ResultSet rs;
    private String sql;
    public static String KodeBus;
    public static String NamaBus;
    public static String AWAL;
    public static String TUJUAN;
    public static String JamAwal;
    public static String JamTiba;
    private DefaultTableModel tb_bis;
    
    /**
     * Creates new form TambahBus
     */
    public ManageBus() {
        initComponents();
        TampilBis();
    }
        public void TampilBis() {
        tb_bis = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
            //all cells false
                return false;
            }
        };
        tb_bis.addColumn("Kode Bis");
        tb_bis.addColumn("Nama Bis");
        tb_bis.addColumn("Tujuan Awal");
        tb_bis.addColumn("Jam Berangkat");
        tb_bis.addColumn("Tujuan Akhir");
        tb_bis.addColumn("Jam Tiba");
        Tabelbis.setModel(tb_bis);
        conn= koneksi.konek();
        try {
            java.sql.Statement stmt = conn.createStatement();
            sql = "select * from databus";
            java.sql.ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tb_bis.addRow(new Object[]{
                    rs.getString("KodeBUS"),
                    rs.getString("NamaBUS"),
                    rs.getString("AwalTerminal"),
                    rs.getString("JamBerangkat"),
                    rs.getString("TujuanTerminal"),
                    rs.getString("JamTiba")
                });
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfKodeB = new javax.swing.JTextField();
        tfNamaB = new javax.swing.JTextField();
        btnKembali = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        output1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabelbis = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tfJB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfJT = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        notif = new javax.swing.JLabel();
        cbstart = new javax.swing.JComboBox<>();
        cbfinish = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(151, 75, 102));

        jLabel1.setBackground(new java.awt.Color(151, 75, 102));
        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        jLabel1.setText("Manage Bus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(371, 371, 371))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setText("input data dibawah ini !");

        jLabel3.setText("Kode Bus");

        jLabel4.setText("Nama Bus");

        jLabel5.setText("Dari Terminal");

        jLabel6.setText("Tujuan");

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        Tabelbis.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabelbis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelbisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabelbis);

        jLabel7.setText("Jam Berangkat");

        tfJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJBActionPerformed(evt);
            }
        });

        jLabel8.setText("Jam Tiba");

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        cbstart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Terminal Bungurasih", "Terminal Arjosari", "Terminal Perak" }));

        cbfinish.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Terminal Bungurasih", "Terminal Arjosari", "Terminal Perak", "" }));

        jLabel9.setText("Tulis jam dalam bentuk (JJ:MM:DD)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(386, 386, 386)
                                .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbstart, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNamaB)
                                    .addComponent(tfJT)
                                    .addComponent(cbfinish, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfKodeB, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnKembali)
                                            .addComponent(btnClear)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAdd)
                                            .addComponent(btnedit))
                                        .addGap(18, 18, 18)
                                        .addComponent(btndelete))
                                    .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfJB, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(notif, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btndelete)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfKodeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNamaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbstart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addComponent(btnedit))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfJB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbfinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKembali)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfJT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (tfKodeB.getText()!=null){
            KodeBus = tfKodeB.getText();
            NamaBus = tfNamaB.getText();
            AWAL =cbstart.getItemAt(cbstart.getSelectedIndex());
            TUJUAN=cbfinish.getItemAt(cbfinish.getSelectedIndex());
            JamAwal = tfJB.getText();
            JamTiba = tfJT.getText();
            
            try {
                conn=koneksi.konek();
                if (KodeBus.equals("") || NamaBus.equals("")){
                    output1.setText("Data tidak boleh ada satupun yang kosong!");
                }else if (AWAL.equals("") || TUJUAN.equals("")){
                    output1.setText("Data tidak boleh ada satupun yang kosong!");
                }else{
                    String sql = "insert into databus (KodeBUS, NamaBUS, AwalTerminal, JamBerangkat, TujuanTerminal, JamTiba) VALUES "
                    + "('"+KodeBus+"', '"+NamaBus+"', '"+AWAL+"','"+JamAwal+"','"+TUJUAN+"','"+JamTiba+"')";
                    st = conn.createStatement();
                    st.execute(sql);
                    tfKodeB.setText("");
                    tfNamaB.setText("");
                    cbstart.setSelectedIndex(0);
                    cbfinish.setSelectedIndex(0);
                    tfJB.setText("");
                    tfJT.setText("");
                    TampilBis();
                    if(sql!=null){
                        output1.setText("");
                        JOptionPane.showMessageDialog(null, "Penambahan Berhasil!");
                    }else{
                        output1.setText("Kode Bus mungkin sudah ada, silakan input ulang");
                    }
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Penambahan Gagal!");
            }
        }
        else {
            output1.setText("Kode Bus sudah ada, silakan input ulang");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfKodeB.setText("");
        tfNamaB.setText("");
        cbstart.setSelectedIndex(0);
        cbfinish.setSelectedIndex(0);
        tfJB.setText("");
        tfJT.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        dispose();
        new AdminMenu().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void TabelbisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelbisMouseClicked
        int baris = Tabelbis.getSelectedRow();
        tfKodeB.setText(Tabelbis.getValueAt(baris, 0).toString());
        tfKodeB.setEditable(false);
        tfNamaB.setText(Tabelbis.getValueAt(baris, 1).toString());
        tfJT.setText(Tabelbis.getValueAt(baris, 3).toString());
        tfJB.setText(Tabelbis.getValueAt(baris, 5).toString());
    }//GEN-LAST:event_TabelbisMouseClicked

    private void tfJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJBActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        if (tfKodeB.getText()!= null){
            KodeBus = tfKodeB.getText();
            NamaBus = tfNamaB.getText();
            AWAL=cbstart.getItemAt(cbstart.getSelectedIndex());
            TUJUAN=cbfinish.getItemAt(cbfinish.getSelectedIndex());
            JamAwal = tfJB.getText();
            JamTiba = tfJT.getText();
                try {
                    
                    conn= koneksi.konek();
                    if (tfKodeB.getText().equals("") || tfNamaB.getText().equals("")){
                        notif.setText("Data tidak boleh ada satupun yang kosong!");
                    }else if (cbstart.getItemAt(cbstart.getSelectedIndex()).equals("") || cbfinish.getItemAt(cbfinish.getSelectedIndex()).equals("")){
                        notif.setText("Data tidak boleh ada satupun yang kosong!");
                    }else if (tfJB.getText().equals("") || tfJT.getText().equals("")){
                        notif.setText("Data tidak boleh ada satupun yang kosong!");
                    }else{
                        conn= koneksi.konek();
                        PreparedStatement stmt = conn.prepareStatement("update databus set NamaBUS=?, AwalTerminal=?, TujuanTerminal=?, JamBerangkat=?, JamTiba=? where KodeBUS=?");
                        
                        stmt.setString(1, tfNamaB.getText());
                        stmt.setString(2, cbstart.getItemAt(cbstart.getSelectedIndex()));
                        stmt.setString(3, cbfinish.getItemAt(cbfinish.getSelectedIndex()));
                        stmt.setString(4, tfJB.getText());
                        stmt.setString(5, tfJT.getText());
                        stmt.setString(6, tfKodeB.getText());
                        

                        stmt.executeUpdate();
                        stmt.execute(sql);
                        if(sql!=null){
                            notif.setText("");
                            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                            TampilBis();
                        }else{
                            notif.setText("Data mungkin sudah ada, silakan input ulang");
                        }
                    }


                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Registrasi Gagal!");
                    JOptionPane.showMessageDialog(null,e);
                }
        }else {
            notif.setText("Password tidak cocok, silakan input ulang");
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus data anggota tersebut?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            try {
                java.sql.PreparedStatement stmt = conn.prepareStatement("delete from databus where kodebus ='" + tfKodeB.getText() + "'");
                stmt.executeUpdate();
                notif.setText("");
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                TampilBis();
                tfKodeB.setText("");
                tfNamaB.setText("");
                cbstart.setSelectedIndex(0);
                cbfinish.setSelectedIndex(0);
                tfJB.setText("");
                tfJT.setText("");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabelbis;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox<String> cbfinish;
    private javax.swing.JComboBox<String> cbstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel notif;
    private javax.swing.JLabel output1;
    private javax.swing.JTextField tfJB;
    private javax.swing.JTextField tfJT;
    private javax.swing.JTextField tfKodeB;
    private javax.swing.JTextField tfNamaB;
    // End of variables declaration//GEN-END:variables
}
