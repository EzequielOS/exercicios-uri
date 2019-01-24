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

public class DistanciaEntrePontos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("#.0000");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		float xPonto1 = Float.parseFloat(leitor.next());
		float yPonto1 = Float.parseFloat(leitor.next());
		
		float xPonto2 = Float.parseFloat(leitor.next());
		float yPonto2 = Float.parseFloat(leitor.next());
		
		float calculo1Distancia = ((xPonto2 - xPonto1)* (xPonto2 - xPonto1)) + ((yPonto2 - yPonto1)*(yPonto2 - yPonto1));
		float calculo2Distancia = (float) Math.sqrt(calculo1Distancia);
		String distanciaString = formatador.format(calculo2Distancia);
		
		System.out.println(distanciaString);
		
		
	}
}
