/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Pessoa.Pessoa;

/**
 *
 * @author Jamex
 */
public interface Dao {
    public void adicionar(Pessoa p);
    public void listarTudo();
    public void remover(int id); 
    
}
