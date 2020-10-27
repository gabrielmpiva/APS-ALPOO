package dao;

import model.Departamento;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DaoGenerico {

    protected HibernateConfiguracao hibernateConfiguracao;

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

    public List<Object> carregarTudoOrdenado(Class<model.Departamento> aClass, String ordem) throws HibernateException {
        Session session = hibernateConfiguracao.openSession();
        Criteria criteria = session.createCriteria(aClass);
        criteria.addOrder(Order.asc(ordem));
        List lista = criteria.list();
        session.close();
        return lista;
    }

    public Object carregarUm(int id, Class<?> aClass) throws HibernateException {
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
