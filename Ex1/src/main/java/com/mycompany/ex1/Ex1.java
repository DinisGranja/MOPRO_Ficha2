/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author dinis
 */
public class Ex1 {

    public static void main(String[] args) {
        Data d1 = new Data(2022, 4, 4);
        System.out.println("O dia da semana é: " + d1.determinarDiaDaSemana());
        System.out.println("A data completa é: " + d1.toString());
        Data d2 = new Data(2022, 12, 25);
        Data d3 = new Data(2022, 4, 5);
        Data d4 = new Data(2022, 4, 4);
        System.out.println("Diferença entre as duas datas: " + d3.calcularDiferenca(d2) + " dias");
        // Testar outros métodos

        if (Data.isAnoBissexto(2020)) {
            System.out.println("Ano bissexto...");
        } else {
            System.out.println("Não é ano bissexto...");
        }
        
        System.out.println("");
        
        if (d1.equals(d4)) {
            System.out.println("É igual!");
        } else {
            System.out.println("Não é igual!");
        }

    }
}
