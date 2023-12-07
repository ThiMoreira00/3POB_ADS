package albergue;

public class Quarto {
	
	/*
	 * 
	 * A classe Quarto possui os seguintes atributos: id, 
	 * nomeQuarto, qtdeCamas, 
	 * temBanheiro
(boolean), descricao.
	 */
	
	int id;
	String nomeQuarto;
	int quantidadeCamas;
	boolean temBanheiro;
	String descricao;
	
	public Quarto() {
		super();
	}
	
	public Quarto(int id, String nomeQuarto, int quantidadeCamas, boolean temBanheiro, String descricao) {
		super();
		this.id = id;
		this.nomeQuarto = nomeQuarto;
		this.quantidadeCamas = quantidadeCamas;
		this.temBanheiro = temBanheiro;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeQuarto() {
		return nomeQuarto;
	}
	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}
	public int getQuantidadeCamas() {
		return quantidadeCamas;
	}
	public void setQuantidadeCamas(int quantidadeCamas) {
		this.quantidadeCamas = quantidadeCamas;
	}
	public boolean isTemBanheiro() {
		return temBanheiro;
	}
	public void setTemBanheiro(boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Quarto [id=" + id + ", nomeQuarto=" + nomeQuarto + ", quantidadeCamas=" + quantidadeCamas
				+ ", temBanheiro=" + temBanheiro + ", descricao=" + descricao + "]";
	}
	
	
	
	
	
}
