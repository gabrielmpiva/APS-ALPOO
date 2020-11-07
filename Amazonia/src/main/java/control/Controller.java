package control;

import dao.DaoGenerico;
import org.hibernate.HibernateException;

import java.util.List;

public class Controller<T> {

    private final DaoGenerico<T> acessohibernatedepto;
    private Class<T> aClass;

    public Controller(Class<T> aClass, DaoGenerico<T> dao) {
        this.aClass = aClass;
        this.acessohibernatedepto = dao;
    }

    public int gravarDados(Object object) {
        try {
            acessohibernatedepto.gravar(object);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();
            return 2;
        }
    }

    public List carregarTodosDados(String filtro) {
        try {
            return acessohibernatedepto.carregarTudoOrdenado(this.aClass, filtro);
        } catch (HibernateException e) {
            return null;
        }
    }

    public boolean excluirDado(Object object) {
        try {acessohibernatedepto.excluir(object);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterarDado(Object object) {
        try {
            acessohibernatedepto.alterar(object);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;}
    }
}
