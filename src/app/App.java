/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Pessoa.Pessoa;
import dao.Dao;
import dao.PessoaDao;

/**
 *
 * @author Jamex
 */
public class App {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("James", "Bruno", 22, 1);
        PessoaDao dao = new PessoaDao();
        p.getId();
        dao.adicionar(p);
        
    }
    
}
