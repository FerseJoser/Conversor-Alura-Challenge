package Conversor.Monedas;

import javax.swing.JOptionPane;

public class function {
	ConversorMoneda monedas = new ConversorMoneda();
	ConversorPesos pesos = new ConversorPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos a Dólar":
        	monedas.ConversorPesosDolares(Minput);
        	break;
        case "De Pesos a Euro":
        	monedas.ConversorPesosEuros(Minput);
        	break;
        case "De Pesos a Libras":
        	monedas.ConversorPesosLibras(Minput);
        	break;
        case "De Pesos a Yen":
        	monedas.ConversorPesosYen(Minput);
        	break;
        case "De Pesos a Won Coreano":
        	monedas.ConversorPesosWon(Minput);
        	break;    	    	                          
        case "De Dólar a Pesos":
        	pesos.ConversorDolaresPesos(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConversorEurosPesos(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConversorLibrasPesos(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConversorYenPesos(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConversorWonPesos(Minput);
            break;
        }     
}
}
