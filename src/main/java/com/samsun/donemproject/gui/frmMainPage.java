/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samsun.donemproject.gui;

import com.samsun.donemproject.repository.entity.Satis;
import com.samsun.donemproject.repository.entity.SatisDetay;
import com.samsun.donemproject.repository.entity.Urun;
import com.samsun.donemproject.repository.hibernate.SatisDetayRepository;
import com.samsun.donemproject.repository.hibernate.UrunRepository;
import com.samsun.donemproject.utils.StaticValues;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmMainPage extends javax.swing.JFrame{

   
    String projename=StaticValues.proje_name;
    private UrunRepository DbUrun;
    private List<Urun> urunlistesi;
    String urun,azurun;
    int a=100;
    int x=750;
    int y=750;
    Graphics g;
    
    
    public frmMainPage() {
        
        initComponents();
        
        DbUrun=new UrunRepository();
        urunlistesi=DbUrun.findAll(new Urun());
        for (Urun item : urunlistesi) {
            if((int)item.getStokmiktari()<a){
                a=(int)item.getStokmiktari();
                urun=item.getAd();
            }
        
        }
        for (Urun itemaz : urunlistesi) {
               if((int)itemaz.getStokmiktari()>a){
                a=(int)itemaz.getStokmiktari();
                azurun=itemaz.getAd();
            }
        }
        txtenfazlasatilan.setText(urun);
        txtenazsatilan.setText(azurun);
     
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d=(Graphics2D)g;
        Font font=new Font("Tahoma",Font.BOLD+Font.PLAIN,50);
        g2d.setFont(font);
        g2d.setColor(Color.WHITE);
        g2d.drawString(projename ,x,y);
        try {
            Thread.sleep(55);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        x+=12;
        if(x>this.getWidth() || x==this.getWidth()){
            x=0;
        }
        repaint();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnurunekle = new javax.swing.JButton();
        btnMusteriList = new javax.swing.JButton();
        btnMusteriEkle = new javax.swing.JButton();
        btnkasa = new javax.swing.JButton();
        btnSatislar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtenfazlasatilan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtenazsatilan = new javax.swing.JTextField();
        btnSatisYap2 = new javax.swing.JButton();
        btnUrunList = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        btnurunekle.setBackground(new java.awt.Color(204, 204, 255));
        btnurunekle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnurunekle.setForeground(new java.awt.Color(0, 0, 153));
        btnurunekle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\add_50px.png")); // NOI18N
        btnurunekle.setText("ÜRÜN EKLE");
        btnurunekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnurunekleMouseClicked(evt);
            }
        });

        btnMusteriList.setBackground(new java.awt.Color(0, 153, 153));
        btnMusteriList.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMusteriList.setForeground(new java.awt.Color(0, 0, 153));
        btnMusteriList.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\search_in_list_50px.png")); // NOI18N
        btnMusteriList.setText("MÜŞTERİ LİSTESİ");
        btnMusteriList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMusteriListMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMusteriListMouseReleased(evt);
            }
        });

        btnMusteriEkle.setBackground(new java.awt.Color(0, 153, 153));
        btnMusteriEkle.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMusteriEkle.setForeground(new java.awt.Color(0, 0, 153));
        btnMusteriEkle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\add_user_group_woman_man_50px.png")); // NOI18N
        btnMusteriEkle.setText("MÜŞTERİ EKLE");
        btnMusteriEkle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMusteriEkleMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMusteriEkleMouseReleased(evt);
            }
        });

        btnkasa.setBackground(new java.awt.Color(204, 204, 255));
        btnkasa.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnkasa.setForeground(new java.awt.Color(0, 0, 153));
        btnkasa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\safe_out_50px.png")); // NOI18N
        btnkasa.setText("KASA MİKTAR");
        btnkasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkasaMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnkasaMouseReleased(evt);
            }
        });
        btnkasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkasaActionPerformed(evt);
            }
        });

        btnSatislar.setBackground(new java.awt.Color(204, 204, 255));
        btnSatislar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSatislar.setForeground(new java.awt.Color(0, 0, 153));
        btnSatislar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\receipt_50px.png")); // NOI18N
        btnSatislar.setText("SATIŞ GEÇMİŞİ");
        btnSatislar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSatislarMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSatislarMouseReleased(evt);
            }
        });
        btnSatislar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatislarActionPerformed(evt);
            }
        });

        jLabel3.setText("EN ÇOK SATILAN ÜRÜN:");

        txtenfazlasatilan.setEditable(false);

        jLabel4.setText("EN AZ SATILAN ÜRÜN:");

        txtenazsatilan.setEditable(false);

        btnSatisYap2.setBackground(new java.awt.Color(0, 153, 153));
        btnSatisYap2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSatisYap2.setForeground(new java.awt.Color(0, 0, 153));
        btnSatisYap2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\sales_performance_50px.png")); // NOI18N
        btnSatisYap2.setText("SATIŞ YAPMA EKRANI");
        btnSatisYap2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSatisYap2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSatisYap2MouseReleased(evt);
            }
        });
        btnSatisYap2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisYap2ActionPerformed(evt);
            }
        });

        btnUrunList.setBackground(new java.awt.Color(0, 153, 153));
        btnUrunList.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnUrunList.setForeground(new java.awt.Color(0, 0, 153));
        btnUrunList.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\list_50px.png")); // NOI18N
        btnUrunList.setText("ÜRÜN LİSTESİ");
        btnUrunList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUrunListMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnUrunListMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtenazsatilan))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtenfazlasatilan)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSatisYap2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                            .addComponent(btnUrunList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMusteriList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSatislar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnkasa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnurunekle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMusteriEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSatisYap2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUrunList, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnMusteriList, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMusteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnurunekle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnkasa, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(btnSatislar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtenfazlasatilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtenazsatilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setForeground(new java.awt.Color(0, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUrunListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrunListMouseReleased
        
        
        
    }//GEN-LAST:event_btnUrunListMouseReleased

    private void btnkasaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkasaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkasaMouseReleased

    private void btnMusteriEkleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteriEkleMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusteriEkleMouseReleased

    private void btnSatisYap2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatisYap2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSatisYap2MouseReleased

    private void btnkasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnkasaActionPerformed

    private void btnMusteriEkleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteriEkleMouseClicked
        
        frmMusteriEkle frm=new frmMusteriEkle();
        frm.setVisible(true);
        
        
    }//GEN-LAST:event_btnMusteriEkleMouseClicked

    private void btnMusteriListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteriListMouseClicked

                 frmMusteriListesi frm=new frmMusteriListesi();
                 frm.setVisible(true);
        
        
        
        
    }//GEN-LAST:event_btnMusteriListMouseClicked

    private void btnMusteriListMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMusteriListMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMusteriListMouseReleased

    private void btnSatisYap2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatisYap2MouseClicked
        
        frmSatisYap frm=new frmSatisYap();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnSatisYap2MouseClicked

    private void btnSatislarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatislarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSatislarMouseReleased

    private void btnSatislarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatislarActionPerformed
        
        frmSatisGecmisi frm=new frmSatisGecmisi();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnSatislarActionPerformed

    private void btnSatislarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSatislarMouseClicked
        
        frmSatisGecmisi frm=new frmSatisGecmisi();
        frm.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnSatislarMouseClicked

    private void btnUrunListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUrunListMouseClicked
        
        frmUrunList frm=new frmUrunList();
        frm.setVisible(true);
        
        
    }//GEN-LAST:event_btnUrunListMouseClicked

    private void btnkasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkasaMouseClicked
        
        frmKasaMiktar frm= new frmKasaMiktar();
        frm.setVisible(true);
        
        
    }//GEN-LAST:event_btnkasaMouseClicked

    private void btnurunekleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnurunekleMouseClicked
        
        frmUrunEkle frm=new frmUrunEkle();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnurunekleMouseClicked

    private void btnSatisYap2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisYap2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSatisYap2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMusteriEkle;
    private javax.swing.JButton btnMusteriList;
    private javax.swing.JButton btnSatisYap2;
    private javax.swing.JButton btnSatislar;
    private javax.swing.JButton btnUrunList;
    private javax.swing.JButton btnkasa;
    private javax.swing.JButton btnurunekle;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtenazsatilan;
    private javax.swing.JTextField txtenfazlasatilan;
    // End of variables declaration//GEN-END:variables
}
