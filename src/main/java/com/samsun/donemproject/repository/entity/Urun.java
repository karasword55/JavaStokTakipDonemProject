

package com.samsun.donemproject.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="tblurun")
@Entity
public class Urun {
    @Id
    @SequenceGenerator(name="sq_urun_id",sequenceName = "sq_urun_id",
                                           initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "sq_urun_id")
    
    private Long id;
    private String ad;
    private Double fiyat;
    private String marka;
    private String model;
     private String barkod;
    private double stokmiktari;
    private double indirimlifiyat;
    private int kdv;
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

   

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public double getStokmiktari() {
        return stokmiktari;
    }

    public void setStokmiktari(double stokmiktari) {
        this.stokmiktari = stokmiktari;
    }

    public double getIndirimlifiyat() {
        return indirimlifiyat;
    }

    public void setIndirimlifiyat(double indirimlifiyat) {
        this.indirimlifiyat = indirimlifiyat;
    }

    public int getKdv() {
        return kdv;
    }

    public void setKdv(int kdv) {
        this.kdv = kdv;
    }
    
    
    
    
    
    
    
    
    

}
