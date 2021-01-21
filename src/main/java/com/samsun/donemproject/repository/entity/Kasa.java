

package com.samsun.donemproject.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="tblKasa")
@Entity
public class Kasa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String kasaadi;
    private Double miktar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKasaadi() {
        return kasaadi;
    }

    public void setKasaadi(String kasaadi) {
        this.kasaadi = kasaadi;
    }

    public Double getMiktar() {
        return miktar;
    }

    public void setMiktar(Double miktar) {
        this.miktar = miktar;
    }
    
    
    

}
