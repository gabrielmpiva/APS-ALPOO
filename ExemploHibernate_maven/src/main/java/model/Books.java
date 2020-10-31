package model;

import javax.persistence.*;

@Entity
public class Books {
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

    private Integer publisher_id;

    private Double price;
    public static final String ORDER_BY_TITLE = "title";

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getPublisherId() {
        return publisher_id;
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
        this.publisher_id = publisherId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Titulo: ").append(getTitle())
                .toString();
    }
}
