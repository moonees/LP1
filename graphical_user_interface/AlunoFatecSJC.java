package graphical_user_interface;

public class AlunoFatecSJC {
	private String nome;
	private String curso;
	private int nascimento;
	private String semestre;
	
	public AlunoFatecSJC(String nome, String curso, int nascimento, String semestre){
		this.nome = nome;
		this.curso = curso;
		this.nascimento = nascimento;
		this.semestre =semestre;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setIdade(int nascimento) {
		this.nascimento = nascimento;
	}
	public int getIdade() {
		return nascimento;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getSemestre() {
		return semestre;
	}
}
