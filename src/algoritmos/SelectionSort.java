package algoritmos;

import gerador.TempoDeExecucao;

public class SelectionSort extends TempoDeExecucao {

	public  void execute(int[] vetor, int tamanho) {
		iniciar();
		int i, j, menor, aux;

		for (i = 0; i < tamanho - 1; ++i) {
			menor = i;
			for (j = i + 1; j < tamanho; ++j) {
				if (vetor[j] < vetor[menor])
					menor = j;
			}
			aux = vetor[i];
			vetor[i] = vetor[menor];
			vetor[menor] = aux;
		}
		finalizar();
	}
	
	public void run(int[] vetor) {
		execute(vetor, vetor.length);
		System.out.println("---- Selection Sort ---- \nTempo de Processamento: "+ (finalDoTeste - inicioDoTeste) +" milissegundos \n");
		
	}
}
