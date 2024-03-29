/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Pannals.BloodRequest;
import Pannals.RequestView;
import java.awt.GridLayout;

/**
 *
 * @author chamod
 */
public class BloodRequestMaintain extends javax.swing.JInternalFrame {

    /**
     * Creates new form BloodRequestMaintain
     */
    public BloodRequestMaintain() {
        initComponents();
        ShowAddRequest();
        ShowViewRequest();
    }
    
    private void ShowAddRequest(){
     BloodRequest MR = new BloodRequest();
        addRequest.removeAll();
        addRequest.setLayout(new GridLayout());
        addRequest.add(MR);
        addRequest.revalidate();
        addRequest.repaint();
        MR.setVisible(true);
        MR = null;
    }
    private void ShowViewRequest(){
     RequestView MR = new RequestView();
        viewRequest.removeAll();
        viewRequest.setLayout(new GridLayout());
        viewRequest.add(MR);
        viewRequest.revalidate();
        viewRequest.repaint();
        MR.setVisible(true);
        MR = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        addRequest = new javax.swing.JPanel();
        viewRequest = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BB : Request Maintain");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/be86d361-1ddd-43e3-8574-e04adf9904b7.jpg"))); // NOI18N

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 153));

        addRequest.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout addRequestLayout = new javax.swing.GroupLayout(addRequest);
        addRequest.setLayout(addRequestLayout);
        addRequestLayout.setHorizontalGroup(
            addRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        addRequestLayout.setVerticalGroup(
            addRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add Request", addRequest);

        viewRequest.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout viewRequestLayout = new javax.swing.GroupLayout(viewRequest);
        viewRequest.setLayout(viewRequestLayout);
        viewRequestLayout.setHorizontalGroup(
            viewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );
        viewRequestLayout.setVerticalGroup(
            viewRequestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View Request", viewRequest);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/24x24/delete.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/WhatsApp Image 2017-10-21 at 8.37.13 AM.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel viewRequest;
    // End of variables declaration//GEN-END:variables
}
