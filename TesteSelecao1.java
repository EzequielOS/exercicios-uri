
/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criacao do  arquivo: 29/01/2019
Objetivo sucinto do arquivo: Resolver exercicios do URI
Referencia: URI Online Judge
Informacoes adicionais: 

 */
import java.util.Scanner;

public class TesteSelecao1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int C = leitor.nextInt();
		int D = leitor.nextInt();
		
		if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
			System.out.println("Valores aceitos");
		}else {
			System.out.println("Valores nao aceitos");
		}
		
	}
}
