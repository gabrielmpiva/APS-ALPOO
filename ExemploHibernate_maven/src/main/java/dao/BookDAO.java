package dao;

import model.Books;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;


public class BookDAO extends DaoGenerico<Books>{
    public BookDAO() {}

    @Override
    public void alterar(Object object) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaUpdate<Books> criteriaUpdate = builder.createCriteriaUpdate(Books.class);
        Root<Books> root = criteriaUpdate.from(Books.class);
        Books books = (Books) object;

        criteriaUpdate.set("price",books.getPrice());
        criteriaUpdate.set("title",books.getTitle());
        criteriaUpdate.where(builder.equal(root.get("isbn"), books.getIsbn()));

        Transaction transaction = session.beginTransaction();
        session.update(books);
        transaction.commit();
        session.close();
    }
}
