
public class Profiss�oTest {
	public static void main(String [] args) {
		Profiss�o[] profissao = new Profiss�o[5];
		profissao[0] = new Profiss�o("Gabriela","Desenvolvedora", 975.50);
		profissao[1] = new Profiss�o("Ramon","Desenvolvedor", 857);
		profissao[2] = new Profiss�o("Bruno","Mecanico", 1600);
		profissao[3] = new Profiss�o("Carlos","Eletricista", 1900.50);
		profissao[4] = new Profiss�o("Matheus","Design",1880);
		for(int i=0;i <5;i++) {
			System.out.println(profissao[i].getNome()+ "\t" + "trabalha como"+ "\t" +profissao[i].getProfissao() +"\t"+ "recebendo um sal�rio de R$"+ profissao[i].getSalario());
		}
		profissao[0].trabalhar();
	}
}
