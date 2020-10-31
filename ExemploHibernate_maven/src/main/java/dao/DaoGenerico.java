package dao;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class DaoGenerico<T> {

    protected HibernateConfiguracao getHibernateConfiguracao() {
        return new HibernateConfiguracao();
    }

    public void gravar(Object obj) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
    }

    public void excluir(Object obj) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
    }

    public List carregarTudoOrdenado(Class<T> aClass, String ordem) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteria = builder.createQuery(aClass);
        Root<T> root = criteria.from(aClass);
        criteria.select(root);

        criteria.orderBy(
                builder.asc(root.get(ordem))
        );
        return session.createQuery(criteria).getResultList();
    }

    public void alterar(Object object) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(object);
        transaction.commit();
        session.close();
    }

    public Object carregarUm(int id, Class<T> aClass) throws HibernateException {
        Session session = getHibernateConfiguracao().openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(aClass);
        criteria.add(Restrictions.eq("id", id));
        Object obj = criteria.uniqueResult();
        transaction.commit();
        session.close();
        return obj;
    }

}
