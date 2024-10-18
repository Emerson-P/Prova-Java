package prova;

import java.util.Scanner;

public class ATV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double valor, taxaFrete = 0.0, taxaImportacao = 0.6;
		int frete;
		String tipoFrete = "";
		
		System.out.println("Digite o valor do produto: ");
		valor = input.nextDouble();
		//caso valor do produto seja 0 ou negativo o programa e encerrado
		if(valor <= 0) {
			System.out.println("Valor inválido, tente novamente mais tarde.");
			System.exit(0);
		}
		
		
		System.out.println("Escolha seu frete:\n1 para Frete demorado: 10% do valor do produto e demora 60 dias para chegar em sua residência.\r\n"
				+ "2 para Frete médio: 15% do valor do produto e demora 30 dias para a encomenda chegar em sua residência.\r\n"
				+ "3 para Frete rápido: 20% do valor do produto e demorar cerca de 20 dias para chegar na sua residência.");
		frete = input.nextInt();
		
		//Determina o tipo do frete e a taxa pelo numeto digitado pelo usuario 
		switch (frete) {
			case 1: {
				taxaFrete = 0.1;
				tipoFrete = "Demorado";
				break;
			}
			case 2: {
				taxaFrete = 0.15;
				tipoFrete = "Medio";
				break;
			}
			case 3: {
				taxaFrete = 0.2;
				tipoFrete = "Rapido";
				break;
			}
			default:{
				//Imprime uma mensagem de valor invalido e termina a aplicação
				System.out.println("Opção de frete inválida, tente novamente mais tarde.");
				System.exit(0);
			}
		}
		
		
		System.out.println("Você escolheu o frete " + tipoFrete 
				+ "\nO valor da taxa de importação: " + valor*taxaImportacao
				+ "\nO valor do frete: " + valor*taxaFrete
				+ "\nO valor do produto final: "  + (valor+(valor*taxaFrete) + ( valor*taxaImportacao))
				);
		
		
		input.close();
	}

}
