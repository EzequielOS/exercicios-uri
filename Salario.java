import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);

		int idFuncionario = entradaDados.nextInt();
		int horasTrabalhadas = entradaDados.nextInt();
		float pagamento = Float.parseFloat(entradaDados.next());

		DecimalFormat formatador = new DecimalFormat("#.00");
		DecimalFormatSymbols simboloFormatador = formatador.getDecimalFormatSymbols();
		simboloFormatador.setDecimalSeparator('.');
		formatador.setDecimalFormatSymbols(simboloFormatador);

		System.out.println("NUMBER = " + idFuncionario + "\nSALARY = U$ " + formatador.format((horasTrabalhadas * pagamento)));
	}
}
