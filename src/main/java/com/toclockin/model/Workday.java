package com.toclockin.model;

public class Workday {
    private long id;
    private String description;

    public Workday(long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Workday() {}

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
