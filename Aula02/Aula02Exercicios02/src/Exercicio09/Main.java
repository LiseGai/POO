package Exercicio09;
/*
 * Escreva um programa Java que use um laço para imprimir os números primos de
1 a 50.

Organizaçao: 
1. Classe Primos: 
- Vai ter 2 Arrays (um pra armazenar todos os numeros de 1 até 50 (inclusos) e outro pra arma-
zenar apenas os numeros primos nesse intervalo 
- Vai ter o construtor 
- Vai ter os Getters e Setters dos 2 arrays 
- Vai ter o Método GerandoNumeros
- Vai ter o Método VerificandoPrimos
- Vai ter o Método ImprimindoPrimos
2. Main: 
Vai instanciar o Primos
Vai chamar os 3 métodos contidos na classe
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primos primos = new Primos();
		primos.GerandoNumeros();
		primos.ImprimindoPrimos(); 
	}

}
