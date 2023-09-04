package com.toclockin.model;

import javax.persistence.OneToMany;

public class Locality {
    private long id;
    @OneToMany
    private AccessLevel accessLevel;
    private String description;

    public Locality(long id, AccessLevel accessLevel, String description) {
        this.id = id;
        this.accessLevel = accessLevel;
        this.description = description;
    }

    public Locality() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
