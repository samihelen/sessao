package sessao;

import java.util.Scanner;

public class Sessao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exercicio 2
		float nota1, nota2, nota3, nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite nota 1: \n");
		nota1 = leia.nextFloat();
		
		System.out.println("\nDigite nota 2: \n");
		nota2 = leia.nextFloat();
		
		System.out.println("\nDigite nota 3: \n");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite nota4: \n");
		nota4 = leia.nextFloat();
		
		leia.close();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("A média final é: %.1f", media);
	}

}
