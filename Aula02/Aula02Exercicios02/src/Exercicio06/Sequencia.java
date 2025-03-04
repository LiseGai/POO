package Exercicio06;

import java.util.ArrayList;
import java.util.Scanner;

public class Sequencia implements TAD06 {
	ArrayList<Integer> numerosEmSequencia = new ArrayList<>();
	private int i;
	private Integer valorAdicionado;
	
	public Integer getValorAdicionado() {
		return valorAdicionado;
	}



	public void setValorAdicionado(Integer valorAdicionado) {
		this.valorAdicionado = valorAdicionado;
	}



	public ArrayList<Integer> getNumerosEmSequencia() {
		return numerosEmSequencia;
	}



	public void setNumerosEmSequencia(ArrayList<Integer> numerosEmSequencia) {
		this.numerosEmSequencia = numerosEmSequencia;
	}



	public int getI() {
		return i;
	}



	public void setI(int i) {
		this.i = i;
	}



	public Sequencia() {
		// TODO Auto-generated constructor stub
		i=0;
		this.valorAdicionado=-1;
	}
	
	public void AdicionandoValores() {
		System.out.println("Adicione valores diferentes de 0: ");
		Scanner adicionando = new Scanner(System.in);
		while (valorAdicionado!=numeroProibido) {
			numerosEmSequencia.add(valorAdicionado);
			valorAdicionado = adicionando.nextInt();
		}
		adicionando.close();
	}
	
	public void ImprimindoValores() {
		System.out.println("Os valores digitados foram: ");
		System.out.print(numerosEmSequencia+"\t");
	}

}
