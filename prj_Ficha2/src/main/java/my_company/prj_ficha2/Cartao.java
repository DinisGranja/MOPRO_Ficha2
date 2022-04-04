/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.prj_ficha2;

import javax.xml.crypto.Data;

/**
 *
 * @author dinis
 */
public class Cartao {
    private int idCartao, qtdEntradas, qtdSaidas;
    private Data dataAtribuicao;
    private static int totalCartoes = 0;
    
    private static final int IDCARTAO_POR_OMISSAO = 0, QTDENTRADAS_POR_OMISSAO = 0, QTDSAIDAS_POR_OMISSAO = 0;
    
    public Cartao(){
        setIdCartao(IDCARTAO_POR_OMISSAO);
        setQtdEntradas(QTDENTRADAS_POR_OMISSAO);
        setQtdSaidas(QTDSAIDAS_POR_OMISSAO);
    }
    
    public Cartao(int idCartao, int qtdEntradas, int qtdSaidas) {
        setIdCartao(idCartao);
        setQtdEntradas(qtdEntradas);
        setQtdSaidas(qtdSaidas);
    }
    
    //ID Cartão
    public void setIdCartao(int idCartao) {
        this.idCartao = idCartao;
    }

    public int getIdCartao() {
        return idCartao;
    }
    
    //Qtd Entradas
    public void setQtdEntradas(int qtdEntradas) {
        this.qtdEntradas = qtdEntradas;
    }

    public int getQtdEntradas() {
        return qtdEntradas;
    }
    
    //Qtd Entradas
    public void setQtdSaidas(int qtdSaidas) {
        this.qtdSaidas = qtdSaidas;
    }

    public int getQtdSaidas() {
        return qtdSaidas;
    }
    
    //Datas
    public void setData(Data dataAtribuicao) {
        this.dataAtribuicao = dataAtribuicao;
    }

    public Data getData() {
        return dataAtribuicao;
    }
    
    //Descrição
    public String toString() {
        return "ID cartao: " + getIdCartao() + "\nQuantidade de Entradas: " + getQtdEntradas() + "\nQuantidade de Saidas: " + getQtdSaidas() + "\nData: " + toString() + "\nPeso: " + getPeso();
    }
    
    //Entrada
    public void entrada(){
        qtdEntradas++;
    }
    
    //Saída
    public void saida(){
        qtdSaidas++;
    }
    
    public int diferenca(){
        return qtdEntradas-qtdSaidas;
    }
}