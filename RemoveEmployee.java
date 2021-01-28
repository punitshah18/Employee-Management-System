/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author krishchandarana
 */
public class RemoveEmployee extends javax.swing.JFrame {

    private MyHashTable theMainHashTable;
    private EmployeeInfo employeeRemoved;
    
    public void setTheMainHashTable(MyHashTable theRefValueHT){
        theMainHashTable = theRefValueHT;
    }

    public RemoveEmployee() {
        initComponents();
        // all the labels
        noEmployeeFound.setVisible(false);
        employeeFound.setVisible(false);
        employeeNotAdded.setVisible(false);
        employeeAdded.setVisible(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        userInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        RemoveEmployee = new javax.swing.JButton();
        UndoEmployee = new javax.swing.JButton();
        noEmployeeFound = new javax.swing.JLabel();
        ExitProgram = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        employeeFound = new javax.swing.JLabel();
        employeeNotAdded = new javax.swing.JLabel();
        employeeAdded = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));

        userInput.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel8.setText("Enter Employee Number Below:");

        RemoveEmployee.setBackground(new java.awt.Color(255, 255, 255));
        RemoveEmployee.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        RemoveEmployee.setText("Remove Employee");
        RemoveEmployee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        RemoveEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveEmployeeActionPerformed(evt);
            }
        });

        UndoEmployee.setBackground(new java.awt.Color(255, 255, 255));
        UndoEmployee.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        UndoEmployee.setText("Undo");
        UndoEmployee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        UndoEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoEmployeeActionPerformed(evt);
            }
        });

        noEmployeeFound.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        noEmployeeFound.setText("*CANNOT FIND EMPLOYEE*");

        ExitProgram.setBackground(new java.awt.Color(255, 255, 255));
        ExitProgram.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        ExitProgram.setText("Back");
        ExitProgram.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 99, 71), 1, true));
        ExitProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitProgramActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(255, 99, 71));

        employeeFound.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        employeeFound.setText("Employee Succesfully Removed!");

        employeeNotAdded.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        employeeNotAdded.setText("*CANNOT RE-ADD EMPLOYEE*");

        employeeAdded.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        employeeAdded.setText("Employee Succesfully Re-Added!");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel8)
                        .addGap(133, 133, 133))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(employeeFound)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(employeeNotAdded)
                                .addComponent(employeeAdded)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(RemoveEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(UndoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGap(9, 9, 9))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(noEmployeeFound))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(ExitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UndoEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noEmployeeFound)
                    .addComponent(employeeNotAdded))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeAdded)
                    .addComponent(employeeFound, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ExitProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoveEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveEmployeeActionPerformed
        // TODO add your handling code here:
        if (userInput.getText().equals("")){
            noEmployeeFound.setVisible(true);
            employeeFound.setVisible(false);
            employeeNotAdded.setVisible(false);
            employeeAdded.setVisible(false);
        }
        else{
            noEmployeeFound.setVisible(false);
            employeeNotAdded.setVisible(false);
            employeeAdded.setVisible(false);
        }

        int empNumRemove = Integer.parseInt(userInput.getText());
        employeeRemoved = theMainHashTable.removeEmployee(empNumRemove);
        employeeFound.setVisible(true);

        if (employeeRemoved == null){
            noEmployeeFound.setVisible(true);
            employeeFound.setVisible(false);
        }
    }//GEN-LAST:event_RemoveEmployeeActionPerformed

    private void UndoEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoEmployeeActionPerformed
        // TODO add your handling code here:
        if (employeeRemoved == null) {
            employeeNotAdded.setVisible(true);
            employeeAdded.setVisible(false);
            noEmployeeFound.setVisible(false);
            employeeFound.setVisible(false);
        }

        else{
            theMainHashTable.addEmployee(employeeRemoved);
            employeeRemoved = null;
            employeeAdded.setVisible(true);
            employeeNotAdded.setVisible(false);
            noEmployeeFound.setVisible(false);
            employeeFound.setVisible(false);
        }

    }//GEN-LAST:event_UndoEmployeeActionPerformed

    private void ExitProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitProgramActionPerformed
        // TODO add your handling code here:
        dispose();
        theMainHashTable.saveFile("HTarchive.txt");
    }//GEN-LAST:event_ExitProgramActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitProgram;
    private javax.swing.JButton RemoveEmployee;
    private javax.swing.JButton UndoEmployee;
    private javax.swing.JLabel employeeAdded;
    private javax.swing.JLabel employeeFound;
    private javax.swing.JLabel employeeNotAdded;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel noEmployeeFound;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}