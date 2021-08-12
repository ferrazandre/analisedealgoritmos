package algoritmos;

import gerador.Atributos;

public class SelectionSort extends Atributos {

	public  void execute(int[] vetor, int tamanho) {
		iniciar();
		int i, j, menor, aux;

		for (i = 0; i < tamanho - 1; ++i) {
			menor = i;
			for (j = i + 1; j < tamanho; ++j) {
				testeChave++;
				if (vetor[j] < vetor[menor]) {
					menor = j;
				}
			}
			aux = vetor[i];
			vetor[i] = vetor[menor];
			vetor[menor] = aux;
			trocaChave+=2;
		}
		finalizar();
	}
	
	public void run(int[] vetor) {
		trocaChave = 0;
		testeChave = 0;
		execute(vetor, vetor.length);
		System.out.println("---- Selection Sort ---- \nTempo de Processamento: " + (finalDoTeste - inicioDoTeste)
				+ " milissegundos \nTestes de Chaves: "+testeChave +" \nTrocas de Chaves: "+ trocaChave +"\n");

	}
}
