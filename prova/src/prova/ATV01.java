package prova;

import java.util.Scanner;

public class ATV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String tipoAlimento;
		int qtdAlimentos, qtdInstituicao, divisao;
		
		//Pede o tipo de alimento
		System.out.println("Digite o tipo de alimento: \nProdutos não perecíveis (por exemplo, enlatados, arroz, macarrão)\r\n"
				+ "Produtos perecíveis (por exemplo, frutas, legumes, pães frescos)\r\n"
				+ "Produtos de higiene pessoal (por exemplo, sabonete, pasta de dente)");
		tipoAlimento = input.nextLine();
		
		//pede a quantidade de aliemento
		System.out.println("Digite a quantidade de alimentos: ");
		qtdAlimentos = input.nextInt();
		
		System.out.println("Digite a quantidade de instituições de caridade que receberão esses alimentos: ");
		qtdInstituicao = input.nextInt();
		
		//Mostra ao usuario as informaçoeos cedidas por ele
		System.out.println("informações:\nTipo de alimento: "+tipoAlimento+ "\nQuantidade de alimentos: " + qtdAlimentos+ "\nquantidade de instituições de caridade: " + qtdInstituicao);
		
		// Caso a divisao seja exata a divisão é justa
		// Caso não e feito um laço while para achar a maior divisão justa
		if( qtdAlimentos%qtdInstituicao == 0) {
			System.out.println("Cada instituição deve receber:  " + qtdAlimentos/qtdInstituicao  );
		}else {
			
			divisao = qtdAlimentos;
			
			while(divisao%qtdInstituicao !=0) {
				divisao --;
			}
			
			System.out.println("Cada instituição deve receber:  " + divisao/qtdInstituicao + "\nSobrando:" + (qtdAlimentos-divisao));
		}
		
		input.close();
	}

}
