package dao;

import model.Books;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.procedure.ProcedureOutputs;
import org.hibernate.result.ResultSetOutput;
import javax.persistence.ParameterMode;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.awt.*;


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

    @Override
    public void excluir(Object obj) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        Transaction transaction = session.beginTransaction();

        Books books = (Books) obj;
        ProcedureCall procedureCall = session.createStoredProcedureCall("deletar_livro");
        procedureCall.registerParameter("this_isbn", String.class, ParameterMode.IN);
        procedureCall.getParameterRegistration("this_isbn").bindValue(books.getIsbn());

        ProcedureOutputs procedureOutputs = procedureCall.getOutputs();
        ResultSetOutput resultSetOutput = (ResultSetOutput) procedureOutputs.getCurrent();

        resultSetOutput.getResultList();
        transaction.commit();
        session.close();
    }
}
