
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 30/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Lanche {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int id = leitor.nextInt();
		double preco = 0;
		int qtdade = leitor.nextInt();
 
		switch (id) {
		case 1:
			preco = 4.00f;
			break;
		case 2:
			preco = 4.50f;
			break;
		case 3:
			preco = 5.00f;
			break;
		case 4:
			preco = 2.00f;
			break;
		case 5:
			preco = 1.50f;
			break;
		default:
			if(id > 5 || id < 1) {
				System.out.println("Verifique o codigo no Cardapio!");
			}
			break;
		}
		
		DecimalFormat formatador = new DecimalFormat("#.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		System.out.println("Total: R$ " + formatador.format((qtdade * preco)));
	}
}
