
public class Profiss�o {
	private String nome;
	private String profissao;
	private double salario;
	
	public Profiss�o(String nome, String profissao, double salario) {
		this.nome = nome;
		this.profissao = profissao;
		this.salario = salario;
	}
	public void  setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getSalario() {
		return salario;
	}
	public void trabalhar() {
		System.out.println("Sua fun��o � muito importante para a sociedade");
	}
}
