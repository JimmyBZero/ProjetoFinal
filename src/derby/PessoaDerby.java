/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derby;

import pessoa.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jamex
 */
public class PessoaDerby{
    
    Statement stmt;
    
    public PessoaDerby(){
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
    
    public void adicionar(Pessoa p) {
        String instrucao = "INSERT INTO PESSOA (NOME, SOBRENOME, IDADE, ID) VALUES ("
        + "'" +  p.getNome() + "', " + "'" + p.getSobrenome() + "', " + p.getIdade() + ", " + p.getId() + ")";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    
        }
    
    public void remover(int id) {
        String instrucao = "DELETE FROM PESSOA WHERE ID = " + "" + id + "";
        System.out.println(instrucao);
        try{
            stmt.executeUpdate(instrucao);
        }catch (SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    public void listarTudo() {
        String instrucao = "SELECT * FROM PESSOA";
        try{
            //um select traz resultados que precisam ser armazenados.
            //vou executar e armazenar o resultado.
            ResultSet rs = stmt.executeQuery(instrucao);
            
            while (rs.next()){
                System.out.println("Nome: " + rs.getString("NOME") + "\nSobrenome: " + rs.getString("SOBRENOME") + "\nIdade: " + rs.getString("IDADE") +
                       "\nId: " + rs.getString("ID") + "\n");
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    public void listarNome(String nome){
        String instrucao = "SELECT * FROM PESSOA";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(nome == null ? rs.getString("NOME") == null : nome.equals(rs.getString("NOME"))){
                System.out.println("Nome: " + rs.getString("NOME") + "\nSobrenome: " + rs.getString("SOBRENOME") + "\nIdade: " + rs.getString("IDADE") +
                       "\nId: " + rs.getString("ID") + "\n");
                }
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    public void listarSobrenome(String sobrenome){
        String instrucao = "SELECT * FROM PESSOA";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(sobrenome == null ? rs.getString("SOBRENOME") == null : sobrenome.equals(rs.getString("SOBRENOME"))){
                System.out.println("Nome: " + rs.getString("NOME") + "\nSobrenome: " + rs.getString("SOBRENOME") + "\nIdade: " + rs.getString("IDADE") +
                       "\nId: " + rs.getString("ID") + "\n");
                }
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    public void listarIdade(String idade){
        String instrucao = "SELECT * FROM PESSOA";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(idade == null ? rs.getString("IDADE") == null : idade.equals(rs.getString("IDADE"))){
                System.out.println("Nome: " + rs.getString("NOME") + "\nSobrenome: " + rs.getString("SOBRENOME") + "\nIdade: " + rs.getString("IDADE") +
                       "\nId: " + rs.getString("ID") + "\n");
                }
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    public void listarId(String id){
        String instrucao = "SELECT * FROM PESSOA";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(id == null ? rs.getString("ID") == null : id.equals(rs.getString("ID"))){
                System.out.println("Nome: " + rs.getString("NOME") + "\nSobrenome: " + rs.getString("SOBRENOME") + "\nIdade: " + rs.getString("IDADE") +
                       "\nId: " + rs.getString("ID") + "\n");
                }
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
}
    