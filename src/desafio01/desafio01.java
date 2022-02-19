package desafio01;

public class desafio01 {

	public static void main(String[] args) {
		
		String estrela = "*";
		String espaco = " ";
		for(int i=1; i<=6; i++) {
			
			System.out.print(espaco.repeat(7-(i+1))); //adiciona os espaços antes das estrelas
			System.out.println(estrela.repeat(i)); //adiciona uma estrela e pula para próxima linha
						
		}
		
	}

}
