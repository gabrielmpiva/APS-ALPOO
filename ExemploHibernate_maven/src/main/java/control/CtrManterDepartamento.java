package control;

import dao.DaoDepartamento;
import model.Departamento;
import org.hibernate.HibernateException;

import java.util.List;

public class CtrManterDepartamento {

    private DaoDepartamento acessohibernatedepto;

    public CtrManterDepartamento() {
        this.acessohibernatedepto = new DaoDepartamento();
    }

    public int gravarDepartamento(Departamento departamento) {
        try {
            acessohibernatedepto.gravar(departamento);
            return 1;
        } catch (HibernateException e) {
            e.printStackTrace();return 2;
        }
    }

    public List<Object> carregarDepartamentos() {
        try {
            return acessohibernatedepto.carregarTudoOrdenado(Departamento.class,"nome");
        } catch (HibernateException e) {
            return null;
        }
    }

    public boolean excluirDepartamento(Departamento departamento) {
        try {acessohibernatedepto.excluir(departamento);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;}
    }

    public boolean alterarDepartamento(Departamento departamento) {
        try {
            acessohibernatedepto.alterar(departamento);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;}
    }
}
