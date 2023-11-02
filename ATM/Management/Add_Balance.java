/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ATM.Management;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class Add_Balance extends javax.swing.JFrame {

    /**
     * Creates new form Add_Balance
     */
    public Add_Balance() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Add_balance_Text = new javax.swing.JTextField();
        Add_Balance_GoBton = new javax.swing.JButton();
        Balance_Transfer_BackBton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Add_Balance_PinText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("   ATM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Add Balance");

        Add_Balance_GoBton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Add_Balance_GoBton.setText("Go ");
        Add_Balance_GoBton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_Balance_GoBtonMouseClicked(evt);
            }
        });
        Add_Balance_GoBton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Balance_GoBtonActionPerformed(evt);
            }
        });

        Balance_Transfer_BackBton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Balance_Transfer_BackBton.setText("Back  ");
        Balance_Transfer_BackBton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Balance_Transfer_BackBtonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Enter Pin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Balance_Transfer_BackBton)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Add_Balance_GoBton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Add_balance_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(Add_Balance_PinText))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Balance_Transfer_BackBton)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_balance_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Balance_PinText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Add_Balance_GoBton)
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Balance_Transfer_BackBtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Balance_Transfer_BackBtonMouseClicked
        // TODO add your handling code here:
        new AllOption_Page().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Balance_Transfer_BackBtonMouseClicked

    private void Add_Balance_GoBtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Balance_GoBtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add_Balance_GoBtonActionPerformed

    private void Add_Balance_GoBtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_Balance_GoBtonMouseClicked
        // TODO add your handling code here:
        Connection con = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM","root","Priyanshu@1234");
          con.setAutoCommit(false);
        PreparedStatement ps = con.prepareStatement("Select Amount from register where Pin=?");
        
        ps.setString(1,Add_Balance_PinText.getText());
        
        ResultSet rs = ps.executeQuery();
        
        String orignalAmount = "";
        
        if(rs.next()){
            orignalAmount = rs.getString(1);
        }
        
        int Oa = Integer.parseInt(orignalAmount);
        
        int Na = Integer.parseInt(Add_balance_Text.getText());
        
        String TotalAmount = (Oa+Na)+"";
        
        
        PreparedStatement ps1 = con.prepareStatement("update register set Amount = ? where Pin=?");
        ps1.setString(1, TotalAmount);
        ps1.setString(2, Add_Balance_PinText.getText());
        
        int rowCount = ps1.executeUpdate();
        
        if(rowCount>0){
            JOptionPane.showMessageDialog(rootPane, "successful added balance");
            con.commit();
            
            new HOME_Page().setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "enter correct Amount");
            con.rollback();
        }
        
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e){
            
            JOptionPane.showMessageDialog(rootPane, "Exception");
            System.err.println(e);
           
            try{
                // con.rollback();
                con.close();
            }
            catch(SQLException ee){
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_Add_Balance_GoBtonMouseClicked

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
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Balance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Balance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Add_Balance_GoBton;
    public javax.swing.JTextField Add_Balance_PinText;
    public javax.swing.JTextField Add_balance_Text;
    public javax.swing.JButton Balance_Transfer_BackBton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
