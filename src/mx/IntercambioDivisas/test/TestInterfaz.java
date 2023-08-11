
package mx.IntercambioDivisas.test;

import javax.swing.JOptionPane;

public class TestInterfaz {

	public static void main(String[] args) {
		// Se declara el arreglo donde se elegira conversor de temp o divias.
		String [] menuInicial = new String[2];
			menuInicial[0] = "Conversor de divisas";
			menuInicial[1] = "Conversor de temperatura.";
			
			
		
		JOptionPane.showMessageDialog(null, "Bienvenido al intercambio de monedas, a continuacion introduce el valor de pesos Mxn");
		
		String vvalor = JOptionPane.showInputDialog("Bienvenido, inserta la cantidad que deseas cambiar");
		
		String Mmenu1 =JOptionPane.showInputDialog(null,"Elija la funcionalidad","Menu",JOptionPane.QUESTION_MESSAGE,null, new Object [] {"Conversor de moneda" ,
				"Conversor de temperatura" }, "seleccionar").toString();
		}
	


}
