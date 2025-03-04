package Exercicio07;

import java.util.*;

public class Notas implements TAD07 {
    private ArrayList<Integer> arquivoNotas = new ArrayList<>();
    private int valorNotas;

    public ArrayList<Integer> getArquivoNotas() {
        return arquivoNotas;
    }

    public void setArquivoNotas(ArrayList<Integer> arquivoNotas) {
        this.arquivoNotas = arquivoNotas;
    }

    public int getValorNotas() {
        return valorNotas;
    }

    public void setValorNotas(int valorNotas) {
        this.valorNotas = valorNotas;
    }

    public Notas() {
        this.valorNotas = 0;
    }

    public void lendoNotas() {
        Scanner notasDigitadas = new Scanner(System.in);
        System.out.println("Digite o valor das notas (-1 para sair):");

        while (true) {
            valorNotas = notasDigitadas.nextInt();

            if (valorNotas == notaProibida) { 
                break; // Sai do loop se a nota for -1
            }

            if (valorNotas > 10) { 
                System.out.println("Nota maior que 10 nao existe. Nao armazenada.");
                continue; // Pula a iteração sem armazenar a nota
            }

            arquivoNotas.add(valorNotas); // Adiciona apenas notas válidas
        }

        notasDigitadas.close();
    }

    public void imprimindoNotas() {
        if (arquivoNotas.isEmpty()) {
            System.out.println("Nenhuma nota armazenada");
        } else {
            System.out.println("Notas Digitadas: " + arquivoNotas);
        }
    }
}


