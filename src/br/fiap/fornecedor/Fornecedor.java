package br.fiap.fornecedor;

public class Fornecedor {
    private  String nome;
    private long cnpj;

    //atalho = alt insert -> contructor
    public Fornecedor( String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    //  método get sempre público, não recebe parametro
    public String getNome () {
        return nome;
    }
    // método set altera valor de uma variável, recebe parametro
    public void setNome (String nome) {
        this.nome= nome;
    }

    //atalho = alt insert -> getter and setter
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}
