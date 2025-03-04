package Exercicio09;

import java.util.ArrayList;

public class Primos {
	private ArrayList<Integer> NumerosGerados = new ArrayList<>();
	private ArrayList<Integer> NumerosPrimos = new ArrayList<>();
	public ArrayList<Integer> getNumerosGerados() {
		return NumerosGerados;
	}
	public void setNumerosGerados(ArrayList<Integer> numerosGerados) {
		NumerosGerados = numerosGerados;
	}
	public ArrayList<Integer> getNumerosPrimos() {
		return NumerosPrimos;
	}
	public void setNumerosPrimos(ArrayList<Integer> numerosPrimos) {
		NumerosPrimos = numerosPrimos;
	}
	
	public Primos() {
		// TODO Auto-generated constructor stub
		this.NumerosGerados=new ArrayList<>();
		this.NumerosPrimos=new ArrayList<>();
	}
	
	public void GerandoNumeros() {
		for (int i=1; i<=50; i++) {
			NumerosGerados.add(i);
		}
		VerificandoNumeros();
	}
	
	public void VerificandoNumeros() {
        for (int num : NumerosGerados) {
            if (VerificandoPrimos(num)) {
                NumerosPrimos.add(num);
            }
        }
	}
	
	public boolean VerificandoPrimos(int numero) {
	        if (numero < 2) return false; // 0 e 1 nao sao primos
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false; // Se for divisível por qualquer número além de 1 e ele mesmo, nao é primo
	            }
	        }
	        return true;
	}
	
	public void ImprimindoPrimos() {
		System.out.println("Numeros primos digitados:\n"+NumerosPrimos);
	}
}

