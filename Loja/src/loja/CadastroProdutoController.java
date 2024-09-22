/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import java.net.URL;
import java.util.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author MrRobot
 */
public class CadastroProdutoController implements Initializable{
    @FXML TableView<ProdutoFX> tblProduto;
    @FXML TableColumn<ProdutoFX, Integer> cltCodigo;
    @FXML TableColumn<ProdutoFX, String> cltNome;
    @FXML TableColumn<ProdutoFX, Integer> cltQuanti;
    @FXML TextField txtCodigo;
    @FXML TextField txtNome;
    @FXML TextField txtQuanti;
   
    public void incluirClique(){
        Produto produto = new Produto();
        produto.codigo = Integer.parseInt(txtCodigo.getText());
        produto.nome = txtNome.getText();
        produto.quanti = Integer.parseInt(txtQuanti.getText());
        ProdutoController.incluir(produto);
        txtCodigo.setText("");
        txtNome.setText("");
        txtQuanti.setText("");
        tblProduto.setItems(obterListaProdutos());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb){
        cltCodigo.setCellValueFactory(
            new PropertyValueFactory<>("codigo"));
	cltNome.setCellValueFactory(
            new PropertyValueFactory<>("nome"));
	cltQuanti.setCellValueFactory(
            new PropertyValueFactory<>("quanti"));  
	tblProduto.setItems(obterListaProdutos());
    }
    
    public ObservableList<ProdutoFX> obterListaProdutos(){
        return FXCollections.observableArrayList(
            new ListaProdutoFX(ProdutoController.obterTodos())
        );
    }
}
