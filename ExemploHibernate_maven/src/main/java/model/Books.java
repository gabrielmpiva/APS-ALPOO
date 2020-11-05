package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Books {
   
    private String  title;
    @Id
    @Column(name = "isbn")
    private String  isbn;
    
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publishers publisher;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "booksauthors", 
        joinColumns = { @JoinColumn(name = "isbn") }, 
        inverseJoinColumns = { @JoinColumn(name = "author_id") }
    )
    private List<Authors> authors = new ArrayList<>();

   	public List<Authors> getAuthors() {
		return authors;
	}

	private Double price;
    public static final String ORDER_BY_TITLE = "title";

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Publishers getPublisher() {
		return publisher;
	}

	public void setPublisher(Publishers publisher) {
		this.publisher = publisher;
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
