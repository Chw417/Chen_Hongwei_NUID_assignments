/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AccountManager;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Account;
import model.AccountDirectory;


/**
 *
 * @author chw
 */
public class ViewJPanel extends javax.swing.JPanel {

   private JPanel userProcessContainer;
   private AccountDirectory accountDirectory;
   private Account account;
    /**
     * Creates new form ViewAccountJPanel
     */
    public ViewJPanel(JPanel userProcessContainer, AccountDirectory directory, Account account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        refreshTextFields();
        setViewMode();
;    }
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFirstName = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLastName = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSSN = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAge = new javax.swing.JTextPane();
        lbLastName = new javax.swing.JLabel();
        lbFirstName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbSSN = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lbHomeAddress = new javax.swing.JLabel();
        lbStreetAddress = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtCity = new javax.swing.JTextPane();
        lbUnitNumber = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtUnitNumber = new javax.swing.JTextPane();
        lbStreetAddress1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtStreetAddress = new javax.swing.JTextPane();
        lbState = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtState = new javax.swing.JTextPane();
        lbZipCode = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtZipCode = new javax.swing.JTextPane();
        lbPhonerNumber = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtPhoneNumber = new javax.swing.JTextPane();
        lbWorkAddress = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtUnitNumber1 = new javax.swing.JTextPane();
        lbUnitNumber1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtStreetAddress1 = new javax.swing.JTextPane();
        lbState1 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtState1 = new javax.swing.JTextPane();
        lbCity1 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtCity1 = new javax.swing.JTextPane();
        lbZipCode1 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtPhoneNumber1 = new javax.swing.JTextPane();
        lbPhoneNumber1 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtZipCode1 = new javax.swing.JTextPane();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lbTitle.setText("List Person");
        lbTitle.setPreferredSize(new java.awt.Dimension(68, 30));

        jScrollPane1.setViewportView(txtFirstName);

        jScrollPane2.setViewportView(txtLastName);

        jScrollPane3.setViewportView(txtSSN);

        jScrollPane4.setViewportView(txtAge);

        lbLastName.setText("Last Name");

        lbFirstName.setText("First Name");

        lbAge.setText("Age");

        lbSSN.setText("Social Security Number");

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbHomeAddress.setBackground(new java.awt.Color(51, 51, 0));
        lbHomeAddress.setForeground(new java.awt.Color(102, 102, 102));
        lbHomeAddress.setText("Home Address");

        lbStreetAddress.setText("Street Address");

        jScrollPane5.setViewportView(txtCity);

        lbUnitNumber.setText("Unit Number");

        jScrollPane6.setViewportView(txtUnitNumber);

        lbStreetAddress1.setText("Street Address");

        jScrollPane7.setViewportView(txtStreetAddress);

        lbState.setText("State");

        jScrollPane8.setViewportView(txtState);

        lbZipCode.setText("Zip Code");

        jScrollPane9.setViewportView(txtZipCode);

        lbPhonerNumber.setText("Phone Number");

        jScrollPane10.setViewportView(txtPhoneNumber);

        lbWorkAddress.setBackground(new java.awt.Color(51, 51, 0));
        lbWorkAddress.setForeground(new java.awt.Color(102, 102, 102));
        lbWorkAddress.setText("Work Address");

        lbCity.setText("City");

        jScrollPane11.setViewportView(txtUnitNumber1);

        lbUnitNumber1.setText("Unit Number");

        jScrollPane12.setViewportView(txtStreetAddress1);

        lbState1.setText("State");

        jScrollPane13.setViewportView(txtState1);

        lbCity1.setText("City");

        jScrollPane14.setViewportView(txtCity1);

        lbZipCode1.setText("Zip Code");

        jScrollPane15.setViewportView(txtPhoneNumber1);

        lbPhoneNumber1.setText("Phone Number");

        jScrollPane16.setViewportView(txtZipCode1);

        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbStreetAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbWorkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbZipCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane7))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbState1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUnitNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPhonerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbState, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbHomeAddress, lbWorkAddress});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbHomeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPhonerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbWorkAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbStreetAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUnitNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbState1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbZipCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPhoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbHomeAddress, lbWorkAddress});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        
        Component[] panelStack = userProcessContainer.getComponents();
        JPanel lastPanel = (JPanel) panelStack[panelStack.length - 1];
        ListJPanel listJpanel = (ListJPanel) lastPanel;
        listJpanel.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String PhoneNumber = txtPhoneNumber.getText();
        String AgeString = txtAge.getText(); // Keep Age as String initially for validation
        String FirstName = txtFirstName.getText();
        String LastName = txtLastName.getText();
        String SSNString = txtSSN.getText(); // Keep SSN as String initially for validation
        String StreetAddress = txtStreetAddress.getText();
        String UnitNumber = txtUnitNumber.getText();
        String City = txtCity.getText();
        String State = txtState.getText();
        String ZipCodeString = txtZipCode.getText(); // Keep ZipCode as String for validation
        String StreetAddress1 = txtStreetAddress1.getText();
        String UnitNumber1 = txtUnitNumber1.getText();
        String City1 = txtCity1.getText();
        String State1 = txtState1.getText();
        String ZipCode1String = txtZipCode1.getText(); // Keep ZipCode1 as String for validation
        String PhoneNumber1 = txtPhoneNumber1.getText();

// Check mandatory fields
        if (FirstName.isBlank() || LastName.isBlank()) {
            JOptionPane.showMessageDialog(this, "All fields are mandatory.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

// Convert Age from String to short
        short Age;
        try {
            Age = Short.parseShort(AgeString); // Convert to short
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Convert SSN from String to long
        long SSN;
        try {
            SSN = Long.parseLong(SSNString); // Convert to long
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid SSN.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Convert PhoneNumber from String to long
        long PhoneNumberLong;
        try {
            PhoneNumberLong = Long.parseLong(PhoneNumber); // Convert to long
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number (digits only).", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Convert ZipCodes from String to int
        int ZipCode;
        int ZipCode1;
        try {
            ZipCode = Integer.parseInt(ZipCodeString); // Convert to int
            ZipCode1 = Integer.parseInt(ZipCode1String); // Convert to int
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid zip codes.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

// Convert PhoneNumber1 from String to long (if PhoneNumber1 is now expected to be a long)
        long PhoneNumber1Long;
        try {
            PhoneNumber1Long = Long.parseLong(PhoneNumber1); // Convert to long
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid secondary phone number (digits only).", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
// Set values in the Account object
        account.setFirstName(FirstName);
        account.setLastName(LastName);
        account.setSSN(SSN);
        account.setAge(Age);
        account.setStreetAddress(StreetAddress);
        account.setUnitNumber(UnitNumber);
        account.setCity(City);
        account.setState(State);
        account.setZipCode(ZipCode);
        account.setStreetAddress1(StreetAddress1);
        account.setUnitNumber1(UnitNumber1);
        account.setCity1(City1);
        account.setState1(State1);
        account.setZipCode1(ZipCode1);
        account.setPhoneNumber(PhoneNumberLong); // Use PhoneNumberLong which is now a long
        account.setPhoneNumber1(PhoneNumber1Long); // Assuming PhoneNumber1 is still a String

        JOptionPane.showMessageDialog(null, "Account successfully updated", "Warning", JOptionPane.WARNING_MESSAGE);
        setViewMode();

      
        
        
       
         // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
          setEditMode();
          // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCity1;
    private javax.swing.JLabel lbFirstName;
    private javax.swing.JLabel lbHomeAddress;
    private javax.swing.JLabel lbLastName;
    private javax.swing.JLabel lbPhoneNumber1;
    private javax.swing.JLabel lbPhonerNumber;
    private javax.swing.JLabel lbSSN;
    private javax.swing.JLabel lbState;
    private javax.swing.JLabel lbState1;
    private javax.swing.JLabel lbStreetAddress;
    private javax.swing.JLabel lbStreetAddress1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUnitNumber;
    private javax.swing.JLabel lbUnitNumber1;
    private javax.swing.JLabel lbWorkAddress;
    private javax.swing.JLabel lbZipCode;
    private javax.swing.JLabel lbZipCode1;
    private javax.swing.JTextPane txtAge;
    private javax.swing.JTextPane txtCity;
    private javax.swing.JTextPane txtCity1;
    private javax.swing.JTextPane txtFirstName;
    private javax.swing.JTextPane txtLastName;
    private javax.swing.JTextPane txtPhoneNumber;
    private javax.swing.JTextPane txtPhoneNumber1;
    private javax.swing.JTextPane txtSSN;
    private javax.swing.JTextPane txtState;
    private javax.swing.JTextPane txtState1;
    private javax.swing.JTextPane txtStreetAddress;
    private javax.swing.JTextPane txtStreetAddress1;
    private javax.swing.JTextPane txtUnitNumber;
    private javax.swing.JTextPane txtUnitNumber1;
    private javax.swing.JTextPane txtZipCode;
    private javax.swing.JTextPane txtZipCode1;
    // End of variables declaration//GEN-END:variables

    private void setEditMode() {
        txtFirstName.setEnabled(true);
        txtLastName.setEnabled(true);
        txtSSN.setEnabled(true);
        txtAge.setEnabled(true);
        txtPhoneNumber.setEnabled(true);
        txtStreetAddress.setEnabled(true);
        txtUnitNumber.setEnabled(true);
        txtCity.setEnabled(true);
        txtState.setEnabled(true);
        txtZipCode.setEnabled(true);
        txtStreetAddress1.setEnabled(true);
        txtUnitNumber1.setEnabled(true);
        txtCity1.setEnabled(true);
        txtState1.setEnabled(true);
        txtZipCode1.setEnabled(true);
        txtPhoneNumber1.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(true);
    }

    private void setViewMode() {
        txtFirstName.setEnabled(false);
        txtLastName.setEnabled(false);
        txtSSN.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtAge.setEnabled(false);
        txtStreetAddress.setEnabled(false);
        txtUnitNumber.setEnabled(false);
        txtCity.setEnabled(false);
        txtState.setEnabled(false);
        txtZipCode.setEnabled(false);
        txtStreetAddress1.setEnabled(false);
        txtUnitNumber1.setEnabled(false);
        txtCity1.setEnabled(false);
        txtState1.setEnabled(false);
        txtZipCode1.setEnabled(false);
        txtPhoneNumber1.setEnabled(false);

        btnSave.setEnabled(false); 
        btnUpdate.setEnabled(true);
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   private void refreshTextFields() {
        txtFirstName.setText(account.getFirstName());
        txtLastName.setText(account.getLastName());
        txtSSN.setText(String.valueOf(account.getSSN()));
        txtPhoneNumber.setText(String.valueOf(account.getPhoneNumber())); // Assuming getPhoneNumber() returns long
        txtAge.setText((String.valueOf(account.getAge())));
        txtStreetAddress.setText(account.getStreetAddress());
        txtUnitNumber.setText(account.getUnitNumber());
        txtCity.setText(account.getCity());
        txtState.setText(account.getState());
        txtZipCode.setText((String.valueOf(account.getZipCode())));
        txtStreetAddress1.setText(account.getStreetAddress1());
        txtUnitNumber1.setText(account.getUnitNumber1());
        txtCity1.setText(account.getCity1());
        txtState1.setText(account.getState1());
        txtZipCode1.setText((String.valueOf(account.getZipCode1())));
        txtPhoneNumber1.setText(String.valueOf(account.getPhoneNumber1())); // Assuming getPhoneNumber1() returns long
    }

}
