/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Pessoa.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jamex
 */
public class PessoaDao implements Dao{
    
    Statement stmt;
    
    public PessoaDao(){
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
    
    @Override
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
    
    public void remover(int id){
        
    }
    
    public void listarTudo(){
        
    }
    
}
    