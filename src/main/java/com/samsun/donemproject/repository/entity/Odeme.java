

package com.samsun.donemproject.repository.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tblOdeme")
@Entity
public class Odeme {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
  private Long musteriid;
    private Double odenenkk;
    private Double odenennakit;
    private Date tarih;
    @Column(nullable = true)
    private Long personelid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(Long musteriid) {
        this.musteriid = musteriid;
    }

    public Double getOdenenkk() {
        return odenenkk;
    }

    public void setOdenenkk(Double odenenkk) {
        this.odenenkk = odenenkk;
    }

    public Double getOdenennakit() {
        return odenennakit;
    }

    public void setOdenennakit(Double odenennakit) {
        this.odenennakit = odenennakit;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public Long getPersonelid() {
        return personelid;
    }

    public void setPersonelid(Long personelid) {
        this.personelid = personelid;
    }
    
    
 

}
