/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author MrRobot
 */
public class Produto {
    public int codigo;
    public String nome;
    public int quanti;
    
    public Produto(){}
    
    public Produto(int codigo, String nome, int quanti){
        this.codigo = codigo;
        this.nome = nome;
        this.quanti = quanti;
    }
}
