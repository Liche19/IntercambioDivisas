package mx.IntercambioDivisas.module;

import javax.swing.JOptionPane;

public class ConversionGrados {
	
	public void ConvertirCelciusFarenheit(double valor) {
		double CelciusFarenheit = (1.8 *valor) +32;
		JOptionPane.showMessageDialog(null, CelciusFarenheit+  " grados Celcius son : " + (double)Math.round(CelciusFarenheit * 100d) /100 + "°"+ " Farenheit");
	}

	public void ConvertirFarenheitCelcius(double valor) {
		double FarenheitCelcius = (valor-32)/1.8 ;
		JOptionPane.showMessageDialog(null,FarenheitCelcius + " grados Farenheit son : "+ (double)Math.round(FarenheitCelcius * 100d) /100+ "°" + " Celcius");
		}

	public void ConvertirCelciusKelvin(double valor) {
		double CelciusKelvin =  (valor+273.15);
		JOptionPane.showMessageDialog(null, CelciusKelvin + " grados Celcius son : " + (double)Math.round(CelciusKelvin * 100d) /100 + "°"+" Kelvin");
	}
	public void ConvertirKelvinCelcius(double valor) {
		double KelvinCelcius = (valor-273.15) ;
		JOptionPane.showMessageDialog(null,  KelvinCelcius + " grados Kelvin son : " + (double)Math.round(KelvinCelcius * 100d) /100 + "°" + " Celcius");
	}
	public void ConvertirFarenheitKelvin(double valor) {
		double FarenheitKelvin = ((valor-32)/1.8) + 273.15 ;
		JOptionPane.showMessageDialog(null, FarenheitKelvin + " grados Farenheit son : "+ (double)Math.round(FarenheitKelvin * 100d) /100 + "°"+" Kelvin");
	}
	public void ConvertirKelvinFarenheit(double valor) {
		double KelvinFarenheit = ((valor-273.15)*1.8)+32;
		JOptionPane.showMessageDialog(null,KelvinFarenheit + " grados Kelvin son : " + (double)Math.round(KelvinFarenheit * 100d) /100+  "°"+ " Farenheit");
	}
	
}
