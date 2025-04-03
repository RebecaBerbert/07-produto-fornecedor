package br.fiap.util;

import br.fiap.fornecedor.Fornecedor;
import br.fiap.produto.Produto;

import static javax.swing.JOptionPane.*;  // "static" para não precisar escrever o nome da classe toda hora e * para importar tudo;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    private Fornecedor[] fornecedor = new Fornecedor[2];
    private Produto[] produto = new Produto[2];
    private int idxProduto = 0;
    private int idxFornecedor = 0;

    public void menu() {
        int opcao = 0;
        String msg = "1.Cadastrar produto\n2 .Pesquisar produto \n3. Pesquisar fornecedor \n4. Finalizar";
        while(true){
            opcao = parseInt(showInputDialog(msg));
            if (opcao==4) {
                return;
            }
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;
                default:
                    showMessageDialog(null,"Opção inválida");
            }
            }
        }

    private void cadastrarProduto(){
        String nome;
        double preco;
        int quant;
        Fornecedor fornecedor = pesquisarFornecedor();
        if(fornecedor==null){
            fornecedor = cadastrarFornecedor();
        }
        nome=showInputDialog("Nome do produto:");
        preco= parseDouble(showInputDialog("valor unitário:"));
        quant= parseInt(showInputDialog("Quantidade em estoque:"));
        produto[idxProduto]= new Produto(nome, preco, quant, fornecedor);
        idxProduto++;

    }

    private Fornecedor cadastrarFornecedor(){
        long cnpj = parseLong(showInputDialog("CNPJ do fornecedor:"));
        String nome= showInputDialog("Nome do fornecedor:");
        fornecedor[idxFornecedor]= new Fornecedor(nome, cnpj);
        idxFornecedor++;
        return fornecedor[idxFornecedor-1];
    }

    private void pesquisarProduto(){
        String aux = "Produto não encontrado";
        String nome= showInputDialog("Nome do produto:");
        for (int i=0;i<idxProduto;i++){
            if(produto[i].getNome().equalsIgnoreCase(nome)){
                aux = "";
                aux+= "Nome do produto: " + nome + "\n";
                aux+= "Valor unitário: R$ " + produto[i].getPreco()+ "\n";
              //  aux+= "Fornecedor: " + produto[i].getFornecedor().getNome() + "\n";

            }
        }


    }
    private Fornecedor pesquisarFornecedor(){
        long cnpj= parseLong(showInputDialog("CNPJ do fornecedor"));
        for (int i=0; i<idxFornecedor;i++){
          if (fornecedor[i].getCnpj() == cnpj) {
              return fornecedor[i];
          }
        }
        showMessageDialog(null, "CNPJ não cadastrado");
        return null;
    }
}



