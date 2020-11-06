package dao;

import javax.persistence.ParameterMode;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import model.Authors;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.procedure.ProcedureOutputs;
import org.hibernate.result.ResultSetOutput;

public class AuthorsDAO extends DaoGenerico<Authors>{
    
    public AuthorsDAO() {}
    
    @Override
    public void alterar(Object object) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaUpdate<Authors> criteriaUpdate = builder.createCriteriaUpdate(Authors.class);
        Root<Authors> root = criteriaUpdate.from(Authors.class);
        Authors autor = (Authors) object;

        criteriaUpdate.set("name",autor.getName());
        criteriaUpdate.set("fname",autor.getfName());
        criteriaUpdate.where(builder.equal(root.get("author_id"), autor.getAuthorId()));

        Transaction transaction = session.beginTransaction();
        session.update(autor);
        transaction.commit();
        session.close();
    }
}
