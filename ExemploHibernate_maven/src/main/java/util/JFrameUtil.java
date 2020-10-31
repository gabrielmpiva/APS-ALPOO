package util;

import control.Controller;
import dao.DaoGenerico;
import model.Books;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JFrameUtil<T> {

    private final Controller<T> controller;

    public JFrameUtil(
            Class<T> aClass,
            DaoGenerico<T> dao
    ) {
        this.controller = new Controller<T>(aClass, dao);
    }

    public ArrayList<Books> carregarLivros(ArrayList<Books> listaDeLivros) {

        List Livros = new ArrayList<>();
        listaDeLivros = new ArrayList<>();

        Livros = controller.carregarTodosDados(Books.ORDER_BY_TITLE);
        for (Object o : Livros) {
            listaDeLivros.add((Books) o);
        }
        return listaDeLivros;
    }

    public DefaultTableModel carregarLivrosNaTabela(ArrayList<Books> listaDeLivros) {
        DefaultTableModel modelo = new DefaultTableModel();
        if (listaDeLivros != null && listaDeLivros.size() > 0) {
            for (Books books : listaDeLivros) {
                Object[][] dados = {
                        {
                                books.getTitle(),
                                books.getIsbn(),
                                books.getPublisherId(),
                                books.getPrice()
                        }
                };
                String[] colunas = {"title", "isbn", "publisher_id", "price"};
                modelo.setDataVector(dados,colunas);
            }
        }
        return modelo;
    }
}

/*
    Livros = controller.carregarTodosDados(Books.ORDER_BY_TITLE);
    ListaDeLivros.removeAllItems();
    for (Object obj : Livros) {
        Books b = (Books) obj;
        ListaDeLivros.addItem(b.getTitle());
    }


    tabelaEditLivro = new JTable();
    List objects = new ArrayList<>();
    objects = controller.carregarTodosDados(Books.ORDER_BY_TITLE);
    if (objects != null) {
        for (Object list : objects) {
            Books books = (Books) list;
            Object[][] dados = {
                    {
                            books.getTitle(),
                            books.getIsbn(),
                            books.getPublisherId(),
                            books.getPrice()
                    }
            };
            String[] colunas = {"title", "isbn", "publisher_id", "price"};
            tabelaEditLivro = new JTable(dados, colunas);
        }
    }
    return tabelaEditLivro;
 */