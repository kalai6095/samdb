package com.hib.exa.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Emp implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String[] company;
    private Integer[] exp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getCompany() {
        return company;
    }

    public void setCompany(String[] company) {
        this.company = company;
    }

    public Integer[] getExp() {
        return exp;
    }

    public void setExp(Integer[] exp) {
        this.exp = exp;
    }
}
