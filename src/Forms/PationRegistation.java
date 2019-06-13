/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import MasterData.Class.BloodTypeData;
import MasterData.Class.PationData;
import Other.SearchPopUp;
import Pannals.RequestView;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author chamod
 */
public class PationRegistation extends javax.swing.JInternalFrame {

    PationData pationData = new PationData();
    javax.swing.table.DefaultTableModel dtf;
    BloodTypeData btype = new BloodTypeData();

    /**
     * Creates new form PationRegistation
     */
    public PationRegistation() {
        initComponents();
        ShowGrid();
        showTableData();
    }

    private void ShowGrid() {
        String data[][] = null;
        String colu[] = new String[]{"Name", "NIC No", "Address", "Gender ", "Contact No 1", "Weight", "Age", "Contact No 2", "Type", "Type Id"};
        DefaultTableModel model = new DefaultTableModel(data, colu) {
            //@Override
            public boolean isCellEditable(int x, int y) {
                return false;
            }
        };

        tblGrid.setModel(model);
        tblGrid.getTableHeader().setPreferredSize(new Dimension(tblGrid.getTableHeader().getPreferredSize().width, 35));
        JTableHeader head = tblGrid.getTableHeader();
        head.setFont(head.getFont().deriveFont(Font.BOLD));

        TableColumn colou11 = tblGrid.getColumnModel().getColumn(6);
        colou11.setMinWidth(0);
        colou11.setPreferredWidth(0);
        colou11.setMaxWidth(0);

        TableColumn colou12 = tblGrid.getColumnModel().getColumn(7);
        colou12.setMinWidth(0);
        colou12.setPreferredWidth(0);
        colou12.setMaxWidth(0);

        TableColumn colou13 = tblGrid.getColumnModel().getColumn(5);
        colou13.setMinWidth(100);
        colou13.setPreferredWidth(100);
        colou13.setMaxWidth(100);

        TableColumn colou14 = tblGrid.getColumnModel().getColumn(9);
        colou14.setMinWidth(100);
        colou14.setPreferredWidth(100);
        colou14.setMaxWidth(100);

    }

    public void showTableData() {
        dtf = (DefaultTableModel) tblGrid.getModel();
        dtf.setRowCount(0);
        ResultSet rs;
        try {
            rs = pationData.showPation("");
            rs.last();
            int count = rs.getRow();
            rs.beforeFirst();
            String data[][] = null;
            data = new String[count][10];
            int x = 0;
            while (rs.next()) {
                Vector v = new Vector();

                dtf = (javax.swing.table.DefaultTableModel) tblGrid.getModel();
                v.add(data[x][0] = rs.getString("Name"));
                v.add(data[x][1] = rs.getString("IDNumber"));
                v.add(data[x][2] = rs.getString("address"));
                v.add(data[x][3] = rs.getString("Gender"));
                v.add(data[x][4] = rs.getString("contactNo1"));
                v.add(data[x][5] = rs.getString("weight"));
                v.add(data[x][6] = rs.getString("age"));
                v.add(data[x][8] = rs.getString("ContactNo2"));

                ResultSet rs1 = btype.SearchBloodType(rs.getString("Type"));
                rs1.beforeFirst();
                rs1.next();
                v.add(data[x][9] = (rs1.getString("Type")) + (rs1.getString("RH")));
                v.add(data[x][8] = rs.getString("Type"));

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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkMale = new javax.swing.JRadioButton();
        chkFemail = new javax.swing.JRadioButton();
        txtAge = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        txtweight = new javax.swing.JTextField();
        txtContactNo1 = new javax.swing.JTextField();
        txtContactNo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        txtABO = new javax.swing.JTextField();
        txtTypeId = new javax.swing.JTextField();
        txtRh = new javax.swing.JTextField();
        cmdBlood = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        txtIDNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        cmbSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGrid = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BB : Patient Registation");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/be86d361-1ddd-43e3-8574-e04adf9904b7.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel1.setText("Name");

        jLabel3.setText("Address");

        chkMale.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(chkMale);
        chkMale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkMale.setText("Male");

        chkFemail.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(chkFemail);
        chkFemail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chkFemail.setText("Female");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel88.setText("V");

        jLabel8.setText("Contact No 2");

        jLabel7.setText("Contact No 1");

        jLabel6.setText("Weight");

        jLabel2.setText("Gender");

        jLabel4.setText("Age");

        jPanel28.setBackground(new java.awt.Color(255, 102, 102));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Blood Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel81.setText("ABO");
        jPanel28.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 56, 20));

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel89.setText("Blood Type ID");
        jPanel28.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, 90, 20));

        txtABO.setEditable(false);
        txtABO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtABOActionPerformed(evt);
            }
        });
        jPanel28.add(txtABO, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 122, -1));

        txtTypeId.setEditable(false);
        txtTypeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTypeIdActionPerformed(evt);
            }
        });
        jPanel28.add(txtTypeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, -1));

        txtRh.setEditable(false);
        txtRh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRhActionPerformed(evt);
            }
        });
        jPanel28.add(txtRh, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 122, -1));

        cmdBlood.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search_1.png"))); // NOI18N
        cmdBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBloodActionPerformed(evt);
            }
        });
        jPanel28.add(cmdBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 30, 20));

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel90.setText("Rh D");
        jPanel28.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 56, 20));

        jLabel5.setText("ID Number");

        jLabel91.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel91.setText("Year");

        jLabel92.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel92.setText("Kg");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkMale)
                                .addGap(10, 10, 10)
                                .addComponent(chkFemail))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContactNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtContactNo2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtweight)))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(chkMale)
                            .addComponent(chkFemail))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbSave.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        cmbSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/save.png"))); // NOI18N
        cmbSave.setText("Save");
        cmbSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSaveActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/new.png"))); // NOI18N
        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/delete.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblGrid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblGrid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGridMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblGrid);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cmbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cmbSave)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtABOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtABOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtABOActionPerformed

    private void txtTypeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTypeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTypeIdActionPerformed

    private void txtRhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRhActionPerformed

    private void cmdBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBloodActionPerformed
        System.out.println(" page came  >>>>>");
        SearchPopUp MAS = new SearchPopUp(null, true, 2, "0") {
            @Override
            public void getSelectedValue(String Para1, String para2, String para3, String para4, String para5) {
                txtTypeId.setText(Para1);
                txtABO.setText(para2);
                txtRh.setText(para3);
            }
        };
        MAS.setVisible(true);
        MAS = null;
    }//GEN-LAST:event_cmdBloodActionPerformed

    private void cmbSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSaveActionPerformed
        if (cmbSave.getText() == "Save") {
            String gender = "Female";
            if (chkMale.isSelected()) {
                gender = "Male";
            } else if (chkMale.isSelected()) {
                gender = "Female";
            }

            int val = pationData.savePation(txtName.getText(), txtAddress.getText(), txtIDNumber.getText().trim(), gender, txtAge.getText(), txtTypeId.getText(), txtContactNo1.getText(), txtContactNo2.getText(), txtweight.getText());
            if (val == 1) {
                JOptionPane.showMessageDialog(null, "Save Sucesfull ");
                newForm();
                cmbSave.setText("Edit");
            } else {
                JOptionPane.showMessageDialog(null, "Save not complet ");
            }

        } else {
            String gender = "Female";
            if (chkMale.isSelected()) {
                gender = "Male";
            } else if (chkMale.isSelected()) {
                gender = "Female";
            }
            int a = pationData.updatePation(txtName.getText(), txtAddress.getText(), gender, txtAge.getText(), txtContactNo1.getText(), txtContactNo2.getText(), txtweight.getText(), txtIDNumber.getText().trim());
            if (a > 0) {
                JOptionPane.showMessageDialog(null, " Update Succesfull ");
                newForm();
            } else {
                JOptionPane.showMessageDialog(null, " Update not complete ");
            }

        }
    }//GEN-LAST:event_cmbSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        newForm();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void tblGridMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGridMouseClicked
        if (evt.getClickCount() == 2) {
            //id double clicked loads data to fields
            try {
                txtName.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 0).toString());
                txtIDNumber.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 1).toString());
                txtAddress.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 2).toString());
                String gender = (tblGrid.getValueAt(tblGrid.getSelectedRow(), 3).toString());
                if (gender == "Male") {
                    chkMale.setSelected(true);
                } else if (gender == "Female") {
                    chkFemail.setSelected(true);
                }
                txtContactNo1.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 4).toString());
                txtweight.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 5).toString());
                txtAge.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 6).toString());
                txtContactNo2.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 7).toString());
                txtTypeId.setText(tblGrid.getValueAt(tblGrid.getSelectedRow(), 9).toString());
                ResultSet rs1 = btype.SearchBloodType(txtTypeId.getText());
                // v.add(data[x][8] = rs.getString("type"));
                rs1.beforeFirst();
                rs1.next();
                txtRh.setText(rs1.getString("RH"));
                txtABO.setText(rs1.getString("Type"));
                cmbSave.setText("Edit");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_tblGridMouseClicked

    public void newForm() {
        txtName.setText("");
        txtAddress.setText("");
        txtIDNumber.setText("");
        txtAge.setText("");
        txtweight.setText("");
        txtContactNo1.setText("");
        txtContactNo2.setText("");
        txtTypeId.setText("");
        txtRh.setText("");
        txtABO.setText("");
        cmbSave.setText("Save");
        showTableData();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chkFemail;
    private javax.swing.JRadioButton chkMale;
    private javax.swing.JButton cmbSave;
    private javax.swing.JButton cmdBlood;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblGrid;
    private javax.swing.JTextField txtABO;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNo1;
    private javax.swing.JTextField txtContactNo2;
    private javax.swing.JTextField txtIDNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRh;
    private javax.swing.JTextField txtTypeId;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
