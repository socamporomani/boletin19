/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author r618b
 */
public class Boletin19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   NewClass[] obx = new NewClass[10];
    NewClass[] suspensos = new NewClass[10];
    NewClass[] aprobados = new NewClass[10];
    Notas dam = new Notas();
    dam.creaArray(obx);
     System.out.println("Mostrar array");
    dam.mostrar(obx);
     System.out.println("Suspensos");
    dam.suspensos(obx,suspensos);
    dam.mostrar(suspensos);
    System.out.println("Aprobados");
    dam.aprobados(obx, aprobados);
    dam.mostrar(aprobados);
    System.out.println("Mostrar alumno");
    dam.mostrar1(obx, "Alumno 1");
    System.out.println("Nota dun alumno determinado por teclado");
    dam.amosarAlumno(obx);
    System.out.println("Nota máxima");
    dam.NotaMax(obx);
    System.out.println("Nota media");
    dam.Media(obx);
    System.out.println("Orden ascendente");
    dam.oredenar(obx);
    dam.mostrar(obx);
    }
}
