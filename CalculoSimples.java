/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 24/01/2019
Objetivo sucinto do arquivo: Resolver exercicio do URI
Referência: URI Online Judge
Informações adicionais: 

 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CalculoSimples {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("####0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		int idPeca1 = leitor.nextInt();
		int qtdadePeca1 = leitor.nextInt();
		double valorPeca1 = Double.parseDouble(leitor.next());
		
		double calculaPeca1 = qtdadePeca1 * valorPeca1;
		
		int idPeca2 = leitor.nextInt();
		int qtdadePeca2 = leitor.nextInt();
		double valorPeca2 = Double.parseDouble(leitor.next());
		
		double calculaPeca2 = qtdadePeca2 * valorPeca2;
		
		double total = calculaPeca1 + calculaPeca2;
		String totalString = formatador.format(total);
	
		System.out.println("VALOR A PAGAR: R$ " + totalString);
	}
}
