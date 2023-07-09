/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DIT;

import DB.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Kairav
 */
//ColumnNames
//PatientNumber
//Firstname
//Surname
//DateOfBirth
//Medical_Conditions
//PhoneNumber
//Address
//Visits
public class Patients extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Patients() {
        initComponents();
           
        setSize(526, 355);
        setLocationRelativeTo(null);
        
        
        try {
            DBConnector.init();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Could not find DB driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Could not connect to db");
        }

        String query2 = "select firstname, surname, PatientNumber FROM Patient ORDER BY firstname;";
        try {
            ResultSet rs = DBConnector.read(query2);

            String[] names = new String[9999];
            int i = 0;
            while (rs.next()) {
                String name = rs.getString("firstname");
                String surname = rs.getString("surname");
                int patientNum = rs.getInt("PatientNumber");
                names[i] = "Patient ID:" + patientNum + " " + name + " " + surname;
                i++;
                patientList.setListData(names);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in SQL query");
        }
    }
    String Criteria = "Firstname";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        listLabel = new javax.swing.JLabel();
        PatientList = new javax.swing.JScrollPane();
        patientList = new javax.swing.JList<>();
        filterInput = new javax.swing.JTextField();
        criteriaButton = new javax.swing.JButton();
        instructionLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        newPatientButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(526, 350));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        titleLabel.setText("Digital Patient Acess Terminal");

        editButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        listLabel.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        listLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listLabel.setText("List Of Patients");

        patientList.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PatientList.setViewportView(patientList);

        filterInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        filterInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filterInputKeyReleased(evt);
            }
        });

        criteriaButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        criteriaButton.setText("Change Search Criteria");
        criteriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criteriaButtonActionPerformed(evt);
            }
        });

        instructionLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        instructionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instructionLabel.setText("Search Criteria: Firstname");

        logoutButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        newPatientButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        newPatientButton.setText("Add Patient");
        newPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPatientButtonActionPerformed(evt);
            }
        });

        viewButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deleteIcon.png"))); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(listLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(newPatientButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(viewButton))
                                    .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(criteriaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(instructionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(titleLabel)
                .addGap(2, 2, 2)
                .addComponent(criteriaButton)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listLabel)
                        .addGap(18, 18, 18)
                        .addComponent(PatientList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newPatientButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String selected = patientList.getSelectedValue();
        new UpdatePatient().setVisible(true);
        dispose();
    }//GEN-LAST:event_editButtonActionPerformed

    private void criteriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criteriaButtonActionPerformed
        // TODO add your handling code here:

            Criteria=Backend.Methods.criteria(Criteria);
            instructionLabel.setText("Search Criteria: "+Criteria);

    }//GEN-LAST:event_criteriaButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void newPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPatientButtonActionPerformed
        // TODO add your handling code here
        new AddPaients().setVisible(true);
        dispose();

    }//GEN-LAST:event_newPatientButtonActionPerformed

    private void filterInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filterInputKeyReleased
        // TODO add your handling code here:
        String query2 = "select firstname, surname, PatientNumber FROM Patient WHERE "+Criteria+" LIKE '%"+filterInput.getText()+"%'ORDER BY firstname;";
        try {
            ResultSet rs = DBConnector.read(query2);
            
            String[] names = new String[2144444444];
            int i = 0;
            while(rs.next()){
                String name = rs.getString("firstname");
                String surname = rs.getString("surname");
                int patientNum = rs.getInt("PatientNumber");
                names[i] ="Patient ID:"+patientNum+" "+name+ " "+surname;
                i++;
                patientList.setListData(names);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error in SQL query");
        }
    }//GEN-LAST:event_filterInputKeyReleased

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
         String selected = patientList.getSelectedValue();
          new Consult()
                  .setVisible(true);
         dispose();
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
         String selected = patientList.getSelectedValue();
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            DBConnector.init();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Could not find DB driver");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Could not connect to db");
        }

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
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PatientList;
    private javax.swing.JButton criteriaButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField filterInput;
    private javax.swing.JLabel instructionLabel;
    private javax.swing.JLabel listLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton newPatientButton;
    private javax.swing.JList<String> patientList;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
