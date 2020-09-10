
public class Lugar {
	private String nome;
	private String país;
	
	
	public Lugar(String nome, String país) {
		this.nome = nome;
		this.país = país;
		
	}
	public void setNome(String nome) {
		this.nome = nome;	
	}
	public String getNome() {
		return nome;
	}
	public  void setPaís(String país) {
		this.país = país;
	}
	public String getPaís() {
		return país;
	}
	public void lugar() {
		System.out.println("Este cidade é muito  bonita");
	}
}
