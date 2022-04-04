/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package my_company.utilitarios;

/**
 *
 * @author dinis
 */
public class TesteData {

    public static void main(String[] args) {
        Data d1 = new Data(2022, 4, 4);
        System.out.println("O dia da semana é: " + d1.determinarDiaDaSemana());
        System.out.println("A data completa é: " + d1.toString());
        Data d2 = new Data(2022, 12, 25);
        Data d3 = new Data(2022, 4, 5);
        System.out.println("Diferença entre as duas datas: " + d3.calcularDiferenca(d2) + " dias");
        // Testar outros métodos
    }
}
