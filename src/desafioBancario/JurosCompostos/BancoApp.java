package desafioBancario.JurosCompostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
   
        double valorFinal = valorInicial;
        
        for(int i = 1; i <= periodo; i++) {
        	valorFinal += valorFinal * taxaJuros; // Calcula os juros compostos para cada ano
        }
        	 System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        	 
    	 	scanner.close();
             
        }
    
}