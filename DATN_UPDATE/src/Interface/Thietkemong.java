package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;

public class Thietkemong extends javax.swing.JFrame {

    double luccat1, asthepcoc, pmax, qcoc, thepx1, Ascx1, Ascy1, thepy1, pmin, acot1, bcot1, xichmagl, Asx, Asy, moduldaydai, xichmalun, Hnen, xichmamax, xichmamin, xichmatb1, Gdat, Fqu1, Gqu, Rtc1, gocmasatdaydai, dungtrongdaydai, dungtrongtb, lucdinhdaydai, hesom1, bien2, hesom2, bien1, aqu, bqu, gocmasattrungbinh, chieusaumongquyuoc, hesobeta1, ptt, ncoctt, beta, rongdai1, daidai1, hesotincaycongtrinh1, dientichdaitt, hesotincaydat1, Ptk1, suckhangmuicoc1, momen1, lucdoc1, rnenbt, Pvl, Qa, rkeobt, dthepcoc, Rcu, rthepchiuluc, chieusaudat, acoc, rthepdai, chieudaicoc1, chieusaucoc, chieudaicoctrongdat, chieusaucaclopdat, cotthepcoc1, chieusaudedai1, chieucaodaicoc1, adai, bdai;
    int ncocchon, sodiem, soluongthepx1, soluongthepy1;
    static double zi[] = new double[100];
    static double zi2[] = new double[100];
    static double li[] = new double[100];
    static double li2[] = new double[100];
    static double masat[] = new double[100];
    static double xichmabt[] = new double[100];
    static double xichmapt[] = new double[100];
    static double xichmamasat;

    public Thietkemong() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        betong = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        thepchiuluc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        thepdai = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lucdoc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        momen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        luccat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tietdiencoc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cotthepcoc = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        chieudaicoc = new javax.swing.JTextField();
        chieusaudedai = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        chieucaodaicoc = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        acot = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        bcot = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        succhiutaitheovl = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        hesotincaycongtrinh = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        hesotincaydat = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        suckhangmuicoc = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        suchiutaitheodatnen = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Ptk = new javax.swing.JLabel();
        Tính = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        dientichdaitinhtoan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        daidai = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rongdai = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        soluongcoctt = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ncoc = new javax.swing.JTextField();
        try {
            tinhsoluongcoc =(javax.swing.JButton)java.beans.Beans.instantiate(getClass().getClassLoader(), "Interface.Thietkemong_tinhsoluongcoc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel28 = new javax.swing.JLabel();
        hesobeta = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        tinhlun = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        Fqu = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        Rtc = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        xichmatb = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        dolun = new javax.swing.JLabel();
        ketluan = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        Asttx = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        Astty = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        thepx = new javax.swing.JComboBox<>();
        thepy = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        soluongthepx = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        soluongthepy = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        Asxc = new javax.swing.JLabel();
        Asyc = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        moccauvc = new javax.swing.JLabel();
        ktra1 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        moccaucl = new javax.swing.JLabel();
        ktra2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vật liệu"));

        jLabel1.setText("Bê tông");

        betong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B20", "B25", "B30" }));

        jLabel2.setText("Thép chịu lực");

        thepchiuluc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AII", "AIII" }));

        jLabel3.setText("Thép đai");

        thepdai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AI" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(betong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thepchiuluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thepdai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(betong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(thepchiuluc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(thepdai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tải trọng (Tính toán)"));

        jLabel4.setText("N (tấn)");

        lucdoc.setDocument(new JTextFieldLimit2(6));

        jLabel5.setText("M (Tấn.m)");

        momen.setDocument(new JTextFieldLimit2(6));

        jLabel6.setText("Q (tấn)");

        luccat.setDocument(new JTextFieldLimit2(6));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lucdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(momen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(luccat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lucdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(momen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(luccat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thiết kế"));

        jLabel7.setText("Tiết diện cọc (cm2)");

        tietdiencoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25x25", "30x30", "35x35" }));

        jLabel8.setText("Chiều dài cọc (m)");

        jLabel9.setText("Cốt thép dọc");

        cotthepcoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ø16", "Ø18", "Ø20" }));

        jLabel10.setText("Chiều sâu đế đài (m)");

        chieudaicoc.setDocument(new JTextFieldLimit2(3));

        chieusaudedai.setDocument(new JTextFieldLimit2(4));

        jLabel11.setText("Chiều cao đài cọc (m)");

        chieucaodaicoc.setDocument(new JTextFieldLimit2(4));

        jLabel36.setText("Kích thước cột (m)");

        acot.setDocument(new JTextFieldLimit2(4));

        jLabel37.setText("a");

        jLabel38.setText("b");

        bcot.setDocument(new JTextFieldLimit2(4));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chieucaodaicoc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tietdiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cotthepcoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chieudaicoc, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(chieusaudedai)
                            .addComponent(acot)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bcot)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tietdiencoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(chieudaicoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cotthepcoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(chieusaudedai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(chieucaodaicoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(acot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sức chịu tải của cọc"));

        jLabel15.setText("Theo vật liệu");

        succhiutaitheovl.setForeground(new java.awt.Color(51, 51, 255));
        succhiutaitheovl.setText("..........");

        jLabel17.setText("T");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Theo đất nền"));

        jLabel18.setText("Hệ số tin cậy theo cấp công trình");

        hesotincaycongtrinh.setDocument(new JTextFieldLimit2(5));

        jLabel19.setText("Hệ số tin cậy theo đất");

        hesotincaydat.setDocument(new JTextFieldLimit2(3));

        jLabel20.setText("Sức kháng mũi cọc (T/m2)");

        suckhangmuicoc.setDocument(new JTextFieldLimit2(6));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hesotincaycongtrinh, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(hesotincaydat)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(suckhangmuicoc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(hesotincaycongtrinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(hesotincaydat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(suckhangmuicoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel21.setText("Theo đất nền");

        suchiutaitheodatnen.setForeground(new java.awt.Color(0, 102, 204));
        suchiutaitheodatnen.setText("..........");

        jLabel23.setText("T");

        jLabel16.setText("Ptk = min (Pvl,Qa)");

        jLabel22.setText("=");

        Ptk.setForeground(new java.awt.Color(0, 0, 255));
        Ptk.setText("..........");

        Tính.setText("Tính");
        Tính.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TínhActionPerformed(evt);
            }
        });

        jLabel24.setText("T");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(succhiutaitheovl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(29, 29, 29)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(suchiutaitheodatnen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ptk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Tính, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(succhiutaitheovl)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(suchiutaitheodatnen)
                    .addComponent(jLabel23))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(Ptk, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(Tính, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Xác định số lượng cọc"));

        jLabel25.setText("Diện tích đài tối thiểu (m2)");

        dientichdaitinhtoan.setForeground(new java.awt.Color(0, 51, 255));
        dientichdaitinhtoan.setText("..........");

        jLabel12.setText("Kích thước đài cọc (m)");

        jLabel13.setText("a");

        daidai.disable();
        daidai.setDocument(new JTextFieldLimit2(4));

        jLabel14.setText("b");

        rongdai.disable();
        rongdai.setDocument(new JTextFieldLimit2(4));

        jLabel26.setText("Số lượng cọc tính toán");

        soluongcoctt.setForeground(new java.awt.Color(0, 51, 255));
        soluongcoctt.setText("..........");

        jLabel27.setText("Số lượng cọc chọn");

        ncoc.disable();
        ncoc.setDocument(new JTextFieldLimit2(4));

        tinhsoluongcoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhsoluongcocActionPerformed(evt);
            }
        });

        jLabel28.setText("Hệ số β (1~1.5)");

        hesobeta.disable();
        hesobeta.setDocument(new JTextFieldLimit2(4));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel25)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel13))
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel26)
                    .addComponent(jLabel28))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(dientichdaitinhtoan))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rongdai, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(daidai))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tinhsoluongcoc)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(hesobeta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(soluongcoctt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ncoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(dientichdaitinhtoan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(daidai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(rongdai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(hesobeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tinhsoluongcoc, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soluongcoctt)
                    .addComponent(jLabel26)
                    .addComponent(ncoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiểm tra lún"));

        tinhlun.setText("Tính lún");
        tinhlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhlunActionPerformed(evt);
            }
        });

        jLabel29.setText("Diện tích móng khối quy ước (m2)");

        Fqu.setForeground(new java.awt.Color(0, 0, 204));
        Fqu.setText("..........");

        jLabel30.setText("Hệ số m1");

        m1.setDocument(new JTextFieldLimit2(4));

        jLabel31.setText("Hệ số m2");

        m2.setDocument(new JTextFieldLimit2(4));

        jLabel32.setText("Cường độ tính toán của đất dưới móng quy ước (T)");

        Rtc.setForeground(new java.awt.Color(0, 51, 204));
        Rtc.setText("..........");

        jLabel33.setText("Ứng suất trung bình tại đáy móng quy ước (T/m2)");

        xichmatb.setForeground(new java.awt.Color(0, 0, 255));
        xichmatb.setText("..........");

        jLabel34.setText("Độ lún (m)");

        dolun.setForeground(new java.awt.Color(0, 51, 204));
        dolun.setText("..........");

        ketluan.setText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Fqu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tinhlun))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addGap(18, 18, 18)
                                    .addComponent(dolun)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ketluan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xichmatb)
                            .addComponent(Rtc))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(Fqu)))
                    .addComponent(tinhlun, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rtc)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(xichmatb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(dolun)
                    .addComponent(ketluan))
                .addGap(193, 193, 193))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Thép đài cọc"));

        jLabel35.setText("As tính toán theo phương x (cm2)");

        Asttx.setForeground(new java.awt.Color(0, 51, 204));
        Asttx.setText("..........");

        jLabel40.setText("As tính toán theo phương y (cm2)");

        Astty.setForeground(new java.awt.Color(0, 51, 204));
        Astty.setText("..........");

        jLabel42.setText("Chọn thép:");

        jLabel45.setText("Chọn thép:");

        thepx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ø6", "Ø8", "Ø10", "Ø12", "Ø14", "Ø16", "Ø18", "Ø20", "Ø22", "Ø25", "Ø28", "Ø30", "Ø32", "Ø36", "Ø40" }));
        thepx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thepxItemStateChanged(evt);
            }
        });

        thepy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ø6", "Ø8", "Ø10", "Ø12", "Ø14", "Ø16", "Ø18", "Ø20", "Ø22", "Ø25", "Ø28", "Ø30", "Ø32", "Ø36", "Ø40" }));
        thepy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thepyActionPerformed(evt);
            }
        });

        jLabel44.setText("Số lượng");

        soluongthepx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        soluongthepx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                soluongthepxItemStateChanged(evt);
            }
        });

        jLabel47.setText("Số lượng");

        soluongthepy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        soluongthepy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                soluongthepyItemStateChanged(evt);
            }
        });

        jLabel48.setText("As(cm2)");

        jLabel49.setText("As(cm2)");

        Asxc.setText("");

        Asyc.setText("");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thepy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soluongthepy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addGap(18, 18, 18)
                        .addComponent(Asyc))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Asttx))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thepx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel43))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soluongthepx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Asxc))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Astty)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Asttx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(thepx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soluongthepx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(Asxc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Astty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soluongthepy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45)
                        .addComponent(thepy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Asyc)
                        .addComponent(jLabel44)
                        .addComponent(jLabel49)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Vị trí móc cẩu"));

        jLabel39.setText("Khi vận chuyển (m): 2 móc cẩu ");

        moccauvc.setForeground(new java.awt.Color(0, 51, 255));
        moccauvc.setText(".........");

        ktra1.setText("");

        jLabel41.setText("Khi cẩu lắp (m)");

        moccaucl.setForeground(new java.awt.Color(0, 51, 255));
        moccaucl.setText(".........");

        ktra2.setText("");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moccauvc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ktra1))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(moccaucl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ktra2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(moccauvc)
                    .addComponent(ktra1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(moccaucl)
                    .addComponent(ktra2))
                .addContainerGap())
        );

        back.setText("Trở về");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setText("Thoát");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exit)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TínhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TínhActionPerformed
        if (chieudaicoc.getText().equals("") || chieusaudedai.getText().equals("") || acot.getText().equals("") || bcot.getText().equals("") || hesotincaycongtrinh.getText().equals("") || hesotincaydat.getText().equals("") || lucdoc.getText().equals("") || luccat.getText().equals("") || momen.getText().equals("") || suckhangmuicoc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập đầy đủ số liệu tính toán!!!");
        } else {

            if (betong.getSelectedItem() == "B20") {
                rnenbt = 1150;
                rkeobt = 90;
            }
            if (betong.getSelectedItem() == "B25") {
                rnenbt = 1450;
                rkeobt = 105;
            }
            if (betong.getSelectedItem() == "B30") {
                rnenbt = 1700;
                rkeobt = 120;
            }
            if (thepchiuluc.getSelectedItem() == "AII") {
                rthepchiuluc = 28000;
            }
            if (thepchiuluc.getSelectedItem() == "AIII") {
                rthepchiuluc = 35500;
            }
            rthepdai = 17500;
            lucdoc1 = Double.parseDouble(lucdoc.getText()) / 1.2;
            momen1 = Double.parseDouble(momen.getText()) / 1.2;
            luccat1 = Double.parseDouble(luccat.getText()) / 1.2;
            if (tietdiencoc.getSelectedItem() == "25x25") {
                acoc = 0.25;
            }
            if (tietdiencoc.getSelectedItem() == "30x30") {
                acoc = 0.3;
            }
            if (tietdiencoc.getSelectedItem() == "35x35") {
                acoc = 0.35;
            }
            if (cotthepcoc.getSelectedItem() == "Ø16") {
                dthepcoc = 0.016;
                asthepcoc = 2.01;
            }
            if (cotthepcoc.getSelectedItem() == "Ø18") {
                dthepcoc = 0.018;
                asthepcoc = 2.54;
            }
            if (cotthepcoc.getSelectedItem() == "Ø20") {
                dthepcoc = 0.02;
                asthepcoc = 3.14;
            }

            chieudaicoc1 = Double.parseDouble(chieudaicoc.getText());
            chieusaudedai1 = Double.parseDouble(chieusaudedai.getText());
            hesotincaycongtrinh1 = Double.parseDouble(hesotincaycongtrinh.getText());
            hesotincaydat1 = Double.parseDouble(hesotincaydat.getText());
            suckhangmuicoc1 = Double.parseDouble(suckhangmuicoc.getText());
            chieusaudat = 0;
            for (int i = 0; i <= DanhGiaDat.m; i++) {
                chieusaudat = chieusaudat + DanhGiaDat.chieuday1[i];
            }
            chieudaicoctrongdat = chieudaicoc1 - 0.5;
            int o = (int) (chieudaicoctrongdat / 0.5);
            li[0] = 0;

            int j = 0;
            for (int i = 1; i <= o;) {

                li[i] = li[i - 1] + 0.5;
                zi[i] = li[i] + chieusaudedai1;
                if (zi[i] <= DanhGiaDat.chieusaucaclopdat[j]) {
                    masat[i] = (Tinhtoan.noisuy2(Tinhtoan.zi, Tinhtoan.b, Tinhtoan.fi, zi[i], DanhGiaDat.doset[j])) * 0.5;
                    i++;
                } else {
                    j++;
                }
            }
            xichmamasat = 0;
            for (int i = 0; i <= o; i++) {
                xichmamasat = xichmamasat + masat[i];
            }
            xichmamasat = xichmamasat / 10;
            Pvl = Tinhtoan.round((rnenbt * acoc * acoc + rthepchiuluc * 3.14 * dthepcoc * dthepcoc), 2);
            succhiutaitheovl.setText(Double.toString(Pvl));

            Rcu = suckhangmuicoc1 * acoc * acoc + 2 * (acoc + acoc) * xichmamasat;
            Qa = Tinhtoan.round((1.15 / hesotincaycongtrinh1) * (Rcu / hesotincaydat1) - (1.1 * chieudaicoctrongdat * acoc * acoc * 2.5), 2);
            suchiutaitheodatnen.setText(Double.toString(Qa));
            Ptk1 = Tinhtoan.min(Qa, Pvl);
            Ptk.setText(Double.toString(Ptk1));
            dientichdaitt = Tinhtoan.round((lucdoc1 * 1.2 / ((((Ptk1 / (3 * 3 * acoc * acoc)))) - 2.1 * chieusaudedai1 * 1.2)), 2);
            dientichdaitinhtoan.setText(Double.toString(dientichdaitt));
            daidai.enable();
            rongdai.enable();
            hesobeta.enable();
    }//GEN-LAST:event_TínhActionPerformed
    }

    private void tinhsoluongcocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhsoluongcocActionPerformed
        if (daidai.getText().equals("") || rongdai.getText().equals("") || hesobeta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập đầy đủ số liệu tính toán!!!");
        } else {
            ncoc.enable();
            daidai1 = Double.parseDouble(daidai.getText());
            rongdai1 = Double.parseDouble(rongdai.getText());
            beta = Double.parseDouble(hesobeta.getText());
            if (daidai1 * rongdai1 < dientichdaitt) {
                JOptionPane.showMessageDialog(this, "Tăng diện tích đài cọc!!!");
            } else {
                ncoctt = Tinhtoan.round((beta * (lucdoc1 * 1.2 + 1.2 * daidai1 * rongdai1 * chieusaudedai1 * 2.1) / Ptk1), 2);
                soluongcoctt.setText(Double.toString(ncoctt));
            }
        }
    }//GEN-LAST:event_tinhsoluongcocActionPerformed

    private void tinhlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinhlunActionPerformed
        if (ncoc.getText().equals("") || m1.getText().equals("") || m2.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập đầy đủ số liệu tính toán!!!");
        } else {
            ncocchon = (int) Double.parseDouble(ncoc.getText());
            chieusaumongquyuoc = chieudaicoctrongdat + chieusaudedai1;
            gocmasattrungbinh = 0;
            bien1 = 0;
            hesom1 = Double.parseDouble(m1.getText());
            hesom2 = Double.parseDouble(m2.getText());

            if (chieusaumongquyuoc <= chieusaudat) {
                for (int i = 0; i <= DanhGiaDat.m; i++) {
                    if (i == 0) {
                        bien1 = bien1 + DanhGiaDat.gocmasat1[i] * (DanhGiaDat.chieuday1[i] - chieusaudedai1);
                    }
                    if (i == DanhGiaDat.m) {
                        bien1 = bien1 + DanhGiaDat.gocmasat1[i] * (chieusaumongquyuoc - Tinhtoan.chieusau(DanhGiaDat.chieuday1, i - 1));
                    }
                    if (i != 0 && i != DanhGiaDat.m) {
                        bien1 = bien1 + DanhGiaDat.gocmasat1[i] * DanhGiaDat.chieuday1[i];
                    }
                }

            }
            gocmasattrungbinh = bien1 / chieudaicoctrongdat;
            aqu = daidai1 - acoc + 2 * chieudaicoctrongdat * Math.tan(((3.14 / 180) * gocmasattrungbinh / 4));
            bqu = rongdai1 - acoc + 2 * chieudaicoctrongdat * Math.tan(((3.14 / 180) * gocmasattrungbinh / 4));
            Fqu1 = Tinhtoan.round(aqu * bqu, 2);
            Fqu.setText(Double.toString(Fqu1));
            bien2 = 0;
            for (int i = 0; i <= DanhGiaDat.m; i++) {

                if (DanhGiaDat.chieusaucaclopdat[i] <= DanhGiaDat.mucnuocngam1) {
                    bien2 = bien2 + DanhGiaDat.chieuday1[i] * DanhGiaDat.dungtrong1[i];

                } else {
                    if (i == DanhGiaDat.m) {
                        bien2 = bien2 + DanhGiaDat.dungtrongdaynoi[i] * (chieusaumongquyuoc - Tinhtoan.chieusau(DanhGiaDat.chieuday1, i - 1));
                    }
                    if (i != DanhGiaDat.m) {
                        bien2 = bien2 + DanhGiaDat.dungtrongdaynoi[i] * DanhGiaDat.chieuday1[i];
                    }

                }

            }
            dungtrongtb = bien2 / chieusaumongquyuoc;
            for (int i = 0; i <= DanhGiaDat.m; i++) {
                if (DanhGiaDat.chieusaucaclopdat[i] > chieusaumongquyuoc) {
                    lucdinhdaydai = DanhGiaDat.lucdinhdonvi1[i];
                    moduldaydai = DanhGiaDat.modulbiendang1[i];
                }
                gocmasatdaydai = DanhGiaDat.gocmasat1[i];
                if (DanhGiaDat.chieusaucaclopdat[i] <= DanhGiaDat.mucnuocngam1) {
                    dungtrongdaydai = DanhGiaDat.dungtrong1[i];
                } else {
                    dungtrongdaydai = DanhGiaDat.dungtrongdaynoi[i];
                }
            }
            Rtc1 = Tinhtoan.round(hesom1 * hesom2 * (Tinhtoan.noisuy1(Tinhtoan.gocmasat, Tinhtoan.A, gocmasatdaydai) * bqu * dungtrongdaydai + Tinhtoan.noisuy1(Tinhtoan.gocmasat, Tinhtoan.B, gocmasatdaydai) * chieusaumongquyuoc * dungtrongtb + Tinhtoan.noisuy1(Tinhtoan.gocmasat, Tinhtoan.D, gocmasatdaydai) * lucdinhdaydai), 2);

            Rtc.setText(Double.toString(Rtc1));
            int u = (int) (chieusaumongquyuoc / 0.5);
            li2[0] = 0;
            int k = 0;
            Gdat = 0;
            for (int i = 1; i <= u;) {
                li2[i] = li2[i - 1] + 0.5;
                if (li2[i] <= chieusaudedai1) {
                    Gdat = Gdat + Fqu1 * 0.5 * 2.1;
                    i++;
                } else {
                    if (li2[i] <= DanhGiaDat.chieusaucaclopdat[k]) {
                        if (li2[i] <= DanhGiaDat.mucnuocngam1) {
                            Gdat = Gdat + (Fqu1 * 0.5 - acoc * acoc * ncocchon * 0.5) * DanhGiaDat.dungtrong1[k];
                        } else {
                            Gdat = Gdat + (Fqu1 * 0.5 - acoc * acoc * ncocchon * 0.5) * DanhGiaDat.dungtrongdaynoi[k];
                        }
                        i++;
                    } else {
                        k++;
                    }
                }

            }
            Gqu = Tinhtoan.round((Gdat + chieudaicoctrongdat * acoc * acoc * 2.5 * 4), 2);
            xichmamax = (lucdoc1 + Gqu) / Fqu1 + (momen1 + luccat1 * chieusaumongquyuoc) / (aqu * bqu * bqu / 6);
            xichmamin = (lucdoc1 + Gqu) / Fqu1 - (momen1 + luccat1 * chieusaumongquyuoc) / (aqu * bqu * bqu / 6);
            xichmatb1 = Tinhtoan.round((xichmamax + xichmamin) / 2, 2);
            if (xichmamax < 1.2 * Rtc1 && xichmatb1 < Rtc1) {
                xichmatb.setText(Double.toString(xichmatb1));
                xichmagl = xichmatb1 - dungtrongtb * chieusaumongquyuoc;
                zi2[0] = 0;
                for (int i = 0; i <= 100;) {
                    xichmabt[i] = dungtrongtb * chieusaumongquyuoc + dungtrongdaydai * zi2[i];
                    xichmapt[i] = Tinhtoan.noisuy2(Tinhtoan.z_b, Tinhtoan.a_b, Tinhtoan.k0, 2 * zi2[i] / bqu, 1) * xichmagl;
                    if (xichmapt[i] <= 0.2 * xichmabt[i]) {
                        Hnen = zi2[i];
                        sodiem = i;
                        break;
                    } else {
                        zi2[i + 1] = zi2[i] + 1;
                        i++;

                    }

                }
                xichmalun = 0;
                for (int i = 0; i <= sodiem; i++) {

                    xichmalun = xichmalun + (0.8 / (moduldaydai * 10)) * xichmapt[i] * 1;

                }
                dolun.setText(Double.toString(Tinhtoan.round(xichmalun, 4)));
                if (xichmalun < 0.1) {
                    ketluan.setText("Thỏa mãn điều kiện lún");
                    ketluan.setForeground(Color.GREEN);
                } else {
                    ketluan.setText("Độ lún lớn hơn giới hạn cho phép!!!");
                    ketluan.setForeground(Color.RED);
                }
                acot1 = Double.parseDouble(acot.getText());
                bcot1 = Double.parseDouble(bcot.getText());
                chieucaodaicoc1 = Double.parseDouble(chieucaodaicoc.getText());
                pmax = (lucdoc1 * 1.2 + 1.2 * daidai1 * rongdai1 * chieusaudedai1 * 2.1) / ncocchon + ((momen1 * 1.2 + luccat1 * 1.2 * chieusaudedai1) * ((daidai1 / 2) - 0.3)) / (ncocchon * ((daidai1 / 2) - 0.3) * ((daidai1 / 2) - 0.3));
                pmin = (lucdoc1 * 1.2 + 1.2 * daidai1 * rongdai1 * chieusaudedai1 * 2.1) / ncocchon - ((momen1 * 1.2 + luccat1 * 1.2 * chieusaudedai1) * ((daidai1 / 2) - 0.3)) / (ncocchon * ((daidai1 / 2) - 0.3) * ((daidai1 / 2) - 0.3));
                Asx = Tinhtoan.round((((daidai1 / 2 - acot1 / 2 - 0.3) * 2 * pmax) / (0.9 * chieucaodaicoc1 * rthepchiuluc)) * 10000, 2);
                Asy = Tinhtoan.round((((rongdai1 / 2 - bcot1 / 2 - 0.3) * (pmax + pmin)) / (0.9 * chieucaodaicoc1 * rthepchiuluc)) * 10000, 2);
                Asttx.setText(Double.toString(Asx));
                Astty.setText(Double.toString(Asy));

                moccauvc.setText(Double.toString(Tinhtoan.round(0.207 * chieudaicoc1, 2)));
                qcoc = 1.2 * 25 * acoc * acoc;
                if (((0.043 * qcoc * chieudaicoc1 * chieudaicoc1) / (0.9 * rthepchiuluc * (acoc - 0.05))) <= 4 * asthepcoc) {
                    ktra1.setText("Thỏa");
                    ktra1.setForeground(Color.GREEN);
                } else {
                    ktra1.setText("Không thỏa");
                    ktra1.setForeground(Color.RED);
                }
                if (((0.086 * qcoc * chieudaicoc1 * chieudaicoc1) / (0.9 * rthepchiuluc * (acoc - 0.05))) <= 4 * asthepcoc) {
                    ktra2.setText("Thỏa");
                    ktra2.setForeground(Color.GREEN);
                } else {
                    ktra2.setText("Không thỏa!!");
                    ktra2.setForeground(Color.RED);
                }
                if (chieudaicoc1 < 8) {
                    moccaucl.setText("Không cần bố trí");

                } else {
                    moccaucl.setText(Double.toString(Tinhtoan.round(0.294 * chieudaicoc1, 2)));
                }

            } else {
                JOptionPane.showMessageDialog(this, "Không thỏa điều kiện, chọn lại kích thước đáy móng!!");
            }
        }
    }//GEN-LAST:event_tinhlunActionPerformed

    private void soluongthepxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_soluongthepxItemStateChanged
        if (soluongthepx.getSelectedItem() == "1") {
            soluongthepx1 = 1;
        }
        if (soluongthepx.getSelectedItem() == "2") {
            soluongthepx1 = 2;
        }
        if (soluongthepx.getSelectedItem() == "3") {
            soluongthepx1 = 3;
        }
        if (soluongthepx.getSelectedItem() == "4") {
            soluongthepx1 = 4;
        }
        if (soluongthepx.getSelectedItem() == "5") {
            soluongthepx1 = 5;
        }
        if (soluongthepx.getSelectedItem() == "6") {
            soluongthepx1 = 6;
        }
        if (soluongthepx.getSelectedItem() == "7") {
            soluongthepx1 = 7;
        }
        if (soluongthepx.getSelectedItem() == "8") {
            soluongthepx1 = 8;
        }
        if (soluongthepx.getSelectedItem() == "9") {
            soluongthepx1 = 9;
        }
        if (soluongthepx.getSelectedItem() == "10") {
            soluongthepx1 = 10;
        }

        Ascx1 = Tinhtoan.round(thepx1 * soluongthepx1, 2);
        Asxc.setText(Double.toString(Ascx1));
        if (Ascx1 < Asx) {
            Asxc.setForeground(Color.RED);
        } else {
            Asxc.setForeground(Color.GREEN);
        }

    }//GEN-LAST:event_soluongthepxItemStateChanged

    private void thepyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thepyActionPerformed
        if (thepy.getSelectedItem() == "Ø6") {
            thepy1 = 0.283;
        }
        if (thepy.getSelectedItem() == "Ø8") {
            thepy1 = 0.503;
        }
        if (thepy.getSelectedItem() == "Ø10") {
            thepy1 = 0.785;
        }
        if (thepy.getSelectedItem() == "Ø12") {
            thepy1 = 1.13;
        }
        if (thepy.getSelectedItem() == "Ø14") {
            thepy1 = 1.54;
        }
        if (thepy.getSelectedItem() == "Ø16") {
            thepy1 = 2.01;
        }
        if (thepy.getSelectedItem() == "Ø18") {
            thepy1 = 2.54;
        }
        if (thepy.getSelectedItem() == "Ø20") {
            thepy1 = 3.14;
        }
        if (thepy.getSelectedItem() == "Ø22") {
            thepy1 = 3.81;
        }
        if (thepy.getSelectedItem() == "Ø25") {
            thepy1 = 4.91;
        }
        if (thepy.getSelectedItem() == "Ø28") {
            thepy1 = 6.15;
        }
        if (thepy.getSelectedItem() == "Ø30") {
            thepy1 = 7.07;
        }
        if (thepy.getSelectedItem() == "Ø32") {
            thepy1 = 8.04;
        }
        if (thepy.getSelectedItem() == "Ø36") {
            thepy1 = 10.18;
        }
        if (thepy.getSelectedItem() == "Ø40") {
            thepy1 = 12.56;
        }

        Ascy1 = Tinhtoan.round(thepy1 * soluongthepy1, 2);
        Asyc.setText(Double.toString(Ascy1));
        if (Ascy1 < Asy) {
            Asyc.setForeground(Color.RED);
        } else {
            Asyc.setForeground(Color.GREEN);
        }
    }//GEN-LAST:event_thepyActionPerformed

    private void thepxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_thepxItemStateChanged
        if (thepx.getSelectedItem() == "Ø6") {
            thepx1 = 0.283;
        }
        if (thepx.getSelectedItem() == "Ø8") {
            thepx1 = 0.503;
        }
        if (thepx.getSelectedItem() == "Ø10") {
            thepx1 = 0.785;
        }
        if (thepx.getSelectedItem() == "Ø12") {
            thepx1 = 1.13;
        }
        if (thepx.getSelectedItem() == "Ø14") {
            thepx1 = 1.54;
        }
        if (thepx.getSelectedItem() == "Ø16") {
            thepx1 = 2.01;
        }
        if (thepx.getSelectedItem() == "Ø18") {
            thepx1 = 2.54;
        }
        if (thepx.getSelectedItem() == "Ø20") {
            thepx1 = 3.14;
        }
        if (thepx.getSelectedItem() == "Ø22") {
            thepx1 = 3.81;
        }
        if (thepx.getSelectedItem() == "Ø25") {
            thepx1 = 4.91;
        }
        if (thepx.getSelectedItem() == "Ø28") {
            thepx1 = 6.15;
        }
        if (thepx.getSelectedItem() == "Ø30") {
            thepx1 = 7.07;
        }
        if (thepx.getSelectedItem() == "Ø32") {
            thepx1 = 8.04;
        }
        if (thepx.getSelectedItem() == "Ø36") {
            thepx1 = 10.18;
        }
        if (thepx.getSelectedItem() == "Ø40") {
            thepx1 = 12.56;
        }

        Ascx1 = Tinhtoan.round(thepx1 * soluongthepx1, 2);
        Asxc.setText(Double.toString(Ascx1));
        if (Ascx1 < Asx) {
            Asxc.setForeground(Color.RED);

        } else {
            Asxc.setForeground(Color.GREEN);
        }

    }//GEN-LAST:event_thepxItemStateChanged

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void soluongthepyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_soluongthepyItemStateChanged
        if (soluongthepy.getSelectedItem() == "1") {
            soluongthepy1 = 1;
        }
        if (soluongthepy.getSelectedItem() == "2") {
            soluongthepy1 = 2;
        }
        if (soluongthepy.getSelectedItem() == "3") {
            soluongthepy1 = 3;
        }
        if (soluongthepy.getSelectedItem() == "4") {
            soluongthepy1 = 4;
        }
        if (soluongthepy.getSelectedItem() == "5") {
            soluongthepy1 = 5;
        }
        if (soluongthepy.getSelectedItem() == "6") {
            soluongthepy1 = 6;
        }
        if (soluongthepy.getSelectedItem() == "7") {
            soluongthepy1 = 7;
        }
        if (soluongthepy.getSelectedItem() == "8") {
            soluongthepy1 = 8;
        }
        if (soluongthepy.getSelectedItem() == "9") {
            soluongthepy1 = 9;
        }
        if (soluongthepy.getSelectedItem() == "10") {
            soluongthepy1 = 10;
        }
        Ascy1 = Tinhtoan.round(thepy1 * soluongthepy1, 2);
        Asyc.setText(Double.toString(Ascy1));
        if (Ascy1 < Asy) {
            Asyc.setForeground(Color.RED);
        } else {
            Asyc.setForeground(Color.GREEN);
        }
    }//GEN-LAST:event_soluongthepyItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asttx;
    private javax.swing.JLabel Astty;
    private javax.swing.JLabel Asxc;
    private javax.swing.JLabel Asyc;
    private javax.swing.JLabel Fqu;
    private javax.swing.JLabel Ptk;
    private javax.swing.JLabel Rtc;
    private javax.swing.JButton Tính;
    private javax.swing.JTextField acot;
    private javax.swing.JButton back;
    private javax.swing.JTextField bcot;
    private javax.swing.JComboBox<String> betong;
    private javax.swing.JTextField chieucaodaicoc;
    private javax.swing.JTextField chieudaicoc;
    private javax.swing.JTextField chieusaudedai;
    private javax.swing.JComboBox<String> cotthepcoc;
    private javax.swing.JTextField daidai;
    private javax.swing.JLabel dientichdaitinhtoan;
    private javax.swing.JLabel dolun;
    private javax.swing.JButton exit;
    private javax.swing.JTextField hesobeta;
    private javax.swing.JTextField hesotincaycongtrinh;
    private javax.swing.JTextField hesotincaydat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel ketluan;
    private javax.swing.JLabel ktra1;
    private javax.swing.JLabel ktra2;
    private javax.swing.JTextField luccat;
    private javax.swing.JTextField lucdoc;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JLabel moccaucl;
    private javax.swing.JLabel moccauvc;
    private javax.swing.JTextField momen;
    private javax.swing.JTextField ncoc;
    private javax.swing.JTextField rongdai;
    private javax.swing.JLabel soluongcoctt;
    private javax.swing.JComboBox<String> soluongthepx;
    private javax.swing.JComboBox<String> soluongthepy;
    private javax.swing.JLabel succhiutaitheovl;
    private javax.swing.JLabel suchiutaitheodatnen;
    private javax.swing.JTextField suckhangmuicoc;
    private javax.swing.JComboBox<String> thepchiuluc;
    private javax.swing.JComboBox<String> thepdai;
    private javax.swing.JComboBox<String> thepx;
    private javax.swing.JComboBox<String> thepy;
    private javax.swing.JComboBox<String> tietdiencoc;
    private javax.swing.JButton tinhlun;
    private javax.swing.JButton tinhsoluongcoc;
    private javax.swing.JLabel xichmatb;
    // End of variables declaration//GEN-END:variables
}
