/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package REGISTER_LOGIN;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class HotelReservation extends javax.swing.JFrame {
    private String loggedInEmailNum;
    private Object[][] originalData;
    private Object[][] modifiedData;
    private int[] selectedRows;
    private int[] selectedColumns;

    public HotelReservation() {
        initComponents();
        displayReservations();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHome = new javax.swing.JTable();
        btnAddproduct = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOTEL RESERVATION SYSTEM");

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(270, 270, 270))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("RESERVATION LIST");

        tableHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fullname", "Contact No.", "Email", "Email Address", "Check-in Date", "Check-out Date", "Room Type "
            }
        ));
        tableHome.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableHome);

        btnAddproduct.setBackground(new java.awt.Color(51, 0, 102));
        btnAddproduct.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnAddproduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddproduct.setText("MAKE RESERVATION");
        btnAddproduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddproductActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(51, 0, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE RESERVATION");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(51, 0, 102));
        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE RESERVATION");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(153, 0, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnAddproduct)
                        .addGap(54, 54, 54)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)
                        .addGap(89, 89, 89)
                        .addComponent(btnLogout)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddproduct)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void transferEmailNum(String emailNum) {
        loggedInEmailNum = emailNum;
    }
    private void displayReservations() {
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
        String filePathString = "C:\\Users\\Darel Briones\\Downloads\\Darel-Gwapo-main\\Darel-Gwapo-main\\Briones_RegisterLogIn\\RESERVATION LIST\\ReservationList.txt";
        Path filePath = Paths.get(filePathString);

        if (Files.exists(filePath)) {
            try (BufferedReader br = new BufferedReader(new FileReader(filePathString))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("Fullname:")) {
                        String[] info = new String[7];
                        for (int i = 0; i < 7; i++) {
                            info[i] = line.split(": ")[1];
                            line = br.readLine();
                        }
                        model.addRow(info);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Error reading ReservationList.txt");
            }
        } else {
            System.err.println("ReservationList.txt does not exist");
        }
    }
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LOGIN x = new LOGIN();
        x.show();
        this.hide();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddproductActionPerformed
        MakeReservation x = new MakeReservation();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddproductActionPerformed
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
        selectedRows = tableHome.getSelectedRows();
        selectedColumns = tableHome.getSelectedColumns();

        if (selectedRows.length > 0 && selectedColumns.length > 0) {
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to change the data in the table?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                if (originalData == null) {
                    originalData = new Object[selectedRows.length][selectedColumns.length];
                    for (int i = 0; i < selectedRows.length; i++) {
                        for (int j = 0; j < selectedColumns.length; j++) {
                            originalData[i][j] = model.getValueAt(selectedRows[i], selectedColumns[j]);
                        }
                    }
                }
                modifiedData = new Object[selectedRows.length][selectedColumns.length];
                for (int i = 0; i < selectedRows.length; i++) {
                    for (int j = 0; j < selectedColumns.length; j++) {
                        modifiedData[i][j] = getUpdatedDataFromTable(selectedRows[i], selectedColumns[j]);
                    }
                }
                for (int selectedRow : selectedRows) {
                    for (int selectedColumn : selectedColumns) {
                        String updatedData = getUpdatedDataFromTable(selectedRow, selectedColumn);

                        if (updatedData != null) {
                            model.setValueAt(updatedData, selectedRow, selectedColumn);
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to retrieve updated data.", "Update Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }

                updateReservationFile(model);
                JOptionPane.showMessageDialog(this, "Reservation updated successfully!", "Update Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (originalData != null && modifiedData != null) {
                    for (int i = 0; i < selectedRows.length; i++) {
                        for (int j = 0; j < selectedColumns.length; j++) {
                            model.setValueAt(originalData[i][j], selectedRows[i], selectedColumns[j]);
                        }
                    }
                    modifiedData = null;
                }
                JOptionPane.showMessageDialog(this, "Update operation canceled. Changes reverted.", "Update Canceled", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select cell(s) to update.", "No Cell Selected", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();

        int rowCount = tableHome.getRowCount();
        if (rowCount > 0) {
            int choice = JOptionPane.showOptionDialog(this, "What data do you want to delete?", "Delete Data",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new String[]{"Delete All Data", "Delete Selected Row(s) Data"}, "Delete All Data");

            if (choice == JOptionPane.YES_OPTION) {
                model.setRowCount(0);
                deleteAllDataFromFile();
                JOptionPane.showMessageDialog(this, "All data deleted successfully!", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
            } else if (choice == JOptionPane.NO_OPTION) {
                int[] selectedRows = tableHome.getSelectedRows();
                if (selectedRows.length > 0) {
                    deleteSelectedRows(selectedRows);
                    JOptionPane.showMessageDialog(this, "Selected row(s) deleted successfully!", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Please select row(s) to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No data to delete.", "Empty Table", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private String getUpdatedDataFromTable(int rowIndex, int columnIndex) {
        DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
        return String.valueOf(model.getValueAt(rowIndex, columnIndex));
    }

private void updateReservationFile(DefaultTableModel model) {
    try {
        Path filePath = Paths.get("C:\\Users\\Darel Briones\\Downloads\\Darel-Gwapo-main\\Darel-Gwapo-main\\Briones_RegisterLogIn\\RESERVATION LIST\\ReservationList.txt");

        StringBuilder content = new StringBuilder();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        content.append("RESERVATION LIST INFORMATION\n");
        content.append("--------------------------\n");

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                String columnName = model.getColumnName(j);
                String cellValue = String.valueOf(model.getValueAt(i, j));
                content.append(columnName).append(": ").append(cellValue).append("\n");
            }
            content.append("--------------------------\n");
        }

        Files.write(filePath, content.toString().getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    private void deleteSelectedRows(int[] rowsToDelete) {
    DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
    Arrays.sort(rowsToDelete);

    for (int i = rowsToDelete.length - 1; i >= 0; i--) {
        int row = rowsToDelete[i];
        model.removeRow(row);
    }
    updateFileFromTableModel();
}

    private void deleteAllDataFromFile() {
        try {
            Path filePath = Paths.get("C:\\Users\\Darel Briones\\Downloads\\Darel-Gwapo-main\\Darel-Gwapo-main\\Briones_RegisterLogIn\\RESERVATION LIST\\ReservationList.txt");
            Files.deleteIfExists(filePath); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateFileFromTableModel() {
        try {
            Path filePath = Paths.get("C:\\Users\\Darel Briones\\Downloads\\Darel-Gwapo-main\\Darel-Gwapo-main\\Briones_RegisterLogIn\\RESERVATION LIST\\ReservationList.txt");

            StringBuilder content = new StringBuilder();
            DefaultTableModel model = (DefaultTableModel) tableHome.getModel();
            int rowCount = model.getRowCount();
            int columnCount = model.getColumnCount();

            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    String columnName = model.getColumnName(j);
                    String cellValue = String.valueOf(model.getValueAt(i, j));
                    content.append(columnName).append(": ").append(cellValue).append("\n");
                }
                content.append("--------------------------\n");
            }

            Files.write(filePath, content.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(HotelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddproduct;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHome;
    // End of variables declaration//GEN-END:variables
}
