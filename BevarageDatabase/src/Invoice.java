
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Invoice extends javax.swing.JFrame {
                        /*For delivary information */
      int   dsUp2Litem=0,dsUp1Litem=0,dsUp500mlitem=0,dsUp250mlpetitem=0,dsUp250mlglassitem=0,dsUp200mlglassitem=0,dsUp250mlcanitem=0;
      int   dPsi2Litem=0,dPsi1Litem=0,dPsi500mlitem=0,dPsi500mldietitem=0,dPsi250mlpetitem=0,dPsi250mlglassitem=0,dPsi200mlglassitem=0,dPsi250mlcanitem=0,dPsi400mlitem=0;   
      int   dMda1Litem=0,dMda500mlitem=0,dMda250mlpetitem=0,dMda200mlglassitem=0,dMda250mlcanitem=0;
      int   dDew500mlitem=0,dDew250mlpetitem=0,dDew200mlglassitem=0,dDew400mlitem=0,dDew250mlcanitem=0;
      int   dAqa1500mlitem=0,dAqa500mlitem=0 ;
      int   dSlice250mlglassitem=0;
      
                        /* For retun information Qty in case */
      
      int   rsUp2Litemcase=0,rsUp1Litemcase=0,rsUp500mlitemcase=0,rsUp250mlpetitemcase=0,rsUp250mlglassitemcase=0,rsUp200mlglassitemcase=0,rsUp250mlcanitemcase=0;
      int   rPsi2Litemcase=0,rPsi1Litemcase=0,rPsi500mlitemcase=0,rPsi500mldietitemcase=0,rPsi250mlpetitemcase=0,rPsi250mlglassitemcase=0,rPsi200mlglassitemcase=0,rPsi250mlcanitemcase=0,rPsi400mlitemcase=0;   
      int   rMda1Litemcase=0,rMda500mlitemcase=0,rMda250mlpetitemcase=0,rMda200mlglassitemcase=0,rMda250mlcanitemcase=0;
      int   rDew500mlitemcase=0,rDew250mlpetitemcase=0,rDew200mlglassitemcase=0,rDew400mlitemcase=0,rDew250mlcanitemcase=0;
      int   rAqa1500mlitemcase=0,rAqa500mlitemcase=0;
      int   rSlice250mlglassitemcase=0;
      
                        /* For return information Qty in piecse */
      int   rsUp2Litemp=0,rsUp1Litemp=0,rsUp500mlitemp=0,rsUp250mlpetitemp=0,rsUp250mlglassitemp=0,rsUp200mlglassitemp=0,rsUp250mlcanitemp=0;
      int   rPsi2Litemp=0,rPsi1Litemp=0,rPsi500mlitemp=0,rPsi500mldietitemp=0,rPsi250mlpetitemp=0,rPsi250mlglassitemp=0,rPsi200mlglassitemp=0,rPsi250mlcanitemp=0,rPsi400mlitemp=0;   
      int   rMda1Litemp=0,rMda500mlitemp=0,rMda250mlpetitemp=0,rMda200mlglassitemp=0,rMda250mlcanitemp=0;
      int   rDew500mlitemp=0,rDew250mlpetitemp=0,rDew200mlglassitemp=0,rDew400mlitemp=0,rDew250mlcanitemp=0;
      int   rAqa1500mlitemp=0,rAqa500mlitemp=0;
      int   rSlice250mlglassitemp=0;
      
      /*for  price calculate */
      int  dsUpPrice =0 ,dPsiPrice =0 ,dMdaPrice =0 ,dDewPrice =0 ,dAqaPrice = 0 ,dSlicePrice = 0 ;
      int seletectedItemNo =0 ;
      int selectedItemcost = 0 ;
      
      float  expectedsUpprice,expectedPepsiprice,expectedMirindaprice,expectedDewprice,expectedAqaprice,expectedSliceprice;
      float  handcash;
      float  expectedSellingCost;
      float  shortageMoney;
     
      
      int soldsUp2Lcase=0,soldsUp1Lcase=0,soldsUp500mlcase=0,soldsUp250mlpetcase=0,soldsUp250mlglasscase=0,soldsUp200mlglasscase=0,soldsUp250mlcancase=0;
      int soldsUp2Lp=0 ,soldsUp1Lp =0 ,soldsUp500mlp=0,soldsUp250mlpetp=0,soldsUp250mlglassp=0,soldsUp200mlglassp=0,soldsUp250mlcanp=0;
      
      int soldMda1Lcase=0,soldMda500mlcase=0,soldMda250mlpetcase=0,soldMda200mlglasscase=0,soldMda250mlcancase=0;
      int soldMda1Lp=0,soldMda500mlp=0,soldMda250mlpetp=0,soldMda200mlglassp=0,soldMda250mlcanp=0;
      
      
      int soldPsi2Lcase=0,soldPsi1Lcase=0,soldPsi500mlcase=0,soldPsi500mldietcase=0,soldPsi250mlpetcase=0,soldPsi250mlglasscase=0,soldPsi200mlglasscase=0,soldPsi400mlcase=0,soldPsi250mlcancase=0;
      int soldPsi2Lp=0,soldPsi1Lp=0,soldPsi500mlp=0,soldPsi500mldietp=0,soldPsi250mlpetp=0,soldPsi250mlglassp=0,soldPsi200mlglassp=0,soldPsi400mlp=0,soldPsi250mlcanp=0;
     
      
      int soldDew500mlcase=0,soldDew250mlpetcase=0,soldDew200mlglasscase=0,soldDew400mlcase=0,soldDew250mlcancase=0;
      int soldDew500mlp=0,soldDew250mlpetp=0,soldDew200mlglassp=0,soldDew400mlp=0,soldDew250mlcanp=0;
      
      
      int soldAqa1500mlcase=0 ,soldAqa500mlcase=0;
      int soldAqa1500mlp=0,soldAqa500mlp=0;
      
      int soldSlice250mlglasscase=0;
      int soldSlice250mlglassp=0;
      String update;
      String date ;
      int ID=1;
      int returnCaseNo;
      //buying cost of 7up,Pepsi,Mirinda,Dew,Aquafina,Slice
      float bsUpprice,bPsiprice,bMdaprice,bDewprice,bAqaprice,bSliceprice; 
      
      float bsUp2L=0,bsUp1L=0,bsUp500ml=0,bsUp250mlpet=0,bsUp250mlglass=0,bsUp200mlglass=0,bsUp250mlcan=0;
      float bPepsi2L=0,bPepsi1L=0,bPepsi500ml=0,bPepsi500mldiet=0,bPepsi250mlpet,bPepsi250mlglass,bPepsi200mlglass,bPepsi400ml,bPepsi250mlcan;
      float bMda1L,bMda500ml,bMda250mlpet,bMda200mlglass,bMda250mlcan;
      float bDew500ml,bDew250mlpet,bDew200mlglass,bDew400ml,bDew250mlcan;
      float bAqa1500ml,bAqa500ml;
      float bSlice250mlglassprice;
      float buyingCost;
      int  otherexpense =0;
      int  labourCost= 0;
      

      public Invoice() {
                    initComponents();
                    selectedItemcost = 0 ;
                    setLocationRelativeTo(null);
                    DateFormat df = new SimpleDateFormat("dd/MM/yy");
                    Calendar calobj = Calendar.getInstance();
                    DateLabel.setText("         "+df.format(calobj.getTime()));
                    date ="'"+df.format(calobj.getTime())+"'";
                    
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rSlice250mlglassp = new javax.swing.JTextField();
        dDew250mlpet = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rsUp2Lp = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dPsi250mlcan = new javax.swing.JTextField();
        dAqa500ml = new javax.swing.JTextField();
        dPsi400ml = new javax.swing.JTextField();
        netCashTextfield = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        dsUp1L = new javax.swing.JTextField();
        dPsi250mlpet = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        dDew200mlglass = new javax.swing.JTextField();
        jToolBar2 = new javax.swing.JToolBar();
        rDew500mlc = new javax.swing.JTextField();
        rDew250mlpetp = new javax.swing.JTextField();
        rAqa1500mlp = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        rAqa1500mlc = new javax.swing.JTextField();
        rPsi250mlpetp = new javax.swing.JTextField();
        rMda1Lc = new javax.swing.JTextField();
        retunInfobutton = new javax.swing.JButton();
        rMda200mlglassc = new javax.swing.JTextField();
        otherExpenseTextfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rsUp250mlpetp = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        rPsi200mlglassp = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        dsUp250mlglass = new javax.swing.JTextField();
        rDew250mlcanp = new javax.swing.JTextField();
        dDew500ml = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        expectedSellingCashButton = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        rPsi400mlc = new javax.swing.JTextField();
        rMda1Lp = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        rDew400mlc = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        dDew400ml = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        dMda200mlglass = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        rMda250mlcanp = new javax.swing.JTextField();
        dDew250mlcan = new javax.swing.JTextField();
        rsUp200mlglassc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rsUp200mlglassp = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        dMda250mlpet = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        rPsi500mldietp = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        rPsi1Lp = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        rsUp250mlpetc = new javax.swing.JTextField();
        dPsi500mldiet = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rsUp250mlglassc = new javax.swing.JTextField();
        rDew250mlcanc = new javax.swing.JTextField();
        rPsi250mlcanc = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectItemcheckButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rPsi400mlp = new javax.swing.JTextField();
        selectedItemCostTextfield = new javax.swing.JTextField();
        rDew400mlp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        rMda200mlglassp = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rPsi500mlp = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        rSlice250mlglassc = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        delivaryButton = new javax.swing.JButton();
        rMda500mlp = new javax.swing.JTextField();
        dPsi2L = new javax.swing.JTextField();
        rAqa500mlp = new javax.swing.JTextField();
        dAqa1500ml = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        rMda250mlpetp = new javax.swing.JTextField();
        rPsi250mlglassc = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        rDew500mlp = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        dSlice250mlglass = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        rsUp250mlcanp = new javax.swing.JTextField();
        rMda500mlc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rsUp1Lc = new javax.swing.JTextField();
        rPsi1Lc = new javax.swing.JTextField();
        rPsi2Lc = new javax.swing.JTextField();
        dsUp500ml = new javax.swing.JTextField();
        rDew200mlglassp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        rsUp250mlglassp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        rAqa500mlc = new javax.swing.JTextField();
        rDew200mlglassc = new javax.swing.JTextField();
        dMda1L = new javax.swing.JTextField();
        rPsi2Lp = new javax.swing.JTextField();
        rPsi200mlglassc = new javax.swing.JTextField();
        rPsi250mlglassp = new javax.swing.JTextField();
        rPsi250mlcanp = new javax.swing.JTextField();
        rsUp1Lp = new javax.swing.JTextField();
        rDew250mlpetc = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        dsUp250mlcan = new javax.swing.JTextField();
        rsUp500mlp = new javax.swing.JTextField();
        expectedSellingCashTextfield = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        rPsi500mldietc = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        dPsi200mlglass = new javax.swing.JTextField();
        rsUp250mlcanc = new javax.swing.JTextField();
        rPsi250mlpetc = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        rsUp2Lc = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        dsUp200mlglass = new javax.swing.JTextField();
        dPsi500ml = new javax.swing.JTextField();
        dsUp2L = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        rsUp500mlc = new javax.swing.JTextField();
        dMda250mlcan = new javax.swing.JTextField();
        dsUp250mlpet = new javax.swing.JTextField();
        dPsi250mlglass = new javax.swing.JTextField();
        rMda250mlpetc = new javax.swing.JTextField();
        dMda500ml = new javax.swing.JTextField();
        rMda250mlcanc = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        dPsi1L = new javax.swing.JTextField();
        rPsi500mlc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel63 = new javax.swing.JLabel();
        sUp2Lsold = new javax.swing.JTextField();
        sUp2Lsoldp = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        sUp500mlsoldp = new javax.swing.JTextField();
        sUp250mlpetsoldp = new javax.swing.JTextField();
        sUp250mlglasssoldp = new javax.swing.JTextField();
        sUp1Lsoldp = new javax.swing.JTextField();
        sUp200mlglasssoldp = new javax.swing.JTextField();
        sUp250mlcansoldp = new javax.swing.JTextField();
        sUp1Lsold = new javax.swing.JTextField();
        sUp500mlsold = new javax.swing.JTextField();
        sUp250mlpetsold = new javax.swing.JTextField();
        sUp250mlglasssold = new javax.swing.JTextField();
        sUp200mlglasssold = new javax.swing.JTextField();
        sUp250mlcansold = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        Psi2Lsold = new javax.swing.JTextField();
        Psi2Lsoldp = new javax.swing.JTextField();
        Psi1Lsoldp = new javax.swing.JTextField();
        Psi500mlsoldp = new javax.swing.JTextField();
        Psi500mldietsoldp = new javax.swing.JTextField();
        Psi250mlpetsoldp = new javax.swing.JTextField();
        Psi250mlglasssoldp = new javax.swing.JTextField();
        Psi200mlglasssoldp = new javax.swing.JTextField();
        Psi400mlsoldp = new javax.swing.JTextField();
        Psi250mlcansoldp = new javax.swing.JTextField();
        Psi1Lsold = new javax.swing.JTextField();
        Psi500mlsold = new javax.swing.JTextField();
        Psi500mldietsold = new javax.swing.JTextField();
        Psi250mlpetsold = new javax.swing.JTextField();
        Psi250mlglasssold = new javax.swing.JTextField();
        Psi200mlglasssold = new javax.swing.JTextField();
        Psi400mlsold = new javax.swing.JTextField();
        Psi250mlcansold = new javax.swing.JTextField();
        Mirinda1Lsold = new javax.swing.JTextField();
        Mirinda1Lsoldp = new javax.swing.JTextField();
        Mirinda500mlsoldp = new javax.swing.JTextField();
        Mirinda250mlpetsoldp = new javax.swing.JTextField();
        Mirinda200mlglasssoldp = new javax.swing.JTextField();
        Mirinda250mlcansoldp = new javax.swing.JTextField();
        Mirinda500mlsold = new javax.swing.JTextField();
        Mirinda250mlpetsold = new javax.swing.JTextField();
        Mirinda200mlglasssold = new javax.swing.JTextField();
        Mirinda250mlcansold = new javax.swing.JTextField();
        Dew500mlsold = new javax.swing.JTextField();
        Dew500mlsoldp = new javax.swing.JTextField();
        Dew250mlpetsoldp = new javax.swing.JTextField();
        Dew400mlsoldp = new javax.swing.JTextField();
        Dew200mlglasssoldp = new javax.swing.JTextField();
        Dew250mlsoldcanp = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        Dew250mlpetsold = new javax.swing.JTextField();
        Dew400mlsold = new javax.swing.JTextField();
        Dew200mlglasssold = new javax.swing.JTextField();
        Dew250mlcansold = new javax.swing.JTextField();
        Aqa1500mlsold = new javax.swing.JTextField();
        Aqa500mlsoldp = new javax.swing.JTextField();
        Aqa500mlsold = new javax.swing.JTextField();
        Slice250mlglasssold = new javax.swing.JTextField();
        Slice250mlglasssoldp = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel70 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        Slice250mlglass = new javax.swing.JLabel();
        Aqa1500mlsoldp = new javax.swing.JTextField();
        totalDelivarycaseNo = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        totalSalecaseNo = new javax.swing.JTextField();
        totaldelinsalecaseNoButton = new javax.swing.JButton();
        jTextField31 = new javax.swing.JTextField();
        jTextField90 = new javax.swing.JTextField();
        jTextField98 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        InvoiceDoneButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setEnabled(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(952, 600));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Pepsi 400ml :");

        rSlice250mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSlice250mlglassp.setText("0");

        dDew250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dDew250mlpet.setText("0");
        dDew250mlpet.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Dew 250ml pet :");

        rsUp2Lp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp2Lp.setText("0");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Slice 250ml glass  :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Pepsi 200ml glass :");

        dPsi250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi250mlcan.setText("0");
        dPsi250mlcan.setToolTipText("");

        dAqa500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dAqa500ml.setText("0");
        dAqa500ml.setToolTipText("");

        dPsi400ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi400ml.setText("0");
        dPsi400ml.setToolTipText("");

        netCashTextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Aquafina 500ml :");

        dsUp1L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp1L.setText("0");

        dPsi250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi250mlpet.setText("0");
        dPsi250mlpet.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("piece ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Qty(cs)");

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel49.setText("Mirinda 500ml :");

        dDew200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dDew200mlglass.setText("0");
        dDew200mlglass.setToolTipText("");

        jToolBar2.setRollover(true);

        rDew500mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew500mlc.setText("0");

        rDew250mlpetp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew250mlpetp.setText("0");

        rAqa1500mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rAqa1500mlp.setText("0");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel54.setText("Dew 500ml :");

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Dew 200ml  :");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("Aquafina 500ml :");

        rAqa1500mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rAqa1500mlc.setText("0");

        rPsi250mlpetp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi250mlpetp.setText("0");

        rMda1Lc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda1Lc.setText("0");

        retunInfobutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        retunInfobutton.setText("Done");
        retunInfobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retunInfobuttonActionPerformed(evt);
            }
        });

        rMda200mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda200mlglassc.setText("0");

        otherExpenseTextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Mirinda 250ml pet :");

        rsUp250mlpetp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp250mlpetp.setText("0");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Pepsi 2L :");

        rPsi200mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi200mlglassp.setText("0");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Pepsi 250ml pet :");

        dsUp250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp250mlglass.setText("0");

        rDew250mlcanp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew250mlcanp.setText("0");

        dDew500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dDew500ml.setText("0");
        dDew500ml.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dew 200ml glass :");

        expectedSellingCashButton.setText("Check ");
        expectedSellingCashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expectedSellingCashButtonActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Mirinda 1L :");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("7up 1L :");

        rPsi400mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi400mlc.setText("0");

        rMda1Lp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda1Lp.setText("0");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setText("Tk");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("7up  200ml glass :");

        rDew400mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew400mlc.setText("0");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setText("Pepsi 1L :");

        jToolBar1.setRollover(true);

        dDew400ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dDew400ml.setText("0");
        dDew400ml.setToolTipText("");

        dMda200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dMda200mlglass.setText("0");
        dMda200mlglass.setToolTipText("");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Pepsi 1L :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Mirinda 500ml :");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Dew 400ml  :");

        rMda250mlcanp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda250mlcanp.setText("0");

        dDew250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dDew250mlcan.setText("0");
        dDew250mlcan.setToolTipText("");

        rsUp200mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp200mlglassc.setText("0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Items names :");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Mirinda 1L :");

        rsUp200mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp200mlglassp.setText("0");

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel57.setText("Dew 250ml can :");

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel58.setText("Aquafina 1500ml :");

        dMda250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dMda250mlpet.setText("0");
        dMda250mlpet.setToolTipText("");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Expected Selling Cash  :");

        rPsi500mldietp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi500mldietp.setText("0");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("7up 250ml pet : ");

        rPsi1Lp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi1Lp.setText("0");

        rsUp250mlpetc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp250mlpetc.setText("0");

        dPsi500mldiet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi500mldiet.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Pepsi 250ml pet :");

        rsUp250mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp250mlglassc.setText("0");

        rDew250mlcanc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew250mlcanc.setText("0");

        rPsi250mlcanc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi250mlcanc.setText("0");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText("Pepsi 400ml pet :");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Pepsi 500ml :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("7up 2L :");

        selectItemcheckButton.setText("Check ");
        selectItemcheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectItemcheckButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Mirinda 200ml glass :");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText("Pepsi 250ml can :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Pepsi 250ml can :");

        rPsi400mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi400mlp.setText("0");

        selectedItemCostTextfield.setEditable(false);
        selectedItemCostTextfield.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectedItemCostTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedItemCostTextfieldActionPerformed(evt);
            }
        });

        rDew400mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew400mlp.setText("0");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("7up 500ml :");

        rMda200mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda200mlglassp.setText("0");

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel50.setText("Mirinda 250ml pet :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("7up 250ml glass :");

        rPsi500mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi500mlp.setText("0");

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Other Expense :");

        rSlice250mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rSlice250mlglassc.setText("0");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel51.setText("Mirinda 200ml glass :");

        delivaryButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        delivaryButton.setText("Done");
        delivaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delivaryButtonActionPerformed(evt);
            }
        });

        rMda500mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda500mlp.setText("0");

        dPsi2L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi2L.setText("0");

        rAqa500mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rAqa500mlp.setText("0");

        dAqa1500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dAqa1500ml.setText("0");
        dAqa1500ml.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Pepsi 250ml glass :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Selected items cost :");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Aquafina 1500ml :");

        rMda250mlpetp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda250mlpetp.setText("0");

        rPsi250mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi250mlglassc.setText("0");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("7up 250ml can : ");

        rDew500mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew500mlp.setText("0");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Pepsi 500ml diet :");

        dSlice250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dSlice250mlglass.setText("0");
        dSlice250mlglass.setToolTipText("");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Net Cash  :");

        rsUp250mlcanp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp250mlcanp.setText("0");

        rMda500mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda500mlc.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Mirinda 250ml can :");

        rsUp1Lc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp1Lc.setText("0");

        rPsi1Lc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi1Lc.setText("0");

        rPsi2Lc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi2Lc.setText("0");

        dsUp500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp500ml.setText("0");

        rDew200mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew200mlglassp.setText("0");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("Items names :");

        rsUp250mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp250mlglassp.setText("0");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Pepsi 500ml  :");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Dew 250ml can :");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText("Pepsi 250ml glass :");

        rAqa500mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rAqa500mlc.setText("0");

        rDew200mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew200mlglassc.setText("0");

        dMda1L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dMda1L.setText("0");
        dMda1L.setToolTipText("");

        rPsi2Lp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi2Lp.setText("0");

        rPsi200mlglassc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi200mlglassc.setText("0");

        rPsi250mlglassp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi250mlglassp.setText("0");

        rPsi250mlcanp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi250mlcanp.setText("0");

        rsUp1Lp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp1Lp.setText("0");

        rDew250mlpetc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rDew250mlpetc.setText("0");

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText("Pepsi 2L :");

        dsUp250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp250mlcan.setText("0");

        rsUp500mlp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp500mlp.setText("0");

        expectedSellingCashTextfield.setEditable(false);
        expectedSellingCashTextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        expectedSellingCashTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expectedSellingCashTextfieldActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel40.setText("Pepsi 500ml diet :");

        rPsi500mldietc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi500mldietc.setText("0");

        dPsi200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi200mlglass.setText("0");
        dPsi200mlglass.setToolTipText("");

        rsUp250mlcanc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp250mlcanc.setText("0");

        rPsi250mlpetc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi250mlpetc.setText("0");

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel53.setText("Dew 250ml pet :");

        rsUp2Lc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp2Lc.setText("0");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("case ");

        dsUp200mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp200mlglass.setText("0");

        dPsi500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi500ml.setText("0");
        dPsi500ml.setToolTipText("");

        dsUp2L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp2L.setText("0");

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel52.setText("Mirinda 250ml can :");

        rsUp500mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rsUp500mlc.setText("0");

        dMda250mlcan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dMda250mlcan.setText("0");
        dMda250mlcan.setToolTipText("");

        dsUp250mlpet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dsUp250mlpet.setText("0");

        dPsi250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi250mlglass.setText("0");
        dPsi250mlglass.setToolTipText("");

        rMda250mlpetc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda250mlpetc.setText("0");

        dMda500ml.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dMda500ml.setText("0");
        dMda500ml.setToolTipText("");

        rMda250mlcanc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rMda250mlcanc.setText("0");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Pepsi 200ml glass :");

        dPsi1L.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        dPsi1L.setText("0");

        rPsi500mlc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rPsi500mlc.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Dew 500ml :");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel55.setText("Dew 400ml pet :");

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setText("Tk");

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setText("Tk");

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setText("Tk");

        jLabel75.setText("(include free sample,\nfuel cost ,labour cost e.t.c)");

        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("7up 2L :");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel39.setText("7up 1L :");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel42.setText("7up 500ml :");

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel59.setText("7up 250ml pet :");

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel60.setText("7up 250ml glass");

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setText("7up 200ml glass :");

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel62.setText("7up 250ml can  :");

        jToolBar3.setRollover(true);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel63.setText("7up 2L :");

        sUp2Lsold.setEditable(false);
        sUp2Lsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp2Lsold.setText("0");

        sUp2Lsoldp.setEditable(false);
        sUp2Lsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp2Lsoldp.setText("0");

        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setText("7up 1L :");

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel81.setText("7up 500 ml :");

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel82.setText("7up 250ml pet :");

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel83.setText("7up 200ml glass :");

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel84.setText("7up 250ml glass :");

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel85.setText("7up 250ml can :");

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel86.setText("Dew 500ml :");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel87.setText("Pepsi 2L :");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel88.setText("Pepsi 1L :");

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel89.setText("Pepsi 500ml :");

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel90.setText("Pepsi 500ml diet :");

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel91.setText("Pepsi 250ml pet :");

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel92.setText("Pepsi 250ml glass :");

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel93.setText("Pepsi 200ml glass :");

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel94.setText("Pepsi 400ml :");

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel95.setText("Pepsi 250ml can :");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel96.setText("Mirinda 1L :");

        jLabel97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel97.setText("Mirinda 500ml :");

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel98.setText("Mirinda 250ml can :");

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel99.setText("Mirinda 250ml pet:");

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel100.setText("Mirinda 200ml glass :");

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel102.setText("Dew 250ml pet :");

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel103.setText("Dew 400ml :");

        jLabel104.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel104.setText("Dew 200ml glass :");

        jLabel105.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel105.setText("Dew 250ml can :");

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel106.setText("Aquafina 500ml :");

        jLabel107.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel107.setText("Aquafina 1500ml :");

        jLabel108.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel108.setText("Slice 250ml glass :");

        sUp500mlsoldp.setEditable(false);
        sUp500mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp500mlsoldp.setText("0");

        sUp250mlpetsoldp.setEditable(false);
        sUp250mlpetsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp250mlpetsoldp.setText("0");

        sUp250mlglasssoldp.setEditable(false);
        sUp250mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp250mlglasssoldp.setText("0");

        sUp1Lsoldp.setEditable(false);
        sUp1Lsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp1Lsoldp.setText("0");

        sUp200mlglasssoldp.setEditable(false);
        sUp200mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp200mlglasssoldp.setText("0");

        sUp250mlcansoldp.setEditable(false);
        sUp250mlcansoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp250mlcansoldp.setText("0");

        sUp1Lsold.setEditable(false);
        sUp1Lsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp1Lsold.setText("0");

        sUp500mlsold.setEditable(false);
        sUp500mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp500mlsold.setText("0");

        sUp250mlpetsold.setEditable(false);
        sUp250mlpetsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp250mlpetsold.setText("0");

        sUp250mlglasssold.setEditable(false);
        sUp250mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp250mlglasssold.setText("0");

        sUp200mlglasssold.setEditable(false);
        sUp200mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp200mlglasssold.setText("0");

        sUp250mlcansold.setEditable(false);
        sUp250mlcansold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sUp250mlcansold.setText("0");

        Psi2Lsold.setEditable(false);
        Psi2Lsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi2Lsold.setText("0");

        Psi2Lsoldp.setEditable(false);
        Psi2Lsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi2Lsoldp.setText("0");

        Psi1Lsoldp.setEditable(false);
        Psi1Lsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi1Lsoldp.setText("0");

        Psi500mlsoldp.setEditable(false);
        Psi500mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi500mlsoldp.setText("0");

        Psi500mldietsoldp.setEditable(false);
        Psi500mldietsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi500mldietsoldp.setText("0");

        Psi250mlpetsoldp.setEditable(false);
        Psi250mlpetsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi250mlpetsoldp.setText("0");

        Psi250mlglasssoldp.setEditable(false);
        Psi250mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi250mlglasssoldp.setText("0");

        Psi200mlglasssoldp.setEditable(false);
        Psi200mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi200mlglasssoldp.setText("0");

        Psi400mlsoldp.setEditable(false);
        Psi400mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi400mlsoldp.setText("0");

        Psi250mlcansoldp.setEditable(false);
        Psi250mlcansoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi250mlcansoldp.setText("0");

        Psi1Lsold.setEditable(false);
        Psi1Lsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi1Lsold.setText("0");

        Psi500mlsold.setEditable(false);
        Psi500mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi500mlsold.setText("0");

        Psi500mldietsold.setEditable(false);
        Psi500mldietsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi500mldietsold.setText("0");

        Psi250mlpetsold.setEditable(false);
        Psi250mlpetsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi250mlpetsold.setText("0");

        Psi250mlglasssold.setEditable(false);
        Psi250mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi250mlglasssold.setText("0");

        Psi200mlglasssold.setEditable(false);
        Psi200mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi200mlglasssold.setText("0");

        Psi400mlsold.setEditable(false);
        Psi400mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi400mlsold.setText("0");

        Psi250mlcansold.setEditable(false);
        Psi250mlcansold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Psi250mlcansold.setText("0");

        Mirinda1Lsold.setEditable(false);
        Mirinda1Lsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda1Lsold.setText("0");

        Mirinda1Lsoldp.setEditable(false);
        Mirinda1Lsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda1Lsoldp.setText("0");

        Mirinda500mlsoldp.setEditable(false);
        Mirinda500mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda500mlsoldp.setText("0");

        Mirinda250mlpetsoldp.setEditable(false);
        Mirinda250mlpetsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda250mlpetsoldp.setText("0");

        Mirinda200mlglasssoldp.setEditable(false);
        Mirinda200mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda200mlglasssoldp.setText("0");

        Mirinda250mlcansoldp.setEditable(false);
        Mirinda250mlcansoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda250mlcansoldp.setText("0");

        Mirinda500mlsold.setEditable(false);
        Mirinda500mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda500mlsold.setText("0");

        Mirinda250mlpetsold.setEditable(false);
        Mirinda250mlpetsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda250mlpetsold.setText("0");

        Mirinda200mlglasssold.setEditable(false);
        Mirinda200mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda200mlglasssold.setText("0");

        Mirinda250mlcansold.setEditable(false);
        Mirinda250mlcansold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Mirinda250mlcansold.setText("0");

        Dew500mlsold.setEditable(false);
        Dew500mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew500mlsold.setText("0");

        Dew500mlsoldp.setEditable(false);
        Dew500mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew500mlsoldp.setText("0");

        Dew250mlpetsoldp.setEditable(false);
        Dew250mlpetsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew250mlpetsoldp.setText("0");

        Dew400mlsoldp.setEditable(false);
        Dew400mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew400mlsoldp.setText("0");

        Dew200mlglasssoldp.setEditable(false);
        Dew200mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew200mlglasssoldp.setText("0");

        Dew250mlsoldcanp.setEditable(false);
        Dew250mlsoldcanp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew250mlsoldcanp.setText("0");

        Dew250mlpetsold.setEditable(false);
        Dew250mlpetsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew250mlpetsold.setText("0");

        Dew400mlsold.setEditable(false);
        Dew400mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew400mlsold.setText("0");

        Dew200mlglasssold.setEditable(false);
        Dew200mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew200mlglasssold.setText("0");

        Dew250mlcansold.setEditable(false);
        Dew250mlcansold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dew250mlcansold.setText("0");

        Aqa1500mlsold.setEditable(false);
        Aqa1500mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aqa1500mlsold.setText("0");

        Aqa500mlsoldp.setEditable(false);
        Aqa500mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aqa500mlsoldp.setText("0");

        Aqa500mlsold.setEditable(false);
        Aqa500mlsold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aqa500mlsold.setText("0");

        Slice250mlglasssold.setEditable(false);
        Slice250mlglasssold.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Slice250mlglasssold.setText("0");

        Slice250mlglasssoldp.setEditable(false);
        Slice250mlglasssoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Slice250mlglasssoldp.setText("0");

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setText("Items names :");

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setText("case ");

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel79.setText("piece ");

        Slice250mlglass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Slice250mlglass.setText("Slice250ml glass :");

        Aqa1500mlsoldp.setEditable(false);
        Aqa1500mlsoldp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Aqa1500mlsoldp.setText("0");

        totalDelivarycaseNo.setEditable(false);
        totalDelivarycaseNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel118.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel118.setText("Total Delivary Case(cs) :");

        jLabel119.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel119.setText("Total Sale Intact Case (about ) :");

        totalSalecaseNo.setEditable(false);
        totalSalecaseNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        totaldelinsalecaseNoButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totaldelinsalecaseNoButton.setText("check ");
        totaldelinsalecaseNoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaldelinsalecaseNoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dAqa500ml, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dDew400ml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(dDew200mlglass, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dDew250mlpet, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dDew500ml, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dDew250mlcan)))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(0, 18, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(dMda250mlcan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                            .addComponent(dMda200mlglass, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dMda250mlpet, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dMda500ml, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dPsi250mlcan, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dPsi400ml, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(dPsi200mlglass, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                            .addComponent(dPsi250mlglass)
                                            .addComponent(dPsi1L, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dsUp250mlcan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                            .addComponent(dsUp200mlglass, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dsUp250mlglass, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dsUp250mlpet, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dsUp500ml, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dsUp1L, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dPsi2L, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(dMda1L, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dPsi250mlpet, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dPsi500mldiet)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dAqa1500ml, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dsUp2L, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dPsi500ml, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dSlice250mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(delivaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rPsi400mlc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rPsi200mlglassc)
                                            .addComponent(rPsi250mlglassc)
                                            .addComponent(rPsi250mlpetc)
                                            .addComponent(rPsi500mldietc)
                                            .addComponent(rPsi250mlcanc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(rPsi500mlc, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rPsi1Lc, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rPsi2Lc, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(1, 1, 1)))
                                        .addGap(44, 44, 44)
                                        .addComponent(rPsi250mlcanp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rDew200mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rDew250mlcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rAqa1500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rSlice250mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rDew200mlglassp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rDew250mlcanp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rSlice250mlglassp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rMda500mlc, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(rMda250mlpetc)
                                            .addComponent(rMda1Lc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rMda500mlp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rMda250mlpetp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rMda1Lp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rDew400mlc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rDew400mlp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(rAqa500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rAqa500mlp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rsUp200mlglassc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rsUp250mlglassc)
                                            .addComponent(rsUp250mlpetc)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                            .addComponent(rsUp250mlcanc, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rsUp2Lc)
                                            .addComponent(rsUp1Lc)
                                            .addComponent(rsUp500mlc)))
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rsUp200mlglassp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                                        .addComponent(rsUp250mlglassp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rsUp250mlpetp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rsUp500mlp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rsUp1Lp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rsUp2Lp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rsUp250mlcanp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi2Lp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi1Lp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi500mlp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi500mldietp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi250mlpetp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi250mlglassp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi200mlglassp, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rPsi400mlp, javax.swing.GroupLayout.Alignment.TRAILING))))
                            .addComponent(jSeparator10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel53)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(rDew250mlpetc, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                            .addComponent(rDew500mlc))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rMda250mlcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rMda200mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rMda250mlcanp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rMda200mlglassp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rDew500mlp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rDew250mlpetp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jSeparator15))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 28, Short.MAX_VALUE)))
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Slice250mlglass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addComponent(rAqa1500mlp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(retunInfobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel76)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82)
                            .addComponent(jLabel84)
                            .addComponent(jLabel83)
                            .addComponent(jLabel85)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sUp2Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sUp250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sUp250mlcansoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sUp200mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sUp200mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sUp250mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sUp250mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sUp250mlpetsold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sUp250mlpetsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sUp500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sUp500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sUp1Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sUp1Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel79)
                                    .addComponent(sUp2Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Mirinda200mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel107)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Dew500mlsold, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew250mlpetsold, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew400mlsold, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew200mlglasssold, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew250mlcansold, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Dew500mlsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew250mlpetsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew400mlsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew200mlglasssoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Dew250mlsoldcanp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Slice250mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Aqa500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Aqa500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Slice250mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Aqa1500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Aqa1500mlsoldp)))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel103)
                            .addComponent(jLabel102)
                            .addComponent(jLabel86)
                            .addComponent(jLabel99)
                            .addComponent(jLabel97)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel93)
                            .addComponent(jLabel92)
                            .addComponent(jLabel91)
                            .addComponent(jLabel90)
                            .addComponent(jLabel89)
                            .addComponent(jLabel88)
                            .addComponent(jLabel96)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel87)
                                .addGap(82, 82, 82)
                                .addComponent(Psi2Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Psi2Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addGap(18, 18, 18)
                                .addComponent(Mirinda250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(Mirinda250mlcansoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(141, 141, 141)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Psi1Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi500mldietsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi250mlpetsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi250mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi200mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi400mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Psi250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Mirinda500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mirinda1Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mirinda250mlpetsold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Mirinda200mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Psi1Lsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi500mlsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi500mldietsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi250mlpetsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi250mlglasssoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi200mlglasssoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi400mlsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Psi250mlcansoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Mirinda1Lsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Mirinda500mlsoldp, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(Mirinda250mlpetsoldp))))
                            .addComponent(jLabel108))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)))
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectedItemCostTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otherExpenseTextfield, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(expectedSellingCashTextfield, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel69)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectItemcheckButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(expectedSellingCashButton))))
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel74))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(totalDelivarycaseNo, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(netCashTextfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                    .addComponent(jLabel118)
                    .addComponent(jLabel119)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(totaldelinsalecaseNoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(totalSalecaseNo, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(299, 299, 299)
                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(811, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel34)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel70)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7)
                    .addComponent(jSeparator14))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dsUp2L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dsUp1L, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dsUp500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dsUp250mlpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dsUp250mlglass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dsUp200mlglass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dsUp250mlcan))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi2L)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi1L)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi500ml)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi500mldiet)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi250mlpet)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi250mlglass)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi200mlglass)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi400ml)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dPsi250mlcan)
                            .addComponent(jLabel11))
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(dMda1L))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dMda500ml))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dMda250mlpet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dMda200mlglass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dMda250mlcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dDew500ml)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(dDew250mlpet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dDew200mlglass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(dDew400ml))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(dDew250mlcan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(dAqa1500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(dAqa500ml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(dSlice250mlglass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delivaryButton)
                            .addComponent(retunInfobutton))
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jToolBar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(selectedItemCostTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(selectItemcheckButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel73))
                                                .addGap(23, 23, 23)
                                                .addComponent(jLabel36)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(expectedSellingCashButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel72)
                                                            .addComponent(expectedSellingCashTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(51, 51, 51))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel37)
                                                        .addGap(6, 6, 6)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(otherExpenseTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel69))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel68)
                                                    .addComponent(jLabel74))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(netCashTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel118)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalDelivarycaseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel119)
                                                .addGap(18, 18, 18)
                                                .addComponent(totalSalecaseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totaldelinsalecaseNoButton)
                                                .addGap(263, 263, 263))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel63)
                                                    .addComponent(sUp2Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp2Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel76)
                                                    .addComponent(sUp1Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp1Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel81)
                                                    .addComponent(sUp500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel82)
                                                    .addComponent(sUp250mlpetsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp250mlpetsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel84)
                                                    .addComponent(sUp250mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp250mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel83)
                                                    .addComponent(sUp200mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp200mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel85)
                                                    .addComponent(sUp250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sUp250mlcansoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel87)
                                                    .addComponent(Psi2Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi2Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel88)
                                                    .addComponent(Psi1Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi1Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel89)
                                                    .addComponent(Psi500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel90)
                                                    .addComponent(Psi500mldietsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi500mldietsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel91)
                                                    .addComponent(Psi250mlpetsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi250mlpetsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel92)
                                                    .addComponent(Psi250mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi250mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel93)
                                                    .addComponent(Psi200mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi200mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel94)
                                                    .addComponent(Psi400mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi400mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel95)
                                                    .addComponent(Psi250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Psi250mlcansoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(15, 15, 15)
                                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel96)
                                                    .addComponent(Mirinda1Lsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Mirinda1Lsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel97)
                                                    .addComponent(Mirinda500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Mirinda500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel99)
                                                    .addComponent(Mirinda250mlpetsold)
                                                    .addComponent(Mirinda250mlpetsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel100)
                                                    .addComponent(Mirinda200mlglasssold)
                                                    .addComponent(Mirinda200mlglasssoldp))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel98)
                                                    .addComponent(Mirinda250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Mirinda250mlcansoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel86)
                                                    .addComponent(Dew500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Dew500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel102)
                                                    .addComponent(Dew250mlpetsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Dew250mlpetsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel103)
                                                    .addComponent(Dew400mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Dew400mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel104)
                                                    .addComponent(Dew200mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Dew200mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel105)
                                                    .addComponent(Dew250mlcansold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Dew250mlsoldcanp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(9, 9, 9)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel107)
                                                    .addComponent(Aqa1500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Aqa1500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Aqa500mlsoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Aqa500mlsold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel106))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel108)
                                            .addComponent(Slice250mlglasssold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Slice250mlglasssoldp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rsUp2Lc)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(rsUp2Lp))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rsUp1Lc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rsUp1Lp)
                                            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rsUp500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rsUp500mlp)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rsUp250mlpetc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rsUp250mlpetp)
                                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rsUp250mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rsUp250mlglassp)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rsUp200mlglassp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(rsUp200mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rsUp250mlcanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rsUp250mlcanp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel64)
                                            .addComponent(rPsi2Lc)
                                            .addComponent(rPsi2Lp))
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel65)
                                            .addComponent(rPsi1Lc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi1Lp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel67)
                                            .addComponent(rPsi500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi500mlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rPsi500mldietc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi500mldietp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel40))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rPsi250mlpetc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi250mlpetp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel43))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rPsi250mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi250mlglassp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rPsi200mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi200mlglassp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel45))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel46)
                                            .addComponent(rPsi400mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rPsi400mlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel47)
                                            .addComponent(rPsi250mlcanc)
                                            .addComponent(rPsi250mlcanp))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel48)
                                            .addComponent(rMda1Lc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rMda1Lp))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rMda500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rMda500mlp)
                                            .addComponent(jLabel49))
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rMda250mlpetp)
                                            .addComponent(rMda250mlpetc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel50))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rMda200mlglassp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rMda200mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel51))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rMda250mlcanp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rMda250mlcanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel52))
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel54)
                                            .addComponent(rDew500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rDew500mlp))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel53)
                                            .addComponent(rDew250mlpetc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rDew250mlpetp))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel55)
                                            .addComponent(rDew400mlp, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rDew400mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rDew200mlglassc)
                                            .addComponent(rDew200mlglassp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel56))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel57)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(rDew250mlcanp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rDew250mlcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel58)
                                            .addComponent(rAqa1500mlc)
                                            .addComponent(rAqa1500mlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel66)
                                            .addComponent(rAqa500mlc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rAqa500mlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Slice250mlglass)
                                            .addComponent(rSlice250mlglassc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rSlice250mlglassp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(108, 108, 108)
                                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(183, 183, 183))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jLabel77)
                    .addContainerGap(1009, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTextField31.setEditable(false);
        jTextField31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField31.setText("              Transaction");

        jTextField90.setEditable(false);
        jTextField90.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField90.setText("             Delivary Items ");

        jTextField98.setEditable(false);
        jTextField98.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField98.setText("               Return Items ");

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText("Date :");

        DateLabel.setBackground(new java.awt.Color(255, 255, 255));
        DateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateLabel.setText("          ");
        DateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        InvoiceDoneButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        InvoiceDoneButton.setText("Done ");
        InvoiceDoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceDoneButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("                Sale Items ");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setText("                     Invoice ");

        jLabel41.setBackground(new java.awt.Color(204, 255, 255));
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        jLabel80.setBackground(new java.awt.Color(204, 255, 255));
        jLabel80.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Pepsi.jpg")); // NOI18N

        jLabel101.setBackground(new java.awt.Color(204, 255, 255));
        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mirinda.jpg"))); // NOI18N

        jLabel109.setBackground(new java.awt.Color(204, 255, 255));
        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dew.jpg"))); // NOI18N

        jLabel110.setBackground(new java.awt.Color(204, 255, 255));
        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aquafina.jpg"))); // NOI18N

        jLabel111.setBackground(new java.awt.Color(204, 255, 255));
        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slice.jpg"))); // NOI18N

        jLabel112.setBackground(new java.awt.Color(204, 255, 255));
        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.jpg"))); // NOI18N

        jLabel113.setBackground(new java.awt.Color(204, 255, 255));
        jLabel113.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\Pepsi.jpg")); // NOI18N

        jLabel114.setBackground(new java.awt.Color(204, 255, 255));
        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mirinda.jpg"))); // NOI18N

        jLabel115.setBackground(new java.awt.Color(204, 255, 255));
        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dew.jpg"))); // NOI18N

        jLabel116.setBackground(new java.awt.Color(204, 255, 255));
        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aquafina.jpg"))); // NOI18N

        jLabel117.setBackground(new java.awt.Color(204, 255, 255));
        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slice.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel117)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2)
                .addComponent(jLabel101, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel116)
            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InvoiceDoneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField98, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField90, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InvoiceDoneButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvoiceDoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceDoneButtonActionPerformed
        /*Database connection for update Piece Stock */
         
         /* try {  
                      
           
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BevarageDatabase;integratedSecurity=true");  
             Statement statement  = connection.createStatement();
             
             ResultSet stockResultsUpPiece = statement.executeQuery("select sUp2Lp,sUp1Lp,sUp500mlp,sUp250mlpetp,sUp250mlglassp,sUp200mlglassp,sUp250mlcanp from sUpPiece");
              //System.out.println("check1 ");
             while(stockResultsUpPiece.next()){
                 
                 rsUp2Litemp=rsUp2Litemp+stockResultsUpPiece.getInt("sUp2Lp");
                 rsUp1Litemp=rsUp1Litemp+stockResultsUpPiece.getInt("sUp1Lp");
                 rsUp500mlitemp=rsUp500mlitemp+stockResultsUpPiece.getInt("sUp500mlp");
                 rsUp250mlpetitemp=rsUp250mlpetitemp+stockResultsUpPiece.getInt("sUp250mlpetp");
                 rsUp250mlglassitemp=rsUp250mlglassitemp+stockResultsUpPiece.getInt("sUp250mlglassp");
                 rsUp200mlglassitemp=rsUp200mlglassitemp+stockResultsUpPiece.getInt("sUp200mlglassp");
                 rsUp250mlcanitemp= rsUp250mlcanitemp+stockResultsUpPiece.getInt("sUp250mlcanp");
                 
             }
             
                ResultSet stockResultPepsiPiece = statement.executeQuery("select Psi2Lp,Psi1Lp,Psi500mlp,Psi250mlpetp,Psi250mlglassp,Psi200mlglassp,Psi250mlcanp,Psi400mlp,Psi500mldietp from PepsiPiece");

               while(stockResultPepsiPiece.next()){
                 
                 rPsi2Litemp=rPsi2Litemp+stockResultPepsiPiece.getInt("Psi2Lp");
                 rPsi1Litemp= rPsi1Litemp+stockResultPepsiPiece.getInt("Psi1Lp");
                 rPsi500mlitemp= rPsi500mlitemp+stockResultPepsiPiece.getInt("Psi500mlp");
                 rPsi500mldietitemp=rPsi500mldietitemp+stockResultPepsiPiece.getInt("Psi500mldietp");
                 rPsi250mlpetitemp=rPsi250mlpetitemp+stockResultPepsiPiece.getInt("Psi250mlpetp");
                 rPsi250mlglassitemp=rPsi250mlglassitemp+stockResultPepsiPiece.getInt("Psi250mlglassp");
                 rPsi200mlglassitemp= rPsi200mlglassitemp+stockResultPepsiPiece.getInt("Psi200mlglassp");
                 rPsi400mlitemp=rPsi400mlitemp+stockResultPepsiPiece.getInt("Psi400mlp");
                 rPsi250mlcanitemp=rPsi250mlcanitemp+stockResultPepsiPiece.getInt("Psi250mlcanp");
                 
             }
           
             ResultSet stockResultMirindaPiece = statement.executeQuery("select Mda1Lp,Mda500mlp,Mda250mlpetp,Mda200mlglassp,Mda250mlcanp from MirindaPiece");

               while(stockResultMirindaPiece.next()){
                 
                
                 rMda1Litemp=rMda1Litemp+stockResultMirindaPiece.getInt("Mda1Lp");
                 rMda500mlitemp=rMda500mlitemp+stockResultMirindaPiece.getInt("Mda500mlp");
                 rMda250mlpetitemp=rMda250mlpetitemp+stockResultMirindaPiece.getInt("Mda250mlpetp");
                 rMda200mlglassitemp= rMda200mlglassitemp+stockResultMirindaPiece.getInt("Mda200mlglassp");
                 rMda250mlcanitemp=rMda250mlcanitemp+stockResultMirindaPiece.getInt("Mda250mlcanp");
                 
             }
              
                ResultSet stockResultDewPiece = statement.executeQuery("select Dew250mlpetp,Dew500mlp,Dew200mlglassp,Dew400mlp,Dew250mlcanp from DewPiece");

               while(stockResultDewPiece.next()){
                 
                 
                 rDew500mlitemp= rDew500mlitemp+stockResultDewPiece.getInt("Dew500mlp");
                 rDew250mlpetitemp=rDew250mlpetitemp+stockResultDewPiece.getInt("Dew250mlpetp");
                 rDew200mlglassitemp=rDew200mlglassitemp+stockResultDewPiece.getInt("Dew200mlglassp");
                 rDew400mlitemp= rDew400mlitemp+stockResultDewPiece.getInt("Dew400mlp");
                 rDew250mlcanitemp=rDew250mlcanitemp+stockResultDewPiece.getInt("Dew250mlcanp");
                 
             }
             
                ResultSet stockResultAquafinaPiece = statement.executeQuery("select Aqa1500mlp,Aqa500mlp from AquafinaPiece");

               while(stockResultAquafinaPiece.next()){
                 
                 rAqa1500mlitemp=rAqa1500mlitemp+stockResultAquafinaPiece.getInt("Aqa1500mlp");
                 rAqa500mlitemp=rAqa500mlitemp+stockResultAquafinaPiece.getInt("Aqa500mlp");
             }
          
                  ResultSet stockResultSlicePiece = statement.executeQuery("select Slice250mlglassp from SlicePiece");

               while(stockResultSlicePiece.next()){
                 
                 rSlice250mlglassitemp=rSlice250mlglassitemp+stockResultSlicePiece.getInt("Slice250mlglassp");                 
             }
               
              


               //update query of Piece stock of 7up,Pepsi,Mirinda,Dew,Aquafina,SLice
             update ="update sUpPiece set sUp2Lp="+rsUp2Litemp+",sUp1Lp="+rsUp1Litemp+",sUp500mlp="+rsUp500mlitemp+",sUp250mlpetp="+rsUp250mlpetitemp+",sUp250mlglassp="+rsUp250mlglassitemp+",sUp200mlglassp="+rsUp200mlglassitemp+",sUp250mlcanp="+rsUp250mlcanitemp+" where sUpPieceID="+ID+" ";
             statement.executeUpdate(update);
             update ="update PepsiPiece set Psi2Lp="+rPsi2Litemp+",Psi1Lp="+rPsi1Litemp+",Psi500mlp="+rMda500mlitemp+",Psi500mldietp="+rPsi500mldietitemp+",Psi250mlpetp="+rPsi250mlpetitemp+",Psi250mlglassp="+rPsi250mlglassitemp+",Psi200mlglassp="+rPsi200mlglassitemp+",Psi250mlcanp="+rPsi250mlcanitemp+",Psi400mlp="+rPsi400mlitemp+" where PsiPieceID="+ID+" ";
             statement.executeUpdate(update);
             update ="update MirindaPiece set Mda1Lp="+rMda1Litemp+",Mda500mlp="+rMda500mlitemp+",Mda250mlpetp="+rMda250mlpetitemp+",Mda200mlglassp="+rMda200mlglassitemp+",Mda250mlcanp="+rMda250mlcanitemp+" where MdaPieceID="+ID+" ";
             statement.executeUpdate(update);
             update ="update DewPiece set Dew500mlp="+rDew500mlitemp+",Dew250mlpetp="+rDew250mlpetitemp+",Dew200mlglassp="+rDew200mlglassitemp+",Dew400mlp="+rDew400mlitemp+",Dew250mlcanp="+rDew250mlcanitemp+" where DewPieceID="+ID+" ";
             statement.executeUpdate(update);
             update ="update AquafinaPiece set Aqa1500mlp="+rAqa1500mlitemp+",Aqa500mlp="+rAqa500mlitemp+" where AquafinaPieceID="+ID+" ";
             statement.executeUpdate(update);
             update ="update SlicePiece set Slice250mlglassp="+rSlice250mlglassitemp+" where SlicePieceID="+ID+" ";
             statement.executeUpdate(update);
           //Piece stock update complte
           
             //Intactstock update start */
             
             
             // variable for sold case of 7up,Pepsi,Mirinda,Dew,Aquafina,Slice
             int sold7up2L = 0,sold7up1L = 0,sold7up500ml = 0,sold7up250mlpet = 0,sold7up250mlglass = 0,sold7up200mlglass = 0,sold7up250mlcan = 0;
             int soldPepsi2L = 0,soldPepsi1L = 0,soldPepsi500ml = 0,soldPepsi250mlpet = 0,soldPepsi250mlglass = 0,soldPepsi200mlglass = 0,soldPepsi250mlcan = 0,soldPepsi400ml = 0,soldPepsi500mldiet = 0;
             int soldMirinda1L = 0,soldMirinda500ml = 0,soldMirinda250mlpet = 0,soldMirinda200mlglass = 0,soldMirinda250mlcan = 0;
             int soldDew500ml = 0,soldDew250mlpet = 0,soldDew400ml = 0,soldDew200mlglass = 0,soldDew250mlcan = 0;
             int soldAquafina1500ml = 0,soldAquafina500ml = 0;
             int soldSlice250mlglass = 0;
             try{   
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
             Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BevarageDatabase;integratedSecurity=true");  
             Statement statement  = connection.createStatement();
            
                ResultSet stockResultsUp= statement.executeQuery("select sUp2L,sUp1L,sUp500ml,sUp250pet,sUp250mlGlass,sUp200mlGlass,sUp250mlCan from sUp");

                while(stockResultsUp.next()){
                 
                 sold7up2L=stockResultsUp.getInt("sUp2L")-soldsUp2Lcase;
                 sold7up1L=stockResultsUp.getInt("sUp1L")-soldsUp1Lcase;
                 sold7up500ml=stockResultsUp.getInt("sUp500ml")-soldsUp500mlcase;
                 sold7up250mlpet=stockResultsUp.getInt("sUp250pet")-soldsUp250mlpetcase;
                 sold7up250mlglass=stockResultsUp.getInt("sUp250mlGlass")-soldsUp250mlglasscase;
                 sold7up200mlglass=stockResultsUp.getInt("sUp200mlGlass")-soldsUp200mlglasscase;
                 sold7up250mlcan=stockResultsUp.getInt("sUp250mlCan")-soldsUp250mlcancase;
                 
             }
            
                 ResultSet stockResultPepsi = statement.executeQuery("select Psi2L,Psi1L,Psi500ml,Psi250mlPet,Psi250mlGlass,Psi200mlGlass,Psi250mlCan,Psi400ml,Psi500mldiet from Pepsi");

               while(stockResultPepsi.next()){
                 
                 soldPepsi2L=stockResultPepsi.getInt("Psi2L")-soldPsi2Lcase;
                 soldPepsi1L=stockResultPepsi.getInt("Psi1L")-soldPsi1Lcase;
                 soldPepsi500ml=stockResultPepsi.getInt("Psi500ml")-soldPsi500mlcase;
                 soldPepsi500mldiet=stockResultPepsi.getInt("Psi500mldiet")-soldPsi500mldietcase;
                 soldPepsi250mlpet=stockResultPepsi.getInt("Psi250mlPet")-soldPsi250mlpetcase;
                 soldPepsi250mlglass=stockResultPepsi.getInt("Psi250mlGlass")-soldPsi250mlglasscase;
                 soldPepsi200mlglass=stockResultPepsi.getInt("Psi200mlGlass")-soldPsi200mlglasscase;
                 soldPepsi400ml=stockResultPepsi.getInt("Psi400ml")-soldPsi400mlcase;
                 soldPepsi250mlcan=stockResultPepsi.getInt("Psi250mlCan")-soldPsi250mlcancase;
                 
             }
           
                ResultSet stockResultMirinda = statement.executeQuery("select Mda1L,Mda500ml,Mda250mlPet,Mda200mlGlass,Mda250mlCan from Mirinda");

               while(stockResultMirinda.next()){
                 
                
                 soldMirinda1L=stockResultMirinda.getInt("Mda1L")-soldMda1Lcase;
                 soldMirinda500ml=stockResultMirinda.getInt("Mda500ml")-soldMda500mlcase;
                 soldMirinda250mlpet=stockResultMirinda.getInt("Mda250mlPet")-soldMda250mlpetcase;
                 soldMirinda200mlglass=stockResultMirinda.getInt("Mda200mlGlass")-soldMda200mlglasscase;
                 soldMirinda250mlcan=stockResultMirinda.getInt("Mda250mlCan")-soldMda250mlcancase;
                 
             }
              
                ResultSet stockResultDew = statement.executeQuery("select Dew250mlPet,Dew500ml,Dew200mlGlass,Dew400ml,Dew250mlCan from Dew");

               while(stockResultDew.next()){
                                  
                 soldDew500ml=stockResultDew.getInt("Dew500ml")-soldDew500mlcase;
                 soldDew250mlpet=stockResultDew.getInt("Dew250mlPet")-soldDew250mlpetcase;
                 soldDew200mlglass=stockResultDew.getInt("Dew200mlGlass")-soldDew200mlglasscase;
                 soldDew400ml=stockResultDew.getInt("Dew400ml")-soldDew400mlcase;
                 soldDew250mlcan=stockResultDew.getInt("Dew250mlCan")-soldDew250mlcancase;
                 
             }
               
                ResultSet stockResultAquafina = statement.executeQuery("select AF1500ml,AF500ml from Aquafina");

               while(stockResultAquafina.next()){
                 
                 soldAquafina1500ml=stockResultAquafina.getInt("AF1500ml")-soldAqa1500mlcase;
                 soldAquafina500ml=stockResultAquafina.getInt("AF500ml")-soldAqa500mlcase;
             }
               
                ResultSet stockResultSlice = statement.executeQuery("select Slice250mlGlass from Slice");

             
               while(stockResultSlice.next()){
                 
                 soldSlice250mlglass=stockResultSlice.getInt("Slice250mlGlass")-soldSlice250mlglasscase;                 
             }
               
             // update query of sold 7up,Pepsi,Mirinda,Dew,Aquafina,Slice  
             update ="update sUp set sUp2L="+sold7up2L+",sUp1L="+sold7up1L+",sUp500ml="+sold7up500ml+",sUp250pet="+sold7up250mlpet+",sUp250mlGlass="+sold7up250mlglass+",sUp200mlGlass="+sold7up200mlglass+",sUp250mlCan="+sold7up250mlcan+" where sUpID="+ID+" ";
             statement.executeUpdate(update);
             update ="update Pepsi set Psi2L="+soldPepsi2L+",Psi1L="+soldPepsi1L+",Psi500ml="+soldPepsi500ml+",Psi500mldiet="+soldPepsi500mldiet+",Psi250mlPet="+soldPepsi250mlpet+",Psi250mlGlass="+soldPepsi250mlglass+",Psi200mlGlass="+soldPepsi200mlglass+",Psi250mlcan="+soldPepsi250mlcan+",Psi400ml="+soldPepsi400ml+" where PsiID="+ID+" ";
             statement.executeUpdate(update);
             update ="update Mirinda set Mda1L="+soldMirinda1L+",Mda500ml="+soldMirinda500ml+",Mda250mlPet="+soldMirinda250mlpet+",Mda200mlGlass="+soldMirinda200mlglass+",Mda250mlCan="+soldMirinda250mlcan+" where MdaID="+ID+" ";
             statement.executeUpdate(update);
             update ="update Dew set Dew500ml="+soldDew500ml+",Dew250mlPet="+soldDew250mlpet+",Dew200mlglass="+soldDew200mlglass+",Dew400ml="+soldDew400ml+",Dew250mlcan="+soldDew250mlcan+" where DewID="+ID+" ";
             statement.executeUpdate(update);
             update ="update Aquafina set AF1500ml="+soldAquafina1500ml+",AF500ml="+soldAquafina500ml+" where AquafinaID="+ID+" ";
             statement.executeUpdate(update);
             update ="update Slice set Slice250mlGlass="+soldSlice250mlglass+" where SliceID="+ID+" ";
             statement.executeUpdate(update);
             // System.out.println("check17");
        /*Intactstock update complete*/  
         
             /*End Database connect */
          } catch (Exception e) {  
             e.printStackTrace();  
         }
          
          //Transaciton statemaent update //
          
           int Profit;
           Profit = (int) ((int)Float.parseFloat(netCashTextfield.getText())-buyingCost);
           otherexpense = Integer.parseInt(otherExpenseTextfield.getText());
        
           try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BevarageDatabase;integratedSecurity=true");  
            Statement statement  = connection.createStatement();
            int  netcash = Integer.parseInt(netCashTextfield.getText());
            String query ;
            int shortage =(int)shortageMoney;
            System.out.println("Date "+date+"Net cash "+netcash+"Shortagee Money "+shortageMoney+"Buying cost"+buyingCost+"Profit"+Profit+"Other xpense "+otherexpense);
            query  = "insert into DailyTransactionstatement (Date,NetCash,ShortageMoney,BuyingCost,Profit,OtherExpense,ID)"
                    +"values ("+date+","+netcash+","+shortage+","+buyingCost+","+Profit+","+otherexpense+","+ID+")";
            System.out.println(query);
            statement.executeUpdate(query);
           
       }catch(ClassNotFoundException | SQLException e ){
           
       }
          
          
    }//GEN-LAST:event_InvoiceDoneButtonActionPerformed

    private void delivaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delivaryButtonActionPerformed
        int check = 1;
        /*delivary item counts & calculate the selected item price */
        try {
            dsUp2Litem=Integer.parseInt(dsUp2L.getText());
        
        System.out.println(dsUp2Litem);
        dsUp1Litem=Integer.parseInt(dsUp1L.getText());
        dsUp500mlitem=Integer.parseInt(dsUp500ml.getText());
        dsUp250mlpetitem=Integer.parseInt(dsUp250mlpet.getText());
        dsUp250mlglassitem=Integer.parseInt(dsUp250mlglass.getText());
        dsUp200mlglassitem=Integer.parseInt(dsUp200mlglass.getText());
        dsUp250mlcanitem=Integer.parseInt(dsUp250mlcan.getText());

        dPsi2Litem=Integer.parseInt(dPsi2L.getText());
        dPsi1Litem=Integer.parseInt(dPsi1L.getText());
        dPsi500mlitem=Integer.parseInt(dPsi500ml.getText());
        dPsi500mldietitem=Integer.parseInt(dPsi500mldiet.getText());
        dPsi250mlpetitem=Integer.parseInt(dPsi250mlpet.getText());
        dPsi250mlglassitem=Integer.parseInt(dPsi250mlglass.getText());
        dPsi200mlglassitem=Integer.parseInt(dPsi200mlglass.getText());
        dPsi400mlitem =Integer.parseInt(dPsi400ml.getText());
        dPsi250mlcanitem=Integer.parseInt(dPsi250mlcan.getText());

        dMda1Litem=Integer.parseInt(dMda1L.getText());
        dMda500mlitem=Integer.parseInt(dMda500ml.getText());
        dMda250mlpetitem=Integer.parseInt(dMda250mlpet.getText());
        dMda200mlglassitem=Integer.parseInt(dMda200mlglass.getText());
        dMda250mlcanitem=Integer.parseInt(dMda250mlcan.getText());

        dDew500mlitem=Integer.parseInt(dDew500ml.getText());
        dDew250mlpetitem=Integer.parseInt(dDew250mlpet.getText());
        dDew200mlglassitem=Integer.parseInt(dDew200mlglass.getText());
        dDew400mlitem=Integer.parseInt(dDew400ml.getText());
        dDew250mlcanitem=Integer.parseInt(dDew250mlcan.getText());

        dAqa1500mlitem=Integer.parseInt(dAqa1500ml.getText());
        dAqa500mlitem=Integer.parseInt(dAqa500ml.getText());

        dSlice250mlglassitem=Integer.parseInt(dSlice250mlglass.getText());
         }catch(Exception e ){
            JOptionPane.showMessageDialog(rootPane, "Please input number only");
            check = 0 ;
        }
        /*delivary price calculation */
        if(check==1){
        dsUpPrice =   dsUp2Litem*555+dsUp1Litem*654+dsUp500mlitem*660+dsUp250mlpetitem*335+dsUp250mlglassitem*310+dsUp200mlglassitem*294+dsUp250mlcanitem*774;

        dPsiPrice =   dPsi2Litem*555+dPsi1Litem*654+dPsi500mlitem*550+dPsi500mldietitem*660+dPsi250mlpetitem*315+dPsi250mlglassitem*310+dPsi200mlglassitem*210+dPsi400mlitem*432+dPsi250mlcanitem*774;

        dMdaPrice =   dMda1Litem*654+dMda500mlitem*660+dMda250mlpetitem*335+dMda200mlglassitem*294+dMda250mlcanitem*774;

        dDewPrice =   dDew500mlitem*660+dDew250mlpetitem*335+dDew200mlglassitem*294+dDew400mlitem*432+dDew250mlcanitem*774;

        dAqaPrice =   dAqa1500mlitem*168+dAqa500mlitem*266 ;

        dSlicePrice = dSlice250mlglassitem*310;

        selectedItemcost = dsUpPrice+dPsiPrice+dMdaPrice+dDewPrice+dAqaPrice+dSlicePrice;
        seletectedItemNo =dsUp2Litem+ dsUp1Litem+dsUp500mlitem+ dsUp250mlpetitem+dsUp250mlglassitem+dsUp200mlglassitem+dsUp250mlcanitem+dPsi2Litem+dPsi1Litem+dPsi500mlitem+dPsi500mldietitem+dPsi250mlpetitem+ dPsi250mlglassitem+dPsi200mlglassitem+dPsi400mlitem+dPsi250mlcanitem+dMda1Litem+ dMda500mlitem+ dMda250mlpetitem+dMda200mlglassitem+dMda250mlcanitem+dDew500mlitem+dDew250mlpetitem+dDew200mlglassitem+dDew400mlitem+dDew250mlcanitem+dAqa1500mlitem+dAqa500mlitem+dSlice250mlglassitem;
            System.out.println(selectedItemcost);
        }
    }//GEN-LAST:event_delivaryButtonActionPerformed

    private void selectedItemCostTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedItemCostTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedItemCostTextfieldActionPerformed

    private void selectItemcheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectItemcheckButtonActionPerformed
        // System.out.println(selectedItemcost);
        selectedItemCostTextfield.setText(Integer.toString(selectedItemcost)+"Tk");
    }//GEN-LAST:event_selectItemcheckButtonActionPerformed

    private void expectedSellingCashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expectedSellingCashButtonActionPerformed
        double result =  expectedSellingCost;  
        int ceil  = (int) Math.ceil(result);
        expectedSellingCashTextfield.setText( Integer.toString(ceil)+"Tk");
    }//GEN-LAST:event_expectedSellingCashButtonActionPerformed

    private void retunInfobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retunInfobuttonActionPerformed
        int check = 1;
        /*return piece string parsing */
       try{
        rsUp2Litemp= Integer.parseInt(rsUp2Lp.getText());
        rsUp1Litemp = Integer.parseInt(rsUp1Lp.getText());
        rsUp500mlitemp=Integer.parseInt(rsUp500mlp.getText());
        rsUp250mlpetitemp = Integer.parseInt(rsUp250mlpetp.getText());
        rsUp250mlglassitemp=Integer.parseInt(rsUp250mlglassp.getText());
        rsUp200mlglassitemp= Integer.parseInt(rsUp200mlglassp.getText());
        rsUp250mlcanitemp=Integer.parseInt(rsUp250mlcanp.getText());

        rPsi2Litemp= Integer.parseInt(rPsi2Lp.getText());
        rPsi1Litemp= Integer.parseInt(rPsi1Lp.getText());
        rPsi500mlitemp=Integer.parseInt(rPsi500mlp.getText());
        rPsi500mldietitemp=Integer.parseInt(rPsi500mldietp.getText());
        rPsi250mlpetitemp=Integer.parseInt(rPsi250mlpetp.getText());
        rPsi250mlglassitemp=Integer.parseInt(rPsi250mlglassp.getText());
        rPsi200mlglassitemp=Integer.parseInt(rPsi200mlglassp.getText());
        rPsi250mlcanitemp=Integer.parseInt(rPsi250mlcanp.getText());
        rPsi400mlitemp=  Integer.parseInt(rPsi400mlp.getText());

        rMda1Litemp= Integer.parseInt(rMda1Lp.getText());
        rMda500mlitemp=Integer.parseInt(rMda500mlp.getText());
        rMda250mlpetitemp=Integer.parseInt(rMda250mlpetp.getText());
        rMda200mlglassitemp=Integer.parseInt(rMda200mlglassp.getText());
        rMda250mlcanitemp=Integer.parseInt(rMda250mlcanp.getText());

        rDew500mlitemp= Integer.parseInt(rDew500mlp.getText());
        rDew250mlpetitemp= Integer.parseInt(rDew250mlpetp.getText());
        rDew200mlglassitemp=Integer.parseInt(rDew200mlglassp.getText());
        rDew400mlitemp=Integer.parseInt(rDew400mlp.getText());
        rDew250mlcanitemp=Integer.parseInt(rDew250mlcanp.getText());

        rAqa1500mlitemp=Integer.parseInt(rAqa1500mlp.getText());
        rAqa500mlitemp=Integer.parseInt(rAqa500mlp.getText());

        rSlice250mlglassitemp=Integer.parseInt(rSlice250mlglassp.getText());

        /*returp case  string parsing */
        rsUp2Litemcase= Integer.parseInt(rsUp2Lc.getText());//7up
        rsUp1Litemcase = Integer.parseInt(rsUp1Lc.getText());
        rsUp500mlitemcase=Integer.parseInt(rsUp500mlc.getText());
        rsUp250mlpetitemcase = Integer.parseInt(rsUp250mlpetc.getText());
        rsUp250mlglassitemcase=Integer.parseInt(rsUp250mlglassc.getText());
        rsUp200mlglassitemcase= Integer.parseInt(rsUp200mlglassc.getText());
        rsUp250mlcanitemcase=Integer.parseInt(rsUp250mlcanc.getText());

        rPsi2Litemcase= Integer.parseInt(rPsi2Lc.getText());//Pepsi
        rPsi1Litemcase= Integer.parseInt(rPsi1Lc.getText());
        rPsi500mlitemcase=Integer.parseInt(rPsi500mlc.getText());
        rPsi500mldietitemcase=Integer.parseInt(rPsi500mldietc.getText());
        rPsi250mlpetitemcase=Integer.parseInt(rPsi250mlpetc.getText());
        rPsi250mlglassitemcase=Integer.parseInt(rPsi250mlglassc.getText());
        rPsi200mlglassitemcase=Integer.parseInt(rPsi200mlglassc.getText());
        rPsi250mlcanitemcase=Integer.parseInt(rPsi250mlcanc.getText());
        rPsi400mlitemcase=  Integer.parseInt(rPsi400mlc.getText());

        rMda1Litemcase= Integer.parseInt(rMda1Lc.getText());//Mirinda
        rMda500mlitemcase=Integer.parseInt(rMda500mlc.getText());
        rMda250mlpetitemcase=Integer.parseInt(rMda250mlpetc.getText());
        rMda200mlglassitemcase=Integer.parseInt(rMda200mlglassc.getText());
        rMda250mlcanitemcase=Integer.parseInt(rMda250mlcanc.getText());

        rDew500mlitemcase= Integer.parseInt(rDew500mlc.getText());//Dew
        rDew250mlpetitemcase= Integer.parseInt(rDew250mlpetc.getText());
        rDew200mlglassitemcase=Integer.parseInt(rDew200mlglassc.getText());
        rDew400mlitemcase=Integer.parseInt(rDew400mlc.getText());
        rDew250mlcanitemcase=Integer.parseInt(rDew250mlcanc.getText());

        rAqa1500mlitemcase=Integer.parseInt(rAqa1500mlc.getText());//Aquafina
        rAqa500mlitemcase=Integer.parseInt(rAqa500mlc.getText());
        rSlice250mlglassitemcase=Integer.parseInt(rSlice250mlglassc.getText());//slice
       }catch(Exception e ){
           JOptionPane.showMessageDialog(rootPane, "Please check your box inputs are correct ");
           check = 0 ;
       }

       
       if(check == 1){
        /* calculating sold 7up in case & piece */
        if(Integer.parseInt(rsUp2Lp.getText())>0){
            soldsUp2Lcase   = (dsUp2Litem-rsUp2Litemcase)-1;
            sUp2Lsold.setText(Integer.toString(soldsUp2Lcase));
            soldsUp2Lp     = (6-rsUp2Litemp);
            sUp2Lsoldp.setText(Integer.toString(soldsUp2Lp));
        }
        else {
            soldsUp2Lcase   = (dsUp2Litem-rsUp2Litemcase);
            sUp2Lsold.setText(Integer.toString(soldsUp2Lcase));
        }

        if(Integer.parseInt(rsUp1Lp.getText())>0){
            soldsUp1Lcase   = (dsUp1Litem-rsUp1Litemcase)-1;
            soldsUp1Lp       = 12-rsUp1Litemp;
            sUp1Lsold.setText(Integer.toString( soldsUp1Lcase));
             sUp1Lsoldp.setText(Integer.toString( soldsUp1Lp));
        }
        else {
            soldsUp1Lcase   = (dsUp1Litem-rsUp1Litemp);
            sUp1Lsold.setText(Integer.toString( soldsUp1Lcase));
        }

        if(Integer.parseInt(rsUp500mlp.getText())>0){
            soldsUp500mlcase = (dsUp500mlitem-rsUp500mlitemcase)-1;
            soldsUp500mlp     =    (24-rsUp500mlitemp);
            
            sUp500mlsold.setText(Integer.toString(soldsUp500mlcase));
             sUp500mlsoldp.setText(Integer.toString(soldsUp500mlp));

        }
        else {
            soldsUp500mlcase  =   (dsUp500mlitem-rsUp500mlitemcase);
            sUp500mlsold.setText(Integer.toString(soldsUp500mlcase));
        }
        if(Integer.parseInt(rsUp250mlpetp.getText())>0){
            soldsUp250mlpetcase   =   (dsUp250mlpetitem-rsUp250mlpetitemcase)-1;
            soldsUp250mlpetp   =      (24-rsUp250mlpetitemp);
            sUp250mlpetsold.setText(Integer.toString(soldsUp250mlpetcase));
            sUp250mlpetsoldp.setText(Integer.toString(soldsUp250mlpetp));
        }
        else  {
            soldsUp250mlpetcase   =   (dsUp250mlpetitem-rsUp250mlpetitemcase);
            sUp250mlpetsold.setText(Integer.toString(soldsUp250mlpetcase));
        }

        if(Integer.parseInt(rsUp250mlglassp.getText())>0){
            soldsUp250mlglasscase   =   (dsUp250mlpetitem-rsUp250mlglassitemcase)-1;
            soldsUp250mlglassp =   (24-rsUp250mlglassitemp);
            
            sUp250mlglasssold.setText(Integer.toString( soldsUp250mlglasscase));
            sUp250mlglasssoldp.setText(Integer.toString( soldsUp250mlglassp));
        }
        else {
            
            soldsUp250mlglasscase   =   (dsUp250mlglassitem-rsUp250mlglassitemcase);
            sUp250mlglasssold.setText(Integer.toString( soldsUp250mlglasscase));
        }

        if(Integer.parseInt(rsUp200mlglassp.getText())>0) {
            soldsUp200mlglasscase   =   (dsUp200mlglassitem-rsUp200mlglassitemcase)-1;
            soldsUp200mlglassp =   (24-rsUp200mlglassitemp);
            sUp200mlglasssold.setText(Integer.toString(soldsUp200mlglasscase));
             sUp200mlglasssoldp.setText(Integer.toString(soldsUp200mlglassp));
        }
        else  {
            soldsUp200mlglasscase   =   (dsUp200mlglassitem-rsUp200mlglassitemcase);
            sUp200mlglasssold.setText(Integer.toString(soldsUp200mlglasscase));
        }

        if(Integer.parseInt(rsUp250mlcanp.getText())>0) {
            soldsUp250mlcancase   =   (dsUp250mlcanitem-rsUp250mlcanitemcase)-1;
            soldsUp250mlcanp   =       (24-rsUp250mlcanitemp);
           
            sUp250mlcansold.setText(Integer.toString( soldsUp250mlcancase));
            sUp250mlcansoldp.setText(Integer.toString( soldsUp250mlcanp));
        }
        else {
            soldsUp250mlcancase   =   (dsUp250mlcanitem-rsUp250mlcanitemcase);
            sUp250mlcansold.setText(Integer.toString( soldsUp250mlcancase));
        }

        /*sold  calculating Pepsi in case & piece */

        if(Integer.parseInt(rPsi2Lp.getText())>0) {
            soldPsi2Lcase =  (dPsi2Litem- rPsi2Litemcase)-1;
            soldPsi2Lp        = 6-rPsi2Litemp;
            Psi2Lsold.setText(Integer.toString(soldPsi2Lcase));
            Psi2Lsoldp.setText(Integer.toString(soldPsi2Lp));
        }
        else {
            soldPsi2Lcase =  (dPsi2Litem- rPsi2Litemcase);
            Psi2Lsold.setText(Integer.toString(soldPsi2Lcase));
        }

        if (Integer.parseInt(rPsi1Lp.getText())>0){
            soldPsi1Lcase =  (dPsi1Litem- rPsi1Litemcase)-1;
            soldPsi1Lp        = 12-rPsi1Litemp;
            Psi1Lsold.setText(Integer.toString(soldPsi1Lcase));
            Psi1Lsoldp.setText(Integer.toString(soldPsi1Lp));
        }
        else {
            soldPsi1Lcase =  (dPsi1Litem- rPsi1Litemcase);
              Psi1Lsold.setText(Integer.toString(soldPsi1Lcase));
        }
        if(Integer.parseInt(rPsi500mlp.getText())>0) {
            soldPsi500mlcase = (dPsi500mlitem- rPsi500mlitemcase)-1;
            soldPsi500mlp     = 24-rPsi500mlitemp;
            Psi500mlsold.setText(Integer.toString(soldPsi500mlcase));
            Psi500mlsoldp.setText(Integer.toString(soldPsi500mlp));
        }
        else  {
            soldPsi500mlcase = (dPsi500mlitem- rPsi500mlitemcase);
            Psi500mlsold.setText(Integer.toString(soldPsi500mlcase));
        }

        if(Integer.parseInt(rPsi500mldietp.getText())>0){
            soldPsi500mldietcase = (dPsi500mldietitem- rPsi500mldietitemcase)-1;
            soldPsi500mldietp = 24-rPsi500mldietitemp;
            Psi500mldietsold.setText(Integer.toString(soldPsi500mldietcase));
            Psi500mldietsoldp.setText(Integer.toString(soldPsi500mldietp));
            
        }
        else{
            soldPsi500mldietcase = (dPsi500mldietitem- rPsi500mldietitemcase);
            Psi500mldietsold.setText(Integer.toString(soldPsi500mldietcase));
        }
        if(Integer.parseInt(rPsi250mlpetp.getText())>0) {
            soldPsi250mlpetcase = (dPsi250mlpetitem- rPsi250mlpetitemcase)-1;
            soldPsi250mlpetp  = 24-rPsi250mlpetitemp;
            Psi250mlpetsold.setText(Integer.toString(soldPsi250mlpetcase));
            Psi250mlpetsoldp.setText(Integer.toString(soldPsi250mlpetp));
            
        }
        else {
            soldPsi250mlpetcase = (dPsi250mlpetitem- rPsi250mlpetitemcase);
            Psi250mlpetsold.setText(Integer.toString(soldPsi250mlpetcase));
        }
        if(Integer.parseInt(rPsi250mlglassp.getText())>0){
            soldPsi250mlglasscase = (dPsi250mlglassitem- rPsi250mlglassitemcase)-1;
            soldPsi250mlglassp= 24-rPsi250mlglassitemp;
            Psi250mlglasssold.setText(Integer.toString(soldPsi250mlglasscase));
            Psi250mlglasssoldp.setText(Integer.toString(soldPsi250mlglassp));
            
            
        }
        else {
            soldPsi250mlglasscase = (dPsi250mlglassitem- rPsi250mlglassitemcase);
            Psi250mlglasssold.setText(Integer.toString(soldPsi250mlglasscase));
        }
        if(Integer.parseInt(rPsi200mlglassp.getText())>0){
            soldPsi200mlglasscase = (dPsi200mlglassitem- rPsi200mlglassitemcase)-1;
            soldPsi200mlglassp= 24-rPsi200mlglassitemp;
            Psi200mlglasssold.setText(Integer.toString(soldPsi200mlglasscase));
            Psi200mlglasssoldp.setText(Integer.toString(soldPsi200mlglassp));
            
        }
        else {
            soldPsi200mlglasscase = (dPsi200mlglassitem- rPsi200mlglassitemcase);
            Psi200mlglasssold.setText(Integer.toString(soldPsi200mlglasscase));
        }
        if(Integer.parseInt(rPsi400mlp.getText())>0){
            soldPsi400mlcase = (dPsi400mlitem- rPsi400mlitemcase)-1;
            soldPsi400mlp     = 24-rPsi400mlitemp;
            Psi400mlsold.setText(Integer.toString(soldPsi400mlcase));
            Psi400mlsoldp.setText(Integer.toString(soldPsi400mlp));
            
        }
        else  {
            soldPsi400mlcase = (dPsi400mlitem- rPsi400mlitemcase);
            Psi400mlsold.setText(Integer.toString(soldPsi400mlcase));
        }
        if(Integer.parseInt(rPsi250mlcanp.getText())>0){

            soldPsi250mlcancase = (dPsi250mlcanitem- rPsi250mlcanitemcase)-1;
            soldPsi250mlcanp  = 24-rPsi250mlcanitemp;
            Psi250mlcansold.setText(Integer.toString(soldPsi250mlcancase));
            Psi250mlcansoldp.setText(Integer.toString(soldPsi250mlcanp));
            
        }
        else{
            soldPsi250mlcancase = (dPsi250mlcanitem- rPsi250mlcanitemcase);
            Psi250mlcansold.setText(Integer.toString(soldPsi250mlcancase));
        }

        /* calculating sold  Mrinda in case & piece */

        if(Integer.parseInt(rMda1Lp.getText())>0){
            soldMda1Lcase  = (dMda1Litem-rMda1Litemcase) -1 ;
            soldMda1Lp         = 12-rMda1Litemp;
            
            Mirinda1Lsold.setText(Integer.toString(soldMda1Lcase));
             Mirinda1Lsoldp.setText(Integer.toString(soldMda1Lp));
        }
        else {
            soldMda1Lcase         = (dMda1Litem-rMda1Litemcase)  ;
             Mirinda1Lsold.setText(Integer.toString(soldMda1Lcase));
        }

        if(Integer.parseInt(rMda500mlp.getText())>0){
            soldMda500mlcase      = (dMda500mlitem-rMda500mlitemcase) -1 ;
            soldMda500mlp      = 24-rMda500mlitemp;
             Mirinda500mlsold.setText(Integer.toString(soldMda500mlcase));
              Mirinda500mlsoldp.setText(Integer.toString(soldMda500mlp));
            
        }
        else {
            soldMda500mlcase= (dMda500mlitem-rMda500mlitemcase)  ;
             Mirinda500mlsold.setText(Integer.toString(soldMda500mlcase));
        }

        if(Integer.parseInt(rMda250mlpetp.getText())>0){
            soldMda250mlpetcase   = (dMda250mlpetitem-rMda250mlpetitemcase) -1 ;
            soldMda250mlpetp   = 24-rMda250mlpetitemp;
             Mirinda250mlpetsold.setText(Integer.toString(soldMda250mlpetcase));
              Mirinda250mlpetsoldp.setText(Integer.toString(soldMda250mlpetp));
        }
        else {
            soldMda250mlpetcase   = (dMda250mlpetitem-rMda250mlpetitemcase) ;
             Mirinda250mlpetsold.setText(Integer.toString(soldMda250mlpetcase));
        }

        if(Integer.parseInt(rMda200mlglassp.getText())>0){
            soldMda200mlglasscase = (dMda200mlglassitem-rMda200mlglassitemcase)-1 ;
            soldMda200mlglassp = 24-rMda200mlglassitemp;
             Mirinda200mlglasssold.setText(Integer.toString(soldMda200mlglasscase));
              Mirinda200mlglasssoldp.setText(Integer.toString(soldMda200mlglassp));
        }
        else {
            soldMda200mlglasscase = (dMda200mlglassitem-rMda200mlglassitemcase) ;
             Mirinda200mlglasssold.setText(Integer.toString(soldMda200mlglasscase));
        }

        if(Integer.parseInt(rMda250mlcanp.getText())>0){
            soldMda250mlcancase   = (dMda250mlcanitem-rMda250mlcanitemcase) -1 ;
            soldMda250mlcanp   = 24-rMda250mlcanitemp;
             Mirinda250mlcansold.setText(Integer.toString(soldMda250mlcancase));
              Mirinda250mlcansoldp.setText(Integer.toString(soldMda250mlcanp));
        }
        else {
            soldMda250mlcancase   = (dMda250mlcanitem-rMda250mlcanitemcase) ;
             Mirinda250mlcansold.setText(Integer.toString(soldMda250mlcancase));
        }

        /*sold calculating  Dew in case & piece */

        if(Integer.parseInt(rDew500mlp.getText())>0){
            soldDew500mlcase         = (dDew500mlitem-rDew500mlitemcase) -1 ;
            soldDew500mlp         =     24-rDew500mlitemp;
            Dew500mlsold.setText(Integer.toString(soldDew500mlcase));
             Dew500mlsoldp.setText(Integer.toString(soldDew500mlp));
        }
        else {
            soldDew500mlcase         = (dDew500mlitem-rDew500mlitemcase) ;
             Dew500mlsold.setText(Integer.toString(soldDew500mlcase));
        }

        if(Integer.parseInt(rDew250mlpetp.getText())>0){
            soldDew250mlpetcase      = (dDew250mlpetitem-rDew250mlpetitemcase) -1 ;
            soldDew250mlpetp      = 24-rDew250mlpetitemp;
             Dew250mlpetsold.setText(Integer.toString(soldDew250mlpetcase));
              Dew250mlpetsoldp.setText(Integer.toString(soldDew250mlpetp));
        }
        else {
            soldDew250mlpetcase      = (dDew250mlpetitem-rDew250mlpetitemcase)  ;
             Dew250mlpetsold.setText(Integer.toString(soldDew250mlpetcase));
        }

        if(Integer.parseInt(rDew200mlglassp.getText())>0){
            soldDew200mlglasscase    = (dDew200mlglassitem-rDew200mlglassitemcase) -1 ;
            soldDew200mlglassp    = 24-rDew200mlglassitemp;
             Dew200mlglasssold.setText(Integer.toString(soldDew200mlglasscase));
              Dew200mlglasssoldp.setText(Integer.toString(soldDew200mlglassp));
        }
        else {
            soldDew200mlglasscase    = (dDew200mlglassitem-rDew200mlglassitemcase)  ;
             Dew200mlglasssold.setText(Integer.toString(soldDew200mlglasscase));
        }

        if(Integer.parseInt(rDew400mlp.getText())>0){
            soldDew400mlcase    = (dDew400mlitem-rDew400mlitemcase)-1 ;
            soldDew400mlp         = 24-rDew400mlitemp;
             Dew400mlsold.setText(Integer.toString(soldDew400mlcase));
             Dew400mlsoldp.setText(Integer.toString(soldDew400mlp));
        }
        else {
            soldDew400mlcase   = (dDew400mlitem-rDew400mlitemcase) ;
            System.out.println(dDew400mlitem+" delivary 400ml case");
            System.out.println(rDew400mlitemcase+" return 400ml case");
            Dew400mlsold.setText(Integer.toString(soldDew400mlcase));
        }

        if(Integer.parseInt(rDew250mlcanp.getText())>0){
            soldDew250mlcancase      = (dDew250mlcanitem-rDew250mlcanitemcase) -1 ;
            soldDew250mlcanp      = 24-rDew250mlcanitemp;
             Dew250mlcansold.setText(Integer.toString(soldDew250mlcancase));
              Dew250mlsoldcanp.setText(Integer.toString(soldDew250mlcanp));
        }
        else {
            soldDew250mlcancase      = (dDew250mlcanitem-rDew250mlcanitemcase)  ;
             Dew250mlcansold.setText(Integer.toString(soldDew250mlcancase));
        }

        /* calculating sold Aquafina in case & piece */

        if(Integer.parseInt(rAqa1500mlp.getText())>0){
            soldAqa1500mlcase = (dAqa1500mlitem-rAqa1500mlitemcase)-1;
            soldAqa1500mlp   = 9 - rAqa1500mlitemp;
            
            Aqa1500mlsold.setText(Integer.toString( soldAqa1500mlcase));
              Aqa1500mlsoldp.setText(Integer.toString(soldAqa1500mlp));
        }
        else {
            soldAqa1500mlcase = (dAqa1500mlitem-rAqa1500mlitemcase);
            Aqa1500mlsold.setText(Integer.toString( soldAqa1500mlcase));
        }
        if(Integer.parseInt(rAqa500mlp.getText())>0){
            soldAqa500mlcase  = (dAqa500mlitem -rAqa500mlitemcase)-1;
            soldAqa500mlp   = 24 - rAqa500mlitemp;
            Aqa500mlsold.setText(Integer.toString( soldAqa500mlcase));
            Aqa500mlsoldp.setText(Integer.toString( soldAqa500mlp));
        }
        else {
            soldAqa500mlcase  = (dAqa500mlitem -rAqa500mlitemcase);
            Aqa500mlsold.setText(Integer.toString( soldAqa500mlcase));
        }

        /* calculating sold Slice  in case & piece */

        if(Integer.parseInt(rSlice250mlglassp.getText())>0){
            soldSlice250mlglasscase = (dSlice250mlglassitem - rSlice250mlglassitemcase)-1;
            soldSlice250mlglassp    =  24- rSlice250mlglassitemp; 
            Slice250mlglasssold.setText(Integer.toString(soldSlice250mlglasscase));
            Slice250mlglasssoldp.setText(Integer.toString(soldSlice250mlglassp)); 
        } else {
            soldSlice250mlglasscase = (dSlice250mlglassitem - rSlice250mlglassitemcase);
              Slice250mlglasssold.setText(Integer.toString(soldSlice250mlglasscase));
        }
        
        
      
      
      
    
        
        
         returnCaseNo = soldsUp250mlcancase+soldsUp200mlglasscase+soldsUp250mlglasscase+soldsUp250mlpetcase+soldsUp500mlcase+soldsUp1Lcase+soldsUp2Lcase+soldSlice250mlglasscase+soldAqa1500mlcase+soldAqa500mlcase+soldDew500mlcase+soldDew250mlpetcase+soldDew400mlcase+soldDew250mlcancase+soldDew200mlglasscase+soldPsi2Lcase+soldPsi1Lcase+soldPsi500mlcase+soldPsi500mldietcase+soldPsi250mlpetcase+soldPsi250mlglasscase+soldPsi200mlglasscase+soldPsi400mlcase+soldPsi250mlcancase+soldMda1Lcase+soldMda500mlcase+soldMda250mlpetcase+soldMda200mlglasscase+soldMda250mlcancase;
        //fuck you

        /*Expected 7up Price */
        float  soldsUp2Lprice=0,soldsUp1Lprice=0,soldsUp500mlprice=0,soldsUp250mlpetprice=0,soldsUp250mlglassprice=0,soldsUp200mlglassprice=0,soldsUp250mlcanprice=0;

        soldsUp2Lprice  =        (float) ((soldsUp2Lcase*555)+(soldsUp2Lp*92.50));
        soldsUp1Lprice =         (float) ((soldsUp1Lcase*654)+(soldsUp1Lp*54.50));
        soldsUp500mlprice    =   (float) ((soldsUp500mlcase*660)+(soldsUp500mlp*27.50));
        soldsUp250mlpetprice   = (float) ((soldsUp250mlpetcase*335)+(soldsUp250mlpetp*13.95));
        soldsUp250mlglassprice = (float) ((soldsUp250mlglasscase*310)+(soldsUp250mlglassp*12.91));
        soldsUp200mlglassprice = (float) ((soldsUp200mlglasscase*294)+(soldsUp200mlglassp*12.25));
        soldsUp250mlcanprice   = (float) ((soldsUp250mlcancase*774)+(soldsUp250mlcanp*32.25));
        /*  System.out.println("sold 7up 2L price "+soldsUp2Lprice);
        System.out.println("sold 7up 1L price "+soldsUp1Lprice);
        System.out.println("sold 7up 500ml price "+soldsUp500mlprice);
        System.out.println("sold 7up 250ml pet price "+soldsUp250mlpetprice);
        System.out.println("sold 7up 250ml glass price "+soldsUp250mlglassprice);
        System.out.println("sold 7up 200ml glass price "+soldsUp200mlglassprice);
        System.out.println("sold 7up 250ml can  price "+soldsUp250mlcanprice);*/

        expectedsUpprice = soldsUp2Lprice+soldsUp1Lprice+soldsUp500mlprice+soldsUp250mlpetprice+soldsUp250mlglassprice+soldsUp200mlglassprice+soldsUp250mlcanprice;
        System.out.println("Expected 7up price "+expectedsUpprice);
        /*Expected Pepsi Price */
        float soldPsi2LPrice=0,soldPsi1LPrice=0,soldPsi500mlPrice=0,soldPsi500mldietPrice=0,soldPsi250mlpetPrice=0,soldPsi250mlglassPrice=0,soldPsi200mlglassPrice=0,soldPsi400mlPrice=0,soldPsi250mlcanPrice=0;

        soldPsi2LPrice =        (float) ((soldPsi2Lcase*555)+(soldPsi2Lp*92.50));
        soldPsi1LPrice =        (float) ((soldPsi1Lcase*654)+(soldPsi1Lp*54.50));
        soldPsi500mlPrice =     (float) ((soldPsi500mlcase*550)+(soldPsi500mlp*22.91));
        soldPsi250mlpetPrice =  (float) ((soldPsi250mlpetcase*315)+(soldPsi250mlpetp*13.125));
        soldPsi500mldietPrice = (float) ((soldPsi500mldietcase*660)+(soldPsi500mldietp*27.50));
        soldPsi250mlglassPrice= (float) ((soldPsi250mlglasscase*310)+(soldPsi250mlglassp*12.91));
        soldPsi200mlglassPrice =(float) ((soldPsi200mlglasscase*210)+(soldPsi200mlglassp*8.75));
        soldPsi400mlPrice =     (float) ((soldPsi400mlcase*432)+(soldPsi400mlp*18));
        soldPsi250mlcanPrice =  (float) ((soldPsi250mlcancase*774)+(soldPsi250mlcanp*32.25));

        expectedPepsiprice = soldPsi2LPrice+soldPsi1LPrice+soldPsi500mlPrice+soldPsi500mldietPrice+soldPsi250mlpetPrice+soldPsi250mlglassPrice+soldPsi200mlglassPrice+soldPsi400mlPrice+soldPsi250mlcanPrice;
        System.out.println("Expected Pepsi cost "+expectedPepsiprice);
        /*Expected Mirinda Price */
        float  soldMda1LPrice=0,soldMda500mlPrice=0,soldMda250mlpetPrice=0,soldMda200mlglassPrice=0,soldMda250mlcanPrice=0;
        soldMda1LPrice =        (float) ((soldMda1Lcase*654)+(soldMda1Lp*54.50));
        soldMda500mlPrice =     (float) ((soldMda500mlcase*660)+(soldMda500mlp*27.50));
        soldMda250mlpetPrice =  (float) ((soldMda250mlpetcase*335)+(soldMda250mlpetp*13.95));
        soldMda200mlglassPrice =(float) ((soldMda200mlglasscase*294)+(soldMda200mlglassp*12.25));
        soldMda250mlcanPrice =  (float) ((soldMda250mlcancase*774)+(soldMda250mlcanp*32.25));

        expectedMirindaprice = soldMda1LPrice+soldMda500mlPrice+soldMda250mlpetPrice+soldMda200mlglassPrice+soldMda250mlcanPrice;
        System.out.println("Expected Mirinda cost "+expectedMirindaprice);
        /*Expected Dew Price */
        float soldDew500mlPrice=0,soldDew250mlpetPrice=0,soldDew200mlglassPrice=0,soldDew400mlPrice=0,soldDew250mlcanPrice=0;
        soldDew500mlPrice =    (float) ((soldDew500mlcase*660)+(soldDew500mlp*27.50));
        soldDew250mlpetPrice = (float) ((soldDew250mlpetcase*335)+(soldDew250mlpetp*13.95));
        soldDew200mlglassPrice=(float) ((soldDew200mlglasscase*294)+(soldDew200mlglassp*12.25));
        soldDew400mlPrice =    (float) ((soldDew400mlcase*432)+(soldDew400mlp*18));
        soldDew250mlcanPrice = (float) ((soldDew250mlcancase*774)+(soldDew250mlcanp*32.25));

        expectedDewprice = soldDew500mlPrice+soldDew250mlpetPrice+soldDew200mlglassPrice+soldDew250mlcanPrice+soldDew400mlPrice;
        System.out.println("Expected Dew cost "+expectedDewprice);
        /*Expected Aquafina Price */
        float soldAqa1500mlPrice=0,soldAqa500mlPrice=0;
        soldAqa1500mlPrice =(float) ((soldAqa1500mlcase*168)+(soldAqa1500mlp*18.66));
        soldAqa500mlPrice  =(float) ((soldAqa500mlcase*266)+(soldAqa500mlp*11.08));

        expectedAqaprice = soldAqa1500mlPrice+soldAqa500mlPrice;
        System.out.println("Expected Aquafina  cost "+expectedAqaprice);
        /*Expected Slice  Price */
        float soldSlicePrice=0;

        soldSlicePrice = (float) ((soldSlice250mlglasscase*310)+(soldSlice250mlglassp*12.91));

        expectedSliceprice = soldSlicePrice;
        System.out.println("Expected  Slice cost "+expectedSliceprice);

        expectedSellingCost =  (expectedsUpprice+expectedPepsiprice+expectedMirindaprice+expectedDewprice+expectedAqaprice+expectedSliceprice);
        System.out.println();
        //buying cost start

        // float bsUpprice,bPsiprice,bMdaprice,bDewprice,bAqaprice,bSliceprice;
        /*Expected 7up Price */
        //float bsUp2L=0,bsUp1L=0,bsUp500ml=0,bsUp250mlpet=0,bsUp250mlglass=0,bsUp200mlglass=0,bsUp250mlcan=0;
        bsUp2L =         (float) ((soldsUp2Lcase*537)+(soldsUp2Lp*89.50));
        bsUp1L     =     (float)((soldsUp1Lcase*632)+soldsUp1Lp*52.66);
        bsUp500ml      = (float) ((soldsUp500mlcase*638)+(soldsUp500mlp*26.58));
        bsUp250mlpet   = (float) ((soldsUp250mlpetcase*325)+(soldsUp250mlpetp*13.54));
        bsUp250mlglass = (float) ((soldsUp250mlglasscase*293)+(soldsUp250mlglassp*12.20));
        bsUp200mlglass = (float) ((soldsUp200mlglasscase*277)+(soldsUp200mlglassp*11.54));
        bsUp250mlcan   = (float) ((soldsUp250mlcancase*751)+(soldsUp250mlcanp*31.29));
           System.out.println("buying price of 7uo 200ml glass "+bsUp200mlglass);
        bsUpprice  = bsUp2L+bsUp1L+bsUp500ml+bsUp250mlpet+bsUp250mlglass+bsUp200mlglass+bsUp250mlcan;
        System.out.println("buying cost of 7up "+bsUpprice);
        /*Expected Pepsi Price */

        bPepsi2L = (float) ((soldPsi2Lcase*537)+(soldPsi2Lp*89.50));
        bPepsi1L = (float) ((soldPsi1Lcase*632)+(soldPsi1Lp*52.66));
        bPepsi500ml = (float) ((soldPsi500mlcase*532)+(soldPsi500mlp*22.16));
        bPepsi250mlpet = (float) ((soldPsi250mlpetcase*306)+(soldPsi250mlpetp*12.75));
        bPepsi500mldiet = (float) ((soldPsi500mldietcase*638)+(soldPsi500mldietp*26.58));
        bPepsi250mlglass = (float) ((soldPsi250mlglasscase*293)+(soldPsi250mlglassp*12.20));
        bPepsi200mlglass = (float) ((soldPsi200mlglasscase*198)+(soldPsi200mlglassp*8.25));
        bPepsi400ml = (float) ((soldPsi400mlcase*418)+(soldPsi400mlp*17.41));
        bPepsi250mlcan = (float) ((soldPsi250mlcancase*751)+(soldPsi250mlcanp*31.29));

        bPsiprice = bPepsi2L+bPepsi1L+bPepsi500ml+bPepsi500mldiet+bPepsi250mlpet+bPepsi250mlglass+bPepsi200mlglass+bPepsi400ml+bPepsi250mlcan;
        System.out.println("buying cost of pepsi "+bPsiprice);
        /*Expected Mirinda Price */

        bMda1L = (float) (soldMda1Lcase*632+soldMda1Lp*52.66);
        bMda500ml = (float) (soldMda500mlcase*638+soldMda500mlp*26.58);
        bMda250mlpet = (float) (soldMda250mlpetcase*325+soldMda250mlpetp*13.54);
        bMda200mlglass = (float) (soldMda200mlglasscase*277+soldMda200mlglassp*11.54);
        bMda250mlcan = (float) (soldMda250mlcancase*751+soldMda250mlcanp*31.29);

        bMdaprice = bMda1L+bMda500ml+bMda250mlpet+bMda200mlglass+bMda250mlcan;

        System.out.println("buying cost of Mirinda"+bMdaprice);/*Expected Dew Price */

        bDew500ml =         (float) ((soldDew500mlcase*638)+(soldDew500mlp*26.58));
        bDew250mlpet =      (float) ((soldDew250mlpetcase*325)+(soldMda250mlpetp*13.54));
        bDew200mlglass =    (float) ((soldDew200mlglasscase*277)+(soldMda200mlglassp*11.54));
        bDew400ml =         (float) ((soldDew400mlcase*418)+(soldDew400mlp*17.41));
        bDew250mlcan =      (float) ((soldDew250mlcancase*751)+(soldMda250mlcanp*31.29));

        bDewprice = bDew500ml+bDew250mlpet+bDew200mlglass+bDew250mlcan+bDew400ml;
        System.out.println("buying cost of Dew "+bDewprice);
        /*Expected Aquafina Price */

        bAqa1500ml =(float) ((soldAqa1500mlcase*158)+(soldAqa1500mlp*17.55));
        bAqa500ml  =(float) ((soldAqa500mlcase*250)+(soldAqa500mlp*10.41));
        bAqaprice = bAqa1500ml+bAqa500ml;
        System.out.println("buying cost of Aquafina "+bAqaprice);
        /*Expected Slice  Price */

        bSlice250mlglassprice = (float) ((soldSlice250mlglasscase*293)+(soldSlice250mlglassp*12.20));

        bSliceprice = bSlice250mlglassprice;
        System.out.println("buying cost of Slcie "+bSliceprice);
        
           System.out.println("Profit by selling sup "+(expectedsUpprice-bsUpprice));
           System.out.println("Profit by selling Pepsi "+(expectedPepsiprice-bPsiprice));
           System.out.println("Profit by selling Dew "+(expectedDewprice-bDewprice));
           System.out.println("Profit by selling Mirinda "+(expectedMirindaprice-bMdaprice));
           System.out.println("Profit by selling Aqufina "+(expectedAqaprice-bAqaprice));
           System.out.println("Profit by selling Slice "+(expectedSliceprice-bSliceprice));
               
        buyingCost =  (bsUpprice+bPsiprice+bMdaprice+bDewprice+bAqaprice+bSliceprice);
       }
        //buying cost complete
    }//GEN-LAST:event_retunInfobuttonActionPerformed

    private void expectedSellingCashTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expectedSellingCashTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expectedSellingCashTextfieldActionPerformed

    private void totaldelinsalecaseNoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaldelinsalecaseNoButtonActionPerformed
        totalDelivarycaseNo.setText(Integer.toString(seletectedItemNo));
        totalSalecaseNo.setText(Integer.toString(returnCaseNo));
    }//GEN-LAST:event_totaldelinsalecaseNoButtonActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Aqa1500mlsold;
    private javax.swing.JTextField Aqa1500mlsoldp;
    private javax.swing.JTextField Aqa500mlsold;
    private javax.swing.JTextField Aqa500mlsoldp;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JTextField Dew200mlglasssold;
    private javax.swing.JTextField Dew200mlglasssoldp;
    private javax.swing.JTextField Dew250mlcansold;
    private javax.swing.JTextField Dew250mlpetsold;
    private javax.swing.JTextField Dew250mlpetsoldp;
    private javax.swing.JTextField Dew250mlsoldcanp;
    private javax.swing.JTextField Dew400mlsold;
    private javax.swing.JTextField Dew400mlsoldp;
    private javax.swing.JTextField Dew500mlsold;
    private javax.swing.JTextField Dew500mlsoldp;
    private javax.swing.JButton InvoiceDoneButton;
    private javax.swing.JTextField Mirinda1Lsold;
    private javax.swing.JTextField Mirinda1Lsoldp;
    private javax.swing.JTextField Mirinda200mlglasssold;
    private javax.swing.JTextField Mirinda200mlglasssoldp;
    private javax.swing.JTextField Mirinda250mlcansold;
    private javax.swing.JTextField Mirinda250mlcansoldp;
    private javax.swing.JTextField Mirinda250mlpetsold;
    private javax.swing.JTextField Mirinda250mlpetsoldp;
    private javax.swing.JTextField Mirinda500mlsold;
    private javax.swing.JTextField Mirinda500mlsoldp;
    private javax.swing.JTextField Psi1Lsold;
    private javax.swing.JTextField Psi1Lsoldp;
    private javax.swing.JTextField Psi200mlglasssold;
    private javax.swing.JTextField Psi200mlglasssoldp;
    private javax.swing.JTextField Psi250mlcansold;
    private javax.swing.JTextField Psi250mlcansoldp;
    private javax.swing.JTextField Psi250mlglasssold;
    private javax.swing.JTextField Psi250mlglasssoldp;
    private javax.swing.JTextField Psi250mlpetsold;
    private javax.swing.JTextField Psi250mlpetsoldp;
    private javax.swing.JTextField Psi2Lsold;
    private javax.swing.JTextField Psi2Lsoldp;
    private javax.swing.JTextField Psi400mlsold;
    private javax.swing.JTextField Psi400mlsoldp;
    private javax.swing.JTextField Psi500mldietsold;
    private javax.swing.JTextField Psi500mldietsoldp;
    private javax.swing.JTextField Psi500mlsold;
    private javax.swing.JTextField Psi500mlsoldp;
    private javax.swing.JLabel Slice250mlglass;
    private javax.swing.JTextField Slice250mlglasssold;
    private javax.swing.JTextField Slice250mlglasssoldp;
    private javax.swing.JTextField dAqa1500ml;
    private javax.swing.JTextField dAqa500ml;
    private javax.swing.JTextField dDew200mlglass;
    private javax.swing.JTextField dDew250mlcan;
    private javax.swing.JTextField dDew250mlpet;
    private javax.swing.JTextField dDew400ml;
    private javax.swing.JTextField dDew500ml;
    private javax.swing.JTextField dMda1L;
    private javax.swing.JTextField dMda200mlglass;
    private javax.swing.JTextField dMda250mlcan;
    private javax.swing.JTextField dMda250mlpet;
    private javax.swing.JTextField dMda500ml;
    private javax.swing.JTextField dPsi1L;
    private javax.swing.JTextField dPsi200mlglass;
    private javax.swing.JTextField dPsi250mlcan;
    private javax.swing.JTextField dPsi250mlglass;
    private javax.swing.JTextField dPsi250mlpet;
    private javax.swing.JTextField dPsi2L;
    private javax.swing.JTextField dPsi400ml;
    private javax.swing.JTextField dPsi500ml;
    private javax.swing.JTextField dPsi500mldiet;
    private javax.swing.JTextField dSlice250mlglass;
    private javax.swing.JButton delivaryButton;
    private javax.swing.JTextField dsUp1L;
    private javax.swing.JTextField dsUp200mlglass;
    private javax.swing.JTextField dsUp250mlcan;
    private javax.swing.JTextField dsUp250mlglass;
    private javax.swing.JTextField dsUp250mlpet;
    private javax.swing.JTextField dsUp2L;
    private javax.swing.JTextField dsUp500ml;
    private javax.swing.JButton expectedSellingCashButton;
    private javax.swing.JTextField expectedSellingCashTextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField90;
    private javax.swing.JTextField jTextField98;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JTextField netCashTextfield;
    private javax.swing.JTextField otherExpenseTextfield;
    private javax.swing.JTextField rAqa1500mlc;
    private javax.swing.JTextField rAqa1500mlp;
    private javax.swing.JTextField rAqa500mlc;
    private javax.swing.JTextField rAqa500mlp;
    private javax.swing.JTextField rDew200mlglassc;
    private javax.swing.JTextField rDew200mlglassp;
    private javax.swing.JTextField rDew250mlcanc;
    private javax.swing.JTextField rDew250mlcanp;
    private javax.swing.JTextField rDew250mlpetc;
    private javax.swing.JTextField rDew250mlpetp;
    private javax.swing.JTextField rDew400mlc;
    private javax.swing.JTextField rDew400mlp;
    private javax.swing.JTextField rDew500mlc;
    private javax.swing.JTextField rDew500mlp;
    private javax.swing.JTextField rMda1Lc;
    private javax.swing.JTextField rMda1Lp;
    private javax.swing.JTextField rMda200mlglassc;
    private javax.swing.JTextField rMda200mlglassp;
    private javax.swing.JTextField rMda250mlcanc;
    private javax.swing.JTextField rMda250mlcanp;
    private javax.swing.JTextField rMda250mlpetc;
    private javax.swing.JTextField rMda250mlpetp;
    private javax.swing.JTextField rMda500mlc;
    private javax.swing.JTextField rMda500mlp;
    private javax.swing.JTextField rPsi1Lc;
    private javax.swing.JTextField rPsi1Lp;
    private javax.swing.JTextField rPsi200mlglassc;
    private javax.swing.JTextField rPsi200mlglassp;
    private javax.swing.JTextField rPsi250mlcanc;
    private javax.swing.JTextField rPsi250mlcanp;
    private javax.swing.JTextField rPsi250mlglassc;
    private javax.swing.JTextField rPsi250mlglassp;
    private javax.swing.JTextField rPsi250mlpetc;
    private javax.swing.JTextField rPsi250mlpetp;
    private javax.swing.JTextField rPsi2Lc;
    private javax.swing.JTextField rPsi2Lp;
    private javax.swing.JTextField rPsi400mlc;
    private javax.swing.JTextField rPsi400mlp;
    private javax.swing.JTextField rPsi500mlc;
    private javax.swing.JTextField rPsi500mldietc;
    private javax.swing.JTextField rPsi500mldietp;
    private javax.swing.JTextField rPsi500mlp;
    private javax.swing.JTextField rSlice250mlglassc;
    private javax.swing.JTextField rSlice250mlglassp;
    private javax.swing.JButton retunInfobutton;
    private javax.swing.JTextField rsUp1Lc;
    private javax.swing.JTextField rsUp1Lp;
    private javax.swing.JTextField rsUp200mlglassc;
    private javax.swing.JTextField rsUp200mlglassp;
    private javax.swing.JTextField rsUp250mlcanc;
    private javax.swing.JTextField rsUp250mlcanp;
    private javax.swing.JTextField rsUp250mlglassc;
    private javax.swing.JTextField rsUp250mlglassp;
    private javax.swing.JTextField rsUp250mlpetc;
    private javax.swing.JTextField rsUp250mlpetp;
    private javax.swing.JTextField rsUp2Lc;
    private javax.swing.JTextField rsUp2Lp;
    private javax.swing.JTextField rsUp500mlc;
    private javax.swing.JTextField rsUp500mlp;
    private javax.swing.JTextField sUp1Lsold;
    private javax.swing.JTextField sUp1Lsoldp;
    private javax.swing.JTextField sUp200mlglasssold;
    private javax.swing.JTextField sUp200mlglasssoldp;
    private javax.swing.JTextField sUp250mlcansold;
    private javax.swing.JTextField sUp250mlcansoldp;
    private javax.swing.JTextField sUp250mlglasssold;
    private javax.swing.JTextField sUp250mlglasssoldp;
    private javax.swing.JTextField sUp250mlpetsold;
    private javax.swing.JTextField sUp250mlpetsoldp;
    private javax.swing.JTextField sUp2Lsold;
    private javax.swing.JTextField sUp2Lsoldp;
    private javax.swing.JTextField sUp500mlsold;
    private javax.swing.JTextField sUp500mlsoldp;
    private javax.swing.JButton selectItemcheckButton;
    private javax.swing.JTextField selectedItemCostTextfield;
    private javax.swing.JTextField totalDelivarycaseNo;
    private javax.swing.JTextField totalSalecaseNo;
    private javax.swing.JButton totaldelinsalecaseNoButton;
    // End of variables declaration//GEN-END:variables
}
