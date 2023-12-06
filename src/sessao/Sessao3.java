package sessao;

import java.util.Scanner;

public class Sessao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exercicio 3
		float salarioBruto, adicionalNoturno, horasExtras, descontos;
		float salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o salário: \n");
		salarioBruto = leia.nextFloat();
		
		System.out.println("\nDigite o adicional noturno: \n");
		adicionalNoturno = leia.nextFloat();
				
		System.out.println("\nDigite as horas extras: \n");
		horasExtras = leia.nextFloat();
		
		System.out.println("\nDigite os descontos: \n");
		descontos = leia.nextFloat();
		
		leia.close();
		
		salarioLiquido =  salarioBruto + adicionalNoturno + (horasExtras *5) - descontos;
		
		System.out.printf("O salário líquido é: R$ %.2f", salarioLiquido);
	}

}
