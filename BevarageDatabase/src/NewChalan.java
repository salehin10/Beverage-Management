
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class NewChalan extends javax.swing.JFrame {

  String string ;
  int add7up2LT,add7up1LT,add7up500mlT,add7up250mlpetT,add7up250mlglassT,add7up200mlglassT,add7up250mlcanT;
  int addPsi2LT,addPsi1LT,addPsi500mlT,addPsi500mldietT,addPsi250mlpetT,addPsi250mlglassT,addPsi200mlglassT,addPsi400mlT,addPsi250mlcanT;
  int addMda1LT,addMda500mlT,addMda250mlpetT,addMda200mlglassT,addMda250mlcanT;
  int addDew500mlT,addDew250mlpetT,addDew400mlT,addDew200mlglassT,addDew250mlcanT;
  int addAqa1500mlT,addAqa500mlT;
  int addSlice250mlglassT;
  int ID = 1;
  int count = 0 ;
  String date ;
  int chalanItemCost = 0;
  int labourCost = 0;
  
    public NewChalan() {
        initComponents();
        setLocationRelativeTo(null);
         DateFormat df = new SimpleDateFormat("dd/MM/yy");
                    Calendar calobj = Calendar.getInstance();
                    dateLabel.setText("         "+df.format(calobj.getTime()));
                    date ="'"+df.format(calobj.getTime())+"'";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        add7up2L = new javax.swing.JTextField();
        add7up1L = new javax.swing.JTextField();
        add7up500ml = new javax.swing.JTextField();
        add7up250mlpet = new javax.swing.JTextField();
        add7up250mlglass = new javax.swing.JTextField();
        add7up200mlglass = new javax.swing.JTextField();
        add7up250mlcan = new javax.swing.JTextField();
        addPsi2L = new javax.swing.JTextField();
        addPsi1L = new javax.swing.JTextField();
        addPsi500ml = new javax.swing.JTextField();
        addPsi250mlpet = new javax.swing.JTextField();
        addPsi500mldiet = new javax.swing.JTextField();
        addPsi250mlglass = new javax.swing.JTextField();
        addPsi200mlglass = new javax.swing.JTextField();
        addPsi400ml = new javax.swing.JTextField();
        addPsi250mlcan = new javax.swing.JTextField();
        addMda1L = new javax.swing.JTextField();
        addMda500ml = new javax.swing.JTextField();
        addMda250mlpet = new javax.swing.JTextField();
        addMda200mlglass = new javax.swing.JTextField();
        addMda250mlcan = new javax.swing.JTextField();
        addDew250mlpet = new javax.swing.JTextField();
        addDew500ml = new javax.swing.JTextField();
        addDew200mlglass = new javax.swing.JTextField();
        addDew400ml = new javax.swing.JTextField();
        addDew250mlcan = new javax.swing.JTextField();
        addAqa1500ml = new javax.swing.JTextField();
        addAqa500ml = new javax.swing.JTextField();
        addSlice250mlglass = new javax.swing.JTextField();
        addStockButton = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        totalCaseTextField = new javax.swing.JTextField();
        chalanCheckButton = new javax.swing.JButton();
        chalanLabourCostButton = new javax.swing.JButton();
        labourCostTextfield = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        totalCasePriceTextfield = new javax.swing.JTextField();
        totalCasePriceButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        dateLabel = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("                                  Chalan ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("7up 2L :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("7up 1L :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("7up 500ml :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("7up 250ml pet :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("7up 250ml glass :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("7up 200ml glass :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("7up 250ml can :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Pepsi 2L :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Pepsi 1L :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Pepsi 500ml :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Pepsi 500ml diet :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Pepsi 250ml pet :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Pepsi 250ml glass :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Pepsi 200ml glass :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Pepsi 400ml :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Pepsi 250ml can :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Mirinda 1L :  ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Mirinda 500ml :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Mirinda 250ml pet :");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Mirinda 200ml glass :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Mirinda 250ml can :");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Dew 500ml :");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Dew 250ml pet :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Dew 200ml glass :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Dew 400ml :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Dew 250ml can : ");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Aquafina 1500ml :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Aquafina 500ml :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Slice 250ml glass :");

        add7up2L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up2L.setText("0");
        add7up2L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add7up2LActionPerformed(evt);
            }
        });

        add7up1L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up1L.setText("0");

        add7up500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up500ml.setText("0");

        add7up250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up250mlpet.setText("0");

        add7up250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up250mlglass.setText("0");

        add7up200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up200mlglass.setText("0");

        add7up250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add7up250mlcan.setText("0");

        addPsi2L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi2L.setText("0");

        addPsi1L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi1L.setText("0");

        addPsi500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi500ml.setText("0");

        addPsi250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi250mlpet.setText("0");

        addPsi500mldiet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi500mldiet.setText("0");

        addPsi250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi250mlglass.setText("0");

        addPsi200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi200mlglass.setText("0");

        addPsi400ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi400ml.setText("0");

        addPsi250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addPsi250mlcan.setText("0");

        addMda1L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addMda1L.setText("0");

        addMda500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addMda500ml.setText("0");

        addMda250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addMda250mlpet.setText("0");

        addMda200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addMda200mlglass.setText("0");

        addMda250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addMda250mlcan.setText("0");

        addDew250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addDew250mlpet.setText("0");

        addDew500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addDew500ml.setText("0");

        addDew200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addDew200mlglass.setText("0");

        addDew400ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addDew400ml.setText("0");

        addDew250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addDew250mlcan.setText("0");

        addAqa1500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addAqa1500ml.setText("0");

        addAqa500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addAqa500ml.setText("0");

        addSlice250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addSlice250mlglass.setText("0");

        addStockButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addStockButton.setText("Add to Stock  ");
        addStockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStockButtonActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Total Case :");

        totalCaseTextField.setEditable(false);
        totalCaseTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        chalanCheckButton.setText("check");
        chalanCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chalanCheckButtonActionPerformed(evt);
            }
        });

        chalanLabourCostButton.setText("Enter");
        chalanLabourCostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chalanLabourCostButtonActionPerformed(evt);
            }
        });

        labourCostTextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Labour Cost(Tk):");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Total Case Price(Tk) :");

        totalCasePriceTextfield.setEditable(false);
        totalCasePriceTextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        totalCasePriceButton.setText("check");
        totalCasePriceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCasePriceButtonActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Date :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(add7up500ml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add7up1L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add7up2L, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addMda1L)
                                    .addComponent(addMda500ml)
                                    .addComponent(addMda250mlpet)
                                    .addComponent(addMda200mlglass)
                                    .addComponent(addMda250mlcan)
                                    .addComponent(addDew500ml)
                                    .addComponent(addDew250mlpet)
                                    .addComponent(addDew200mlglass)
                                    .addComponent(addDew400ml)
                                    .addComponent(addDew250mlcan, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(addAqa1500ml)
                                    .addComponent(addAqa500ml)
                                    .addComponent(addSlice250mlglass)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addPsi400ml, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                        .addComponent(addPsi200mlglass)
                                        .addComponent(addPsi250mlglass)
                                        .addComponent(addPsi250mlpet)
                                        .addComponent(addPsi500mldiet)
                                        .addComponent(addPsi500ml)
                                        .addComponent(addPsi1L)
                                        .addComponent(addPsi2L)
                                        .addComponent(add7up250mlcan)
                                        .addComponent(add7up200mlglass)
                                        .addComponent(add7up250mlglass)
                                        .addComponent(add7up250mlpet))
                                    .addComponent(addPsi250mlcan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(addStockButton))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(totalCaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chalanCheckButton))
                                .addComponent(jLabel33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(totalCasePriceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalCasePriceButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labourCostTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32))
                                        .addGap(18, 18, 18)
                                        .addComponent(chalanLabourCostButton))))
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add7up2L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(add7up1L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(add7up500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(add7up250mlpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalCaseTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chalanCheckButton)
                        .addComponent(add7up250mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(add7up200mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(add7up250mlcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chalanLabourCostButton)
                        .addComponent(labourCostTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addPsi2L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalCasePriceTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalCasePriceButton))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(addPsi1L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(addPsi500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(addPsi500mldiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addPsi250mlpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPsi250mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(addPsi200mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(addPsi400ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(addPsi250mlcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(addMda1L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(addMda500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(addMda250mlpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(addMda200mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(addMda250mlcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(addDew500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(addDew250mlpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(addDew200mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(addDew400ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(addDew250mlcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(addAqa1500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(addAqa500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(addSlice250mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addStockButton))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add7up2LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add7up2LActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add7up2LActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void addStockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStockButtonActionPerformed
            //newchalan 7up
             int check = 1;
            try{
            add7up2LT =  Integer.parseInt(add7up2L.getText());
            add7up1LT =  Integer.parseInt(add7up1L.getText());
            add7up500mlT = Integer.parseInt(add7up500ml.getText());
            add7up250mlpetT = Integer.parseInt(add7up250mlpet.getText());
            add7up250mlglassT = Integer.parseInt(add7up250mlglass.getText());
            add7up200mlglassT = Integer.parseInt(add7up200mlglass.getText());
            add7up250mlcanT = Integer.parseInt(add7up250mlcan.getText());
            
            //newchalan Pepsi
              addPsi2LT = Integer.parseInt(addPsi2L.getText());
              addPsi1LT = Integer.parseInt(addPsi1L.getText());
              addPsi500mlT =Integer.parseInt(addPsi500ml.getText());
              addPsi500mldietT =Integer.parseInt(addPsi500mldiet.getText());
              addPsi250mlpetT =  Integer.parseInt(addPsi250mlpet.getText());
              addPsi250mlglassT =Integer.parseInt(addPsi250mlglass.getText());
              addPsi200mlglassT =Integer.parseInt(addPsi200mlglass.getText());
              addPsi400mlT =Integer.parseInt(addPsi400ml.getText());
              addPsi250mlcanT =Integer.parseInt(addPsi250mlcan.getText());
              
              //newchalan mirinda
              addMda1LT=Integer.parseInt(addMda1L.getText());
              addMda500mlT=Integer.parseInt(addMda500ml.getText());
              addMda250mlpetT=Integer.parseInt(addMda250mlpet.getText());
              addMda200mlglassT=Integer.parseInt(addMda200mlglass.getText());
              addMda250mlcanT=Integer.parseInt(addMda250mlcan.getText());
              //new chalan for Dew
              
              addDew500mlT = Integer.parseInt(addDew500ml.getText());
              addDew250mlpetT =Integer.parseInt(addDew250mlpet.getText());
              addDew200mlglassT =Integer.parseInt(addDew200mlglass.getText());
              addDew400mlT =Integer.parseInt(addDew400ml.getText());
              addDew250mlcanT =Integer.parseInt(addDew250mlcan.getText());
              // new chalan for Aquafina 
              addAqa1500mlT = Integer.parseInt(addAqa1500ml.getText());
              addAqa500mlT = Integer.parseInt(addAqa500ml.getText());
              // new chalan for Slice 
              addSlice250mlglassT = Integer.parseInt(addSlice250mlglass.getText());
              count =add7up2LT+add7up1LT+add7up500mlT+add7up250mlpetT+add7up250mlglassT+add7up200mlglassT+add7up250mlcanT+addPsi2LT+addPsi1LT+addPsi500mlT+addPsi500mldietT+addPsi250mlpetT+addPsi250mlglassT+addPsi200mlglassT+addPsi400mlT+addPsi250mlcanT+addMda1LT+addMda500mlT+addMda250mlpetT+addMda200mlglassT+addMda250mlcanT+addDew500mlT+addDew250mlpetT+addDew400mlT+addDew200mlglassT+addDew250mlcanT+addSlice250mlglassT+addAqa1500mlT+addAqa500mlT;

            }catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Please check your box inputs are correct");
                check = 0;
            }
            if(check==1){
            try{
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BevarageDatabase;integratedSecurity=true");  
             Statement statement  = connection.createStatement();
            // ResultSet result7up =  statement.executeQuery("select sUp2L,sUp1L,sUp500ml,sUp250Pet,sUp250mlGlass,sUp200mlGlass,sUp250mlCan from sUp");
             //ResultSet resultPepsi =  statement.executeQuery("select Psi2L,Psi1L,Psi500ml,Psi500mlDiet,Psi250mlPet,Psi250mlGlass,Psi200mlGlass,Psi400ml,Psi250mlCan from Pepsi");
             ResultSet stockResultsUp= statement.executeQuery("select sUp2L,sUp1L,sUp500ml,sUp250pet,sUp250mlGlass,sUp200mlGlass,sUp250mlCan from sUp");
             while(stockResultsUp.next()){
                  
                 add7up2LT=add7up2LT+stockResultsUp.getInt("sUp2L");
                 add7up1LT=add7up1LT+stockResultsUp.getInt("sUp1L");
                 add7up500mlT=add7up500mlT+stockResultsUp.getInt("sUp500ml");
                 add7up250mlpetT=add7up250mlpetT+stockResultsUp.getInt("sUp250pet");
                 add7up250mlglassT=add7up250mlglassT+stockResultsUp.getInt("sUp250mlGlass");
                 add7up200mlglassT=add7up200mlglassT+stockResultsUp.getInt("sUp200mlGlass");
                 add7up250mlcanT=add7up250mlcanT+stockResultsUp.getInt("sUp250mlCan");
                 
             }
                 ResultSet stockResultPepsi = statement.executeQuery("select Psi2L,Psi1L,Psi500ml,Psi250mlpet,Psi250mlGlass,Psi200mlGlass,Psi250mlCan,Psi400ml,Psi500mlDiet from Pepsi");

               while(stockResultPepsi.next()){
                  
                 addPsi2LT=addPsi2LT+stockResultPepsi.getInt("Psi2L");
           
                 addPsi1LT=add7up1LT+stockResultPepsi.getInt("PSi1L");
                  
                 addPsi500mlT=addPsi500mlT+stockResultPepsi.getInt("Psi500ml");
                 
                 addPsi500mldietT=addPsi500mldietT+stockResultPepsi.getInt("Psi500mlDiet");
                 
                 addPsi250mlpetT=addPsi250mlpetT+stockResultPepsi.getInt("Psi250mlPet");
                 
                 addPsi250mlglassT=addPsi250mlglassT+stockResultPepsi.getInt("Psi250mlGlass");
                 
                 addPsi200mlglassT=addPsi200mlglassT+stockResultPepsi.getInt("Psi200mlGlass");
               
                 addPsi400mlT=addPsi400mlT+stockResultPepsi.getInt("Psi400ml");
               
                 addPsi250mlcanT=addPsi250mlcanT+stockResultPepsi.getInt("Psi250mlCan");
                
                 
                
                 
             }
                 
                ResultSet stockResultMirinda = statement.executeQuery("select Mda1L,Mda500ml,Mda250mlPet,Mda200mlGlass,Mda250mlCan from Mirinda");
                
               while(stockResultMirinda.next()){
                   
                 addMda1LT=addMda1LT+ stockResultMirinda.getInt("Mda1L");
                 addMda500mlT= addMda500mlT+stockResultMirinda.getInt("Mda500ml");
                 addMda250mlpetT=addMda250mlpetT+ stockResultMirinda.getInt("Mda250mlPet");
                 addMda200mlglassT=addMda200mlglassT+ stockResultMirinda.getInt("Mda200mlGlass");
                 addMda250mlcanT= addMda250mlcanT+stockResultMirinda.getInt("Mda250mlCan");
               
               
               
               }
              ResultSet stockResultDew = statement.executeQuery("select Dew250mlPet,Dew500ml,Dew200mlGlass,Dew400ml,Dew250mlCan from Dew");
                //System.out.println(addDew500mlT);
                //int tmp = stockResultDew.getInt("Dew500ml");
                int i = 1;
               while(stockResultDew.next()){
                   
                 addDew500mlT = addDew500mlT + stockResultDew.getInt("Dew500ml"); 
                 addDew250mlpetT= addDew250mlpetT +stockResultDew.getInt("Dew250mlPet");
                 addDew400mlT=  addDew400mlT +stockResultDew.getInt("Dew400ml");
                 addDew200mlglassT=addDew200mlglassT + stockResultDew.getInt("Dew200mlGlass");
                 addDew250mlcanT= addDew250mlcanT + stockResultDew.getInt("Dew250mlCan");
                 
             }
               // System.out.println(tmp);
               
              ResultSet stockResultAquafina = statement.executeQuery("select AF1500ml,AF500ml from Aquafina");
              
               while(stockResultAquafina.next()){
                
                 addAqa1500mlT= addAqa1500mlT+stockResultAquafina.getInt("AF1500ml");
                 addAqa500mlT=addAqa500mlT+stockResultAquafina.getInt("AF500ml");
             }
                 ResultSet stockResultSlice = statement.executeQuery("select Slice250mlGlass from Slice");

               while(stockResultSlice.next()){
                
                 addSlice250mlglassT=addSlice250mlglassT+stockResultSlice.getInt("Slice250mlGlass");                 
             }
            
            String update ; 
             
             update ="update sUp set sUp2L="+add7up2LT+",sUp1L="+add7up1LT+",sUp500ml="+add7up500mlT+",sUp250pet="+add7up250mlpetT+",sUp250mlGlass="+add7up250mlglassT+",sUp200mlGlass="+add7up200mlglassT+",sUp250mlCan="+add7up250mlcanT+" where sUpID="+ID+" ";
             System.out.println(update);
             statement.executeUpdate(update);
             update = "update Pepsi set Psi2L="+addPsi2LT+",Psi1L="+addPsi1LT+",Psi500ml="+addPsi500mlT+",Psi500mlDiet="+addPsi500mldietT+",Psi250mlpet="+addPsi250mlpetT+",Psi400ml="+addPsi400mlT+",Psi250mlGlass="+addPsi250mlglassT+",Psi200mlGlass="+addPsi200mlglassT+",Psi250mlCan="+addPsi250mlcanT+" where PsiID = "+ID+"";
             System.out.println(update);
             statement.executeUpdate(update);
             update = " update Mirinda set Mda1L="+addMda1LT+",Mda500ml="+addMda500mlT+",Mda250mlPet="+addMda250mlpetT+",Mda200mlGlass="+addMda200mlglassT+",Mda250mlCan="+addMda250mlcanT+" where MdaID="+ID+" ";
             System.out.println(update);
             statement.executeUpdate(update);
             update = " update Dew set Dew500ml="+addDew500mlT+",Dew400ml="+addDew400mlT+",Dew250mlPet="+addDew250mlpetT+",Dew200mlGlass="+addDew200mlglassT+",Dew250mlCan="+addDew250mlcanT+" where DewID="+ID+" ";
             System.out.println(update);
              System.out.println("ghapla1");
             statement.executeUpdate(update);
                System.out.println("ghapla");
             update = "update Aquafina set AF1500ml="+addAqa1500mlT+",AF500ml="+addAqa500mlT+" where AquafinaID="+ID+"  ";
             System.out.println(update);
             statement.executeUpdate(update);
             update = "update Slice set Slice250mlGlass="+addSlice250mlglassT+"";
             System.out.println(update);
             statement.executeUpdate(update);
             System.out.println(update);
            
             String query ;
             
             //ResultSet chalanResult= statement.executeQuery("select Date,CaseNo,Tk,LabourCost from ChalanStatement");
             query = "insert into ChalanStatement(Date,CaseNo,Tk,LabourCost)"
                     + "values("+date+","+count+","+chalanItemCost+","+labourCost+")";
            System.out.println(query);
            
            statement.executeQuery(query);
           
            }catch(Exception e){
                
            }
            }
    }//GEN-LAST:event_addStockButtonActionPerformed

    private void chalanCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chalanCheckButtonActionPerformed
            int check = 1;
            
            try{
                add7up2LT =  Integer.parseInt(add7up2L.getText());
            add7up1LT =  Integer.parseInt(add7up1L.getText());
            add7up500mlT = Integer.parseInt(add7up500ml.getText());
            add7up250mlpetT = Integer.parseInt(add7up250mlpet.getText());
            add7up250mlglassT = Integer.parseInt(add7up250mlglass.getText());
            add7up200mlglassT = Integer.parseInt(add7up200mlglass.getText());
            add7up250mlcanT = Integer.parseInt(add7up250mlcan.getText());
            System.out.println("new stock 7up "+add7up2LT);
            //newchalan Pepsi
              addPsi2LT = Integer.parseInt(addPsi2L.getText());
              addPsi1LT = Integer.parseInt(addPsi1L.getText());
              addPsi500mlT =Integer.parseInt(addPsi500ml.getText());
              addPsi500mldietT =Integer.parseInt(addPsi500mldiet.getText());
              addPsi250mlpetT =  Integer.parseInt(addPsi250mlpet.getText());
              addPsi250mlglassT =Integer.parseInt(addPsi250mlglass.getText());
              addPsi200mlglassT =Integer.parseInt(addPsi200mlglass.getText());
              addPsi400mlT =Integer.parseInt(addPsi400ml.getText());
              addPsi250mlcanT =Integer.parseInt(addPsi250mlcan.getText());
              
              //newchalan mirinda
              addMda1LT=Integer.parseInt(addMda1L.getText());
              addMda500mlT=Integer.parseInt(addMda500ml.getText());
              addMda250mlpetT=Integer.parseInt(addMda250mlpet.getText());
              addMda200mlglassT=Integer.parseInt(addMda200mlglass.getText());
              addMda250mlcanT=Integer.parseInt(addMda250mlcan.getText());
              //new chalan for Dew
              
              addDew500mlT = Integer.parseInt(addDew500ml.getText());
              addDew250mlpetT =Integer.parseInt(addDew250mlpet.getText());
              addDew200mlglassT =Integer.parseInt(addDew200mlglass.getText());
              addDew400mlT =Integer.parseInt(addDew400ml.getText());
              addDew250mlcanT =Integer.parseInt(addDew250mlcan.getText());
              // new chalan for Aquafina 
              addAqa1500mlT = Integer.parseInt(addAqa1500ml.getText());
              addAqa500mlT = Integer.parseInt(addAqa500ml.getText());
              // new chalan for Slice 
              addSlice250mlglassT = Integer.parseInt(addSlice250mlglass.getText());
              count =add7up2LT+add7up1LT+add7up500mlT+add7up250mlpetT+add7up250mlglassT+add7up200mlglassT+add7up250mlcanT+addPsi2LT+addPsi1LT+addPsi500mlT+addPsi500mldietT+addPsi250mlpetT+addPsi250mlglassT+addPsi200mlglassT+addPsi400mlT+addPsi250mlcanT+addMda1LT+addMda500mlT+addMda250mlpetT+addMda200mlglassT+addMda250mlcanT+addDew500mlT+addDew250mlpetT+addDew400mlT+addDew200mlglassT+addDew250mlcanT+addSlice250mlglassT+addAqa1500mlT+addAqa500mlT;
                System.out.println(count+" count ");
            }catch(Exception e ){
                JOptionPane.showMessageDialog(rootPane,"Please input number only ");
                check = 0;
            }
        
        
              if( check == 1) totalCaseTextField.setText(Integer.toString(count));
    }//GEN-LAST:event_chalanCheckButtonActionPerformed

    private void chalanLabourCostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chalanLabourCostButtonActionPerformed
       int check = 1 ;
        try{
           labourCost = Integer.parseInt(labourCostTextfield.getText());
       }catch(Exception e ){
          labourCost = Integer.parseInt(labourCostTextfield.getText());

       }
    }//GEN-LAST:event_chalanLabourCostButtonActionPerformed

    private void totalCasePriceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCasePriceButtonActionPerformed
       
             add7up2LT =  Integer.parseInt(add7up2L.getText());
            add7up1LT =  Integer.parseInt(add7up1L.getText());
            add7up500mlT = Integer.parseInt(add7up500ml.getText());
            add7up250mlpetT = Integer.parseInt(add7up250mlpet.getText());
            add7up250mlglassT = Integer.parseInt(add7up250mlglass.getText());
            add7up200mlglassT = Integer.parseInt(add7up200mlglass.getText());
            add7up250mlcanT = Integer.parseInt(add7up250mlcan.getText());
            System.out.println("new stock 7up "+add7up2LT);
            //newchalan Pepsi
              addPsi2LT = Integer.parseInt(addPsi2L.getText());
              addPsi1LT = Integer.parseInt(addPsi1L.getText());
              addPsi500mlT =Integer.parseInt(addPsi500ml.getText());
              addPsi500mldietT =Integer.parseInt(addPsi500mldiet.getText());
              addPsi250mlpetT =  Integer.parseInt(addPsi250mlpet.getText());
              addPsi250mlglassT =Integer.parseInt(addPsi250mlglass.getText());
              addPsi200mlglassT =Integer.parseInt(addPsi200mlglass.getText());
              addPsi400mlT =Integer.parseInt(addPsi400ml.getText());
              addPsi250mlcanT =Integer.parseInt(addPsi250mlcan.getText());
              
              //newchalan mirinda
              addMda1LT=Integer.parseInt(addMda1L.getText());
              addMda500mlT=Integer.parseInt(addMda500ml.getText());
              addMda250mlpetT=Integer.parseInt(addMda250mlpet.getText());
              addMda200mlglassT=Integer.parseInt(addMda200mlglass.getText());
              addMda250mlcanT=Integer.parseInt(addMda250mlcan.getText());
              //new chalan for Dew
              
              addDew500mlT = Integer.parseInt(addDew500ml.getText());
              addDew250mlpetT =Integer.parseInt(addDew250mlpet.getText());
              addDew200mlglassT =Integer.parseInt(addDew200mlglass.getText());
              addDew400mlT =Integer.parseInt(addDew400ml.getText());
              addDew250mlcanT =Integer.parseInt(addDew250mlcan.getText());
              // new chalan for Aquafina 
              addAqa1500mlT = Integer.parseInt(addAqa1500ml.getText());
              addAqa500mlT = Integer.parseInt(addAqa500ml.getText());
              // new chalan for Slice 
              addSlice250mlglassT = Integer.parseInt(addSlice250mlglass.getText());
/*
               int add7up2LT,add7up1LT,add7up500mlT,add7up250mlpetT,add7up250mlglassT,add7up200mlglassT,add7up250mlcanT;
  int addPsi2LT,addPsi1LT,addPsi500mlT,addPsi500mldietT,addPsi250mlpetT,addPsi250mlglassT,addPsi200mlglassT,addPsi400mlT,addPsi250mlcanT;
  int addMda1LT,addMda500mlT,addMda250mlpetT,addMda200mlglassT,addMda250mlcanT;
  int addDew500mlT,addDew250mlpetT,addDew400mlT,addDew200mlglassT,addDew250mlcanT;
  int addAqa1500mlT,addAqa500mlT;
  int addSlice250mlglassT;
              */
        
       int sUpPrice =   add7up2LT*555+add7up1LT*654+add7up500mlT*660+add7up250mlpetT*335+add7up250mlglassT*310+add7up200mlglassT*294+add7up250mlcanT*774;

       int  PsiPrice =   addPsi2LT*555+addPsi1LT*654+addPsi500mlT*550+addPsi500mldietT*660+addPsi250mlpetT*315+addPsi250mlglassT*310+addPsi200mlglassT*210+addPsi400mlT*432+addPsi250mlcanT*774;

       int  MdaPrice =   addMda1LT*654+addMda500mlT*660+addMda250mlpetT*335+addMda200mlglassT*294+addMda250mlcanT*774;

       int  DewPrice =   addDew500mlT*660+addDew250mlpetT*335+addDew200mlglassT*294+addDew400mlT*432+addDew250mlcanT*774;

       int  AqaPrice =   addAqa1500mlT*168+addAqa500mlT*266 ;

       int  SlicePrice = addSlice250mlglassT*310;

       chalanItemCost = sUpPrice+PsiPrice+MdaPrice+DewPrice+AqaPrice+SlicePrice;
       totalCasePriceTextfield.setText(Integer.toString(chalanItemCost));
    }//GEN-LAST:event_totalCasePriceButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewChalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewChalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewChalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewChalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewChalan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add7up1L;
    private javax.swing.JTextField add7up200mlglass;
    private javax.swing.JTextField add7up250mlcan;
    private javax.swing.JTextField add7up250mlglass;
    private javax.swing.JTextField add7up250mlpet;
    private javax.swing.JTextField add7up2L;
    private javax.swing.JTextField add7up500ml;
    private javax.swing.JTextField addAqa1500ml;
    private javax.swing.JTextField addAqa500ml;
    private javax.swing.JTextField addDew200mlglass;
    private javax.swing.JTextField addDew250mlcan;
    private javax.swing.JTextField addDew250mlpet;
    private javax.swing.JTextField addDew400ml;
    private javax.swing.JTextField addDew500ml;
    private javax.swing.JTextField addMda1L;
    private javax.swing.JTextField addMda200mlglass;
    private javax.swing.JTextField addMda250mlcan;
    private javax.swing.JTextField addMda250mlpet;
    private javax.swing.JTextField addMda500ml;
    private javax.swing.JTextField addPsi1L;
    private javax.swing.JTextField addPsi200mlglass;
    private javax.swing.JTextField addPsi250mlcan;
    private javax.swing.JTextField addPsi250mlglass;
    private javax.swing.JTextField addPsi250mlpet;
    private javax.swing.JTextField addPsi2L;
    private javax.swing.JTextField addPsi400ml;
    private javax.swing.JTextField addPsi500ml;
    private javax.swing.JTextField addPsi500mldiet;
    private javax.swing.JTextField addSlice250mlglass;
    private javax.swing.JButton addStockButton;
    private javax.swing.JButton chalanCheckButton;
    private javax.swing.JButton chalanLabourCostButton;
    private javax.swing.JLabel dateLabel;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField labourCostTextfield;
    private javax.swing.JButton totalCasePriceButton;
    private javax.swing.JTextField totalCasePriceTextfield;
    private javax.swing.JTextField totalCaseTextField;
    // End of variables declaration//GEN-END:variables
}
