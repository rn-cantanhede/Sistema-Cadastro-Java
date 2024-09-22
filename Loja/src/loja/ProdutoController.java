/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import java.util.List;

/**
 *
 * @author MrRobot
 */
public class ProdutoController {
    private static ProdutoDAO dao = new ProdutoDAO();
    public static List<Produto> obterTodos(){
        return dao.obterTodos();
    }
    
    public static void incluir(Produto produto){
        if (produto.quanti >= 0) {
            dao.incluir(produto);
        }
    }
}
