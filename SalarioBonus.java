import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class SalarioBonus {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("####0.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);
		
		String funcionario = leitor.next();
		double salario = Double.parseDouble(leitor.next());
		double vendas = Double.parseDouble(leitor.next());
		
		double bonus = (vendas * 0.15);
		double total = (bonus + salario);
		String totalString = formatador.format(total);
		
		System.out.println("TOTAL = R$ " + totalString );
	}
	
}
