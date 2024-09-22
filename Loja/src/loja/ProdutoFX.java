/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author MrRobot
 */
public class ProdutoFX {
    private final SimpleIntegerProperty codigo;
    private final SimpleStringProperty nome;
    private final SimpleIntegerProperty quanti;
    
    public ProdutoFX(Produto produto){
        this.codigo = new SimpleIntegerProperty(produto.codigo);
        this.nome = new SimpleStringProperty(produto.nome);
        this.quanti = new SimpleIntegerProperty(produto.quanti);
    }
    
    public int getCodigo(){ 
        return codigo.get();
    }
    public SimpleIntegerProperty codigoProperty(){
        return codigo;
    }
    
    public String getNome(){ 
        return nome.get();
    }
    public SimpleStringProperty nomeProperty(){
        return nome;
    }
    
    public int getQuanti(){
        return quanti.get();
    }
    public SimpleIntegerProperty quantiProperty(){
        return quanti;
    }
}
