package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Random;

@Entity
@Table(name = "BooksAuthors")
public class BooksAuthors {
    @Id
    private String  isbn;
    @Id
    private Integer author_id;

    private Integer seq_no;

    public BooksAuthors(String isbn, Integer author_id) {
        this.isbn = isbn;
        this.author_id = author_id;
        this.seq_no = new Random().nextInt();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(Integer seq_no) {
        this.seq_no = seq_no;
    }
}
