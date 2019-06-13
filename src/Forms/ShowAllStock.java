/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import MasterData.Class.BloodTypeData;
import MasterData.Class.StockData;
import Pannals.RequestView;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author chamod
 */
public class ShowAllStock extends javax.swing.JInternalFrame {
StockData stockdate=new StockData();
BloodTypeData btype = new BloodTypeData();
    /**
     * Creates new form ShowAllStock
     */
    public ShowAllStock() {
        initComponents();
        ShowGrid();
        showTableData();
    }
    
     private void ShowGrid() {
        String data[][] = null; 
        String colu[] = new String[]{"Stock Id", "Vol", "Type", "Rh", "added Date"};
        DefaultTableModel model = new DefaultTableModel(data, colu) {
            //@Override
            public boolean isCellEditable(int x, int y) {
                return false;
            }
        };

        tblStockDate.setModel(model);
        tblStockDate.getTableHeader().setPreferredSize(new Dimension(tblStockDate.getTableHeader().getPreferredSize().width, 35));
        JTableHeader head = tblStockDate.getTableHeader();
        head.setFont(head.getFont().deriveFont(Font.BOLD));

        /* DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        RequestViewTable.getColumnModel().getColumn(4).setCellRenderer(rightRenderer); */
        TableColumn colou10 = tblStockDate.getColumnModel().getColumn(0);
        colou10.setMinWidth(60);
        colou10.setPreferredWidth(60);
        colou10.setMaxWidth(60);

        TableColumn colou11 = tblStockDate.getColumnModel().getColumn(2);
        colou11.setMinWidth(80);
        colou11.setPreferredWidth(80);
        colou11.setMaxWidth(80);
        
        TableColumn colou12 = tblStockDate.getColumnModel().getColumn(3);
        colou12.setMinWidth(80);
        colou12.setPreferredWidth(80);
        colou11.setMaxWidth(80);

        TableColumn colou13 = tblStockDate.getColumnModel().getColumn(4);
        colou13.setMinWidth(140);
        colou13.setPreferredWidth(140);
        colou11.setMaxWidth(140);

        /*TableColumn colou14 = RequestViewTable.getColumnModel().getColumn(4);
        colou14.setMinWidth(100);
        colou14.setPreferredWidth(100);
        colou14.setPreferredWidth(120);*/
    }

      public void showTableData() {
        ResultSet rs;
        DefaultTableModel dtf = new DefaultTableModel();
        dtf = (DefaultTableModel) tblStockDate.getModel();
        dtf.setRowCount(0);
        try {
            rs = stockdate.Showstock(txtRequestId.getText().trim());
            rs.last();            
            int count = rs.getRow();
            rs.beforeFirst();
            String data[][] = null;
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                dtf = (javax.swing.table.DefaultTableModel) tblStockDate.getModel();
                v.add(data[x][0] = rs.getString("StockId"));                
                v.add(data[x][1] = rs.getString("Vol"));                
                ResultSet rs1 = btype.SearchBloodType(rs.getString("TypeId"));
                rs1.beforeFirst();
                rs1.next();                
                v.add(data[x][2] = rs1.getString("Type"));
                v.add(data[x][3] = rs1.getString("RH"));   
                v.add(data[x][4] = rs.getString("AddedDate"));
                dtf.addRow(v);
                // confirm = rs.getInt("confirm");
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
       public void showTableDataBloodType() {
        ResultSet rs;
        DefaultTableModel dtf = new DefaultTableModel();
        dtf = (DefaultTableModel) tblStockDate.getModel();
        dtf.setRowCount(0);
        try {
            rs = stockdate.ShowstockBloodType(jTextField2.getText().trim());
            rs.last();            
            int count = rs.getRow();
            rs.beforeFirst();
            String data[][] = null;
            data = new String[count][5];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();
                dtf = (javax.swing.table.DefaultTableModel) tblStockDate.getModel();
                v.add(data[x][0] = rs.getString("StockId"));                
                v.add(data[x][1] = rs.getString("Vol"));                
                ResultSet rs1 = btype.SearchBloodType(rs.getString("TypeId"));
                rs1.beforeFirst();
                rs1.next();                
                v.add(data[x][2] = rs1.getString("Type"));
                v.add(data[x][3] = rs1.getString("RH"));   
                v.add(data[x][4] = rs.getString("AddedDate"));
                dtf.addRow(v);
                // confirm = rs.getInt("confirm");
                x = x + 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RequestView.class.getName()).log(Level.SEVERE, null, ex);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRequestId = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStockDate = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BB : Show Stock Data");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/be86d361-1ddd-43e3-8574-e04adf9904b7.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Stock Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Stock");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Blood Type Id");

        txtRequestId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRequestIdKeyReleased(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtRequestId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblStockDate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblStockDate);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/delete.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2017-10-21 at 8.37.13 AM.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtRequestIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRequestIdKeyReleased
        showTableData();
    }//GEN-LAST:event_txtRequestIdKeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
       showTableDataBloodType();
    }//GEN-LAST:event_jTextField2KeyReleased

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblStockDate;
    private javax.swing.JTextField txtRequestId;
    // End of variables declaration//GEN-END:variables
}
