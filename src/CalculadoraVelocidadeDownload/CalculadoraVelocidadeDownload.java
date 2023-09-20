package CalculadoraVelocidadeDownload;

import java.util.Scanner;

public class CalculadoraVelocidadeDownload {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        // Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
        double distanciaServidores = scanner.nextDouble();
        double velocidadePlano = scanner.nextDouble();

        // Calcular a velocidade de download estimada
        double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

        // Apresentar o resultado
        System.out.println("Velocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

        scanner.close();
    }

    public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
        // Calcular a velocidade de download estimada usando a fórmula fornecida
        double velocidadeDownloadEstimada = velocidadePlano / (1 + (distanciaServidores / 100));
        
        // Garantir que a velocidade de download estimada não exceda a velocidade do plano contratado
        if (velocidadeDownloadEstimada > velocidadePlano) {
            return velocidadePlano;
        }
        
        return velocidadeDownloadEstimada;
    }
}
	