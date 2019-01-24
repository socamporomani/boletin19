/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;
import java.util.Random;
/**
 *
 * @author socamporomani
 */
public class nuimeros {


    /**
     *
     * @return
     */ 
    
 public int[] numeroA(){
    Random alea=new Random();
    int [] numeros = new int[10];    
    int n=0;      
      for(int i=0; i<6; i++) //generamos 10 números
      {
             n = (int)(alea.nextDouble() * 50.0); //generamos numeros aleatorios entre 0 y 50
             numeros[i] = n; //guardamos el entero obtenido en el array
             numeros[i]++;  //le sumamos uno a la posición del array para poder guardar el siguiente número
             System.out.println(numeros[i]);
       }
       
       return numeros;
 

}
}
