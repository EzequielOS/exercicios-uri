
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 29/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */
import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args) {
		int diasFornecido = new Scanner(System.in).nextInt();
		int anos = 0;
		int meses = 0;
		int dias = 0;

		if (diasFornecido >= 0) {
			anos = diasFornecido / 365;
			diasFornecido -= anos * 365;
			meses = diasFornecido / 30;
			diasFornecido -= meses * 30;
			dias = diasFornecido / 1;
			diasFornecido -= dias * 1;
		} else {
			System.out.println("O numero deve ser maior que 0");
		}

		System.out.println(anos + " ano(s)\n" + meses + " mes(es)\n" + dias + " dia(s)");
	}
}
