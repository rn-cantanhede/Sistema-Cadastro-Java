/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MrRobot
 */
public class ListaProdutoFX extends ArrayList<ProdutoFX>{
    public ListaProdutoFX(List<Produto> origem){
        origem.forEach((p) -> {
            add(new ProdutoFX(p));
        });
    }
}
