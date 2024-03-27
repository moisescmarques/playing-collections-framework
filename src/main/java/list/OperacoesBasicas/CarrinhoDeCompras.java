package main.java.list.OperacoesBasicas;

import java.util.*;

public class CarrinhoDeCompras {

    //atributo
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }
    
    public void adicionarItem(Item it){
        listaItens.add(it);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
		for (Item t: this.listaItens) {
			if(t.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(t);
			}
		}
		listaItens.removeAll(itensParaRemover);

        System.out.println("Item removido com sucesso!");
    }

    public void calcularValorTotal(){
        double valor_total = 0;
        int cont_itens = 0;
        for (Item item: this.listaItens){
            valor_total = valor_total + (item.getPreco() * item.getQuantidade());
            cont_itens += 1;
        }
        System.out.println("Valor total dos seus " + cont_itens + " itens é: R$ " + valor_total);
    }

    public void exibirItens(){
        System.out.println(listaItens);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        Item bone = new Item("Boné NY", 150.0, 1);
        Item camiseta = new Item("Camiseta Java", 50.0, 1);

        carrinhoDeCompras.adicionarItem(bone);
        carrinhoDeCompras.adicionarItem(camiseta);
        
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Boné NY");

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();
        //System.out.println(bone.toString());
    }   
}