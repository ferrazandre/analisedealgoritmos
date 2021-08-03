package algoritmos;

import gerador.TempoDeExecucao;

public class QuickSort extends TempoDeExecucao {

	public void execute(int[] v, int i, int f) {
		iniciar();
		int n = (int) (Math.random() * ((f) - i + 1) + i);
		int pivo = v[n];
		int e = i;
		int d = f;
		while (e <= d) {
			while (e <= f && v[e] < pivo)
				e++;
			while (d >= i && v[d] > pivo)
				d--;
			if (e <= d) {
				int aux = v[e];
				v[e] = v[d];
				v[d] = aux;
				e++;
				d--;
			}
		}
		if (e < f)
			execute(v, e, f);
		if (d > i)
			execute(v, i, d);
		finalizar();
	}

	public void run(int[] vetor) {
		execute(vetor, 0, vetor.length-1);

		System.out.println("---- Quik Sort ---- \nTempo de Processamento: " + (finalDoTeste - inicioDoTeste)
				+ " milissegundos \n");
	}

}
