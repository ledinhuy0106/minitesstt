package com.example.model;


import javax.persistence.*;

@Entity
@Table
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int bath;
    @ManyToOne
    private  Category category;

    public House(Long id, String name, int bath, Category category) {
        this.id = id;
        this.name = name;
        this.bath = bath;
        this.category = category;
    }

    public House(String name, int bath, Category category) {
        this.name = name;
        this.bath = bath;
        this.category = category;
    }

    public House() {

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

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
