/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * TravelagentSearch.java
 *
 * Created on May 21, 2013, 9:12:38 AM
 */
package Other;

import MasterData.Class.BloodRequestData;
import MasterData.Class.BloodTypeData;
import MasterData.Class.DonerData;
import MasterData.Class.HospitalData;
import MasterData.Class.PationData;
import MasterData.Class.StockData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author admin
 */
public abstract class SearchPopUp extends javax.swing.JDialog {

    //DBFacade db = new DBFacade();
    HospitalData hospital = new HospitalData();
    BloodTypeData btype = new BloodTypeData();
    BloodRequestData breq = new BloodRequestData();
    StockData stock = new StockData();
    DonerData donerdata = new DonerData();
    PationData pation = new PationData();
    String mainid;

    int searchtype = 0;

    /**
     * Creates new form TravelagentSearch
     */
    public SearchPopUp(java.awt.Frame parent, boolean modal, int Type, String mainid) {
        super(parent, modal);
        initComponents();
        this.mainid = mainid;
        Toolkit theKit = getToolkit();
        Dimension wndSize = theKit.getScreenSize();
        int widW = wndSize.width;
        int heiW = wndSize.height;
        int wid = this.getWidth();
        int hei = this.getHeight();
        int setW = (widW - wid) / 2;
        int setH = (heiW - hei) / 2;
        setLocation(setW, setH);

        searchtype = Type;
        if (searchtype == 1) {
            showGrid(1);
        } else if (searchtype == 2) {
            showGrid2(2);
        } else if (searchtype == 3) {
            showGrid3(3);
        } else if (searchtype == 4) {
            showGrid4(mainid);
        } else if (searchtype == 5) {
            showGrid5(5);
        } else if (searchtype == 6) {
            showGrid6(6);
        } else if (searchtype == 7) {
            showGrid7(7);
        }

    }

    private void showGrid(int type) {
        try {
            ResultSet set = null;
            String data[][] = null;
            if (type == 1) {
                set = hospital.GetHospital(Jsearchtext.getText().trim());
                set.last();
                data = new String[set.getRow()][2];
                set.beforeFirst();
                int x = 0;
                while (set.next()) {
                    data[x][0] = set.getString("HId");
                    data[x][1] = set.getString("HName");
                    x++;
                }
                set.close();
                set = null;
            }

            String colu[] = new String[]{"Hospital ID", "Hospital Name"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);

            /*  TableColumn colou1 = jTable1.getColumnModel().getColumn();
            colou1.setMinWidth(10);
            colou1.setPreferredWidth(50);
            colou1.setMaxWidth(200);
            TableColumn colou12 = jTable1.getColumnModel().getColumn(2);
            colou12.setMinWidth(10);
            colou12.setPreferredWidth(150);
            colou12.setMaxWidth(200);*/
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid2(int Type) {
        try {
            ResultSet set = null;
            String data[][] = null;

            set = btype.GetBloodType(Jsearchtext.getText().trim());
            set.last();
            data = new String[set.getRow()][3];
            set.beforeFirst();
            int x = 0;
            while (set.next()) {
                data[x][0] = set.getString("TypeId");
                data[x][1] = set.getString("Type");
                data[x][2] = set.getString("RH");
                //data[x][3] = set.getString("Sub_account_name");
                //  data[x][4] = set.getString("Sub_account_name");
                x++;
            }
            set.close();
            set = null;

            String colu[] = new String[]{"Blood Id", "Blood Type", "RH"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);

            TableColumn colou1 = jTable1.getColumnModel().getColumn(0);
            colou1.setMinWidth(0);
            colou1.setPreferredWidth(0);
            colou1.setMaxWidth(0);
            /*TableColumn colou12 = jTable1.getColumnModel().getColumn(2);
            colou12.setMinWidth(10);
            colou12.setPreferredWidth(150);
            colou12.setMaxWidth(200);*/
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid3(int Type) {
        try {
            ResultSet set = null;
            String data[][] = null;

            set = breq.ShowRequest(Jsearchtext.getText().trim());
            set.last();
            data = new String[set.getRow()][5];
            set.beforeFirst();
            int x = 0;
            while (set.next()) {
                data[x][0] = set.getString("RequestID");
                data[x][1] = set.getString("TypeId");
                data[x][2] = set.getString("RequestVol");
                data[x][3] = set.getString("HId");
                data[x][4] = set.getString("ConsultentName");
                x++;
            }
            set.close();
            set = null;

            String colu[] = new String[]{"Request Id", "Blood Type", "Requested Vol", "Hospital Id", "Consultent Name"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);

            TableColumn colou1 = jTable1.getColumnModel().getColumn(3);
            colou1.setMinWidth(0);
            colou1.setPreferredWidth(0);
            colou1.setMaxWidth(0);
            TableColumn colou12 = jTable1.getColumnModel().getColumn(4);
            colou12.setMinWidth(0);
            colou12.setPreferredWidth(0);
            colou12.setMaxWidth(0);
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid4(String mainid) {
        try {
            ResultSet set = null;
            String data[][] = null;
            Jsearchtext.setVisible(false);
            jLabel1.setVisible(false);
            set = stock.GetStock(mainid.trim());
            set.last();
            data = new String[set.getRow()][3];
            set.beforeFirst();
            int x = 0;
            while (set.next()) {
                data[x][0] = set.getString("StockId");
                data[x][1] = set.getString("Vol");
                data[x][2] = set.getString("TypeId");
                //data[x][3] = set.getString("Sub_account_name");
                //  data[x][4] = set.getString("Sub_account_name");
                x++;
            }
            set.close();
            set = null;

            String colu[] = new String[]{"Stock Id", "Vol", "type Id"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);

            /*TableColumn colou1 = jTable1.getColumnModel().getColumn(0);
            colou1.setMinWidth(0);
            colou1.setPreferredWidth(0);
            colou1.setMaxWidth(0);
           TableColumn colou12 = jTable1.getColumnModel().getColumn(2);
            colou12.setMinWidth(10);
            colou12.setPreferredWidth(150);
            colou12.setMaxWidth(200);*/
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid5(int Type) {
        try {
            ResultSet set = null;
            String data[][] = null;

            set = stock.GetStock(Jsearchtext.getText().trim());
            set.last();
            data = new String[set.getRow()][2];
            set.beforeFirst();
            int x = 0;
            while (set.next()) {
                data[x][0] = set.getString("StockId");
                data[x][1] = set.getString("Vol");
                //data[x][2] = set.getString("RH");
                //data[x][3] = set.getString("Sub_account_name");
                //  data[x][4] = set.getString("Sub_account_name");
                x++;
            }
            set.close();
            set = null;

            String colu[] = new String[]{"Stock Id", "Vol"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);

            /*TableColumn colou1 = jTable1.getColumnModel().getColumn(0);
            colou1.setMinWidth(0);
            colou1.setPreferredWidth(0);
            colou1.setMaxWidth(0);
           TableColumn colou12 = jTable1.getColumnModel().getColumn(2);
            colou12.setMinWidth(10);
            colou12.setPreferredWidth(150);
            colou12.setMaxWidth(200);*/
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid6(int Type) {
        try {
            ResultSet set = null;
            String data[][] = null;

            set = donerdata.ShowDoner(Jsearchtext.getText().trim());
            set.last();
            data = new String[set.getRow()][3];
            set.beforeFirst();
            int x = 0;
            while (set.next()) {
                data[x][0] = set.getString("DonorId");
                data[x][1] = set.getString("name");
                data[x][2] = set.getString("type");
                //data[x][3] = set.getString("Sub_account_name");
                //  data[x][4] = set.getString("Sub_account_name");
                x++;
            }
            set.close();
            set = null;

            String colu[] = new String[]{"Doner Id", "Name", "type Id"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showGrid7(int Type) {
        try {
            ResultSet set = null;
            String data[][] = null;

            set = pation.showPation(Jsearchtext.getText().trim());
            set.last();
            data = new String[set.getRow()][3];
            set.beforeFirst();
            int x = 0;
            while (set.next()) {
                data[x][0] = set.getString("IDNumber");
                data[x][1] = set.getString("Name");
                //data[x][2] = set.getString("contactNo1");
                data[x][2] = set.getString("type");
                //  data[x][4] = set.getString("Sub_account_name");
                x++;
            }
            set.close();
            set = null;

            String colu[] = new String[]{"NIC No", "Name", "Contact No"};
            DefaultTableModel model = new DefaultTableModel(data, colu) {

                public boolean isCellEditable(int x, int y) {
                    return false;
                }
            };

            jTable1.setModel(model);
            data = null;
            colu = null;
        } catch (Exception ex) {
            ex.printStackTrace();
            //Logger.getLogger(MainAccountSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public abstract void getSelectedValue(String Para1, String para2, String para3, String para4, String para5);

//public  abstract void  getTravelID(String TANO);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Jsearchtext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(18);
        jTable1.setSelectionBackground(new java.awt.Color(0, 153, 51));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 190));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/102.png"))); // NOI18N
        jButton1.setText("Ok");
        jButton1.setToolTipText("Select");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 90, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/delete.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setToolTipText("Close GUI");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 100, 30));

        jLabel1.setText("Search");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 20));

        Jsearchtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JsearchtextActionPerformed(evt);
            }
        });
        Jsearchtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JsearchtextKeyReleased(evt);
            }
        });
        jPanel1.add(Jsearchtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 200, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2017-10-21 at 8.37.13 AM.jpeg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    if (jTable1.getSelectedRowCount() == 1) {
        if (searchtype == 1) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), "", "", "");
        } else if (searchtype == 2) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        } else if (searchtype == 3) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        } else if (searchtype == 4) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        } else if (searchtype == 5) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), "", "", "");
        } else if (searchtype == 6) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        } else if (searchtype == 7) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        }
        dispose();
    }
}//GEN-LAST:event_jTable1MouseClicked

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (jTable1.getSelectedRowCount() == 2) {
        if (searchtype == 1) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), "", "", "");
        } else if (searchtype == 2) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        } else if (searchtype == 3) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
        } else if (searchtype == 4) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        } else if (searchtype == 5) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), "", "", "");
        } else if (searchtype == 6) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        } else if (searchtype == 7) {
            getSelectedValue(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString(), jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString(), "", "");
        }
        dispose();
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

}//GEN-LAST:event_jTable1KeyReleased

    private void JsearchtextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JsearchtextKeyReleased
      if (searchtype == 1) {
            showGrid(1);
        } else if (searchtype == 2) {
            showGrid2(2);
        } else if (searchtype == 3) {
            showGrid3(3);
        } else if (searchtype == 4) {
            showGrid4(mainid);
        } else if (searchtype == 5) {
            showGrid5(5);
        } else if (searchtype == 6) {
            showGrid6(6);
        } else if (searchtype == 7) {
            showGrid7(7);
        }
    }//GEN-LAST:event_JsearchtextKeyReleased

    private void JsearchtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JsearchtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JsearchtextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jsearchtext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
