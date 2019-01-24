/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 24/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;


public class Consumo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		DecimalFormat formatador = new DecimalFormat("#.000");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		
		int distanciaTotal = leitor.nextInt();
		float combustivelGasto = Float.parseFloat(leitor.next());
		
		float total = distanciaTotal / combustivelGasto;
		String totalString = formatador.format(total);
		
		System.out.println(totalString + " km/l");

	}
}
