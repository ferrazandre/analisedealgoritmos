package main;

import algoritmos.BubbleSort;
import algoritmos.InsertionSort;
import algoritmos.MergeSort;
import algoritmos.QuickSort;
import algoritmos.SelectionSort;
import gerador.GeradorDeSequencias;

public class InicializarPrograma {

	private int[] vetor = null;
	int[] numeros = { 10, 100, 1000, 10000, 100000, 1000000 };
	private static BubbleSort bubbleSort = new BubbleSort();
	private static InsertionSort insertionSort = new InsertionSort();
	private static QuickSort quickSort = new QuickSort();
	private static SelectionSort selectionSort = new SelectionSort();
	private static MergeSort mergeSort = new MergeSort();

	/**
	 * Vetores ordenados com apenas uma checagem.
	 */
	public void vetoresOrdenados() {

		for (int i : numeros) {
			System.out
					.println("------------------------------------------------- \nTeste Vetor Ordernado Tamanho " + i);
			vetor = GeradorDeSequencias.geradorDeSequenciaOrdenadada(i);
			bubbleSort.run(vetor);
			insertionSort.run(vetor);
			quickSort.run(vetor);
			selectionSort.run(vetor);
			mergeSort.run(vetor);
		}
	}

	/**
	 * Vetores ordenados inversamente com apenas uma checagem.
	 */
	public void vetoresInversos() {
		for (int i : numeros) {
			System.out.println(
					"------------------------------------------------- \nTeste Vetor Ordernado Inversamente Tamanho "
							+ i);
			this.vetor = GeradorDeSequencias.geradorDeSequenciaInversa(10);
			bubbleSort.run(vetor);
			insertionSort.run(vetor);
			quickSort.run(vetor);
			selectionSort.run(vetor);
			mergeSort.run(vetor);
		}
	}

	/**
	 * Vetores quase ordenados com 14 checagens.
	 */
	public void vetoresQuaseOrdenados() {
		for (int i : numeros) {
			System.out.println(
					"------------------------------------------------- \nTeste Vetor Quase Ordernado Tamanho " + i);
			this.vetor = GeradorDeSequencias.geradorDeSequenciaQuaseOrdenada(i);
			bubbleSort.run(vetor);
			insertionSort.run(vetor);
			quickSort.run(vetor);
			selectionSort.run(vetor);
			mergeSort.run(vetor);
		}
	}

	/**
	 * Vetores ordenados aleatóriamente com 14 checagens.
	 */
	public void vetoresAleatorios() {
		for (int i : numeros) {
			System.out
					.println("------------------------------------------------- \nTeste Vetor Aleatório Tamanho " + i);
			vetor = GeradorDeSequencias.geradorDeSequenciaAleatoria(i);
			bubbleSort.run(vetor);
			insertionSort.run(vetor);
			quickSort.run(vetor);
			selectionSort.run(vetor);
			mergeSort.run(vetor);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		InicializarPrograma i = new InicializarPrograma();
		i.vetoresInversos();
	}

}
