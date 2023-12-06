package sessao;

import java.util.Scanner;

public class Sessao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exercício1
		float salario, abono;
		float novoSalario;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salário: \n");
		salario = leia.nextFloat();
		
		System.out.println("\nDigite o abono: \n");
		abono = leia.nextFloat();
		
		leia.close();
		
		novoSalario = salario+abono;
		System.out.printf("O novo salário é: R$ %.2f", novoSalario);
		
		
	}

}
