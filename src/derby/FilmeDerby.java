/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derby;

import filme.Filme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        int cont;
        cont = f.getExemplares();
        
        String instrucao = "INSERT INTO FILME (NOME, GENERO, NUM, EXEMPLARES) VALUES ("
        + "'" +  f.getNome() + "', " + "'" + f.getGenero() + "', " + f.getNum() + ", " + f.getExemplares() + ")";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
        
        while(cont != 0){
        String instrucao2 = "INSERT INTO EXEMPLAR (NUMEX, NUMFILME, IDCLIENTE) VALUES ("
        +   cont + ", " + f.getNum() + ", " + 0 + ")";
        System.out.println(instrucao2);
        try{
            stmt.executeUpdate(instrucao2);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        cont = cont - 1;
        
        }
        
    
    }
    
    public void remover(int num) {
        String instrucao = "DELETE FROM FILME WHERE NUM = " + "" + num + "";
        String instrucao2 = "DELETE FROM EXEMPLAR WHERE NUMFILME = " + "" + num + "";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        System.out.println(instrucao2);
        try{
            stmt.executeUpdate(instrucao2);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    public void listarTudo() {
        String instrucao = "SELECT * FROM FILME";
        try{
            //um select traz resultados que precisam ser armazenados.
            //vou executar e armazenar o resultado.
            ResultSet rs = stmt.executeQuery(instrucao);
            
            while (rs.next()){
                System.out.println("\nNome: " + rs.getString("NOME") + "\nGenero: " + rs.getString("GENERO") + "\nNumero: " + rs.getString("NUM") +
                       "\nExemplares Disponiveis: " + rs.getString("EXEMPLARES") + "\n");
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
}
