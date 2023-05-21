package com.example.songhuysql.entity;

import jakarta.persistence.*;
import jdk.jfr.Category;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Entity
@Table(name = "book")
public class Book {
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public com.example.songhuysql.entity.category getCategory() {
        return category;
    }

    public void setCategory(com.example.songhuysql.entity.category category) {
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @Column(name = "price")
    private Double price;
    @ManyToOne
    @JoinColumn(name = "category_id" )
    private category category;


}
