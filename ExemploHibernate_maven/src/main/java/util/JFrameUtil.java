package util;

import control.Controller;
import dao.DaoGenerico;
import model.Authors;
import model.Books;
import model.Publishers;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public ArrayList<Authors> carregarAutores(ArrayList<Authors> listaDeAutores) {

        List Livros = new ArrayList<>();
        listaDeAutores = new ArrayList<>();

        Livros = controller.carregarTodosDados(Authors.ORDER_BY_NAME);
        for (Object o : Livros) {
            listaDeAutores.add((Authors) o);
        }
        return listaDeAutores;
    }
    
    
    public ArrayList<Publishers> carregarEditoras(ArrayList<Publishers> listaDeEditoras) {

    	  List<Object> Livros = new ArrayList<>();
          listaDeEditoras = new ArrayList<>();

          Livros = controller.carregarTodosDados(Publishers.ORDER_BY_NAME);
          for (Object o : Livros) {
              listaDeEditoras.add((Publishers) o);
          }
          return listaDeEditoras;
    }

    public DefaultTableModel carregarLivrosNaTabela(ArrayList<Books> listaDeLivros) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("title");
        modelo.addColumn("isbn");
        modelo.addColumn("publisher");
        modelo.addColumn("price");
        if (listaDeLivros != null && listaDeLivros.size() > 0) {
            modelo.setNumRows(listaDeLivros.size());
            for (int i = 0; i < listaDeLivros.size(); i++) {
                    modelo.setValueAt(listaDeLivros.get(i).getTitle(),i,0);
                    modelo.setValueAt(listaDeLivros.get(i).getIsbn(),i,1);
                    modelo.setValueAt(listaDeLivros.get(i).getPublisher().getName(),i,2);
                    modelo.setValueAt(listaDeLivros.get(i).getPrice(),i,3);
            }
        }
        return modelo;
    }
    
    
    public DefaultTableModel carregarEditorasNaTabela(ArrayList<Publishers> listaDeEditoras) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nome");
        modelo.addColumn("url");
        if (listaDeEditoras != null && listaDeEditoras.size() > 0) {
            modelo.setNumRows(listaDeEditoras.size());
            for (int i = 0; i < listaDeEditoras.size(); i++) {
                    modelo.setValueAt(listaDeEditoras.get(i).getPublisherId(),i,0);
                    modelo.setValueAt(listaDeEditoras.get(i).getName(),i,1);
                    modelo.setValueAt(listaDeEditoras.get(i).getUrl(),i,2);
                    
            }
        }
        return modelo;
    }
}