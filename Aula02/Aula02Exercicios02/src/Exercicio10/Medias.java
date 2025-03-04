package Exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Medias implements TAD10 {
	private ArrayList<Float> medias_Digitadas = new ArrayList<>();
	private float mediaDigitada;
	
	//Getters e Setters
	public ArrayList<Float> getMedias_Digitadas() {
		return medias_Digitadas;
	}
	public void setMedias_Digitadas(ArrayList<Float> medias_Digitadas) {
		this.medias_Digitadas = medias_Digitadas;
	}
	public float getMédiaDigitada() {
		return mediaDigitada;
	}
	public void setMédiaDigitada(float médiaDigitada) {
		this.mediaDigitada = médiaDigitada;
	}
	
	public Medias() {
		// TODO Auto-generated constructor stub
		this.medias_Digitadas=new ArrayList<>();
		this.mediaDigitada=0;
	}
	
	public void ArmazenandoMedias() {
		Scanner entrada = new Scanner(System.in);
		do {
			System.out.print("Digite uma média (0 a 10, 0 para sair): ");
            mediaDigitada = entrada.nextFloat();
			if (mediaDigitada == numeroProibido) {
				System.out.println("Valor proibido");
                break;
            }
			if (mediaDigitada < 0 || mediaDigitada>10) {
				System.out.println("Numero Invalido. Média nao armazenada");
				continue;
			}
			else medias_Digitadas.add(mediaDigitada);
		}while (true);
		entrada.close();
	}
	
	public void ImprimindoMedias() {
		System.out.println("As médias foram: \n"+medias_Digitadas+"\t");
	}

}
