

package com.samsun.donemproject.repository.entity;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="tblSatisDetay")
@Entity
public class SatisDetay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     private Long satisid;
    private Long urunid;
    private Double birimfiyat;
    private Double miktar;
    private Double toplamfiyat;
    private String urunadi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSatisid() {
        return satisid;
    }

    public void setSatisid(Long satisid) {
        this.satisid = satisid;
    }

    public Long getUrunid() {
        return urunid;
    }

    public void setUrunid(Long urunid) {
        this.urunid = urunid;
    }

    public Double getBirimfiyat() {
        return birimfiyat;
    }

    public void setBirimfiyat(Double birimfiyat) {
        this.birimfiyat = birimfiyat;
    }

    public Double getMiktar() {
        return miktar;
    }

    public void setMiktar(Double miktar) {
        this.miktar = miktar;
    }

    public Double getToplamfiyat() {
        return toplamfiyat;
    }

    public void setToplamfiyat(Double toplamfiyat) {
        this.toplamfiyat = toplamfiyat;
    }

    public String getUrunadi() {
        return urunadi;
    }

    public void setUrunadi(String urunadi) {
        this.urunadi = urunadi;
    }
    
    
    

}
