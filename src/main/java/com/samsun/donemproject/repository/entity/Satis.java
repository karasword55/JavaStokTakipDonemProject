

package com.samsun.donemproject.repository.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tblsatis")
@Entity
public class Satis {
    @Id
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date tarih;
    @Column(nullable = true)
    private double kdvdahilfiyat;
    private double toplamfiyat;
    @Column(nullable = true)
    private double toplamkdv;
    private double odenenkk;
    private double odenennakit;
    private double kalan;
    private java.util.Date islemtarihi;
    @Column(nullable = true)
    private Long personelid;
    private Long musteriid;
   

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public double getKdvdahilfiyat() {
        return kdvdahilfiyat;
    }

    public void setKdvdahilfiyat(double kdvdahilfiyat) {
        this.kdvdahilfiyat = kdvdahilfiyat;
    }

    public double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }

    public double getToplamkdv() {
        return toplamkdv;
    }

    public void setToplamkdv(double toplamkdv) {
        this.toplamkdv = toplamkdv;
    }

    public double getOdenenkk() {
        return odenenkk;
    }

    public void setOdenenkk(double odenenkk) {
        this.odenenkk = odenenkk;
    }

    public double getOdenennakit() {
        return odenennakit;
    }

    public void setOdenennakit(double odenennakit) {
        this.odenennakit = odenennakit;
    }

    public double getKalan() {
        return kalan;
    }

    public void setKalan(double kalan) {
        this.kalan = kalan;
    }

    public java.util.Date getIslemtarihi() {
        return islemtarihi;
    }

    public void setIslemtarihi(java.util.Date islemtarihi) {
        this.islemtarihi = islemtarihi;
    }

    public Long getPersonelid() {
        return personelid;
    }

    public void setPersonelid(Long personelid) {
        this.personelid = personelid;
    }

    public Long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(Long musteriid) {
        this.musteriid = musteriid;
    }

    
   
}
