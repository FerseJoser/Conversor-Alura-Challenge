package Conversor.Monedas;

import javax.swing.JOptionPane;


public class Principal {
	public static void main (String[] args) {

        function monedas = new function();
             
        int respuesta=0;
        	while(respuesta==JOptionPane.OK_OPTION) {
        		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     monedas.ConvertirMonedas(Minput);
                      respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
                     }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    }
        	
        }  
	}
    
               

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    
	
	
}
}
    
