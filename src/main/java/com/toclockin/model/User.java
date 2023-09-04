package com.toclockin.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class User {
    private long id;
    private UserCategory userCategory;
    private String name;
    private Company company;
    private AccessLevel accessLevel;
    private Workday workday;
    private BigDecimal tolerance;
    private LocalDateTime startJourney;
    private LocalDateTime endJourney;

    public User(long id, UserCategory userCategory, String name, Company company, AccessLevel accessLevel,
                Workday workday, BigDecimal tolerance, LocalDateTime startJourney, LocalDateTime endJourney) {
        this.id = id;
        this.userCategory = userCategory;
        this.name = name;
        this.company = company;
        this.accessLevel = accessLevel;
        this.workday = workday;
        this.tolerance = tolerance;
        this.startJourney = startJourney;
        this.endJourney = endJourney;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public Workday getWorkday() {
        return workday;
    }

    public void setWorkday(Workday workday) {
        this.workday = workday;
    }

    public BigDecimal getTolerance() {
        return tolerance;
    }

    public void setTolerance(BigDecimal tolerance) {
        this.tolerance = tolerance;
    }

    public LocalDateTime getStartJourney() {
        return startJourney;
    }

    public void setStartJourney(LocalDateTime startJourney) {
        this.startJourney = startJourney;
    }

    public LocalDateTime getEndJourney() {
        return endJourney;
    }

    public void setEndJourney(LocalDateTime endJourney) {
        this.endJourney = endJourney;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
