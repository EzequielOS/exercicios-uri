
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 29/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */
import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {

		int valor = new Scanner(System.in).nextInt();

		System.out.println(valor);
		System.out.printf("%d nota(s) de R$ 100,00\n", valor / 100);
		valor %= 100;		
		System.out.printf("%d nota(s) de R$ 50,00\n", valor / 50);
		valor %= 50;		
		System.out.printf("%d nota(s) de R$ 20,00\n", valor / 20);
		valor %= 20;		
		System.out.printf("%d nota(s) de R$ 10,00\n", valor / 10);
		valor %= 10;	
		System.out.printf("%d nota(s) de R$ 5,00\n", valor / 5);
		valor %= 5;		
		System.out.printf("%d nota(s) de R$ 2,00\n", valor / 2);
		valor %= 2;
		System.out.printf("%d nota(s) de R$ 1,00\n", valor);
	}
}
