package graphical_user_interface;
import graphical_user_interface.FormSistemaSolar;

public class SistemaSolar {
	private String nome;
	private String posicao;
	private int luas;
	
	public SistemaSolar(String nome, String posicao, int luas) {
		this.nome = nome;
		this.posicao = posicao;
		this.luas = luas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getLuas() {
		return luas;
	}
	public void setLuas(int luas) {
		this.luas = luas;
	}
	
	public void Nome() {
		System.out.println("O planeta selecionado se chama "  );
	}
	public void Posicao() {
		System.out.println("Esta localizado a " + posicao + "anos luz da terra");
	}
	public void Tamanho() {
		System.out.println("cansei");
	}
	

}
