/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.lang.Long;

/**
 *
 * @author alfa wijaya
 */
public class input_mahasiswa extends javax.swing.JFrame {

    public input_mahasiswa() {
        initComponents();
        this.setTitle("DATA MAHASISWA");
        this.setLocationRelativeTo(this);

        koneksi k = new koneksi();
        k.Koneksi();
        konek.setText(k.statusKoneksi);

        ButtonGroup bg = new ButtonGroup();
        bg.add(intlakilaki);
        bg.add(intperempuan);
        Table();
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
        jLabel3 = new javax.swing.JLabel();
        jPinput = new javax.swing.JPanel();
        jbnama = new javax.swing.JLabel();
        intnama = new javax.swing.JTextField();
        jbnim = new javax.swing.JLabel();
        intnim = new javax.swing.JTextField();
        jbgender = new javax.swing.JLabel();
        intlakilaki = new javax.swing.JRadioButton();
        intperempuan = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        intalamat = new javax.swing.JTextArea();
        jbalamat = new javax.swing.JLabel();
        jBhapus = new javax.swing.JButton();
        jBubah = new javax.swing.JButton();
        jBsimpan = new javax.swing.JButton();
        jBreset = new javax.swing.JButton();
        jCpilih = new javax.swing.JComboBox<>();
        jBcari = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        konek = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(243, 243, 243));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\film\\logo_unu.png")); // NOI18N
        jLabel3.setText("jLabel3");

        jPinput.setBackground(new java.awt.Color(0, 153, 51));
        jPinput.setBorder(javax.swing.BorderFactory.createTitledBorder("INPUT DATA"));
        jPinput.setName(""); // NOI18N

        jbnama.setText("NAMA");

        jbnim.setText("NIM");

        intnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intnimActionPerformed(evt);
            }
        });

        jbgender.setText("GENDER");

        intlakilaki.setText("LAKI-LAKI");
        intlakilaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intlakilakiActionPerformed(evt);
            }
        });

        intperempuan.setText("PEREMPUAN");

        intalamat.setColumns(20);
        intalamat.setRows(5);
        jScrollPane2.setViewportView(intalamat);

        jbalamat.setText("ALAMAT");

        jBhapus.setText("HAPUS");
        jBhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhapusActionPerformed(evt);
            }
        });

        jBubah.setText("UBAH");
        jBubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBubahActionPerformed(evt);
            }
        });

        jBsimpan.setText("SIMPAN");
        jBsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsimpanActionPerformed(evt);
            }
        });

        jBreset.setText("RESET");
        jBreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBresetActionPerformed(evt);
            }
        });

        jCpilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Pencarian-", "NIM", "NAMA", "ALAMAT", "GENDER" }));
        jCpilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCpilihActionPerformed(evt);
            }
        });

        jBcari.setText("CARI");
        jBcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPinputLayout = new javax.swing.GroupLayout(jPinput);
        jPinput.setLayout(jPinputLayout);
        jPinputLayout.setHorizontalGroup(
            jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinputLayout.createSequentialGroup()
                .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPinputLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPinputLayout.createSequentialGroup()
                                .addComponent(jbnama, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(intnama, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbnim, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPinputLayout.createSequentialGroup()
                                .addComponent(jbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(intlakilaki, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(intperempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jbalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPinputLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPinputLayout.createSequentialGroup()
                                .addComponent(jBcari, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCpilih, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPinputLayout.createSequentialGroup()
                                .addComponent(jBsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBubah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBreset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(intnim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPinputLayout.setVerticalGroup(
            jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPinputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnim, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPinputLayout.createSequentialGroup()
                        .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intlakilaki)
                            .addComponent(intperempuan)
                            .addComponent(jbalamat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBcari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPinputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBhapus)
                            .addComponent(jBubah)
                            .addComponent(jBsimpan)
                            .addComponent(jBreset)))
                    .addGroup(jPinputLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("KONEKSI"));

        jLabel1.setText("STATUS KONEKSI JDBC");
        jLabel1.setMaximumSize(new java.awt.Dimension(140, 16));

        konek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(konek, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(konek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("TABEL DATA MAHASISWA"));

        tbldata.setBackground(new java.awt.Color(0, 204, 204));
        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NO.", "NIM", "NAMA", "GENDER", "ALAMAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbldata.setGridColor(new java.awt.Color(243, 243, 243));
        tbldata.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tbldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldataMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbldata);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText(" DATA MAHASISIWA, PEMROGRAMAN 2  ");

        jLabel4.setText("PRODI S1 ILMU KOMPUTER");

        jLabel5.setText("UNEVERSITAS NAHDLATUL ULAMA BLITAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPinput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(278, 278, 278)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Statement pst;
    ResultSet rs;

    public void Table() {

        koneksi k = new koneksi();
        k.Koneksi();

        try {

            String sql = "select * from identitas";
            pst = k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbldata.setModel(DbUtils.resultSetToTableModel(rs));
                

            
        } catch (Exception e) {
            
        }

    }
    
    public void selectNim(long nim){
        koneksi k = new koneksi();
        k.Koneksi();
        
         try {

            String sql = "select * from identitas where nim like '%" + nim + "%'";
            pst = k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbldata.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void selectNama(String nama){
        koneksi k = new koneksi();
        k.Koneksi();
        
         try {

            String sql = "select * from identitas where nama like '%" + nama + "%'";
            pst = k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbldata.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        public void selectGender(String jenis){
        koneksi k = new koneksi();
        k.Koneksi();
        
         try {

            String sql = "select * from identitas where gender like '%" + jenis + "%'";
            pst = k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbldata.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
        public void selectAlamat(String alamat){
        koneksi k = new koneksi();
        k.Koneksi();
        
         try {

            String sql = "select * from identitas where alamat like '%" + alamat + "%'";
            pst = k.conn.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            tbldata.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
    private void intnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intnimActionPerformed

    private void jBsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsimpanActionPerformed

        String jenis = "";
        if (intlakilaki.isSelected()) {
            jenis = "L";
        } else if (intperempuan.isSelected()) {
            jenis = "P";
        }

        insert in = new insert();

       
        String nama = intnama.getText();
        String alamat = intalamat.getText();

        in.insert(Long.parseLong(intnim.getText()), nama, alamat, jenis);

        Table();
    }//GEN-LAST:event_jBsimpanActionPerformed

    private void konekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_konekActionPerformed

    private void intlakilakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intlakilakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intlakilakiActionPerformed

    private void tbldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldataMouseClicked

        DefaultTableModel dtm = (DefaultTableModel) tbldata.getModel(); //create a model
        long selectedRowIndex = tbldata.getSelectedRow(); //get selected row
        long id = (long) dtm.getValueAt((int) selectedRowIndex, 0); //get the primary key to fetch data.

        koneksi k = new koneksi();
        k.Koneksi();
        try {
            String sql = "select * from identitas where nim like '%" + id + "%'";
            pst = k.conn.prepareStatement(sql);
            ResultSet rs = rs = pst.executeQuery(sql);

            while (rs.next()) {    //u can use normal query
               
                    
                intnim.setText(rs.getString("nim"));
                intnama.setText(rs.getString("nama"));
                intalamat.setText(rs.getString("alamat"));

                String jenis = rs.getString("gender");
                if (jenis.equals("L")) {
                    intlakilaki.setSelected(true);
                } else {
                    intperempuan.setSelected(true);
                }
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_tbldataMouseClicked

    private void jBhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhapusActionPerformed

        koneksi k = new koneksi();
        k.Koneksi();
        hapus h = new hapus();
        h.delete(Long.parseLong(intnim.getText()));

        Table();

    }//GEN-LAST:event_jBhapusActionPerformed

    private void jBresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBresetActionPerformed

        intnim.setText("");
        intnama.setText("");
        intalamat.setText("");

    }//GEN-LAST:event_jBresetActionPerformed

    private void jBubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBubahActionPerformed

        koneksi k = new koneksi();
        k.Koneksi();
        ubah u = new ubah();
        
        String nama = intnama.getText();
        String alamat = intalamat.getText();
        
        String jenis = "";
        if (intlakilaki.isSelected()) {
            jenis = "L";
        } else if (intperempuan.isSelected()) {
            jenis = "P";
        }
        u.update(Long.parseLong(intnim.getText()), nama, alamat, jenis);

        Table();
    }//GEN-LAST:event_jBubahActionPerformed

    private void jCpilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCpilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCpilihActionPerformed

    private void jBcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcariActionPerformed
        
        if (jCpilih.getSelectedIndex() == 1){
            selectNim(Integer.parseInt(intnim.getText()));
        }else if (jCpilih.getSelectedIndex() == 2){
            selectNama(intnama.getText());
        }else if (jCpilih.getSelectedIndex() == 3){
            selectAlamat(intalamat.getText());
        }else if (jCpilih.getSelectedIndex() == 4){
            
                  String jenis = "";
        if (intlakilaki.isSelected()) {
            jenis = "L";
        } else if (intperempuan.isSelected()) {
            jenis = "P";
        }
        selectGender(jenis);
        }else{
            Table();
        }
    }//GEN-LAST:event_jBcariActionPerformed

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
            java.util.logging.Logger.getLogger(input_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new input_mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea intalamat;
    private javax.swing.JRadioButton intlakilaki;
    private javax.swing.JTextField intnama;
    private javax.swing.JTextField intnim;
    private javax.swing.JRadioButton intperempuan;
    private javax.swing.JButton jBcari;
    private javax.swing.JButton jBhapus;
    private javax.swing.JButton jBreset;
    private javax.swing.JButton jBsimpan;
    private javax.swing.JButton jBubah;
    private javax.swing.JComboBox<String> jCpilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPinput;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jbalamat;
    private javax.swing.JLabel jbgender;
    private javax.swing.JLabel jbnama;
    private javax.swing.JLabel jbnim;
    private javax.swing.JTextField konek;
    private javax.swing.JTable tbldata;
    // End of variables declaration//GEN-END:variables

}
