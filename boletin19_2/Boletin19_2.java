/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author r618b
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    Notas dam = new Notas();
    dam.creaArray();
     System.out.println("*************");
    dam.amosarAprobadosSuspensos();
     System.out.println("*************");
    dam.calcMedia();
        System.out.println("*************");
    dam.NotaMax();
    }
    
}
