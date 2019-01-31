
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 31/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */

import java.util.Scanner;

public class Intervalo {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float numeroFornecido = Float.parseFloat(leitor.next());
		
		
		if (numeroFornecido >= 0 && numeroFornecido <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (numeroFornecido >= 25.01 && numeroFornecido <= 50.00) {
			System.out.println("Intervalo (25,50]");
		} else if (numeroFornecido >= 50.01 && numeroFornecido <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else if (numeroFornecido >= 75.01 && numeroFornecido <= 100.00) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}
}
