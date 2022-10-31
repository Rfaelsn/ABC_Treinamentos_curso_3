package com.aovivo.sisrestaurante;

import java.util.ArrayList;
import java.util.List;
/**
* <h1>Pedido.java</h1>
* <p>
*   Esta classe é a descrição de um  pedido do restaurante.
*   fazendo a ligação  entre as informações de cleinete e os produtos adiquiridos
* <p>
*
* @author Rafael Silva do Nascimento
* @version 1.0
* @since 28-10-2022
*/

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();
    private double totalPedido = 0;

    /**
    * Este método é utilizado para Editar um dos produtos na lista do pedido.
    * Recebe o nome do produto que deseja  alterar e o nome do novo produto que deseja inserir.
    * @param nomeProduto Este é o nome do produto que se deseja alterar
    * @param novoProduto Este é o Objeto produto que irá substituir o antigo produto.
    */
    public void editaProduto(String nomeProduto,Produto novoProduto){
        for (int i = 0; i < this.produtos.size(); i++) {
            if (produtos.get(i).getNomeProduto() == nomeProduto) {
                produtos.add(i, novoProduto);
            }
        }
    }


    /**
    * Este método é utilizado para adicionar um produto no pedido.
    * @param produto Este é o Objeto produto que será adicionado no pedido.
    */
    public void adicionaProduto(Produto produto){
        this.produtos.add(produto);
        this.totalPedido += produto.getPrecoProduto();
    }


     /**
    * Este método é utilizado para remover um produto no pedido.
    * ele fará a busca pelo nome no "banco de dados" para a remoção
    * @param nomeProduto Este parâmetro é o nome do produto que se deseja remover.
    */
    public void removerProduto(String nomeProduto){
        for (int i = 0; i < this.produtos.size(); i++) {
            if (produtos.get(i).getNomeProduto() == nomeProduto) {
                produtos.remove(i);
            }
        }
    }

    /**
    * Este método é utilizado para gerar a descrição completa do pedido.
    * @return Retorna uma String com toda a descrição  do pedido.
    */
    public String listarPedido(){
        String descPedido = "Informações do cliente: \n";
        descPedido += "nome: "+ this.cliente.getNome()+"\n" ;
        descPedido += "cpf: "+ this.cliente.getCpf()+"\n";
        descPedido += "Endereco: "+ this.cliente.getEndereco()+"\n";
        descPedido += "Telefone: "+ this.cliente.getTelefone()+"\n";
        descPedido += "produtos: \n";
        for (int i = 0; i < this.getProdutos().size(); i++) {
            descPedido += (i+1)+"º Produto:\n";
            descPedido += "Nome do Produto: "+this.getProdutos().get(i).getNomeProduto()+"\n";
            descPedido += "descrição do Produto: "+this.getProdutos().get(i).getDescricaoProduto()+"\n";
            descPedido += "Preço do Produto: "+this.getProdutos().get(i).getPrecoProduto()+"\n";
        }
        descPedido += "\n Total do pedido: "+this.totalPedido;


        return descPedido;
    }





    public Pedido() {
    }

    public Pedido(Cliente cliente, List<Produto> produtos, double totalPedido) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.totalPedido = totalPedido;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getTotalPedido() {
        return this.totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }


}
