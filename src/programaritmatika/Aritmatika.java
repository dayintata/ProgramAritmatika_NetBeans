/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaritmatika;

/**
 *
 * @author Dayinta-PC
 */
public class Aritmatika extends javax.swing.JFrame {

   String jns = "";
   int jml;
   
    public Aritmatika() {
        initComponents();
        getJumlah();
        getJenis();
        panel.setVisible(false);
        pilihbil.setEnabled(false);
        bil1.setVisible(false);
        bil2.setVisible(false);
        bil3.setVisible(false);
        bil4.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b1.setVisible(false);
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
        jenis = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bil1 = new javax.swing.JLabel();
        bil2 = new javax.swing.JLabel();
        bil3 = new javax.swing.JLabel();
        bil4 = new javax.swing.JLabel();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        pilihbil = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ket = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROGRAM ARITMATIKA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 225, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Jenis Aritmatika");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 110, 15);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis);
        jenis.setBounds(270, 60, 140, 20);

        panel.setBackground(new java.awt.Color(255, 255, 204));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operasi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        panel.setForeground(new java.awt.Color(255, 255, 204));
        panel.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Jumlah Bilangan");
        panel.add(jLabel3);
        jLabel3.setBounds(16, 63, 110, 15);

        bil1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil1.setText("Bilangan 1");
        panel.add(bil1);
        bil1.setBounds(16, 98, 110, 15);

        bil2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil2.setText("Bilangan 2");
        panel.add(bil2);
        bil2.setBounds(16, 134, 110, 15);

        bil3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil3.setText("Bilangan 3");
        panel.add(bil3);
        bil3.setBounds(16, 167, 110, 15);

        bil4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bil4.setText("Bilangan 4");
        panel.add(bil4);
        bil4.setBounds(16, 200, 110, 15);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panel.add(b1);
        b1.setBounds(216, 96, 154, 30);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        panel.add(b2);
        b2.setBounds(216, 129, 154, 30);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panel.add(b3);
        b3.setBounds(216, 162, 154, 30);

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panel.add(b4);
        b4.setBounds(216, 195, 154, 30);

        pilihbil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        pilihbil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihbilActionPerformed(evt);
            }
        });
        panel.add(pilihbil);
        pilihbil.setBounds(216, 58, 154, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("HITUNG");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1);
        jButton1.setBounds(150, 240, 75, 23);
        panel.add(ket);
        ket.setBounds(166, 17, 110, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        panel.add(jScrollPane1);
        jScrollPane1.setBounds(70, 270, 226, 80);

        getContentPane().add(panel);
        panel.setBounds(20, 100, 410, 360);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 480);

        setSize(new java.awt.Dimension(466, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        getJenis();

    }//GEN-LAST:event_jenisActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void pilihbilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihbilActionPerformed
        getJumlah();
    }//GEN-LAST:event_pilihbilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Double hsl = 0.0;
        Double a1,a2,a3,a4;
        a1 = Double.parseDouble(b1.getText().toString());
        a2 = Double.parseDouble(b2.getText().toString());
        a3 = Double.parseDouble(b2.getText().toString());
        a4 = Double.parseDouble(b2.getText().toString());

        if(jns.equals("Penjumlahan")){
            if(jml == 2){
                hsl = a1 + a2;
                jTextArea1.setText(""+a1+ " + " +a2+ " = "+hsl);
            }
            if(jml == 3){
                hsl = a1 + a2 + a3;
                jTextArea1.setText(""+a1+ " + " +a2+ " + "+a3+ " = " +hsl);
            }
            if(jml == 4){
                hsl = a1 + a2 + a3 + a4;
                jTextArea1.setText(""+a1+ " + " +a2+ " + "+a3+ " + " +a4+ " = " +hsl);
            }

        }
        else if(jns.equals("Pengurangan")){
            if(jml == 2){
                hsl = a1 - a2;
                jTextArea1.setText(""+a1+ " - " +a2+ " = "+hsl);
            }
            if(jml == 3){
                hsl = a1 - a2 - a3;
                jTextArea1.setText(""+a1+ " - " +a2+ " - "+a3+ " = " +hsl);
            }
            if(jml == 4){
                hsl = a1 - a2 - a3 - a4;
                jTextArea1.setText(""+a1+ " - " +a2+ " - "+a3+ " - " +a4+ " = " +hsl);
            }

        }
        if(jns.equals("Perkalian")){
            if(jml == 2){
                hsl = a1 * a2;
                jTextArea1.setText(""+a1+ " x " +a2+ " = "+hsl);
            }
            if(jml == 3){
                hsl = a1 * a2 * a3;
                jTextArea1.setText(""+a1+ " x " +a2+ " x "+a3+ " = " +hsl);
            }
            if(jml == 4){
                hsl = a1 * a2 * a3 * a4;
                jTextArea1.setText(""+a1+ " x " +a2+ " x "+a3+ " x " +a4+ " = " +hsl);
            }

        }

        if(jns.equals("Pembagian")){
            if(jml == 2){
                hsl = a1 / a2;
                jTextArea1.setText(""+a1+ " : " +a2+ " = "+hsl);
            }
            if(jml == 3){
                hsl = a1 / a2 / a3;
                jTextArea1.setText(""+a1+ " : " +a2+ " : "+a3+ " = " +hsl);
            }
            if(jml == 4){
                hsl = a1 / a2 / a3 / a4;
                jTextArea1.setText(""+a1+ " : " +a2+ " : "+a3+ " : " +a4+ " = " +hsl);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aritmatika.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aritmatika().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JLabel bil1;
    private javax.swing.JLabel bil2;
    private javax.swing.JLabel bil3;
    private javax.swing.JLabel bil4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JLabel ket;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> pilihbil;
    // End of variables declaration//GEN-END:variables

    private void getJenis() {
        if(jenis.getSelectedItem().equals("Penjumlahan")){
            jns = "Penjumlahan";
            ket.setText("Penjumlahan");
            panel.setVisible(true);
            pilihbil.setEnabled(true);
        }
        
        else if(jenis.getSelectedItem().equals("Pengurangan")){
            jns = "Pengurangan";
            ket.setText("Pengurangan");
            panel.setVisible(true);
            pilihbil.setEnabled(true);
            
        }
        else if(jenis.getSelectedItem().equals("Perkalian")){
            jns = "Perkalian";
            ket.setText("Perkalian");
            panel.setVisible(true);
            pilihbil.setEnabled(true);
        }
        else if(jenis.getSelectedItem().equals("Pembagian")){
            jns = "Pembagian";
            ket.setText("Pembagian");
            panel.setVisible(true);
            pilihbil.setEnabled(true);
        }
    }

    private void getJumlah() {
        if(pilihbil.getSelectedItem().equals("2")){
            bil3.setVisible(false);
            bil4.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            bil1.setVisible(true);
            bil2.setVisible(true);
            b1.setVisible(true);
            b2.setVisible(true);
            jml = 2;
        }else if(pilihbil.getSelectedItem().equals("3")){
            bil3.setVisible(true);
            bil4.setVisible(false);
            b3.setVisible(true);
            b4.setVisible(false);
            jml = 3;
        }else if(pilihbil.getSelectedItem().equals("4")){
            bil3.setVisible(true);
            bil4.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            jml=4;
        }
    }
    }

