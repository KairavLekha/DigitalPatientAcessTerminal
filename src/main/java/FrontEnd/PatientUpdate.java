/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import Backend.DB.SelectedOption;
import Backend.DB.DBConnector;
import Backend.DB.Patient;
import javax.swing.ImageIcon;

/**
 *
 * @author Kairav
 */
public class PatientUpdate extends javax.swing.JFrame {

    /**
     * Creates new form Screen1
     */
    public static int id;

    public PatientUpdate() {
        initComponents();
        ImageIcon pic = new ImageIcon("src\\main\\resources\\pulseNew.png");
        this.setIconImage(pic.getImage());
       this.setSize(600,440);
        setLocationRelativeTo(null);

        DBConnector.connect();
        id = Integer.parseInt(SelectedOption.downloadSelected());
        //fills in information on selected patient

        firstnameField.setText(Patient.loadSinglePatient("Firstname", id));
        surnameField.setText(Patient.loadSinglePatient("Surname", id));
        AddressField.setText(Patient.loadSinglePatient("Address", id));
        DOBfield.setText(Patient.loadSinglePatient("Date_Of_Birth", id));
        numberField.setText(Patient.loadSinglePatient("Phone_Number", id));
        allergyArea.setText(Patient.loadSinglePatient("Allergy", id));
        conditionsArea.setText(Patient.loadSinglePatient("Medical_Conditions", id));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        conditionsLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        DOBfield = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        AddressField = new javax.swing.JTextPane();
        numberField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        AllergyLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allergyArea = new javax.swing.JTextArea();
        addressLabel = new javax.swing.JLabel();
        numberLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        conditionsArea = new javax.swing.JTextArea();
        SubtitleLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Kairav\\OneDrive\\Pictures\\logoutIcon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        editButton.setText("Update Information ");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        conditionsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        conditionsLabel.setText("Medical Conditions:");

        surnameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        surnameLabel.setText("Surname:");

        firstnameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        surnameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        DOBfield.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jScrollPane4.setViewportView(AddressField);

        numberField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameLabel.setText("Name:");

        AllergyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AllergyLabel.setText("Allergies:");

        dateLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dateLabel.setText("Date Of Birth:");

        allergyArea.setColumns(20);
        allergyArea.setRows(5);
        jScrollPane1.setViewportView(allergyArea);

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressLabel.setText("Address:");

        numberLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numberLabel.setText("Phone Number:");

        conditionsArea.setColumns(20);
        conditionsArea.setRows(5);
        jScrollPane2.setViewportView(conditionsArea);

        SubtitleLabel.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        SubtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubtitleLabel.setText("Patient Information");
        SubtitleLabel.setOpaque(true);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        titleLabel.setText("Doctor Information Terminal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubtitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nameLabel)
                            .addGap(21, 21, 21))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addressLabel)
                                .addComponent(dateLabel)
                                .addComponent(conditionsLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DOBfield, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numberLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(surnameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AllergyLabel))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberField, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(surnameField)))
                    .addComponent(editButton))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubtitleLabel)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(surnameLabel)
                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(DOBfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressLabel)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(AllergyLabel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(conditionsLabel)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //change screen
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        new Patients().setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed
//update DB
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String allergy = allergyArea.getText();
        String firstname = firstnameField.getText();
        String surname = surnameField.getText();
        String address = AddressField.getText();
        String DOB = DOBfield.getText();
        String phoneNumber = numberField.getText();
        String conditions = conditionsArea.getText();
        Patient.updatePatient(firstname, surname, DOB, conditions, phoneNumber, address, allergy, id);
    }//GEN-LAST:event_editButtonActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane AddressField;
    private javax.swing.JLabel AllergyLabel;
    private javax.swing.JTextField DOBfield;
    private javax.swing.JLabel SubtitleLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea allergyArea;
    private javax.swing.JButton backButton;
    private javax.swing.JTextArea conditionsArea;
    private javax.swing.JLabel conditionsLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField numberField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JTextField surnameField;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
