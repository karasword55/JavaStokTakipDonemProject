

package com.samsun.donemproject.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tblpersonel")
@Entity
public class Personel {
    @Id 
    private Long id;
    private String kullanici;
    private String sifre;
    private String email;

    public Personel(Long id, String kullanici, String sifre, String email) {
        this.id = id;
        this.kullanici = kullanici;
        this.sifre = sifre;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
