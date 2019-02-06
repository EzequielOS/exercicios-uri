
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 05/02/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 		A % 2 == 0
 */

import java.util.Scanner;

public class SomaImparConsecutivo {
		public static void main(String[] args) {

			int N;
			int X;
			int Y; 
			int aPartir;
			int total;
			Scanner leitor = new Scanner(System.in);
			N = leitor.nextInt();
			
			for (int i = 1; i <= N; i++) {
				int sum = 0;
				X = leitor.nextInt();
				Y = leitor.nextInt();
				for (aPartir = X,total = 0; total < Y; aPartir++) {
					if (aPartir % 2 != 0) {
						sum += aPartir;
						total += 1;
					}
				}
				System.out.print(sum+"\n");
			}

		}

	}
 