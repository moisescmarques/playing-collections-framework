package main.java.list.OperacoesBasicas;

public class Tarefa {
	private String descricao;
	
	//método construtor
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	//método get para retornar a descrição
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "Tarefa {" + "descricao = '" + descricao + "'}";
	}
}
