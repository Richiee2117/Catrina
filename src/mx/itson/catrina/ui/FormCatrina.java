/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.catrina.ui;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;
import javax.swing.table.DefaultTableModel;
import mx.itson.catrina.entities.AccountData;
import mx.itson.catrina.entities.Customer;
import mx.itson.catrina.entities.Transaction;
import mx.itson.catrina.enums.TypeTransaction;

/**
 *
 * @author USER
 */
public class FormCatrina extends javax.swing.JFrame {

    /**
     * Creates new form FormCatrina
     */
    public FormCatrina() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JButton();
        lblRfc = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblAdress1 = new javax.swing.JLabel();
        lblCity1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRfc1 = new javax.swing.JLabel();
        lblClabe = new javax.swing.JLabel();
        lblRfc3 = new javax.swing.JLabel();
        lblRfc4 = new javax.swing.JLabel();
        lblCurrency = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblFinalBalance = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lblDeposits = new javax.swing.JLabel();
        lblWithdrawals = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransactions = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADO DE CUENTA");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 879, 51));

        btnOpenFile.setBackground(new java.awt.Color(255, 204, 51));
        btnOpenFile.setForeground(new java.awt.Color(0, 0, 0));
        btnOpenFile.setText("Open Files");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });
        jPanel2.add(btnOpenFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, -1, -1));

        lblRfc.setForeground(new java.awt.Color(0, 0, 0));
        lblRfc.setText("rfc");
        jPanel2.add(lblRfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 96, 30));

        lblName1.setBackground(new java.awt.Color(255, 153, 0));
        lblName1.setForeground(new java.awt.Color(0, 0, 0));
        lblName1.setText("Nombre");
        lblName1.setOpaque(true);
        jPanel2.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 96, 30));

        lblZip.setForeground(new java.awt.Color(0, 0, 0));
        lblZip.setText("zipcode");
        jPanel2.add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 96, 33));

        lblAdress1.setForeground(new java.awt.Color(0, 0, 0));
        lblAdress1.setText("adress");
        lblAdress1.setMaximumSize(new java.awt.Dimension(50, 15));
        jPanel2.add(lblAdress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, 33));

        lblCity1.setForeground(new java.awt.Color(0, 0, 0));
        lblCity1.setText("city");
        jPanel2.add(lblCity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 220, 33));

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ACCOUNT STATEMENT");
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 204, 23));

        lblRfc1.setForeground(new java.awt.Color(0, 0, 0));
        lblRfc1.setText("CLABE");
        jPanel2.add(lblRfc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 96, 30));

        lblClabe.setForeground(new java.awt.Color(0, 0, 0));
        lblClabe.setText("rfc");
        lblClabe.setMaximumSize(new java.awt.Dimension(50, 15));
        jPanel2.add(lblClabe, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 160, 30));

        lblRfc3.setForeground(new java.awt.Color(0, 0, 0));
        lblRfc3.setText("CURRENCY");
        jPanel2.add(lblRfc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 96, 30));

        lblRfc4.setForeground(new java.awt.Color(0, 0, 0));
        lblRfc4.setText("ACCOUNT");
        jPanel2.add(lblRfc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 96, 30));

        lblCurrency.setForeground(new java.awt.Color(0, 0, 0));
        lblCurrency.setText("rfc");
        jPanel2.add(lblCurrency, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 150, 30));

        lblAccount.setForeground(new java.awt.Color(0, 0, 0));
        lblAccount.setText("rfc");
        jPanel2.add(lblAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 130, 30));

        lblName2.setBackground(new java.awt.Color(255, 153, 0));
        lblName2.setForeground(new java.awt.Color(0, 0, 0));
        lblName2.setText("PERIOD SUMMARY");
        lblName2.setOpaque(true);
        jPanel2.add(lblName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 148, 30));

        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setText("FINAL BALANCE");
        jPanel2.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 96, 33));

        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setText("WITHDRAWALS");
        jPanel2.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 96, 33));

        lblFinalBalance.setForeground(new java.awt.Color(0, 0, 0));
        lblFinalBalance.setText("DEPOSITS");
        jPanel2.add(lblFinalBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 96, 33));

        lbl4.setForeground(new java.awt.Color(0, 0, 0));
        lbl4.setText("DEPOSITS");
        jPanel2.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 96, 33));

        lblDeposits.setForeground(new java.awt.Color(0, 0, 0));
        lblDeposits.setText("DEPOSITS");
        jPanel2.add(lblDeposits, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 96, 33));

        lblWithdrawals.setForeground(new java.awt.Color(0, 0, 0));
        lblWithdrawals.setText("DEPOSITS");
        jPanel2.add(lblWithdrawals, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 96, 33));

        tblTransactions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "DATE", "DESCRIPTION", "DEPOSITS", "WITHDRAWALS", "SUBTOTAL"
            }
        ));
        jScrollPane2.setViewportView(tblTransactions);
        if (tblTransactions.getColumnModel().getColumnCount() > 0) {
            tblTransactions.getColumnModel().getColumn(1).setMinWidth(100);
            tblTransactions.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 580, 210));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ZIP CODE:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 80, 30));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CITY:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 80, 30));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ADRESS:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 30));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RFC:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        double deposito = 0;
       
        double retiro = 0;
        double totalDeposits = 0;
    double totalWithdrawals = 0;

         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
         
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                byte fileBytes[] = Files.readAllBytes(file.toPath());
                String content = new String(fileBytes, StandardCharsets.UTF_8);
                AccountData account = new AccountData().deserealize(content);
                if (account != null) {
                    lblAccount.setText(account.getAccount());
                    lblClabe.setText(account.getClabe());
                    lblCurrency.setText(account.getCurrency());
                    
                    lblName1.setText(account.getCustomer().getName());
                    lblRfc.setText(account.getCustomer().getRfc());
                    lblAdress1.setText(account.getCustomer().getAddress());
                    lblCity1.setText(account.getCustomer().getCity());
                    lblZip.setText(account.getCustomer().getZipCode());
                    
                    

                       // Ordenar las transacciones por fecha de más reciente a más antigua
     List<Transaction> sortedTransactions = new ArrayList<>(account.getTransactions());
        Collections.sort(sortedTransactions, (t1, t2) -> t1.getDate().compareTo(t2.getDate()));

        DefaultTableModel transactionsModel = (DefaultTableModel) tblTransactions.getModel();
        transactionsModel.setRowCount(0);

        for (Transaction transaction : sortedTransactions) {
            String formattedDate = dateFormat.format(transaction.getDate()); // Formatear la fecha

            if (transaction.getType() == TypeTransaction.DEPOSITS) {
                totalDeposits += transaction.getAmount();
            } else if (transaction.getType() == TypeTransaction.WITHDRAWALS) {
                totalWithdrawals += transaction.getAmount();
            }

            double saldo = totalDeposits - totalWithdrawals;

            if (transaction.getType() == TypeTransaction.DEPOSITS) {
                transactionsModel.addRow(new Object[]{
                    formattedDate, // Fecha formateada
                    transaction.getDescription(),
                    decimalFormat.format(transaction.getAmount()), // Depósito formateado
                    "", // Retiro
                    decimalFormat.format(saldo) // Saldo formateado
                });
            } else if (transaction.getType() == TypeTransaction.WITHDRAWALS) {
                transactionsModel.addRow(new Object[]{
                    formattedDate, // Fecha formateada
                    transaction.getDescription(),
                    "", // Depósito
                    decimalFormat.format(transaction.getAmount()), // Retiro formateado
                    decimalFormat.format(saldo) // Saldo formateado
                });
            }
        }
        
                }
            }
        lblDeposits.setText(decimalFormat.format(totalDeposits));
        lblWithdrawals.setText(decimalFormat.format(totalWithdrawals));
        double balance = totalDeposits - totalWithdrawals;
        lblFinalBalance.setText(decimalFormat.format(balance));

    } catch (IOException ex) {
        System.err.println("Ocurrió un error: " + ex);
    }



    }//GEN-LAST:event_btnOpenFileActionPerformed

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
            java.util.logging.Logger.getLogger(FormCatrina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCatrina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCatrina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCatrina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCatrina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAdress1;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblClabe;
    private javax.swing.JLabel lblCurrency;
    private javax.swing.JLabel lblDeposits;
    private javax.swing.JLabel lblFinalBalance;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblRfc;
    private javax.swing.JLabel lblRfc1;
    private javax.swing.JLabel lblRfc3;
    private javax.swing.JLabel lblRfc4;
    private javax.swing.JLabel lblWithdrawals;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTable tblTransactions;
    // End of variables declaration//GEN-END:variables
}

