/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ManagerWorkArea;

import Business.Business;
import Business.UserAccount;
import Business.UserAccountDirectory;
import Customer.Customer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sreeram
 */
public class CustomerJPanel extends javax.swing.JPanel {
    private Business business;
    private UserAccount useraccount;
    DefaultTableModel tableModel;
    /**
     * Creates new form CustomerJPanel
     */
    public CustomerJPanel() {
        initComponents();
    }

    CustomerJPanel(Business business, UserAccount useraccount) {
       initComponents();
       
       this.business= business;
       this.useraccount= useraccount;
       this.tableModel= (DefaultTableModel) jTable1.getModel();
               
    }
    
    public void populate(){
        tableModel.setRowCount(0);
        
        for(Customer c: this.business.getCustomerDirectory().getCustomerlist()){
            UserAccount u= this.business.getUserAccountDirectory().findById(c.getPersonId());
            
            Object[] row= new Object[4];
            
            row[0]= c.getPersonId();
            row[1]= c.getName();
            row[2]= u.getUsername();
            row[3]= u.getPassword();
            
            tableModel.addRow(row);
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

        fieldusername = new javax.swing.JTextField();
        fieldpassword = new javax.swing.JTextField();
        fieldname = new javax.swing.JTextField();
        addCustBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldage = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fieldusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldusernameActionPerformed(evt);
            }
        });
        add(fieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, 20));
        add(fieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, 20));
        add(fieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 90, 20));

        addCustBtn.setText("New Customer");
        addCustBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustBtnActionPerformed(evt);
            }
        });
        add(addCustBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "User Name", "Pasword"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel2.setText("User name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setText("Password");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        add(fieldage, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 200, 90, -1));

        jLabel4.setText("age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addCustBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustBtnActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory ua= this.business.getUserAccountDirectory();
        
        if(ua.accountExists(fieldusername.getText(), fieldpassword.getText(),"customer")){
            JOptionPane.showMessageDialog(null,"Sorry credentials are taken");
        }
        else{
            UserAccount user=this.business.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), "customer");
            this.business.getCustomerDirectory().createCustomer(user.getAccountId(), fieldname.getText(), fieldage.getText());
            populate();
        }
    }//GEN-LAST:event_addCustBtnActionPerformed

    private void fieldusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldusernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustBtn;
    private javax.swing.JTextField fieldage;
    private javax.swing.JTextField fieldname;
    private javax.swing.JTextField fieldpassword;
    private javax.swing.JTextField fieldusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
