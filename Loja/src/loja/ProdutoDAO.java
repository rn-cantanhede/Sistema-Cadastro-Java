/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author MrRobot
 */
public class ProdutoDAO {
    private Connection getConnection() throws Exception{
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        return DriverManager.getConnection(
                "jdbc:derby://localhost:1527/LojaDB",
                "LojaDB", "LojaDB");
    }
    
    public List<Produto> obterTodos(){
        ArrayList<Produto> lista = new ArrayList<>();
        try (Connection c1 = getConnection()){
            ResultSet r1 = c1.createStatement().executeQuery("SELECT * FROM PRODUTOS");
            while (r1.next()){
                lista.add(new Produto(r1.getInt("CODIGO"),
                r1.getString("NOME"), r1.getInt("QUANTI")));
            }
        } catch (Exception ex) {}
        return lista;
    }
    public void incluir(Produto p){
        try (Connection c1 = getConnection(); 
        PreparedStatement ps = c1.prepareStatement("INSERT INTO PRODUTOS VALUES(?,?,?)")) {
        ps.setInt(1, p.codigo);
        ps.setString(2, p.nome);
        ps.setInt(3, p.quanti);
        ps.executeUpdate();  // Executa a inserção
        }   catch (Exception e) {
           // Loga a exceção
        }
    }
}
