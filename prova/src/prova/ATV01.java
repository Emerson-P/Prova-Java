package prova;

import java.util.Scanner;

public class ATV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String tipoAlimento;
		int qtdAlimentos, qtdInstituicao, divisao;
		
		//Pede o tipo de alimento
		System.out.println("Digite o tipo de alimento: \nProdutos n�o perec�veis (por exemplo, enlatados, arroz, macarr�o)\r\n"
				+ "Produtos perec�veis (por exemplo, frutas, legumes, p�es frescos)\r\n"
				+ "Produtos de higiene pessoal (por exemplo, sabonete, pasta de dente)");
		tipoAlimento = input.nextLine();
		
		//pede a quantidade de aliemento
		System.out.println("Digite a quantidade de alimentos: ");
		qtdAlimentos = input.nextInt();
		
		System.out.println("Digite a quantidade de institui��es de caridade que receber�o esses alimentos: ");
		qtdInstituicao = input.nextInt();
		
		//Mostra ao usuario as informa�oeos cedidas por ele
		System.out.println("informa��es:\nTipo de alimento: "+tipoAlimento+ "\nQuantidade de alimentos: " + qtdAlimentos+ "\nquantidade de institui��es de caridade: " + qtdInstituicao);
		
		// Caso a divisao seja exata a divis�o � justa
		// Caso n�o e feito um la�o while para achar a maior divis�o justa
		if( qtdAlimentos%qtdInstituicao == 0) {
			System.out.println("Cada institui��o deve receber:  " + qtdAlimentos/qtdInstituicao  );
		}else {
			
			divisao = qtdAlimentos;
			
			while(divisao%qtdInstituicao !=0) {
				divisao --;
			}
			
			System.out.println("Cada institui��o deve receber:  " + divisao/qtdInstituicao + "\nSobrando:" + (qtdAlimentos-divisao));
		}
		
		input.close();
	}

}
