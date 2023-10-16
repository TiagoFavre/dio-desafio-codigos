package desafioBancario.HerancaBancária;

import java.text.DecimalFormat;

class ContaPoupanca extends ContaBancaria {
	  private double taxaJuros;

	  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
	    super(numero, titular, saldo);
	    this.taxaJuros = taxaJuros;
	  }

	  @Override
	  public void exibirInformacoes() {
	    super.exibirInformacoes();
	    DecimalFormat decimalFormat = new DecimalFormat("#.0");
	    System.out.println("Taxa de juros: " + decimalFormat.format(taxaJuros) + "%");
	  }
	}