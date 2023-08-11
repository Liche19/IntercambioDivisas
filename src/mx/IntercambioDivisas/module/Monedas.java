package mx.IntercambioDivisas.module;

import javax.swing.JOptionPane;

public class Monedas {

	static void conversor(double valor) {

		String menu2 = JOptionPane.showInputDialog(null, "Elija divisas a cambiar", "Menu",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "pesos a dolar", "pesos a euro", "pesos a libra", "pesos a yen", "pesos a sul",
						"dolar a peso", "euro a peso", "libra a peso", "yen a peso", "sun a peso" },
				"seleccionar").toString();
		ClasePrincipalIntercambio monedas = new ClasePrincipalIntercambio();
		switch (menu2) {
		case "pesos a dolar":
			monedas.ConvertirPesosDolar(valor);
			break;

		case "pesos a euro":
			monedas.ConvertirPesosEuro(valor);
			break;

		case "pesos a libra":
			monedas.ConvertirPesosLibra(valor);
			break;

		case "pesos a yen":
			monedas.ConvertirPesosYen(valor);
			break;

		case "pesos a sul":
			monedas.ConvertirPesosSul(valor);
			break;

		case "dolar a peso":
			monedas.ConvertirDolarPesos(valor);
			break;

		case "euro a peso":
			monedas.ConvertirEuroPesos(valor);
			break;

		case "libra a peso":
			monedas.ConvertirLibraPesos(valor);
			break;

		case "yen a peso":
			monedas.ConvertirYenPesos(valor);
			break;

		case "sun a peso":
			monedas.ConvertirSulPesos(valor);
			break;

		default:
			break;
		}
	}
}
