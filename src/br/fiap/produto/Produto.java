package br.fiap.produto;
import br.fiap.fornecedor.Fornecedor;

public class Produto {


    private String nome;
    private double preco;
    private int quant;
    private Fornecedor fornecedor;

    public Produto(String nome, double preco, int quant, Fornecedor fornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
        this.fornecedor = fornecedor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public Fornecedor getFornecedor(){
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }
}

