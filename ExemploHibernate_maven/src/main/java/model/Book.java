package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Book {
    /*
    title CHAR(60),
    isbn CHAR(13) PRIMARY KEY,
    publisher_id INT,
    price DECIMAL(10,2),
     */
    private String  title;

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  isbn;
    private Integer publisherId;
    private Double price;

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public Double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
