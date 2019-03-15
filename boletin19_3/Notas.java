/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author r618b
 */
public class Notas {
    public NewClass[] creaArray(NewClass[] array) {
        Random rand = new Random();
        for (int i = 0; i <array.length; i++) {
            NewClass alum = new NewClass();
            alum.setNotas(rand.nextInt(11));
            alum.setNome("Alumno " + (i+1));
            array[i] = alum;
        }
        return array;
    }
    
    public void mostrar(NewClass[] array){
        for(NewClass alum: array){
            System.out.println(alum.toString());
        }
    }
    
    public void mostrar1(NewClass[] array, String id){
        for (NewClass alum : array) {
            if (alum.getNome().equals(id)) {
                System.out.println(alum);
                break;
            }
        }
    }
    
    public void amosarAlumno(NewClass[] array){
        String id =JOptionPane.showInputDialog("Escriba alumno y su numero");
        for (NewClass alum : array) {
            if (alum.getNome().equals(id)) {
                System.out.println(alum);
                break;
            }
        }
    }
    
    public NewClass[] suspensos(NewClass []array1, NewClass []array2) {
        int x = 0;
        for (int i=0;i<array1.length;i++){
            array2[x] = new NewClass(0,"Aprobado");
            if (array1[i].getNotas() < 5){
                array2[x] = array1[i];
            }
            x++;
        }
        return array2;
    }
    
        public NewClass[] aprobados(NewClass []array1, NewClass []array2) {
        int x = 0;
        for (int i=0;i<array1.length;i++){
            array2[x] = new NewClass(0,"Suspenso");
            if (array1[i].getNotas() > 4){
                array2[x] = array1[i];
            }
            x++;
        }
        return array2;
    }

    public void Media(NewClass []array) {
        int total = 0;
        for (NewClass ele : array) {
            total += ele.getNotas();
        }
        System.out.println("La media es: " + total / array.length);
    }

    public void NotaMax(NewClass []array) {
        int notaMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNotas() > notaMax) {
                notaMax = array[i].getNotas();
            }
        }
        System.out.println("La nota máxima es: " + notaMax);
    }
    
    public void oredenar(NewClass []array){
            NewClass alum = new NewClass();
            for(int i=0;i<array.length-1;i++)
                for(int j=i+1;j<array.length;j++)
                    if (array[i].getNotas() > array[j].getNotas()){
                        alum=array[i];
                        array[i]=array[j];
                        array[j]=alum;
                    }
    }
}
