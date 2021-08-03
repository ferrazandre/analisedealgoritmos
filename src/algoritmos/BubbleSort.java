package algoritmos;

import gerador.TempoDeExecucao;

public class BubbleSort extends TempoDeExecucao {

	public void execute(int[] vetor) {
		boolean troca = true;
		iniciar();
		for (int i = 1; (i < vetor.length) && (troca); i++) {
			troca = false;
			for (int j = 0; j < vetor.length - 1; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux;
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					troca = true;
				}
			}
		}
		finalizar();
	}
	
	public void run(int[] vetor) {
		execute(vetor);
		
		System.out.println("---- Bubble Sort ---- \nTempo de Processamento: "+ (finalDoTeste - inicioDoTeste) +" milissegundos \n");
		
	}
}
