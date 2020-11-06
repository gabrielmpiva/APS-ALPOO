/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmViewHome.java
 *
 * Created on May 22, 2009, 10:50:36 AM
 */
package view;

import control.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.AuthorsDAO;
import dao.BookDAO;
import dao.PublishersDAO;
import enums.FieldType;
import model.Authors;
import model.Books;
import model.Publishers;
import util.JFrameMaskUtil;
import util.JFrameUtil;

/**
 *
 * @author elio
 */
public class FrmViewHome extends javax.swing.JFrame {
    //declaracao dos atributos
    ArrayList<Books> listaDeLivros = new ArrayList<>();
    ArrayList<Authors> listaDeAutores = new ArrayList<>();
    private ArrayList<Publishers> listaDeEditoras = new ArrayList<>();
    Books livroSelecionado;
    private Publishers editoraDelivroSelecionado;
    private Publishers editorSelecionado;

    /** Creates new form FrmManterDepartamento */
    public FrmViewHome() {
        initComponents();
         //inicia os atributos

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoLivrosAutores = new javax.swing.ButtonGroup();
        abaPrincipal = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        abaEdicao = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEditLivro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        seletorLivros = new javax.swing.JComboBox<>();
        livrosAbas = new javax.swing.JTabbedPane();
        livrosPainelEditar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        campoAlterarPrecoLivro = new javax.swing.JTextField();
        campoAlterarTituloLivro = new javax.swing.JTextField();
        botaoAlterarLivro = new javax.swing.JButton();
        livrosPainelIncluirDeletar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelIncluirTitulo = new javax.swing.JLabel();
        campoIncluirTitulo = new javax.swing.JTextField();
        campoIncluirIsbn = new javax.swing.JTextField();
        labelIsbn = new javax.swing.JLabel();
        labelIncluirAutor = new javax.swing.JLabel();
        seletorEditoraLivros = new javax.swing.JComboBox<>();
        campoIncluirPreco = new javax.swing.JTextField();
        labelIncluirPreco = new javax.swing.JLabel();
        botaoIncluirLivro = new javax.swing.JButton();
        botaoExcluirLivro = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        seletorFiltroEditora = new javax.swing.JComboBox<>();
        radioButtomLivros = new javax.swing.JRadioButton();
        radioButtomAutores = new javax.swing.JRadioButton();
        botaoBuscar = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPesquisa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabelaEditLivro.setAutoCreateRowSorter(true);
        tabelaEditLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaEditLivro.setColumnSelectionAllowed(true);
        tabelaEditLivro.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaEditLivro);

        jLabel1.setText("Livro selecionado:");

        seletorLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletorLivrosActionPerformed(evt);
            }
        });

        livrosPainelEditar.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar livro"));

        labelTitulo.setText("Titulo");

        labelPreco.setText("Preço");

        botaoAlterarLivro.setText("Alterar");
        botaoAlterarLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoAlterarLivroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo)
                    .addComponent(labelPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoAlterarTituloLivro)
                    .addComponent(campoAlterarPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAlterarLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAlterarTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(campoAlterarPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoAlterarLivro)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout livrosPainelEditarLayout = new javax.swing.GroupLayout(livrosPainelEditar);
        livrosPainelEditar.setLayout(livrosPainelEditarLayout);
        livrosPainelEditarLayout.setHorizontalGroup(
            livrosPainelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, livrosPainelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        livrosPainelEditarLayout.setVerticalGroup(
            livrosPainelEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livrosPainelEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        livrosAbas.addTab("Editar", livrosPainelEditar);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Incluir novo livro"));

        labelIncluirTitulo.setText("Titulo");

        campoIncluirTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIncluirTituloActionPerformed(evt);
            }
        });

        labelIsbn.setText("Isbn");

        labelIncluirAutor.setText("Editora");

        seletorEditoraLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seletorEditoraLivrosActionPerformed(evt);
            }
        });

        labelIncluirPreco.setText("Preço");

        botaoIncluirLivro.setText("Incluir");
        botaoIncluirLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoIncluirLivroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labelIncluirPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(campoIncluirPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(labelIncluirAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seletorEditoraLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIsbn)
                            .addComponent(labelIncluirTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoIncluirTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(campoIncluirIsbn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoIncluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIncluirTitulo)
                    .addComponent(labelIncluirTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIncluirIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIsbn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seletorEditoraLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIncluirAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIncluirPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIncluirPreco)
                    .addComponent(botaoIncluirLivro))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout livrosPainelIncluirDeletarLayout = new javax.swing.GroupLayout(livrosPainelIncluirDeletar);
        livrosPainelIncluirDeletar.setLayout(livrosPainelIncluirDeletarLayout);
        livrosPainelIncluirDeletarLayout.setHorizontalGroup(
            livrosPainelIncluirDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livrosPainelIncluirDeletarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        livrosPainelIncluirDeletarLayout.setVerticalGroup(
            livrosPainelIncluirDeletarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livrosPainelIncluirDeletarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        livrosAbas.addTab("Incluir", livrosPainelIncluirDeletar);

        botaoExcluirLivro.setText("Excluir");
        botaoExcluirLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoExcluirLivroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoExcluirLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(seletorLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(livrosAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(seletorLivros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluirLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(livrosAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        abaEdicao.addTab("Livros", jPanel2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        abaEdicao.addTab("Autor", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        abaEdicao.addTab("Editora", jPanel6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaEdicao)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        abaPrincipal.addTab("Editar", jPanel3);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro de busca"));

        jLabel2.setText("Selecione a editora");

        grupoLivrosAutores.add(radioButtomLivros);
        radioButtomLivros.setText("Livros");

        grupoLivrosAutores.add(radioButtomAutores);
        radioButtomAutores.setText("Autores");

        botaoBuscar.setText("Buscar");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(radioButtomLivros)
                        .addGap(30, 30, 30)
                        .addComponent(radioButtomAutores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seletorFiltroEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(seletorFiltroEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioButtomLivros)
                            .addComponent(radioButtomAutores)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoBuscar)))
                .addGap(8, 8, 8))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado da pesquisa"));

        tabelaPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabelaPesquisa);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        abaPrincipal.addTab("Busca", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregarLivros() {
        listaDeLivros = new ArrayList<>();
        listaDeLivros = new JFrameUtil<Books>(Books.class, new BookDAO()).carregarLivros(listaDeLivros);
        seletorLivros.removeAllItems();

        for (Books b : listaDeLivros) {
            seletorLivros.addItem(b.getTitle());
        }

        if (listaDeLivros.size() == 0) {
            livroSelecionado = null;
            tabelaEditLivro.setModel(new DefaultTableModel());
        }
    }


    private void carregarAutores() {
        listaDeAutores = new JFrameUtil<Authors>(Authors.class, new AuthorsDAO()).carregarAutores(listaDeAutores);
        seletorEditoraLivros.removeAllItems();
        for (Authors a : listaDeAutores) {
            seletorEditoraLivros.addItem(a.getFullName());
        }
    }

    private void carregarEditoras() {
        listaDeEditoras = new JFrameUtil<Publishers>(Publishers.class, new PublishersDAO()).carregarEditoras(listaDeEditoras);

        seletorEditoraLivros.removeAllItems();
        for (Publishers b : listaDeEditoras) {
            seletorEditoraLivros.addItem(b.getName());
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregarLivros();
        carregarAutores();
        configMascaras();
        carregarEditoras();
    }//GEN-LAST:event_formWindowOpened

    private void seletorEditoraLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletorEditoraLivrosActionPerformed
        listaDeEditoras.forEach((e) -> {
            if (e.getName().equals(seletorEditoraLivros.getSelectedItem())) {
                editoraDelivroSelecionado = e;
            }
        });
    }//GEN-LAST:event_seletorEditoraLivrosActionPerformed

    private void botaoIncluirLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoIncluirLivroMouseClicked

        String parsePreco = campoIncluirPreco.getText().replace(JFrameMaskUtil.CURRENCY_FORMAT,"");
        String parseIsbn = campoIncluirIsbn.getText().replace("isbn","");
        boolean camposInValidos = campoIncluirTitulo.getText().isEmpty() ||
        campoIncluirPreco.getText().isEmpty() ||
        campoIncluirIsbn.getText().isEmpty() ||
                parsePreco.isEmpty() ||
                parseIsbn.isEmpty() ||
        seletorEditoraLivros.getSelectedItem() == null;
        if (camposInValidos){
            JOptionPane.showMessageDialog(this, "Existem campos vazios");
        } else {

            livroSelecionado = new Books();
            livroSelecionado.setTitle(campoIncluirTitulo.getText());
            livroSelecionado.setIsbn(campoIncluirIsbn.getText());
            livroSelecionado.setPublisherId(editoraDelivroSelecionado.getPublisherId());
            livroSelecionado.setPrice(Double.parseDouble(parsePreco));

            int retorno = new Controller<Books>(Books.class, new BookDAO()).gravarDados(livroSelecionado);

            if (retorno == 1) {
                JOptionPane.showMessageDialog(this, "Livro adicionado!");
                carregarLivros();
            } else if (retorno == 2) {
                JOptionPane.showMessageDialog(this, "Livro não adicionado");
            } else {
                JOptionPane.showMessageDialog(this, "Livro já existe");
            }
        }
    }//GEN-LAST:event_botaoIncluirLivroMouseClicked

    private void botaoExcluirLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoExcluirLivroMouseClicked
        if (livroSelecionado != null && seletorLivros.getSelectedItem() != null) {
            if (new Controller<Books>(Books.class, new BookDAO()).excluirDado(livroSelecionado)){
                JOptionPane.showMessageDialog(null, "Livro Excluído");
            } else {
                JOptionPane.showMessageDialog(null, "Livro não excluído");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um livro para deleta-lo");
        }
        carregarLivros();
    }//GEN-LAST:event_botaoExcluirLivroMouseClicked

    private void botaoAlterarLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoAlterarLivroMouseClicked
        if (livroSelecionado != null && seletorLivros.getSelectedItem() != null) {
            String parse = campoAlterarPrecoLivro.getText().replace(JFrameMaskUtil.CURRENCY_FORMAT,"");
            if (campoAlterarTituloLivro.getText().isEmpty() || parse.isEmpty()){
                JOptionPane.showMessageDialog(this, "Existem campos vazios!");
            } else {
                livroSelecionado.setTitle(campoAlterarTituloLivro.getText());
                livroSelecionado.setPrice(Double.parseDouble(parse));

                if (new Controller<Books>(Books.class, new BookDAO()).alterarDado(livroSelecionado)) {
                    JOptionPane.showMessageDialog(this, "Objeto persistido");
                } else {
                    JOptionPane.showMessageDialog(this, "Objeto não persistido");
                }

                carregarLivros();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um livro!");
        }

    }//GEN-LAST:event_botaoAlterarLivroMouseClicked

    private void seletorLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seletorLivrosActionPerformed
        listaDeLivros.forEach((e) -> {
            if (e.getTitle() == seletorLivros.getSelectedItem()) {
                livroSelecionado = e;
                tabelaEditLivro
                        .setModel(new JFrameUtil<Books>(Books.class, new BookDAO())
                                .carregarLivrosNaTabela(new ArrayList<>(Arrays.asList(livroSelecionado))));

                tabelaEditLivro.getColumnModel().getColumn(0).setPreferredWidth(200);
            }
        });

    }//GEN-LAST:event_seletorLivrosActionPerformed

    private void campoIncluirTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIncluirTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIncluirTituloActionPerformed

    private void configMascaras() {
        JFrameMaskUtil.customFormat(campoIncluirPreco,"R$ ", FieldType.CURRENCY,10);
        JFrameMaskUtil.customFormat(campoAlterarPrecoLivro, JFrameMaskUtil.CURRENCY_FORMAT, FieldType.CURRENCY,10);
        JFrameMaskUtil.customFormat(campoIncluirIsbn,"isbn", FieldType.POSITIVE_INTEGER,13);
        JFrameMaskUtil.customFormat(campoIncluirTitulo,"", FieldType.LETTERS,60);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaEdicao;
    private javax.swing.JTabbedPane abaPrincipal;
    private javax.swing.JButton botaoAlterarLivro;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoExcluirLivro;
    private javax.swing.JButton botaoIncluirLivro;
    private javax.swing.JTextField campoAlterarPrecoLivro;
    private javax.swing.JTextField campoAlterarTituloLivro;
    private javax.swing.JTextField campoIncluirIsbn;
    private javax.swing.JTextField campoIncluirPreco;
    private javax.swing.JTextField campoIncluirTitulo;
    private javax.swing.ButtonGroup grupoLivrosAutores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelIncluirAutor;
    private javax.swing.JLabel labelIncluirPreco;
    private javax.swing.JLabel labelIncluirTitulo;
    private javax.swing.JLabel labelIsbn;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTabbedPane livrosAbas;
    private javax.swing.JPanel livrosPainelEditar;
    private javax.swing.JPanel livrosPainelIncluirDeletar;
    private javax.swing.JRadioButton radioButtomAutores;
    private javax.swing.JRadioButton radioButtomLivros;
    private javax.swing.JComboBox<String> seletorEditoraLivros;
    private javax.swing.JComboBox<String> seletorFiltroEditora;
    private javax.swing.JComboBox<String> seletorLivros;
    private javax.swing.JTable tabelaEditLivro;
    private javax.swing.JTable tabelaPesquisa;
    // End of variables declaration//GEN-END:variables
}
