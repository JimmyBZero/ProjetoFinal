/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filme;

/**
 *
 * @author Jamex
 */
public class Filme {
    private String nome;
    private String genero;
    private int num;
    private int exemplares;
        
    public Filme(String nome, String genero, int num, int exemplares){
        this.nome = nome;
        this.genero = genero;
        this.num = num;
        this.exemplares = exemplares;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }
}
