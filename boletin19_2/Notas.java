/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import java.util.Random;

/**
 *
 * @author r618b
 */
public class Notas {
   int[] notas = new int[3];

    public void creaArray() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            System.out.print((i+1)+"ª nota");
            notas[i] = rand.nextInt(11);
            System.out.println(notas[i]);
        }
    }

    public void amosarAprobadosSuspensos() {
        int suspensos = 0;
        int aprobados = 0;
        for (int ele : notas) {
            if (ele < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
        }
        System.out.println("Nº de suspensos: " +suspensos);
        System.out.println("Nº de aprobados: "+aprobados);
    }

    public void calcMedia() {
        int total=0,notasT = 0;
        for (int ele : notas) {
            total += ele;
            notasT++;
        }
        System.out.println("La media es: " + total / notasT);
    }

    public void NotaMax() {
        int Max = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > Max) {
               Max = notas[i];
            }
        }
        System.out.println("La nota máxima es: " + Max);
    }
}
