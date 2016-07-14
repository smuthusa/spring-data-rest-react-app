package com.elephant.csg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by smuthusa on 7/9/2016.
 */
@Entity
public class College {
    @Id
    private Long code;
    private String name;
    private int region;
    private String address;
    private Date establishedYear;

    public College() {
    }

    public College(String name, Long code, int region, String address, Date establishedYear) {
        this.name = name;
        this.code = code;
        this.region = region;
        this.address = address;
        this.establishedYear = establishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public int getRegion() {
        return region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(Date establishedYear) {
        this.establishedYear = establishedYear;
    }
}
