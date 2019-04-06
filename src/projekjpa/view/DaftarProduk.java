package projekjpa.view;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import projekJPA.dao.DaoPortofolio;
import projekJPA.dao.DaoProduk;
import projekJPA.model.Portofolio;
import projekJPA.model.Produk;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class DaftarProduk extends javax.swing.JFrame {
        boolean f = false, t = true;
        DefaultListModel listModel = new DefaultListModel();
        JSpinner spinEmas, spinReksadana, spinSaham;
        JLabel labelEmas, labelReksadana1, labelReksadana2, labelSaham;

    /**
     * Creates new form produk
     */
    public DaftarProduk() {
        initComponents();
        //Setting untuk Emas
        SpinnerModel smEmas = new SpinnerNumberModel(0, 0, 1000, 1); //default value,lower bound,upper bound,increment by
        spinEmas = new JSpinner(smEmas);
        spinEmas.setBounds(40, 180, 70, 25);
        
        labelEmas = new JLabel("gram");
        labelEmas.setBounds(120,180,50,25);
        
        add(labelEmas);
        add(spinEmas);
        
        //Setting untuk Reksadana
        labelReksadana1 = new JLabel("Rp");
        labelReksadana1.setBounds(40, 180, 20, 25);
        
        labelReksadana2 = new JLabel(". 000");
        labelReksadana2.setBounds(160, 180, 50, 25);
        
        SpinnerModel smReksadana = new SpinnerNumberModel(100, 100, 500000, 50);
        spinReksadana = new JSpinner(smReksadana);
        spinReksadana.setBounds(60, 180, 100, 25);
        
        add(labelReksadana1);
        add(spinReksadana);
        add(labelReksadana2);
        //Setting untuk Saham
        SpinnerModel smSaham = new SpinnerNumberModel(100, 100, 500000, 50);
        spinSaham = new JSpinner(smSaham);
        
        
        
        //CLEAR
        clearFrame();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Produk", "Reksadana", "Emas", "Saham" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("BELI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String pilihan = (String) jComboBox2.getSelectedItem();
        listModel.removeAllElements();
        DaoProduk daoProduk = new DaoProduk(Produk.class);
        List<Produk> findType = daoProduk.findType(pilihan);
        for(int i = 0 ; i<findType.size(); i++){
            //Iki coba aturen cekne iso podo ngunu. Nama harga keuntungan
            listModel.addElement(findType.get(i).getNama() + "    " +findType.get(i).getPergerakanHargaMax()); 
        }
        jList1.setModel(listModel);
        clearFrame();
        if(pilihan.equalsIgnoreCase("EMAS")){
            spinEmas.setVisible(t);
            labelEmas.setVisible(t);
        }else if(pilihan.equalsIgnoreCase("REKSADANA")){
            labelReksadana1.setVisible(t);
            spinReksadana.setVisible(t);
            labelReksadana2.setVisible(t);
        }else if(pilihan.equalsIgnoreCase("SAHAM")){
            
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed
    private void clearFrame(){
        spinEmas.setVisible(f);
        labelEmas.setVisible(f);
        labelReksadana1.setVisible(f);
        labelReksadana2.setVisible(f);
        spinReksadana.setVisible(f);
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listModel.get(jList1.getSelectedIndex());
        Portofolio portofolio = new Portofolio();
        DaoPortofolio daoPortofolio = new DaoPortofolio(Portofolio.class);
        
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
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}