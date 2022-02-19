package desafio02;

import java.util.Scanner;

public class valida {

	
	protected String recebeSenha() {
    System.out.println("Digite uma senha");
		
		Scanner scan = new Scanner(System.in);
		String senha = scan.next();
		return senha;
	}
	

	
	public void quantidadeCaracteres() {
		
		int tamanhoSenha = recebeSenha().length();
		int faltam = 6 - tamanhoSenha;
		
		if(tamanhoSenha<6) {
			
		 System.out.println("Sua senha possui " + tamanhoSenha+ " caracteres. São necessários mais " + faltam + " caracteres.");
			
			
		} else {
	    System.out.println("Sua senha tem o tamanho correto");
		}
	}


	
//		public void verificaSenha() {
//			
//			int maiusculas = 0, minusculas = 0, numeros = 0;
//			for (int i = 0; i < recebeSenha().length(); i++) { // para todos os caracteres da string
//			    char c = recebeSenha().charAt(i); // pegar o caractere
//			   
//			    if (Character.isUpperCase(c)) {
//			        maiusculas++;
//			    } else if (Character.isLowerCase(c)) {
//			        minusculas++;
//			    } else if (Character.isDigit(c)) {
//			        numeros++;
//			    }
//			
//			if(maiusculas<1) {
//				System.out.println("Digite uma letra maiúscula");
//			}
//			if(minusculas<1) {
//				System.out.println("Digite uma letra minuscula");
//			}
//			if(numeros<1) {
//				System.out.println("Digite um número");
//			}
//			
//			
//			}
//			
//		}
	
	

}
