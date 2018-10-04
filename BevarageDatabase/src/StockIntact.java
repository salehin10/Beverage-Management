
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



public class StockIntact extends javax.swing.JFrame {

    
    
    
    public StockIntact() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane32 = new javax.swing.JScrollPane();
        jTable32 = new javax.swing.JTable();
        checkButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sUp1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Psi1 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        Mda1 = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        Dew1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        AF1 = new javax.swing.JTable();
        jScrollPane30 = new javax.swing.JScrollPane();
        Slice1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sUpprice = new javax.swing.JTextField();
        DewPrice = new javax.swing.JTextField();
        AFPrice = new javax.swing.JTextField();
        SlicePrice = new javax.swing.JTextField();
        MdaPrice = new javax.swing.JTextField();
        PsiPrice = new javax.swing.JTextField();
        TotalStockPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTable32.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Dew-500ml"
            }
        ));
        jScrollPane32.setViewportView(jTable32);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 204));
        setResizable(false);

        checkButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        checkButton.setText("check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        sUp1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sUp1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "7up-2L", "7up-1L", "7up-500ml", "7up-250mlPet", "7up-250mlGlass", "7up-200mlGlassl", "7up-250mlCan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(sUp1);

        Psi1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Psi1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pepsi-2L", "Pepsi-1L", "Pepsi-500ml", "Pepsi-500mlDiet", "Pepsi-250mlPet", "Pepsi-250mlGlass", "Pepsi-200mlCan", "Pepsi-400ml", "Pepsi-250mlCan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Psi1);

        Mda1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mda1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Mirinda-1L", "Mirinda-500ml", "Mirinda-250mlPet", "Mirinda-200mlGlass", "Mirinda-250mlCan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(Mda1);

        Dew1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dew1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Dew-500ml", "Dew-250mlPet", "Dew-200mlGlass", "Dew-400ml", "Dew-250mlCan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(Dew1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("7up(qty)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Pepsi(qty)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mirinda(qty)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Dew(qty)");

        AF1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AF1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "AF-1500ml", "AF-500ml"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane27.setViewportView(AF1);

        Slice1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Slice1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Slice-250ml"
            }
        ));
        jScrollPane30.setViewportView(Slice1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Aquafina(qty)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Slice(qty)");

        sUpprice.setEditable(false);
        sUpprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        DewPrice.setEditable(false);
        DewPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        AFPrice.setEditable(false);
        AFPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        SlicePrice.setEditable(false);
        SlicePrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MdaPrice.setEditable(false);
        MdaPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        PsiPrice.setEditable(false);
        PsiPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        TotalStockPrice.setEditable(false);
        TotalStockPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jLabel7.setText("Total Stock Price : ");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jTextField1.setText("                                                                              Stock of Bevarages ");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\stockpic.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sUpprice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 863, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PsiPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalStockPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SlicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MdaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTextField1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sUpprice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PsiPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MdaPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DewPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AFPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SlicePrice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalStockPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
   DefaultTableModel sModel = (DefaultTableModel) sUp1.getModel();
   DefaultTableModel pModel = (DefaultTableModel) Psi1.getModel();
   DefaultTableModel mModel = (DefaultTableModel) Mda1.getModel();
   DefaultTableModel aModel = (DefaultTableModel) AF1.getModel();
   DefaultTableModel dModel = (DefaultTableModel) Dew1.getModel();
   DefaultTableModel sliceModel = (DefaultTableModel) Slice1.getModel();
   
        int sPrice = 0,slPrice=0,aPrice = 0,dPrice=0,pPrice=0,mPrice;
        int price1=0,price2=0,price3=0,price4=0,price5=0,price6=0,price7=0,price8=0,price9=0;
        try {  
          
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BevarageDatabase;integratedSecurity=true");  
             Statement statement = connection.createStatement();    
             /*for 7up stock calculate */
             ResultSet result7upPrice =  statement.executeQuery("select sUp2L,sUp1L,sUp500ml,sUp250Pet,sUp250mlGlass,sUp200mlGlass,sUp250mlCan from sUp");
             
              while (result7upPrice.next()){
                  price1 = result7upPrice.getInt("sUp2L")*537;
                  price2 = result7upPrice.getInt("sUp1L")*632;
                  price3 = result7upPrice.getInt("sUp500ml")*638;
                  price4 = result7upPrice.getInt("sUp250Pet")*325;
                  price5 = result7upPrice.getInt("sUp250mlGlass")*293;
                  price6 = result7upPrice.getInt("sUp200mlGlass")*277;
                  price7 = result7upPrice.getInt("sUp250mlCan")*751;
             }
             sPrice = price1+price2+price3+price4+price5+price6+price7;
             sUpprice.setText(Integer.toString(sPrice)+""+"Tk");   
             ResultSet result7up =  statement.executeQuery("select sUp2L,sUp1L,sUp500ml,sUp250Pet,sUp250mlGlass,sUp200mlGlass,sUp250mlCan from sUp");
                     
             ResultSetMetaData ressultMetadata7up = result7up.getMetaData();

             int column7up = ressultMetadata7up.getColumnCount();
             
             Vector column_name7up = new Vector();
             
             Vector data_rows7up   = new Vector();
             
             while(result7up.next()) {
               
               data_rows7up = new Vector();
               for(int i= 1 ;i<=column7up;i++){
                   data_rows7up.addElement(result7up.getString(i));
                 
               }
                   sModel.addRow(data_rows7up);  
             }
          /* For Pepsi stock calculate */   
         ResultSet resultPepsiPrice =  statement.executeQuery("select Psi2L,Psi1L,Psi500ml,Psi500mlDiet,Psi250mlPet,Psi250mlGlass,Psi200mlGlass,Psi400ml,Psi250mlCan from Pepsi");
          
         while (resultPepsiPrice.next()){
                 
                  price1 = resultPepsiPrice.getInt("Psi2L")*537;
                  price2 = resultPepsiPrice.getInt("Psi1L")*632;
                  price3 = resultPepsiPrice.getInt("Psi500ml")*532;
                  price4 = resultPepsiPrice.getInt("Psi500mlDiet")*638;
                  price5 = resultPepsiPrice.getInt("Psi250mlPet")*306;
                  price6 = resultPepsiPrice.getInt("Psi250mlGlass")*293;
                  price7 = resultPepsiPrice.getInt("Psi200mlGlass")*198;
                  price8 = resultPepsiPrice.getInt("Psi400ml")*418;
                  price9 = resultPepsiPrice.getInt("Psi250mlCan")*751;
             }
            
             pPrice = price1+price2+price3+price4+price5+price6+price7+price8+price9;
             PsiPrice.setText(Integer.toString(pPrice)+""+"Tk");
             ResultSet resultPepsi =  statement.executeQuery("select Psi2L,Psi1L,Psi500ml,Psi500mlDiet,Psi250mlPet,Psi250mlGlass,Psi200mlGlass,Psi400ml,Psi250mlCan from Pepsi");
             ResultSetMetaData ressultMetadataPepsi = resultPepsi.getMetaData();

             int columnPepsi = ressultMetadataPepsi.getColumnCount();
             
             Vector column_namePepsi = new Vector();
             
             Vector data_rowsPepsi   = new Vector();
             
             while(resultPepsi.next()) {
               
               data_rowsPepsi = new Vector();
               for(int i= 1 ;i<=columnPepsi;i++){
                   data_rowsPepsi.addElement(resultPepsi.getString(i));
                 
               }
                   pModel.addRow(data_rowsPepsi);  
             }
             //for Mirinda stock calculate 
              ResultSet resultMirindaPrice =  statement.executeQuery("select Mda1L,Mda500ml,Mda250mlPet,Mda200mlGlass,Mda250mlCan from Mirinda");
             
              while (resultMirindaPrice.next()){
                  price2 = resultMirindaPrice.getInt("Mda1L")*632;
                  price3 = resultMirindaPrice.getInt("Mda500ml")*638;
                  price4 = resultMirindaPrice.getInt("Mda250mlPet")*325;
                  price5 = resultMirindaPrice.getInt("Mda200mlGlass")*277;
                  price7 = resultMirindaPrice.getInt("Mda250mlCan")*751;
             }

             mPrice = price2+price3+price4+price5+price7;
             MdaPrice.setText(Integer.toString(mPrice)+" "+"Tk");   
             ResultSet resultMirinda =  statement.executeQuery("select Mda1L,Mda500ml,Mda250mlPet,Mda200mlGlass,Mda250mlCan from Mirinda");
                     
             ResultSetMetaData ressultMetadataMirinda = resultMirinda.getMetaData();
            
             int columnMirinda = ressultMetadataMirinda.getColumnCount();
             
             Vector column_nameMirinda = new Vector();
             
             Vector data_rowsMirinda  = new Vector();
             
             while(resultMirinda.next()) {
               
               data_rowsMirinda = new Vector();
               for(int i= 1 ;i<=columnMirinda;i++){
                   data_rowsMirinda.addElement(resultMirinda.getString(i));
                 
               }
                   mModel.addRow(data_rowsMirinda);  
             }
          
            //For Dew stock calculate
             ResultSet resultDewPrice =  statement.executeQuery("select Dew500ml,Dew250mlPet,Dew200mlGlass,Dew400ml,Dew250mlCan from Dew");
             
              while (resultDewPrice.next()){
                 
                  price3 = resultDewPrice.getInt("Dew500ml")*638;
                  price4 = resultDewPrice.getInt("Dew250mlPet")*325;
                  price5 = resultDewPrice.getInt("Dew200mlGlass")*277;
                  price6 = resultDewPrice.getInt("Dew400ml")*418;
                  price7 = resultDewPrice.getInt("Dew250mlCan")*751;
             }
             
             dPrice = price3+price4+price5+price6+price7;
             DewPrice.setText(Integer.toString(dPrice)+""+"Tk");   
             ResultSet resultDew =  statement.executeQuery("select Dew500ml,Dew250mlPet,Dew200mlGlass,Dew400ml,Dew250mlCan from Dew");
                
             ResultSetMetaData ressultMetadataDew = resultDew.getMetaData();
         
             int columnDew = ressultMetadataDew.getColumnCount();
             
             Vector column_nameDew = new Vector();
             
             Vector data_rowsDew   = new Vector();
             
             while(resultDew.next()) {
               
               data_rowsDew = new Vector();
               for(int i= 1 ;i<=columnDew;i++){
                   data_rowsDew.addElement(resultDew.getString(i));
                 
               }
                   dModel.addRow(data_rowsDew);  
             }
       
             //for AquaFina stock calculate 
               ResultSet resultAqaPrice =  statement.executeQuery("select AF1500ml,AF500ml from Aquafina");
             
              while (resultAqaPrice.next()){
                 
                  price3 = resultAqaPrice.getInt("AF1500ml")*158;
                  price4 = resultAqaPrice.getInt("AF500ml")*250;
                 
             }
             
             aPrice = price3+price4;
             AFPrice.setText(Integer.toString(aPrice)+""+"Tk");   
             ResultSet resultAqa =  statement.executeQuery("select AF1500ml,AF500ml from Aquafina");
                     
             ResultSetMetaData ressultMetadataAqa = resultAqa.getMetaData();
         
             int columnAqa = ressultMetadataAqa.getColumnCount();
             
             Vector column_nameAqa = new Vector();
             
             Vector data_rowsAqa   = new Vector();
             
             while(resultAqa.next()) {
               
               data_rowsAqa = new Vector();
               for(int i= 1 ;i<=columnAqa;i++){
                   data_rowsAqa.addElement(resultAqa.getString(i));
                 
               }
                   aModel.addRow(data_rowsAqa);  
             } 
              System.out.println("Pani ok");
             // for Slice stock calculate 
                ResultSet resultSlicePrice =  statement.executeQuery("select Slice250mlGlass from Slice");
             
              while (resultSlicePrice.next()){
                 
                
                  price5 = resultSlicePrice.getInt("Slice250mlGlass")*293;
                  
             }
             
             slPrice =price5;
             SlicePrice.setText(Integer.toString(slPrice)+""+"Tk");   
             ResultSet resultSlice =  statement.executeQuery("select Slice250mlGlass from Slice");
                     
             ResultSetMetaData ressultMetadataSlice = resultSlice.getMetaData();
         
             int columnSlice = ressultMetadataSlice.getColumnCount();
             
             Vector column_nameSlice = new Vector();
             
             Vector data_rowsSlice   = new Vector();
             
             while(resultSlice.next()) {
               
               data_rowsSlice = new Vector();
               for(int i= 1 ;i<=columnSlice;i++){
                   data_rowsSlice.addElement(resultSlice.getString(i));
                 
               }
                   sliceModel.addRow(data_rowsSlice);  
             }
              System.out.println("Slic ok");
              //int total = sUpprice;
              TotalStockPrice.setText(Integer.toString(sPrice+aPrice+mPrice+slPrice+dPrice+pPrice)+""+"Tk");
         } catch (Exception e) {  
             e.printStackTrace();  
         }
    }//GEN-LAST:event_checkButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
 
    
    public static void main(String args[]) {

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockIntact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AF1;
    private javax.swing.JTextField AFPrice;
    private javax.swing.JTable Dew1;
    private javax.swing.JTextField DewPrice;
    private javax.swing.JTable Mda1;
    private javax.swing.JTextField MdaPrice;
    private javax.swing.JTable Psi1;
    private javax.swing.JTextField PsiPrice;
    private javax.swing.JTable Slice1;
    private javax.swing.JTextField SlicePrice;
    private javax.swing.JTextField TotalStockPrice;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable32;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable sUp1;
    private javax.swing.JTextField sUpprice;
    // End of variables declaration//GEN-END:variables
}
