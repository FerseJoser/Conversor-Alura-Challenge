package Conversor.Monedas;

import javax.swing.JOptionPane;

public class ConversorPesos {
	public void ConversorDolaresPesos(double valor) {
		double monedaDolar = valor * 3739.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Pesos Colombianos");
	}
	
	public void ConversorEurosPesos(double valor) {
		double monedaEuro = valor * 4050.48;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Pesos Colombianos");
	}
	
	public void ConversorLibrasPesos(double valor) {
		double monedaLibra = valor * 4890.52;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Pesos Colombianos");
	}
	
	public void ConversorYenPesos(double valor) {
		double monedaYen = valor * 29.68;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Pesos Colombianos");
	}
	
	public void ConversorWonPesos(double valor) {
		double monedaWon = valor * 3.04;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Pesos Colombianos");
	}
}
