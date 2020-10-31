package dao;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class DaoGenerico<T> {
    HibernateConfiguracao hibernateConfiguracao;

    public DaoGenerico () {
        hibernateConfiguracao = new HibernateConfiguracao();
    }

    public void gravar(Object obj) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);
        transaction.commit();
        session.close();
    }

    public void alterar(Object obj) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        session.close();
    }

    public void excluir(Object obj) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
    }

    public List carregarTudoOrdenado(Class<T> aClass, String ordem) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<T> criteria = builder.createQuery(aClass);
        Root<T> objectRoot = criteria.from(aClass);
        criteria.orderBy(
                builder.asc(objectRoot.get(ordem))
        );
        return session.createQuery(criteria).getResultList();
    }

    public Object carregarUm(int id, Class<T> aClass) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(aClass);
        criteria.add(Restrictions.eq("id", id));
        Object obj = criteria.uniqueResult();
        transaction.commit();
        session.close();
        return obj;
    }

}
