/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import javax.swing.JOptionPane;

/**
 *
 * @author r618b
 */
public class NewClass {
   private int notas;
   private String nome;

    public NewClass(int notas, String nome) {
        this.notas = notas;
        this.nome = nome;
    }

    public NewClass() {
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return"Alumno: " + nome + ", " + notas;
    }
}
    

  

