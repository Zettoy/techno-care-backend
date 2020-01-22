package com.technocare.backend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Quote {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String contact;
    private String email;
    private String serviceInterested;

    @Column(columnDefinition = "TEXT")
    private String message;

    protected Quote() {}

    public Quote(String name, String contact, String email, String serviceInterested, String message) {
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.serviceInterested = serviceInterested;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getServiceInterested() {
        return serviceInterested;
    }

    public void setServiceInterested(String serviceInterested) {
        this.serviceInterested = serviceInterested;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
