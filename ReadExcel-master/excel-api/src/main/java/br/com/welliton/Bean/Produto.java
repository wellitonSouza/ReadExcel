package br.com.welliton.Bean;

public class Produto {

	private int id;
	private String nome;
	private String descricao;
	private int free_shipping;
	private double valor;
	
	
	public Produto(int id, String nome, String descricao, int free_shipping, double valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.free_shipping = free_shipping;
		this.valor = valor;
	}
	public Produto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public int getFree_shipping() {
		return free_shipping;
	}
	public void setFree_shipping(int free_shipping) {
		this.free_shipping = free_shipping;
	}
	
	@Override
	public String toString() {
		return "Id ="+id+" Nome= "+nome+" Free_Shipping = "+free_shipping+" Valor = "+valor+" Descricao ="+descricao;
	}
	

}
