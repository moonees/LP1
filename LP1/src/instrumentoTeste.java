
public class InstrumentoTeste {
	public static void main(String [] args) {
		InstrumentoMusical[] instrumento = new InstrumentoMusical[5];
		instrumento[0] = new InstrumentoMusical("Violão","Vintage","Marrom");
		instrumento[1] = new InstrumentoMusical("Guitarra", "Boss", "Branca");
		instrumento[2] = new InstrumentoMusical("Saxofone", "Boss", "Dourado");
		instrumento[3] = new InstrumentoMusical("Bateria", "Laney", "Preta e Branco");
		instrumento[4] = new InstrumentoMusical("Triangulo", "Vintage", "Prata");
		
		for(int i=0; i <5; i++) {
			System.out.println("O instrumento é"+"\t" + instrumento[i].getNome() +"\t" + "de cor" + "\t" + instrumento[i].getCor());
			
		}
		instrumento[0].tocar();
	}
}
