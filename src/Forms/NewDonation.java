/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import MasterData.Class.BloodTypeData;
import MasterData.Class.DonationData;
import MasterData.Class.StockData;
import Other.SearchPopUp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author chamod
 */
public class NewDonation extends javax.swing.JInternalFrame {
BloodTypeData btype = new BloodTypeData();
StockData stockdata=new StockData();
DonationData donationdata=new DonationData();
    /**
     * Creates new form NewDonation
     */
    public NewDonation() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDonerId = new javax.swing.JTextField();
        txtDonerName = new javax.swing.JTextField();
        cmdBlood = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVol = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        txtABO = new javax.swing.JTextField();
        txtTypeId = new javax.swing.JTextField();
        txtRh = new javax.swing.JTextField();
        cmdBlood1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmdSave = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BB : Donation");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/be86d361-1ddd-43e3-8574-e04adf9904b7.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Doner Id");

        txtDonerId.setEditable(false);
        txtDonerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonerIdActionPerformed(evt);
            }
        });

        txtDonerName.setEditable(false);

        cmdBlood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_1.png"))); // NOI18N
        cmdBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBloodActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Description");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Vol");

        jPanel28.setBackground(new java.awt.Color(255, 153, 153));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Blood Group"));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("ABO");
        jPanel28.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 56, 20));

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("Rh D");
        jPanel28.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 56, 20));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("Blood Type Id");
        jPanel28.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 90, 20));

        txtABO.setEditable(false);
        txtABO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtABOActionPerformed(evt);
            }
        });
        jPanel28.add(txtABO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 122, -1));

        txtTypeId.setEditable(false);
        txtTypeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeIdActionPerformed(evt);
            }
        });
        jPanel28.add(txtTypeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, -1));

        txtRh.setEditable(false);
        txtRh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRhActionPerformed(evt);
            }
        });
        jPanel28.add(txtRh, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 122, -1));

        cmdBlood1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_1.png"))); // NOI18N
        cmdBlood1.setEnabled(false);
        cmdBlood1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBlood1ActionPerformed(evt);
            }
        });
        jPanel28.add(cmdBlood1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 30, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Today Is");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/new.png"))); // NOI18N
        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/delete.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmdSave.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        cmdSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/save.png"))); // NOI18N
        cmdSave.setText("Save");
        cmdSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2017-10-21 at 8.37.13 AM.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDonerId, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(cmdBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtDonerName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVol, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(5, 5, 5)
                                    .addComponent(cmdSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBlood, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDonerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(cmdSave)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBloodActionPerformed
        System.out.println(" page came  >>>>>");
        SearchPopUp MAS = new SearchPopUp(null, true, 6, "0") {
            @Override
            public void getSelectedValue(String Para1, String para2, String para3, String para4, String para5) {
                try {
                    txtDonerId.setText(Para1);
                    txtDonerName.setText(para2);
                    txtTypeId.setText(para3);
                    ResultSet rs = btype.SearchBloodType(para3);
                    rs.beforeFirst();
                    rs.next();
                    txtRh.setText(rs.getString("RH"));
                    txtABO.setText(rs.getString("Type"));
                } catch (SQLException ex) {
                    Logger.getLogger(NewDonation.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };
        MAS.setVisible(true);
        MAS = null;
    }//GEN-LAST:event_cmdBloodActionPerformed

    private void txtABOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtABOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtABOActionPerformed

    private void txtTypeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeIdActionPerformed

    private void txtRhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRhActionPerformed

    private void cmdSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveActionPerformed
        int val = stockdata.AddItemToStock(txtVol.getText(), txtTypeId.getText());
        
            if (val > 0) {
                donationdata.SaveDonationData(txtDonerId.getText(), String.valueOf(val), txtDescription.getText());
                JOptionPane.showMessageDialog(null, " Save Succesfull ");
                newForm();
            } else {
                JOptionPane.showMessageDialog(null, " Save not complete ");
            }
    }//GEN-LAST:event_cmdSaveActionPerformed

    private void txtDonerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonerIdActionPerformed

    private void cmdBlood1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBlood1ActionPerformed
        System.out.println(" page came  >>>>>");
        SearchPopUp MAS = new SearchPopUp(null, true, 2, "0") {
            @Override
            public void getSelectedValue(String Para1, String para2, String para3, String para4, String para5) {
                txtTypeId.setText(Para1);
                txtABO.setText(para2);
                txtRh.setText(para3);
                //  txtpaymode.setSelectedIndex(Integer.parseInt(para4));

            }
        };
        MAS.setVisible(true);
        MAS = null;
    }//GEN-LAST:event_cmdBlood1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     newForm();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void newForm(){
      txtDonerId.setText("");
       txtDonerName.setText("");
       txtTypeId.setText("");
       txtRh.setText("");
       txtABO.setText("");
       txtDescription.setText("");
       txtVol.setText("");
       jXDatePicker1.setToolTipText("");
    }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBlood;
    private javax.swing.JButton cmdBlood1;
    private javax.swing.JButton cmdSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel28;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField txtABO;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDonerId;
    private javax.swing.JTextField txtDonerName;
    private javax.swing.JTextField txtRh;
    private javax.swing.JTextField txtTypeId;
    private javax.swing.JTextField txtVol;
    // End of variables declaration//GEN-END:variables
}