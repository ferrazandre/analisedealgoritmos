package algoritmos;

import gerador.TempoDeExecucao;

public class MergeSort extends TempoDeExecucao {
	/**
	   * M�todo que ordena um vetor de elementos inteiros, utilizando o algoritmo
	   * do Merge Sort.
	   * 
	   * @param inicio - Posi��o inicial do vetor.
	   * @param fim  - Posi��o final do vetor.
	   * @param vetor - Vetor de n�meros inteiros.
	   */
	  private static void mergeSortRecursivo(int inicio, int fim, int[] vetor) {
	    /* Se o inicio for menor que o fim menos 1, significa que tem elementos
			  dentro do vetor. */
	    if(inicio < fim - 1) {
	      // Guarda a posi��o do meio do vetor.
	      int meio = (inicio + fim) / 2;
	      
	      /* Chama este m�todo recursivamente, indicando novas posi��es do
				  inicio e fim do vetor. */
	      mergeSortRecursivo(inicio, meio, vetor);
	      
	      /* Chama este m�todo recursivamente, indicando novas posi��es do
				  inicio e fim do vetor. */
	      mergeSortRecursivo(meio, fim, vetor);
	      
	      // Chama o m�todo que intercala os elementos do vetor.
	      intercala(vetor, inicio, meio, fim);
	    }
	  }

	  /**
	   * M�todo responsavel por intercalar os valores do vetor de forma ordenada.
	   * 
	   * @param vetor - Vetor que ter� seus valores ordenados.
	   * @param inicio - Posi��o inicial da ordena��o no vetor.
	   * @param meio  - Posi��o do meio da ordena��o no vetor.
	   * @param fim  - Posi��o final da ordena��o no vetor.
	   */
	  private static void intercala(int[] vetor, int inicio, int meio, int fim) {
	    /* Vetor utilizado para guardar os valors ordenados. */
	    int novoVetor[] = new int[fim - inicio];
	    /* Variavel utilizada para guardar a posicao do inicio do vetor. */
	    int i = inicio;
	    /* Variavel utilizada para guardar a posi��o do meio do vetor. */
	    int m = meio;
	    /* Variavel utilizada para guarda a posi��o onde os
	      valores ser�o inseridos no novo vetor. */
	    int pos = 0;
	    
	    /* Enquanto o inicio n�o chegar at� o meio do vetor, ou o meio do vetor
	      n�o chegar at� seu fim, compara os valores entre o inicio e o meio,
	      verificando em qual ordem vai guarda-los ordenado.*/
	    while(i < meio && m < fim) {
	      /* Se o vetor[i] for menor que o vetor[m], ent�o guarda o valor do
	        vetor[i] pois este � menor. */
	      if(vetor[i] <= vetor[m]) {
	        novoVetor[pos] = vetor[i];
	        pos = pos + 1;
	        i = i + 1;
	      // Sen�o guarda o valor do vetor[m] pois este � o menor.
	      } else {
	        novoVetor[pos] = vetor[m];
	        pos = pos + 1;
	        m = m + 1;
	      }
	    }
	    
	    // Adicionar no vetor os elementos que est�o entre o inicio e meio,
	    // que ainda n�o foram adicionados no vetor.
	    while(i < meio) {
	      novoVetor[pos] = vetor[i];
	      pos = pos + 1;
	      i = i + 1;
	    }
	    
	    // Adicionar no vetor os elementos que est�o entre o meio e o fim,
	    // que ainda n�o foram adicionados no vetor.
	    while(m < fim) {
	      novoVetor[pos] = vetor[m];
	      pos = pos + 1;
	      m = m + 1;
	    }
	    
	    // Coloca no vetor os valores j� ordenados.
	    for(pos = 0, i = inicio; i < fim; i++, pos++) {
	      vetor[i] = novoVetor[pos];
	    }
	  }


	public static void execute(int vetor[], int inicio, int fim) {
		int meio;
		if (inicio < fim) {
			meio = (inicio + fim) / 2;
			mergeSortRecursivo(inicio, meio,vetor);
			mergeSortRecursivo(meio+1, fim,vetor);
			intercala(vetor, inicio, meio, fim);
		}
	}

	public void run(int[] vetor) {
		iniciar();
		execute(vetor, 0, vetor.length - 1);
		finalizar();
		System.out.println("---- Merge Sort ---- \nTempo de Processamento: " + (finalDoTeste - inicioDoTeste)
				+ " milissegundos \n");

	}
}
