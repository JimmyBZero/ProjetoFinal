/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derby;

import filme.Filme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Jamex
 */
public class FilmeDerby {
    
    Statement stmt;
    
    public FilmeDerby(){
        String username = "Jimmy";
        String password = "123";
        String url = "jdbc:derby://localhost:1527/MoviesDataBase";
                
        try{
            Connection con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
    }
    }
    
    public void adicionar(Filme f) {
        String instrucao = "INSERT INTO FILME (NOME, GENERO, NUM, EXEMPLARES) VALUES ("
        + "'" +  f.getNome() + "', " + "'" + f.getGenero() + "', " + f.getNum() + ", " + f.getExemplares() + ")";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    
        }
    
    public void remover(int num) {
        String instrucao = "DELETE FROM FILME WHERE NUM = " + "" + num + "";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    public void listarTudo(){
        
    }
    
}
