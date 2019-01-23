/*
 Nome do autor: Ezequiel de Oliveira Sant'Ana
Data de criação do arquivo: 22/01/2019
Objetivo sucinto do arquivo: Programa pra calculo de medias
Referência: URI Online Judge
Informações adicionais:

 */

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class MediaDois {
	public static void main(String[] args) {

		DecimalFormat formatador = new DecimalFormat("#.0");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);

		Scanner numero = new Scanner(System.in);

		float A = Float.parseFloat(numero.next());
		float B = Float.parseFloat(numero.next());
		float C = Float.parseFloat(numero.next());

		double notasMedia = (A * 2) + (B * 3) + (C * 5);
		double pesoNotas = 2 + 3 + 5;
		double calculoMedia = notasMedia / pesoNotas;
		String notaString = formatador.format(calculoMedia);

		System.out.println("MEDIA = " + notaString);
	}
}
