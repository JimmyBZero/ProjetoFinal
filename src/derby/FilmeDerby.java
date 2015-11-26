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
import pessoa.Pessoa;


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
    
    public void listarNome(String nome) {
        String instrucao = "SELECT * FROM FILME";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(nome == null ? rs.getString("NOME") == null : nome.equals(rs.getString("NOME"))){
                    System.out.println("\nNome: " + rs.getString("NOME") + "\nGenero: " + rs.getString("GENERO") + "\nNumero: " + rs.getString("NUM") +
                    "\nExemplares Disponiveis: " + rs.getString("EXEMPLARES") + "\n");
                }
            }    
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    public void listarGenero(String genero) {
        String instrucao = "SELECT * FROM FILME";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(genero == null ? rs.getString("GENERO") == null : genero.equals(rs.getString("GENERO"))){
                    System.out.println("\nNome: " + rs.getString("NOME") + "\nGenero: " + rs.getString("GENERO") + "\nNumero: " + rs.getString("NUM") +
                    "\nExemplares Disponiveis: " + rs.getString("EXEMPLARES") + "\n");
                }
            }    
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    public void listarNum(String num) {
        String instrucao = "SELECT * FROM FILME";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(num == null ? rs.getString("NUM") == null : num.equals(rs.getString("NUM"))){
                    System.out.println("\nNome: " + rs.getString("NOME") + "\nGenero: " + rs.getString("GENERO") + "\nNumero: " + rs.getString("NUM") +
                    "\nExemplares Disponiveis: " + rs.getString("EXEMPLARES") + "\n");
                }
            }    
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    public void listarExemplares(String ex) {
        String instrucao = "SELECT * FROM FILME";
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if(ex == null ? rs.getString("EXEMPLARES") == null : ex.equals(rs.getString("EXEMPLARES"))){
                    System.out.println("\nNome: " + rs.getString("NOME") + "\nGenero: " + rs.getString("GENERO") + "\nNumero: " + rs.getString("NUM") +
                    "\nExemplares Disponiveis: " + rs.getString("EXEMPLARES") + "\n");
                }
            }    
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
    }
    
    public void alugar(String idpessoa, String numfilme, String exemplar){
        
        String instrucao = "UPDATE EXEMPLAR SET IDCLIENTE = " + idpessoa + " WHERE NUMFILME = " + numfilme + " AND NUMEX = " + exemplar;
        try{
            stmt.executeUpdate(instrucao);
            System.out.println("FILME " + numfilme + ", EXEMPLAR " + exemplar + " ALUGADO COM SUCESSO PARA O CLIENTE NUM: " + idpessoa);         
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
        
        //PROBLEMA SÉRIO NO MÉTODO ALUGAR!
        /* NÃO CONSEGUI FAZER UM IF OU CASE QUE VERIFIQUE SE O FILME JÁ ESTÁ ALUGADO PARA ALGUM OUTRO CLIENTE.
        AO ALUGAR, VERIFICAR SE O EXEMPLAR EM QUESTÃO JÁ NÃO ESTÁ ALUGADO PARA OUTRO CLIENTE.            
        */
    }
    
    public void devolver(String numfilme, String exemplar){
        String instrucao = "UPDATE EXEMPLAR SET IDCLIENTE = 0 WHERE NUMFILME = " + numfilme + " AND NUMEX = " + exemplar;
        try{
            stmt.executeUpdate(instrucao);
            System.out.println("EXEMPLAR " + exemplar + " DE " + numfilme + " DEVOLVIDO COM SUCESSO");         
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
    
    public void checarFilme(String id, String ex){
        String instrucao = "SELECT * FROM EXEMPLAR WHERE NUMFILME = " + id + " AND NUMEX = " + ex;
        try{
            ResultSet rs = stmt.executeQuery(instrucao);
            while (rs.next()){
                if("0".equals(rs.getString("NUMEX"))){
                    System.out.println("ESTE EXEMPLAR NÃO ESTÁ LOCADO.");
                }else{
                    System.out.println("O EXEMPLAR " + ex + " DO FILME " + id + " ESTA COM O CLIENTE DE NUMERO " + rs.getString("IDCLIENTE"));
                }
            }
        }catch(SQLException se){
            System.out.println("Mensagem: " + se.getMessage());
        }
    }
}
