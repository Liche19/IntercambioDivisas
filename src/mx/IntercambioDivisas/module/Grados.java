package mx.IntercambioDivisas.module;

import javax.swing.JOptionPane;

public class Grados {

	static void conversorTemp(double valor) {
		String menu3 = JOptionPane
				.showInputDialog(null, "Elija los grados a cambiar", "Menu", JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Celcius a Farenheit", "Farenheit a Celcius", "Celcius a Kelvin",
								"Kelvin a Celcius", "Farenheit a kelvin", "Kelvin a Farenheit" },
						"seleccionar")
				.toString();
		ConversionGrados operaciones = new ConversionGrados();
		
		switch (menu3) {
		
		case "Celcius a Farenheit":
			operaciones.ConvertirCelciusFarenheit(valor);
			break;

		case "Farenheit a Celcius":
			operaciones.ConvertirFarenheitCelcius(valor);
			break;

		case "Celcius a Kelvin":
			operaciones.ConvertirCelciusKelvin(valor);
			break;

		case "Kelvin a Celcius":
			operaciones.ConvertirKelvinCelcius(valor);
			break;

		case "Farenheit a kelvin":
			operaciones.ConvertirFarenheitKelvin(valor);
			break;

		case "Kelvin a Farenheit":
			operaciones.ConvertirKelvinFarenheit(valor);
			break;
		default:
			break;
		}
	}
}
