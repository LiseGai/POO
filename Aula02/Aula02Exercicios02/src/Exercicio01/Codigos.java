package Exercicio01;

import java.util.Scanner;

public class Codigos implements TAD01 {
    private int vetorNumeros[];
    private int num;
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int[] getVetorNumeros() {
        return vetorNumeros;
    }

    public void setVetorNumeros(int[] vetorNumeros) {
        this.vetorNumeros = vetorNumeros;
    }

    public Codigos() {
        vetorNumeros = new int[TAMANHO];
        num=0;
        geradorVetor();
    }

    private void geradorVetor() {
        System.out.println("Digite os numeros de 1 a 10:");
        Scanner numeros = new Scanner(System.in);
        
        for (int i = 0; i < TAMANHO; i++) {
            int num = numeros.nextInt();  // Armazena o número antes da validação
            if (num > 10 || num < 1) {
                System.out.println("Numero inválido. Nao armazenado");
                i--;  // Para repetir a entrada caso o número seja inválido
            } else {
                vetorNumeros[i] = num;
            }
        }
        numeros.close();
    }

    public void imprimindoVetor() {
        System.out.println("O vetor digitado foi:");
        for (int num : vetorNumeros) {
            System.out.print(num+"\t");
        }
    }
}

