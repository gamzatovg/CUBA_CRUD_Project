package com.company.test.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "TEST_CITY")
@Entity(name = "test_City")
@PublishEntityChangedEvents
public class City extends StandardEntity {
    private static final long serialVersionUID = -2359576284300188538L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "IS_DEFAULT", nullable = false)
    protected Boolean isDefault = false;

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}