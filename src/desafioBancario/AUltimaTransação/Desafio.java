package desafioBancario.AUltimaTransação;

import java.util.Scanner;

public class Desafio {
	
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String entrada = scanner.nextLine();
	    String[] partes = entrada.split(",");
	    
	   // Verifique se a entrada tem os campos necessários
	    if (partes.length == 4) {
	        String data = partes[0];
	        String hora = partes[1];
	        String descricao = partes[2];
	        double valor = Double.parseDouble(partes[3]);
	        
	    // Crie uma instância de Transacao
	        Transacao transacao = new Transacao(data, hora, descricao, valor);

	    // Imprima a transação
	        transacao.imprimir();
	    } else {
	        System.out.println("Entrada inválida. Certifique-se de fornecer os dados corretos no formato 'data,hora,descricao,valor'.");
	    }
	  }
	}