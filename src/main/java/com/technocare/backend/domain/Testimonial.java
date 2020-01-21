package com.technocare.backend.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Testimonial {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String head;
    @Column(columnDefinition = "TEXT")
    private String content;

    protected Testimonial() {}

    public Testimonial(String name, String head, String content) {
        this.name = name;
        this.head = head;
        this.content = content;
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

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
