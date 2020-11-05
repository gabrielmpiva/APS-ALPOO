package model;

import javax.persistence.*;

@Entity
public class Books {
    private String  title;

    @Id
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
