package albergue;

public class Cama {

//	A classe Cama possui os seguintes atributos: id, codigoCama, ehBeliche (boolean),
//	posicao, descricao.
	
	int id;
	int codigoCama;
	boolean ehBeliche;
	String posicao;
	String descricao;
	
	public Cama() {
		super();
	}
	
	public Cama(int id, int codigoCama, boolean ehBeliche, String posicao, String descricao) {
		super();
		this.id = id;
		this.codigoCama = codigoCama;
		this.ehBeliche = ehBeliche;
		this.posicao = posicao;
		this.descricao = descricao;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigoCama() {
		return codigoCama;
	}
	public void setCodigoCama(int codigoCama) {
		this.codigoCama = codigoCama;
	}
	public boolean isBeliche() {
		return ehBeliche;
	}
	public void setBeliche(boolean beliche) {
		this.ehBeliche = beliche;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Cama [id=" + id + ", codigoCama=" + codigoCama + ", ehBeliche=" + ehBeliche + ", posicao=" + posicao
				+ ", descricao=" + descricao + "]";
	}
	
	
	
	
}
