
package com.samsun.donemproject.gui;

import com.samsun.donemproject.repository.entity.Kasa;
import com.samsun.donemproject.repository.entity.Musteri;
import com.samsun.donemproject.repository.entity.Odeme;
import com.samsun.donemproject.repository.entity.Satis;
import com.samsun.donemproject.repository.entity.SatisDetay;
import com.samsun.donemproject.repository.entity.Urun;
import com.samsun.donemproject.repository.hibernate.KasaRepository;
import com.samsun.donemproject.repository.hibernate.MusteriRepository;
import com.samsun.donemproject.repository.hibernate.OdemeRepository;
import com.samsun.donemproject.repository.hibernate.SatisDetayRepository;
import com.samsun.donemproject.repository.hibernate.SatisRepository;
import com.samsun.donemproject.repository.hibernate.UrunRepository;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class frmSatisYap extends javax.swing.JFrame {

    
    
     public static Musteri musteri=null;
    public static Urun urun=null;
    private UrunRepository DbUrun;
    private MusteriRepository DbMusteri;
    private SatisRepository DbSatis;
    private SatisDetayRepository DbSatisDetay;
    private KasaRepository DbKasa;
    private OdemeRepository DbOdeme;
    private int detayadedi=0;
    private double toplamfiyat=0;
    private double kkodeme=0;
    private double nakitodeme=0;
    private double kalan=0;
    private List<SatisDetay> satisDetayList=new ArrayList<>();
    java.text.NumberFormat format = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.getDefault());
   
    public frmSatisYap() {
        initComponents();
        
        DbKasa=new KasaRepository();
        DbMusteri = new MusteriRepository();
        DbOdeme=new OdemeRepository();
        DbSatisDetay=new SatisDetayRepository();
        DbUrun=new UrunRepository();
        DbSatis =new SatisRepository();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMusteriId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblMusteriAra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMusteriAdi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        formattxtTarih = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtToplamFiyat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmboBanka = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtkkodenen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnakitodenen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtKalan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSatis = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtBarkod = new javax.swing.JTextField();
        btnUrunBul = new javax.swing.JButton();
        txtUrunAdi = new javax.swing.JTextField();
        txtBirimFiyat = new javax.swing.JTextField();
        txtAdet = new javax.swing.JTextField();
        txtToplam = new javax.swing.JTextField();
        btnSatisYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Müşteri Id :");

        txtMusteriId.setEditable(false);

        lblMusteriAra.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mert\\Desktop\\search_25px.png")); // NOI18N
        lblMusteriAra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMusteriAraMouseClicked(evt);
            }
        });

        jLabel3.setText("Müşteri Adı :");

        txtMusteriAdi.setEditable(false);

        jLabel4.setText("Satış Tarihi :");

        try {
            formattxtTarih.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setText("Personel :");

        jLabel6.setText("Toplam Fiyat :");

        txtToplamFiyat.setEditable(false);

        jLabel7.setText("Kredi Kartı Banka:");

        cmboBanka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lütfen Seçiniz...", "Halkbank", "Vakıfbank", "Ziraatbank", "Akbank", "Anadolubank", "Şekerbank", "İş Bankası", "Yapı Kredi Bankası", "Deniz Bank", "ING Bank", "QNB Finansbank", " " }));
        cmboBanka.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboBankaİtemStateChanged(evt);
            }
        });

        jLabel8.setText("Kredi Kartı Ödenen:");

        txtkkodenen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtkkodenenKeyReleased(evt);
            }
        });

        jLabel9.setText("Nakit Ödenen:");

        txtnakitodenen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnakitodenenKeyReleased(evt);
            }
        });

        jLabel10.setText("Kalan :");

        txtKalan.setEditable(false);

        tableSatis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Ürün Adı", "Birim Fiyat", "Adet", "Toplam"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSatis);
        if (tableSatis.getColumnModel().getColumnCount() > 0) {
            tableSatis.getColumnModel().getColumn(0).setPreferredWidth(50);
            tableSatis.getColumnModel().getColumn(1).setPreferredWidth(300);
            tableSatis.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableSatis.getColumnModel().getColumn(3).setPreferredWidth(35);
            tableSatis.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        jLabel11.setText("Barkod Okuma:");

        txtBarkod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBarkodKeyPressed(evt);
            }
        });

        btnUrunBul.setText("Bul");
        btnUrunBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrunBulActionPerformed(evt);
            }
        });

        txtUrunAdi.setEditable(false);

        txtBirimFiyat.setEditable(false);
        txtBirimFiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirimFiyatActionPerformed(evt);
            }
        });

        txtAdet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdetActionPerformed(evt);
            }
        });
        txtAdet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdetKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAdetKeyReleased(evt);
            }
        });

        txtToplam.setEditable(false);

        btnSatisYap.setText("SATIŞ YAP");
        btnSatisYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisYapActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBarkod, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSatisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtMusteriId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMusteriAra))
                                    .addComponent(txtMusteriAdi)
                                    .addComponent(formattxtTarih)
                                    .addComponent(jTextField1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(108, 108, 108)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtToplamFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmboBanka, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtKalan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                                .addComponent(txtnakitodenen, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtkkodenen, javax.swing.GroupLayout.Alignment.LEADING)))))))
                        .addContainerGap(55, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnUrunBul, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBirimFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAdet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtToplamFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblMusteriAra, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtMusteriId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMusteriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cmboBanka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(formattxtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtkkodenen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtnakitodenen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtKalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtBarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUrunBul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBirimFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtToplam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnSatisYap)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBirimFiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirimFiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirimFiyatActionPerformed

    private void txtAdetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdetActionPerformed

    private void lblMusteriAraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMusteriAraMouseClicked
        
        frmMusteriListesi frm=new frmMusteriListesi();
        frm.setVisible(true);
        
    }//GEN-LAST:event_lblMusteriAraMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
         if(musteri!=null){
            txtMusteriId.setText(musteri.getId()+"");
            txtMusteriAdi.setText(musteri.getAd()+""+ musteri.getSoyad());
        }
        if(urun!=null){
            txtUrunAdi.setText(urun.getAd());
            txtBirimFiyat.setText(urun.getFiyat()+"");
            txtAdet.requestFocus();
            
        }
        
        
    }//GEN-LAST:event_formWindowActivated

    private void cmboBankaİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboBankaİtemStateChanged
        
        int secilenitemid = cmboBanka.getSelectedIndex();
        if(secilenitemid>0){
            txtkkodenen.setEnabled(true);
        }else{
            txtkkodenen.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_cmboBankaİtemStateChanged

    private void btnUrunBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrunBulActionPerformed
        
        frmUrunList frm=new frmUrunList();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btnUrunBulActionPerformed

    private void txtBarkodKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarkodKeyPressed
        
         if(evt.getKeyChar()==KeyEvent.VK_ENTER){
            if(txtAdet.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Adet alanını boş bırakamazsınız..");
                txtAdet.requestFocus();// boş bıraktığımız adet alanına focuslar.
            }else{
                Ekle();
            }
            
            
        }
        
        
    }//GEN-LAST:event_txtBarkodKeyPressed

    private void txtAdetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdetKeyPressed
        
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             if(urun!=null){
                 Ekle();
             }else{
                  if(txtBarkod.getText().isEmpty()){
                     JOptionPane.showMessageDialog(this, "Barkod alanı boş bıarkılamaz!");
                     txtBarkod.requestFocus();
                 }
                 else
                     Ekle();
             }
           
         }else{
             
            
             
            
         }
        
        
        
    }//GEN-LAST:event_txtAdetKeyPressed

    private void txtAdetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdetKeyReleased
        
         try {
                       double birimfiyat=urun.getFiyat();
                       double adet=0;
                 if(!txtAdet.getText().trim().equals("")){
                  adet=Double.parseDouble(txtAdet.getText());
                  double toplam=birimfiyat*adet;
                   txtToplam.setText(format.format(toplam));
                 }
             }catch(NullPointerException ex){
                 
             } 
             catch (Exception e) {
                 JOptionPane.showMessageDialog(this, "Lütfen Geçerli bir sayı giriniz!");
             }
        
        
    }//GEN-LAST:event_txtAdetKeyReleased

    private void txtkkodenenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkkodenenKeyReleased
        
          if(toplamfiyat<=0 && !txtkkodenen.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Lütfen önce ürün ekleyiniz!");
            txtkkodenen.setText("");
        }else{
            try {
            kkodeme=Double.parseDouble(txtkkodenen.getText());
            
        } catch (Exception e) {
        }
            kalan=toplamfiyat-kkodeme-nakitodeme;
            txtKalan.setText(format.format(kalan));
      }
        
        
    }//GEN-LAST:event_txtkkodenenKeyReleased

    private void txtnakitodenenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnakitodenenKeyReleased
        
         if(toplamfiyat<=0 && !txtnakitodenen.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Lütfen önce ürün ekleyiniz!");
            txtnakitodenen.setText("");
        }else{
            try {
            nakitodeme=Double.parseDouble(txtnakitodenen.getText());
            
        } catch (Exception e) {
        }
            kalan=toplamfiyat-kkodeme-nakitodeme;
            txtKalan.setText(format.format(kalan));
      }
        
        
        
        
    }//GEN-LAST:event_txtnakitodenenKeyReleased

    private void btnSatisYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisYapActionPerformed
        
        try {
            // satış gerçekleşiyor..
            // stoktan düülecek,kasaya para girişi olacak.
            Satis satis=new Satis();
            satis.setIslemtarihi(new SimpleDateFormat("dd/MM/yyyy").parse(formattxtTarih.getText()));
            satis.setToplamfiyat(toplamfiyat);
            satis.setOdenennakit(nakitodeme);
            satis.setOdenenkk(kkodeme);
            satis.setKalan(kalan);
            satis.setMusteriid(musteri.getId());
            DbSatis.Save(satis);
            JOptionPane.showMessageDialog(this, "SATIŞ BAŞARIYLA GERÇEKLEŞTİ!");
            SatisDetay satisdetay;
            for (SatisDetay item : satisDetayList) {
                satisdetay=new SatisDetay();
                satisdetay.setBirimfiyat(item.getBirimfiyat());
                satisdetay.setMiktar(item.getMiktar());
                satisdetay.setSatisid(satis.getId());
                satisdetay.setToplamfiyat(item.getToplamfiyat());
                satisdetay.setUrunadi(item.getUrunadi());
                satisdetay.setUrunid(item.getUrunid());
                DbSatisDetay.Save(satisdetay);
            }
            // ödeme var ise ödeme tablosuna giriş
            Odeme odeme=new Odeme();
            odeme.setOdenenkk(kkodeme);
            odeme.setOdenennakit(nakitodeme);
            odeme.setMusteriid(musteri.getId());
            odeme.setTarih(new SimpleDateFormat("dd/MM/yyyy").parse(formattxtTarih.getText()));
            DbOdeme.Save(odeme);
            // stoktan ürün adedi düşülmesi lazım
            for (SatisDetay item : satisDetayList) {
                Urun urun=DbUrun.findById(item.getUrunid(), new Urun());
                urun.setStokmiktari(urun.getStokmiktari()-item.getMiktar());
                DbUrun.Update(urun);
            }
            //Eğer ödeme var ise kasaya para girecek
            // 1->naskit kasası
            // 2-> kredi kartı kasası
            //burası nakit için
            Kasa kasa= DbKasa.findById(4L,new Kasa());
            kasa.setMiktar(kasa.getMiktar()+nakitodeme);
            DbKasa.Update(kasa);
            // 2-kredi kartı için;
            int secilenitemid = cmboBanka.getSelectedIndex();
            if(secilenitemid<0){
            Long secilenbanka=Long.parseLong(cmboBanka.getSelectedIndex()+"");
            kasa= DbKasa.findById(secilenbanka,new Kasa());
            kasa.setMiktar(kasa.getMiktar()+kkodeme);
            DbKasa.Update(kasa);
            JOptionPane.showMessageDialog(this, "Satış Yapıldı!");
            
            }
        } catch (ParseException ex) {
            
            Logger.getLogger(frmSatisYap.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
        JOptionPane.showMessageDialog(this, "Satış Yapıldı!");
        
        
    }//GEN-LAST:event_btnSatisYapActionPerformed

    
    private void Ekle(){
       if(txtBarkod.getText().isEmpty()){
           
               tableSatis.setValueAt(urun.getId(), detayadedi, 0);
               tableSatis.setValueAt(urun.getAd(), detayadedi, 1);
               tableSatis.setValueAt(urun.getFiyat(), detayadedi, 2);
               tableSatis.setValueAt(txtAdet.getText(), detayadedi, 3);
               Double toplamfiyat=urun.getFiyat()* Double.parseDouble(txtAdet.getText());
               tableSatis.setValueAt(toplamfiyat, detayadedi, 4);
               detayadedi++;
               this.toplamfiyat+=toplamfiyat;
               txtToplamFiyat.setText(format.format(this.toplamfiyat));
               satisdetayekle(urun.getFiyat(),
                       Double.parseDouble(txtAdet.getText()), 
                       toplamfiyat, urun.getAd(), urun.getId());
               urun=null;
           
       }else{
           String barkod=txtBarkod.getText();
           Urun sorgu=new Urun();
           sorgu.setBarkod(barkod);
           List<Urun> result=DbUrun.findByClass(sorgu);
           if(result.size()<1){
               JOptionPane.showMessageDialog(this, "Böyle bir ürün bulunmamaktadır!");
               
           }else{
              Urun urun=result.get(0);
               tableSatis.setValueAt(urun.getId(), detayadedi, 0);
               tableSatis.setValueAt(urun.getAd(), detayadedi, 1);
               tableSatis.setValueAt(urun.getFiyat(), detayadedi, 2);
               tableSatis.setValueAt(txtAdet.getText(), detayadedi, 3);
               Double toplamfiyat=urun.getFiyat()* Double.parseDouble(txtAdet.getText());
               tableSatis.setValueAt(toplamfiyat, detayadedi, 4);
               detayadedi++;
               this.toplamfiyat+=toplamfiyat;
               txtToplamFiyat.setText(format.format(this.toplamfiyat));
                satisdetayekle(urun.getFiyat(),
                       Double.parseDouble(txtAdet.getText()), 
                       toplamfiyat, urun.getAd(), urun.getId());

               
           }
          
       }
               
       
                 txtAdet.setText("");
                 txtBarkod.setText("");
                 txtUrunAdi.setText("");
                 txtToplam.setText("");
                 txtBirimFiyat.setText("");
      
//JOptionPane.showMessageDialog(this, "Eklendi..");
   }
  
    
         private void satisdetayekle(double birimfiyat,double miktar,double toplamfiyat,
           String urunadi,Long urunid){
       SatisDetay satisdetay=new SatisDetay();
               satisdetay.setBirimfiyat(birimfiyat);
               satisdetay.setMiktar(miktar);
               satisdetay.setToplamfiyat(toplamfiyat);
               satisdetay.setUrunadi(urunadi);
               satisdetay.setUrunid(urunid);
               satisDetayList.add(satisdetay);
   } 
         
         
    
    
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
            java.util.logging.Logger.getLogger(frmSatisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSatisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSatisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSatisYap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSatisYap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSatisYap;
    private javax.swing.JButton btnUrunBul;
    private javax.swing.JComboBox<String> cmboBanka;
    private javax.swing.JFormattedTextField formattxtTarih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMusteriAra;
    private javax.swing.JTable tableSatis;
    private javax.swing.JTextField txtAdet;
    private javax.swing.JTextField txtBarkod;
    private javax.swing.JTextField txtBirimFiyat;
    private javax.swing.JTextField txtKalan;
    private javax.swing.JTextField txtMusteriAdi;
    private javax.swing.JTextField txtMusteriId;
    private javax.swing.JTextField txtToplam;
    private javax.swing.JTextField txtToplamFiyat;
    private javax.swing.JTextField txtUrunAdi;
    private javax.swing.JTextField txtkkodenen;
    private javax.swing.JTextField txtnakitodenen;
    // End of variables declaration//GEN-END:variables
}
