
public class ProfissãoTest {
	public static void main(String [] args) {
		Profissão[] profissao = new Profissão[5];
		profissao[0] = new Profissão("Gabriela","Desenvolvedora", 975.50);
		profissao[1] = new Profissão("Ramon","Desenvolvedor", 857);
		profissao[2] = new Profissão("Bruno","Mecanico", 1600);
		profissao[3] = new Profissão("Carlos","Eletricista", 1900.50);
		profissao[4] = new Profissão("Matheus","Design",1880);
		for(int i=0;i <5;i++) {
			System.out.println(profissao[i].getNome()+ "\t" + "trabalha como"+ "\t" +profissao[i].getProfissao() +"\t"+ "recebendo um salário de R$"+ profissao[i].getSalario());
		}
		profissao[0].trabalhar();
	}
}
