package br.com.codenation.calculadora;

public class CalculadoraSalario {

	public long calcularSalarioLiquido(double salarioBruto) {
		return (salarioBruto >= 1039) ? Math.round(calcularIrrf(calcularInss(salarioBruto))) : 0;
	}

	private double calcularInss(double salarioBruto) {
		if(salarioBruto <= 1500)
			return salarioBruto - salarioBruto * 0.08;
		else if(salarioBruto > 1500 && salarioBruto <= 4000)
			return salarioBruto - salarioBruto * 0.09;
		return salarioBruto - salarioBruto * 0.11;
	}

	private double calcularIrrf(double valorComDescontoInss) {
		if(valorComDescontoInss <= 3000)
			return valorComDescontoInss; //isento
		else if(valorComDescontoInss>3000 && valorComDescontoInss<=6000)
			return valorComDescontoInss - valorComDescontoInss * 0.075;
		return valorComDescontoInss - valorComDescontoInss * 0.15;
	}
}