
package com.samsun.donemproject.gui;

import com.samsun.donemproject.repository.entity.Satis;
import com.samsun.donemproject.repository.entity.SatisDetay;
import com.samsun.donemproject.repository.hibernate.SatisRepository;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;


public class frmSatisGecmisi extends javax.swing.JFrame {

    private List<Satis> mlist;
    private SatisRepository DbSatis;
     java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.getDefault());
    
    public frmSatisGecmisi() {
        initComponents();
        DbSatis=new SatisRepository();
        mlist=DbSatis.findAll(new Satis());
        SatisListele();
       // mlist=new ArrayList<Satis>();
        
      
        
    }

    private void SatisListele(){
        
        int i=0;
        for (Satis item : mlist) {
            double nakit,kk;
            nakit=item.getOdenennakit();
            kk=item.getOdenenkk();
            tableSatisGecmisi.setValueAt(item.getId(), i, 0);
            tableSatisGecmisi.setValueAt(format.format(nakit), i, 1);
            tableSatisGecmisi.setValueAt(format.format(kk), i, 2);
            tableSatisGecmisi.setValueAt(item.getKalan(), i, 3);
            tableSatisGecmisi.setValueAt(item.getMusteriid(), i, 4);
            tableSatisGecmisi.setValueAt(item.getIslemtarihi(), i, 5);
            
            i++;
            
        }
        
        
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableSatisGecmisi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btngeri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableSatisGecmisi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nakit Ödenen", "K.K Ödenen", "Kalan", "Musteri Id", "İşlem Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSatisGecmisi);
        if (tableSatisGecmisi.getColumnModel().getColumnCount() > 0) {
            tableSatisGecmisi.getColumnModel().getColumn(0).setPreferredWidth(10);
            tableSatisGecmisi.getColumnModel().getColumn(1).setPreferredWidth(170);
            tableSatisGecmisi.getColumnModel().getColumn(2).setResizable(false);
            tableSatisGecmisi.getColumnModel().getColumn(2).setPreferredWidth(30);
            tableSatisGecmisi.getColumnModel().getColumn(3).setPreferredWidth(120);
            tableSatisGecmisi.getColumnModel().getColumn(4).setPreferredWidth(35);
            tableSatisGecmisi.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("SATIŞ GEÇMİŞİ");

        btngeri.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\left_40px.png")); // NOI18N
        btngeri.setText("GERİ");
        btngeri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btngeriMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngeri, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)
                        .addGap(0, 353, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btngeri, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btngeriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btngeriMouseClicked
        
        dispose();
        
        
    }//GEN-LAST:event_btngeriMouseClicked

 
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
            java.util.logging.Logger.getLogger(frmSatisGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSatisGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSatisGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSatisGecmisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSatisGecmisi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngeri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableSatisGecmisi;
    // End of variables declaration//GEN-END:variables
}
