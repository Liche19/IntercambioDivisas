package mx.IntercambioDivisas.module;

import javax.swing.JOptionPane;

public class ClasePrincipalIntercambio{
	
// PESOS A MONEDAS EXTRANGERAS

public void ConvertirPesosDolar(double valor) {
	double pesoaDolar = valor /17.05;
	JOptionPane.showMessageDialog(null, "La cantidad en Dolar es $: " + (double)Math.round(pesoaDolar * 100d) /100);
}

public void ConvertirPesosEuro(double valor) {
	double pesoaEuro = valor/18.74 ;
	JOptionPane.showMessageDialog(null,"La cantidad en Euro es $: " + (double)Math.round(pesoaEuro * 100d) /100);
	}

public void ConvertirPesosLibra(double valor) {
	double pesoaLibra = valor/21.71 ;
	JOptionPane.showMessageDialog(null,"La cantidad en Libra es $: " + (double)Math.round(pesoaLibra * 100d) /100);
}
public void ConvertirPesosYen(double valor) {
	double pesoaYen = valor/0.12 ;
	JOptionPane.showMessageDialog(null, "La cantidad en Libra es $: " + (double)Math.round(pesoaYen * 100d) /100);
}
public void ConvertirPesosSul(double valor) {
	double pesoaSul = valor/0.013 ;
	JOptionPane.showMessageDialog(null, "La cantidad en Libra es $: " + (double)Math.round(pesoaSul * 100d) /100);
}

// MONEDAS EXTRANGERAS A PESOS
public void  ConvertirDolarPesos(double valor) {
	double Dolarapeso = valor *17.05;
	JOptionPane.showMessageDialog(null,"La cantidad en peso es $: " + (double)Math.round(Dolarapeso * 100d) /100);
	
}

public void ConvertirEuroPesos(double valor) {
	double Euroapeso = valor*18.74 ;
	JOptionPane.showMessageDialog(null, "La cantidad en peso es $: " + (double)Math.round(Euroapeso * 100d) /100);
	}

public void ConvertirLibraPesos(double valor) {
	double Libraapeso = valor*21.71 ;
	JOptionPane.showMessageDialog(null,"La cantidad en peso es $: " + (double)Math.round(Libraapeso * 100d) /100);
}
public void ConvertirYenPesos(double valor) {
	double Yenapeso = valor*0.12 ;
	JOptionPane.showMessageDialog(null, "La cantidad en peso es : $" + (double)Math.round(Yenapeso * 100d) /100);
}
public void ConvertirSulPesos(double valor) {
	double Sulapeso = valor*0.013 ;
	JOptionPane.showMessageDialog(null,"La cantidad en Libra es : $" + (double)Math.round(Sulapeso * 100d) /100);
}


	
	
	
}
