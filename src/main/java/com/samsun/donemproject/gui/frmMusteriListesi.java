
package com.samsun.donemproject.gui;

import com.samsun.donemproject.repository.entity.Musteri;
import com.samsun.donemproject.repository.hibernate.MusteriRepository;
import java.util.List;
import javax.swing.JOptionPane;


public class frmMusteriListesi extends javax.swing.JFrame {


    private MusteriRepository Db;
    private List<Musteri> mlist;
    
    
    public frmMusteriListesi() {
        initComponents();
        Db=new MusteriRepository();
        mlist=Db.findAll(new Musteri());
        Listele();
    }
    
    private void Listele(){
          int row=0;
         for (Musteri item :mlist) {
             tableMusteri.setValueAt(item.getId(), row, 0);
             tableMusteri.setValueAt(item.getAd(),row,1);
             tableMusteri.setValueAt(item.getSoyad(), row, 2);
             tableMusteri.setValueAt(item.getAdres(), row, 3);
             tableMusteri.setValueAt(item.getTelefon(), row, 4);
             tableMusteri.setValueAt(item.getEmail(), row, 5);
             row++;
             
         }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMusteri = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableMusteri.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Ad", "Soyad", "Adres", "Telefon", "Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableMusteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMusteriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMusteri);
        if (tableMusteri.getColumnModel().getColumnCount() > 0) {
            tableMusteri.getColumnModel().getColumn(0).setPreferredWidth(30);
            tableMusteri.getColumnModel().getColumn(1).setPreferredWidth(140);
            tableMusteri.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableMusteri.getColumnModel().getColumn(3).setPreferredWidth(250);
            tableMusteri.getColumnModel().getColumn(4).setPreferredWidth(100);
            tableMusteri.getColumnModel().getColumn(5).setPreferredWidth(145);
        }

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("MÜŞTERİ LİSTESİ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableMusteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMusteriMouseClicked
        
         int secilenid=tableMusteri.getSelectedRow();
        if(secilenid<0 || secilenid>mlist.size()-1)
            JOptionPane.showMessageDialog(this, "Lütfen geçerli bir seçim yapınız..");
        else{
           Musteri secilenmusteri=mlist.get(secilenid);
           frmSatisYap.musteri=secilenmusteri;
           this.setVisible(false);
            
        }
        
        
    }//GEN-LAST:event_tableMusteriMouseClicked

   
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
            java.util.logging.Logger.getLogger(frmMusteriListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMusteriListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMusteriListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMusteriListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMusteriListesi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMusteri;
    // End of variables declaration//GEN-END:variables
}
