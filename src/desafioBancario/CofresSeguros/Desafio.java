package desafioBancario.CofresSeguros;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// Lê o tipo de cofre (primeira linha da entrada)
	    Scanner scanner = new Scanner(System.in);
	    String tipoCofre = scanner.nextLine();
	    
	    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
	    if (tipoCofre.equalsIgnoreCase("digital")) {
	    	int senha = scanner.nextInt();
	    	CofreDigital cofreDigital = new CofreDigital(senha);
	    	System.out.println("Tipo: Cofre Digital");
	        System.out.println("Metodo de abertura: Senha");
	    	int tentativaSenha = scanner.nextInt();
	    	
	    	if(cofreDigital.validarSenha(tentativaSenha)) {
	    		System.out.println("Cofre aberto!");
	    }else {
	    		System.out.println("Senha incorreta!");

	    }
	    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
	        CofreFisico cofreFisico = new CofreFisico();
	        System.out.println("Tipo: Cofre Fisico");
	        System.out.println("Metodo de abertura: Chave");
	    } else {
	        System.out.println("Tipo de cofre inválido.");
	      }
	    }
	  }
