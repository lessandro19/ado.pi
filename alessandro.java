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
public class alessandro {
     public static void main(String[] args) {
        abelha ale = new abelha();
            
       ale.setNome("Alessandro");
        ale.setCor("amerela e preta");
       ale.setEspecie("asiática");
        ale.setTamanho(12);
        
       
        
        System.out.println("A abelha com o nome " + ale.getNome() + 
                           ", tem a cor " + ale.getCor() + 
                           ", é da especie " + ale.getEspecie() +
                           ", o seu tamanho é de " + ale.getTamanho () + ("mm"));
        
        System.out.println("A abelha " + ale.getNome() +
                            ", pode fazer: ");
        
        ale. colherPolen();
        ale.pousou();
        ale.voar();
     }
}
        
    

    

