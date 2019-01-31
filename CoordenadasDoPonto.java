
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 31/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class CoordenadasDoPonto {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		DecimalFormat formatador = new DecimalFormat("#.0");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);

		float coordX = Float.parseFloat(leitor.next());
		float coordY = Float.parseFloat(leitor.next());

		if (coordX == 0 && coordY == 0) {
			System.out.println("Origem");
		} else if (coordX == 0 && coordY != 0) {
			System.out.println("Eixo Y");
		} else if (coordX != 0 && coordY == 0) {
			System.out.println("Eixo X");
		} else if (coordX < 0 && coordY > 0) {
			System.out.println("Q2");
		} else if (coordX > 0 && coordY < 0) {
			System.out.println("Q4");
		} else if (coordX > 0 && coordY > 0) {
			System.out.println("Q1");
		}

		else if (coordX < 0 && coordY < 0) {
			System.out.println("Q3");
		}

	}

}
