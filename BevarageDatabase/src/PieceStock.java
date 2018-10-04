
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class PieceStock extends javax.swing.JFrame {

    /**
     * Creates new form PieceStock
     */
    public PieceStock() {
        initComponents();
        setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        PsiP = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        sUpP = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        AqaP = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        MdaP = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        DewP = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        SliceP = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        RetailStockCheckButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        PsiP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PsiP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pepsi 2L", "Pepsi 1L", "Pepsi 500ml", "Pepsi 500ml diet", "Pepsi 250ml pet", "Pepsi 250ml glass ", "Pepsi 200ml glass", "Pepsi 400ml ", "Pepsi  250ml can"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PsiP);

        sUpP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sUpP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "7up 2L", "7up 1L", "7up 500ml", " 7up 250ml pet", "7up 250ml glass ", "7up 200ml glass", "7up  250ml can"
            }
        ));
        jScrollPane2.setViewportView(sUpP);

        AqaP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AqaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Aquafina 1500ml", "Aquafina 500ml"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(AqaP);

        MdaP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MdaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Mirinda 1L", "Mirinda 500ml ", "Mirinda 250ml pet", "Mirinda 200ml glass", "Mirinda 250ml can"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(MdaP);

        DewP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DewP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Dew 500ml ", "Dew 250ml pet", "Dew 400ml", "Dew 200ml glass", "Dew 250ml can"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(DewP);

        SliceP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SliceP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Slice 250ml glass"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(SliceP);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("                                                                                      Retail Stock");

        RetailStockCheckButton.setText("Check ");
        RetailStockCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetailStockCheckButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(708, 708, 708))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(800, 800, 800))
                            .addComponent(jTextField1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
                                .addGap(380, 380, 380))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(RetailStockCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addComponent(RetailStockCheckButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RetailStockCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetailStockCheckButtonActionPerformed
   DefaultTableModel sModel =       (DefaultTableModel) sUpP.getModel();
   DefaultTableModel pModel =       (DefaultTableModel) PsiP.getModel();
   DefaultTableModel mModel =       (DefaultTableModel) MdaP.getModel();
   DefaultTableModel aModel =       (DefaultTableModel) AqaP.getModel();
   DefaultTableModel dModel =       (DefaultTableModel) DewP.getModel();
   DefaultTableModel sliceModel =   (DefaultTableModel) SliceP.getModel();
   
        
        try {  
          
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BevarageDatabase;integratedSecurity=true");  
             Statement statement = connection.createStatement();    
             /*for 7up stock calculate */
              
             
             ResultSet result7up =  statement.executeQuery("select sUp2Lp,sUp1Lp,sUp500mlp,sUp250mlpetp,sUp250mlglassp,sUp200mlglassp,sUp250mlcanp from sUpPiece");
                     
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
        
             ResultSet resultPepsi =  statement.executeQuery("select Psi2Lp,Psi1Lp,Psi500mlp,Psi500mldietp,Psi250mlpetp,Psi250mlglassp,Psi200mlglassp,Psi400mlp,Psi250mlcanp from PepsiPiece");
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
             
             ResultSet resultMirinda =  statement.executeQuery("select Mda1Lp,Mda500mlp,Mda250mlpetp,Mda200mlglassp,Mda250mlcanp from MirindaPiece");
                     
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
            
             ResultSet resultDew =  statement.executeQuery("select Dew500mlp,Dew250mlpetp,Dew200mlglassp,Dew400mlp,Dew250mlcanp from DewPiece");
                
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
               
             ResultSet resultAqa =  statement.executeQuery("select Aqa1500mlp,Aqa500mlp from AquafinaPiece");
                     
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
               
             ResultSet resultSlice =  statement.executeQuery("select Slice250mlglassp from SlicePiece");
                     
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
             
         } catch (Exception e) {  
             e.printStackTrace();  
         }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_RetailStockCheckButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PieceStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PieceStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PieceStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PieceStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PieceStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AqaP;
    private javax.swing.JTable DewP;
    private javax.swing.JTable MdaP;
    private javax.swing.JTable PsiP;
    private javax.swing.JButton RetailStockCheckButton;
    private javax.swing.JTable SliceP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable sUpP;
    // End of variables declaration//GEN-END:variables
}
