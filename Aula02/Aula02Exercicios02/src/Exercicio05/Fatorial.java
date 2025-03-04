package Exercicio05;

import java.util.Scanner;

public class Fatorial {
    private int numero;
    private int fatorial;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFatorial() {
        return fatorial;
    }

    public void setFatorial(int fatorial) {
        this.fatorial = fatorial;
    }

    public Fatorial() {
        // Inicializa valores
        numero = 0;
        fatorial = 1;
        pedindoNumero();
    }

    private void pedindoNumero() {
        Scanner digitado = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número menor que 13 (sair): ");
            numero = digitado.nextInt();

            if (numero >= 13) {
                System.out.println("Saindo...");
                break; // Como 13 ultrapassa o limite de int pro fatorial, escolhi ele ou qualquer
                //coisa acima dele
            }

            gerandoFatorial(numero);
            imprimindoFatorial();
        }

        digitado.close();
    }

    private void gerandoFatorial(int numero2) {
        fatorial = 1; // Resetamos o fatorial para não acumular valores antigos

        for (int i = 1; i <= numero2; i++) {
            fatorial *= i;
        }
    }

    public void imprimindoFatorial() {
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}

