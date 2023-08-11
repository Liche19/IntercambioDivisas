package mx.IntercambioDivisas.module;

import javax.swing.JOptionPane;
import mx.IntercambioDivisas.module.*;

public class Principal {
	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null, "Bienvenido al intercambio de monedas y
		// temperatura");
		boolean repetidor = true;
		try {
			
			do {
				String menu1 = JOptionPane
						.showInputDialog(null, "Elija la funcionalidad", "Menu", JOptionPane.QUESTION_MESSAGE, null,
								new Object[] { "Conversor de moneda", "Conversor de temperatura" }, "seleccionar")
						.toString();

				switch (menu1) {
				case "Conversor de moneda":
					String valor = JOptionPane.showInputDialog("Bienvenido, inserta la cantidad que deseas cambiar");

					if (verificarValor(valor)) {
						double cantidad = Double.parseDouble(valor);
						Monedas intercambio = new Monedas();
						Monedas.conversor(cantidad);

						int respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar haciendo conversiones?");
						if (JOptionPane.OK_OPTION == respuesta) {
							JOptionPane.showMessageDialog(null,"En proceso a realizar una nueva conversion");

						} else {
							if (JOptionPane.OK_CANCEL_OPTION == respuesta || JOptionPane.NO_OPTION == respuesta) {
								repetidor = false;
								JOptionPane.showMessageDialog(null, "Programa terminado");
							}
						}
					}
					break;

				case "Conversor de temperatura":

					String valorTemp = JOptionPane
							.showInputDialog("Bienvenido, inserta la cantidad que deseas cambiar");
					if (verificarValor(valorTemp)) {
						double cantidad = Double.parseDouble(valorTemp);
						Grados intercambioTemp = new Grados();
						Grados.conversorTemp(cantidad);

						int respuesta = JOptionPane.showConfirmDialog(null, "Deseas continuar haciendo conversiones?");
						if (JOptionPane.OK_OPTION == respuesta) {

							JOptionPane.showMessageDialog(null,"En proceso a realizar una nueva conversion");

						} else {
							if (JOptionPane.OK_CANCEL_OPTION == respuesta || JOptionPane.NO_OPTION == respuesta) {
								repetidor = false;
								JOptionPane.showMessageDialog(null, "Programa terminado");
							}
						}

					}
					break;

				default:
					break;
				}

			} while (repetidor == true);

		} catch (NullPointerException e) {
			repetidor = false;
			JOptionPane.showMessageDialog(null, "Programa terminado");
		} finally {

		}

	}

	public static Boolean verificarValor(String valor) {
		try {
			
			double input = Double.parseDouble(valor);
			if (input >= 0 || input < 0) {
				return true;

			}
		} catch (NumberFormatException excepcion) {
			JOptionPane.showMessageDialog(null, "No se se aceptan caracteres, solo numeros");
			return false;
		}
		return null;
	}
}
