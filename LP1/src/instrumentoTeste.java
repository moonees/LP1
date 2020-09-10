
public class InstrumentoTeste {
	public static void main(String [] args) {
		instrumentoMusical[] instrumento = new instrumentoMusical[5];
		instrumento[0] = new instrumentoMusical("Violão","Vintage","Marrom");
		instrumento[1] = new instrumentoMusical("Guitarra", "Tama", "Branca");
		instrumento[2] = new instrumentoMusical("Saxofone", "Boss", "Dourado");
		instrumento[3] = new instrumentoMusical("Bateria", "Vintage", "Preta e Branco");
		instrumento[4] = new instrumentoMusical("Triangulo", "Laney", "Prata");
		
		for(int i=0; i <5; i++) {
			System.out.println("O instrumento é"+"\t" + instrumento[i].getNome() +"\t" + "de cor" + "\t" + instrumento[i].getCor());
			
		}
		instrumento[0].tocar();
	}
}
