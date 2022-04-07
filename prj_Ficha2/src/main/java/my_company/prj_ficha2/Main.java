/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my_company.prj_ficha2;

/**
 *
 * @author dinis
 */
public class Main {

    public static void main(String[] args) {
        Cartao c1 = new Cartao(1211894,3,10);
        Data d1 = new Data(2003,3,2);
        c1.setData(d1);
        System.out.println(c1.toString());
        System.out.println(c1.diferenca());
        
        System.out.println(Cartao.totalCartoes());
    }
}
