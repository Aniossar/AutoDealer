package com.company.carscubaplatform.entity.car;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "CARSCUBAPLATFORM_COLOR")
@Entity(name = "carscubaplatform_Color")
@NamePattern("%s|name")
public class Color extends StandardEntity {
    private static final long serialVersionUID = 4551974417181652379L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true, length = 100)
    private String name;

    @Column(name = "CODE")
    @NotNull
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