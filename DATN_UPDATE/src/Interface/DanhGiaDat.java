package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.DefaultTableModel;

public class DanhGiaDat extends javax.swing.JFrame implements ActionListener {

    static int m;
    static String tendat1[] = new String[100];
    static String loaidat1[] = new String[100];
    static double chieuday1[] = new double[100];
    static float dungtrong1[] = new float[100];
    static float doam1[] = new float[100];
    static float gioihannhao1[] = new float[100];
    static float gioihandeo1[] = new float[100];
    static float gocmasat1[] = new float[100];
    static float lucdinhdonvi1[] = new float[100];
    static float tytrong1[] = new float[100];
    static float modulbiendang1[] = new float[100];
    static float doset[] = new float[100];
    static float hesorong[] = new float[100];
    static float dobaohoa[] = new float[100];
    static double dungtrongdaynoi[] = new double[100];
    static double chieusaucaclopdat[] = new double[100];
    static double mucnuocngam1;

    public DanhGiaDat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tendat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chieuday = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        doam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        gioihannhao = new javax.swing.JTextField();
        asdasd = new javax.swing.JLabel();
        gioihandeo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        gocmasattrong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tytrong = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        modulbiendang = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lucdinhdonvi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dungtrong = new javax.swing.JTextField();
        thongbao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loaidat = new javax.swing.JComboBox<>();
        Danhgia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        mucnuocngam = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đất", "Loại đất", "Chiều dày (m)", "ɣ (g/cm3)", "W (%)", "Wnh (%)", "Wd (%)", "ϕ (độ)", "c (kg/cm2)", "∆", "Eo (kg/cm2)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(80);
        }

        jLabel1.setText("Tên đất");

        jLabel5.setText("Chiều dày (m)");

        chieuday.setDocument(new JTextFieldLimit2(4));

        jLabel6.setText("Độ ẩm W (%)");

        doam.setDocument(new JTextFieldLimit2(6));

        jLabel7.setText("Giới hạn nhão(%)");

        gioihannhao.setDocument(new JTextFieldLimit2(5));

        asdasd.setText("Giới hạn dẻo(%)");

        gioihandeo.setDocument(new JTextFieldLimit2(5));

        jLabel9.setText("Góc ma sát trong ϕ (độ)");

        gocmasattrong.setDocument(new JTextFieldLimit2(4));

        jLabel10.setText("Tỷ trọng ");

        tytrong.setDocument(new JTextFieldLimit2(5));

        jLabel11.setText("Modul biến dạng Eo (kg/cm2)");

        modulbiendang.setDocument(new JTextFieldLimit2(5));

        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        Sua.setText("Sửa");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });

        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        jLabel8.setText("Lực dính đơn vị (kg/cm2)");

        lucdinhdonvi.setDocument(new JTextFieldLimit2(5));

        jLabel12.setText("Dung trọng (g/cm3)");

        dungtrong.setDocument(new JTextFieldLimit2(5));

        thongbao.setForeground(new java.awt.Color(255, 0, 0));
        thongbao.setText("");

        jLabel3.setText("Loại đất");

        loaidat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đất dính", "Đất rời" }));
        loaidat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                loaidatItemStateChanged(evt);
            }
        });

        Danhgia.setText("Tiếp theo");
        Danhgia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanhgiaActionPerformed(evt);
            }
        });

        jLabel4.setText("Mực nước ngầm(m)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(doam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gioihannhao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(asdasd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gioihandeo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(102, 102, 102)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tytrong)
                                    .addComponent(gocmasattrong, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lucdinhdonvi, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(modulbiendang)))
                            .addComponent(thongbao, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sua)
                            .addComponent(them)
                            .addComponent(Xoa)
                            .addComponent(Danhgia, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(49, 49, 49)
                                            .addComponent(tendat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(48, 48, 48)
                                            .addComponent(loaidat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(63, 63, 63)
                                            .addComponent(jLabel5)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(mucnuocngam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(chieuday, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(dungtrong, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tendat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(mucnuocngam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(them)
                    .addComponent(chieuday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(loaidat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dungtrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(Sua))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(doam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(gioihannhao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asdasd)
                        .addComponent(gioihandeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(gocmasattrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(lucdinhdonvi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tytrong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(modulbiendang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Danhgia, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thongbao)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Xoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mucnuocngam.setDocument(new JTextFieldLimit2(4));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (loaidat.getSelectedItem() == "Đất dính") {
            if (!tendat.getText().trim().equals("") && !chieuday.getText().trim().equals("") && !dungtrong.getText().trim().equals("") && !doam.getText().trim().equals("") && !gioihannhao.getText().trim().equals("") && !gioihandeo.getText().trim().equals("") && !gocmasattrong.getText().trim().equals("") && !lucdinhdonvi.getText().trim().equals("") && !tytrong.getText().trim().equals("") && !modulbiendang.getText().trim().equals("")) {
                model.addRow(new Object[]{tendat.getText(), loaidat.getSelectedItem(), chieuday.getText(), dungtrong.getText(), doam.getText(), gioihannhao.getText(), gioihandeo.getText(), gocmasattrong.getText(), lucdinhdonvi.getText(), tytrong.getText(), modulbiendang.getText()});
                thongbao.setText("");
                tendat.setText("");
                chieuday.setText("");
                dungtrong.setText("");
                doam.setText("");
                gioihannhao.setText("");
                gioihandeo.setText("");
                gocmasattrong.setText("");
                lucdinhdonvi.setText("");
                tytrong.setText("");
                modulbiendang.setText("");

            } else {
                thongbao.setText("Phải điền đầy đủ thông tin");
            }
        } else {
            if (!tendat.getText().trim().equals("") && !chieuday.getText().trim().equals("") && !dungtrong.getText().trim().equals("") && !doam.getText().trim().equals("") && !gocmasattrong.getText().trim().equals("") && !lucdinhdonvi.getText().trim().equals("") && !tytrong.getText().trim().equals("") && !modulbiendang.getText().trim().equals("")) {
                model.addRow(new Object[]{tendat.getText(), loaidat.getSelectedItem(), chieuday.getText(), dungtrong.getText(), doam.getText(), 0, 0, gocmasattrong.getText(), lucdinhdonvi.getText(), tytrong.getText(), modulbiendang.getText()});
                tendat.setText("");
                chieuday.setText("");
                dungtrong.setText("");
                doam.setText("");
                gioihannhao.setText("");
                gioihandeo.setText("");
                gocmasattrong.setText("");
                lucdinhdonvi.setText("");
                tytrong.setText("");
                modulbiendang.setText("");
            } else {
                thongbao.setText("Phải điền đầy đủ thông tin");
            }

        }


    }//GEN-LAST:event_themActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                thongbao.setText("Bảng còn trống");
            } else {
                thongbao.setText("Chọn lớp đất cần sửa!!");
            }
        } else {

            model.setValueAt(tendat.getText(), jTable1.getSelectedRow(), 0);
            model.setValueAt(loaidat.getSelectedItem().toString(), jTable1.getSelectedRow(), 1);
            model.setValueAt(chieuday.getText(), jTable1.getSelectedRow(), 2);
            model.setValueAt(dungtrong.getText(), jTable1.getSelectedRow(), 3);
            model.setValueAt(doam.getText(), jTable1.getSelectedRow(), 4);
            model.setValueAt(gioihannhao.getText(), jTable1.getSelectedRow(), 5);
            model.setValueAt(gioihandeo.getText(), jTable1.getSelectedRow(), 6);
            model.setValueAt(gocmasattrong.getText(), jTable1.getSelectedRow(), 7);
            model.setValueAt(lucdinhdonvi.getText(), jTable1.getSelectedRow(), 8);
            model.setValueAt(tytrong.getText(), jTable1.getSelectedRow(), 9);
            model.setValueAt(modulbiendang.getText(), jTable1.getSelectedRow(), 10);

    }//GEN-LAST:event_SuaActionPerformed
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        tendat.setText((String) model.getValueAt(jTable1.getSelectedRow(), 0));
        loaidat.setSelectedItem(model.getValueAt(jTable1.getSelectedRow(), 1));
        chieuday.setText((String) model.getValueAt(jTable1.getSelectedRow(), 2));
        dungtrong.setText((String) model.getValueAt(jTable1.getSelectedRow(), 3));
        doam.setText((String) model.getValueAt(jTable1.getSelectedRow(), 4));
        gioihannhao.setText((String) model.getValueAt(jTable1.getSelectedRow(), 5));
        gioihandeo.setText((String) model.getValueAt(jTable1.getSelectedRow(), 6));
        gocmasattrong.setText((String) model.getValueAt(jTable1.getSelectedRow(), 7));
        lucdinhdonvi.setText((String) model.getValueAt(jTable1.getSelectedRow(), 8));
        tytrong.setText((String) model.getValueAt(jTable1.getSelectedRow(), 9));
        modulbiendang.setText((String) model.getValueAt(jTable1.getSelectedRow(), 10));
    }//GEN-LAST:event_jTable1MouseClicked

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                thongbao.setText("Bảng còn trống");
            } else {
                thongbao.setText("Chọn lớp đất cần Xóa!!");
            }
        } else {
            model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void DanhgiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanhgiaActionPerformed

        m = jTable1.getRowCount() - 1;
        mucnuocngam1 = Float.parseFloat(mucnuocngam.getText());

        for (int i = 0; i <= m; i++) {

            tendat1[i] = jTable1.getValueAt(i, 0).toString();
            loaidat1[i] = jTable1.getValueAt(i, 1).toString();
            chieuday1[i] = Float.parseFloat(jTable1.getValueAt(i, 2).toString());
            dungtrong1[i] = Float.parseFloat(jTable1.getValueAt(i, 3).toString());
            doam1[i] = Float.parseFloat(jTable1.getValueAt(i, 4).toString());
            gioihannhao1[i] = Float.parseFloat(jTable1.getValueAt(i, 5).toString());
            gioihandeo1[i] = Float.parseFloat(jTable1.getValueAt(i, 6).toString());
            gocmasat1[i] = Float.parseFloat(jTable1.getValueAt(i, 7).toString());
            lucdinhdonvi1[i] = Float.parseFloat(jTable1.getValueAt(i, 8).toString());
            tytrong1[i] = Float.parseFloat(jTable1.getValueAt(i, 9).toString());
            modulbiendang1[i] = Float.parseFloat(jTable1.getValueAt(i, 10).toString());

        }
        chieusaucaclopdat[0] = chieuday1[0];
        for (int i = 1; i <= m; i++) {
            chieusaucaclopdat[i] = chieusaucaclopdat[i - 1] + chieuday1[i];
        }

        for (int i = 0; i <= m; i++) {
            if (jTable1.getValueAt(i, 1) == "Đất dính") {
                doset[i] = (doam1[i] - gioihandeo1[i]) / (gioihannhao1[i] - gioihandeo1[i]);
            }
            hesorong[i] = (float) ((tytrong1[i] * 10 * (1 + 0.01 * doam1[i]) / (dungtrong1[i] * 10)) - 1);
            dobaohoa[i] = (float) (0.01 * doam1[i] * tytrong1[i] / hesorong[i]);
            if (jTable1.getValueAt(i, 1) == "Đất rời") {
                doset[i] = (float) 0.2;
            }

        }
        for (int i = 0; i <= m; i++) {
            dungtrongdaynoi[i] = (tytrong1[i] - 1) / (1 + hesorong[i]);
        }

        new Thietkemong().setVisible(true);

    }//GEN-LAST:event_DanhgiaActionPerformed

    private void loaidatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_loaidatItemStateChanged
        if (loaidat.getSelectedItem() == "Đất rời") {
            gioihannhao.disable();
            gioihandeo.disable();

        } else {
            gioihannhao.enable();
            gioihandeo.enable();
        }
    }//GEN-LAST:event_loaidatItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhGiaDat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Danhgia;
    private javax.swing.JButton Sua;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel asdasd;
    private javax.swing.JTextField chieuday;
    private javax.swing.JTextField doam;
    private javax.swing.JTextField dungtrong;
    private javax.swing.JTextField gioihandeo;
    private javax.swing.JTextField gioihannhao;
    private javax.swing.JTextField gocmasattrong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> loaidat;
    private javax.swing.JTextField lucdinhdonvi;
    private javax.swing.JTextField modulbiendang;
    private javax.swing.JTextField mucnuocngam;
    private javax.swing.JTextField tendat;
    private javax.swing.JButton them;
    private javax.swing.JLabel thongbao;
    private javax.swing.JTextField tytrong;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");

    }
}
