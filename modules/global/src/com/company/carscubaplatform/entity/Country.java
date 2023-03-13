package com.company.carscubaplatform.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CARSCUBAPLATFORM_COUNTRY")
@Entity(name = "carscubaplatform_Country")
@NamePattern("%s|name")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -4984413512958145394L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 100)
    private String name;

    @Column(name = "CODE")
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}