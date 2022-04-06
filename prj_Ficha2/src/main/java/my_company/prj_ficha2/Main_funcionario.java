/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package my_company.prj_ficha2;

/**
 *
 * @author dinis
 */
public class Main_funcionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data d1 = new Data(2003, 3, 2);
        Data d2 = new Data(2013, 5, 12);
        Data d3 = new Data(1993, 10, 22);

        Cartao c1 = new Cartao(1211894, 3, 10);
        Data dc1 = new Data(2003, 3, 2);
        Cartao c2 = new Cartao(1214123, 3, 10);
        Data dc2 = new Data(2005, 12, 1);
        Cartao c3 = new Cartao(1244685, 3, 10);
        Data dc3 = new Data(2000, 10, 7);
        Data dc4 = new Data(2021, 4, 6);

        Funcionario f1 = new Funcionario(1, "Dinis", "123456789", d1, c1);
        f1.addEntrada();
        f1.addSaida();
        Funcionario f2 = new Funcionario(2, "Afonso", "987654321", d2, c2);
        f2.addEntrada();
        f2.addEntrada();
        f2.addSaida();
        Funcionario f3 = new Funcionario(3, "Miguel", "135792468", d3, c3);
        f3.addEntrada();
        f3.addEntrada();
        f3.addEntrada();
        f3.addSaida();
        f3.addSaida();

        System.out.println(f1.toString());
        System.out.println("");
        System.out.println(f2.toString());
        System.out.println("");
        System.out.println(f3.toString());
        System.out.println("");
        System.out.println(f2.getCartao().toString());
        System.out.println("");
        f3.setNome("Albino");
        System.out.println("Nome: " + f3.getNome() + "\nNIF: " + f3.getNif());
        System.out.println("");
        System.out.println("Diferença: " + f3.calcularDifEntradasSaidas());
        System.out.println("");
        f1.getCartao().setData(dc4);
        System.out.println(f1.toString());
    }

}
