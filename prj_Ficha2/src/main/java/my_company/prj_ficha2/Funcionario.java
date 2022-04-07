/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.prj_ficha2;

/**
 *
 * @author dinis
 */
public class Funcionario {

    private int idFunc; // identificador do funcionário
    private int entrada = 0;
    private int saida = 0;
    private String nome; // nome do funcionário
    private String nif; // Número de identificação fiscal
    private Data dataContrato; // Data de contrato
    private Cartao cartao; // Cartão atribuído ao funcionário
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String NIF_POR_OMISSAO = "sem nif";
    private static final int NUM_POR_OMISSAO = 0;

    public Funcionario(int idFunc, String nome, String nif, Data dataContrato, Cartao cartao) {
        setIdFunc(idFunc);
        setNome(nome);
        setNif(nif);
        setDataContrato(dataContrato);
        setCartao(cartao);
    }

    public Funcionario() {
        setIdFunc(NUM_POR_OMISSAO);
        setNome(NOME_POR_OMISSAO);
        setNif(NIF_POR_OMISSAO);
    }

    public Funcionario(Funcionario funcionario) {
        setIdFunc(funcionario.idFunc);
        setNome(funcionario.nome);
        setNif(funcionario.nif);
        setDataContrato(funcionario.dataContrato);
        setCartao(funcionario.cartao);
    }

    public int getIdFunc() {
        return idFunc;
    }

    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public Data getDataContrato() {
        return dataContrato;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato = dataContrato;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public String toString() {
        return "ID Função: " + getIdFunc() + "\nNome: " + getNome() + "\nNIF: " + getNif() + "\nData de Contrato: " + getDataContrato();
    }

    public int qtdEntradas() {
        return entrada;
    }

    public int qtdSaidas() {
        return saida;
    }

    public int calcularDifEntradasSaidas() {
        return qtdEntradas()-qtdSaidas();
    }

    public void alterarDataAtribuicaoCartao(Data d1) {
        this.dataContrato = d1;
    }

    public void addEntrada() {
        entrada++;
    }

    public void addSaida() {
        saida++;
    }
}
