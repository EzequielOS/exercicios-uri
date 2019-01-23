/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 22/01/2019
Objetivo sucinto do arquivo: Programa pra calculo de medias
Referência: URI Online Judge
Informações adicionais: 

 */

import java.util.*;

public class MediaDois {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		numero.useLocale(Locale.ENGLISH);
		
		double A = numero.nextDouble();
		double B = numero.nextDouble();
		double C = numero.nextDouble();

		System.out.println("MEDIA = " + (((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5)));
		
		double mediaValor = (A * 2) + (B * 3) + (C * 5);
		double mediaPeso = 2 + 3 + 5;
		double media = mediaValor / mediaPeso;
		
		System.out.println("MEDIA = " + media);
	}
}
