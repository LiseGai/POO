package Exercicio1;

public class Implementacao implements TAD01 {

	@Override
	public int soma(int valor1, int valor2) {
		// TODO Auto-generated method stub
		int soma = valor1+valor2;
		return soma;
	}

	@Override
	public float subtracao(float valor1, float valor2) {
		// TODO Auto-generated method stub
		return (valor1-valor2);
		
	}

	@Override
	public float multiplicacao(float valor1, float valor2) {
		// TODO Auto-generated method stub
		return valor1-valor2;
		
	}

	@Override
	public float divisao(float valor1, float valor2) {
		// TODO Auto-generated method stub
		return valor1%valor2;
		
	}

}
