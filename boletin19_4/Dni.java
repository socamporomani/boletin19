/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_4;

/**
 *
 * @author r618b
 */
public class Dni {
      private int nif ;
    private final String []letra ={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public Dni(int nif) {
        this.nif = nif;
    }

    public Dni() {
    }
    
    public int resto(int nif){
        this.nif = nif;
        int resto;
        resto = nif%23;
        return resto;
    }
    
    public void calcularLetra(){
        System.out.println("A letra deste dni é: "+letra[this.resto(nif)]);
        }
}
