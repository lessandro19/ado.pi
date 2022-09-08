/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abelha;

/**
 *
 * @author alessandro.rmsilva
 */
public class abelha { private String cor = "preta e amarela";
    private String especie = "asiática";
    private int tamanho = 12;
    private String abelha;
    private String nome;
    
    
    public abelha(String nomeabelha) {
       //atribuir o atributo
       this.nome = nomeabelha;
    }
    
    public abelha() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String get() {
        return abelha;
    }

    public void setabelha(String abelha) {
        this.abelha = abelha;
    }
    
    public void colherPolen() {
        System.out.println("colher o pólen");
    }
    
    public void voar() {
        System.out.println("voar");
    }
    
    public void pousou() {
        System.out.println("pousar");
    }   
}
    

