/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import derby.FilmeDerby;
import pessoa.Pessoa;
import derby.PessoaDerby;
import filme.Filme;

/**
 *
 * @author Jamex
 */
public class App {
    public static void main(String[] args) {
        
        
        PessoaDerby derby = new PessoaDerby();
        FilmeDerby derbyf = new FilmeDerby();
        
        //CRIANDO ALGUNS OBJETOS PARA O BANCO NÃO ESTAR VAZIO PARA A EXECUÇÃO.
        
        Pessoa p1 = new Pessoa("James", "Bruno", 22, 1);
        Pessoa p2 = new Pessoa("Jose", "Silva", 35, 2);
        Pessoa p3 = new Pessoa("Maria", "Da Penha", 30, 3);
        Pessoa p4 = new Pessoa("Anita", "Dolores", 65, 4);
        Pessoa p5 = new Pessoa("Juca", "Dos Santos", 33, 5);
        
        Filme f1 = new Filme("Scarface", "Ação", 1001, 5);
        Filme f2 = new Filme("O Ataque Das Cobras", "Horror", 1002, 5);
        Filme f3 = new Filme("Capitão Europa", "Ação", 1003, 5);
        Filme f4 = new Filme("Bob Bucha", "Desenho", 1004, 5);
        Filme f5 = new Filme("A Banana Voadora", "Comédia", 1005, 5);
         
        derby.adicionar(p1);
        derby.adicionar(p2);
        derby.adicionar(p3);
        derby.adicionar(p4);
        derby.adicionar(p5);
        
        derbyf.adicionar(f1);
        derbyf.adicionar(f2);
        derbyf.adicionar(f3);
        derbyf.adicionar(f4);
        derbyf.adicionar(f5);
        
    }
}
