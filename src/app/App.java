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
        
        Pessoa p = new Pessoa("James", "Bruno", 25, 2);
        Filme f = new Filme("Scarface", "Ação", 01, 5);
        PessoaDerby derby = new PessoaDerby();
        FilmeDerby derbyf = new FilmeDerby();
        
                      
    }
}
