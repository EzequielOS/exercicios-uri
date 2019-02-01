/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 01/02/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 
 */
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ImpostoDeRenda {
	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("####0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		float salario = Float.parseFloat(new Scanner(System.in).next());
		float salarioCalculado = 0.00f;
		
		if (salario >= 0.00f && salario <= 2000.00f){
			System.out.println("Isento");
		}
		else if(salario >= 2000.01f && salario <= 3000.00f) {
			salario -= 2000.00f;
			salarioCalculado = salario * 0.08f;	
			System.out.println("R$ " + formatador.format(salarioCalculado));
		}
		else if(salario >= 3000.01f && salario <= 4500.00f) {
			salario -= 3000.00f;
			salarioCalculado += (1000.00f * 0.08f);
			salarioCalculado += salario * 0.18f;
			System.out.println("R$ " + formatador.format(salarioCalculado));
		}
		else if(salario > 4500.00f) {
			salario -= 4500;
			salarioCalculado += (1000.00f * 0.08f);
			salarioCalculado += (1500.00f * 0.18f);
			salarioCalculado += salario * 0.28f;
			System.out.println("R$ " + formatador.format(salarioCalculado));
		}
	}
}
