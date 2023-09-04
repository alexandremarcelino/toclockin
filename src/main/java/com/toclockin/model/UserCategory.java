package com.toclockin.model;

public class UserCategory {
    private long id;
    private String description;

    public UserCategory(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public UserCategory(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
