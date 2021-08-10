package algoritmos;

import gerador.Atributos;

public class BubbleSort extends Atributos {

	public void execute(int[] vetor) {
		boolean troca = true;
		trocaChave = 0;
		testeChave = 0;
		iniciar();
		for (int i = 1; (i < vetor.length) && (troca); i++) {
			troca = false;
			testeChave++;
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux;
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					troca = true;
					trocaChave++;
				}
			}
		}
		finalizar();
	}

	public void run(int[] vetor) {
		execute(vetor);

		System.out.println("---- Bubble Sort ---- \nTempo de Processamento: " + (finalDoTeste - inicioDoTeste)
				+ " milissegundos \nTestes de Chaves: " + testeChave + " \nTrocas de Chaves: " + trocaChave + "\n");

	}
}
