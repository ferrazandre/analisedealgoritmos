package main;

import algoritmos.BubbleSort;
import algoritmos.InsertionSort;
import algoritmos.MergeSort;
import algoritmos.QuickSort;
import algoritmos.SelectionSort;
import gerador.GeradorDeSequencias;

public class InicializarPrograma {

	private int[] vetor1 = null;
	private int[] vetor2 = null;
	private int[] vetor3 = null;
	private int[] vetor4 = null;
	private int[] vetor5 = null;
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
			this.vetor1 = GeradorDeSequencias.geradorDeSequenciaOrdenadada(i);
			vetor2 = vetor1.clone();
			vetor3 = vetor1.clone();
			vetor4 = vetor1.clone();
			vetor5 = vetor1.clone();
			bubbleSort.run(vetor1);
			insertionSort.run(vetor2);
			quickSort.run(vetor3);
			selectionSort.run(vetor4);
			mergeSort.run(vetor5);
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
			this.vetor1 = GeradorDeSequencias.geradorDeSequenciaInversa(i);
			vetor2 = vetor1.clone();
			vetor3 = vetor1.clone();
			vetor4 = vetor1.clone();
			vetor5 = vetor1.clone();
			bubbleSort.run(vetor1);
			insertionSort.run(vetor2);
			quickSort.run(vetor3);
			selectionSort.run(vetor4);
			mergeSort.run(vetor5);
		}
	}

	/**
	 * Vetores quase ordenados com 14 checagens.
	 */
	public void vetoresQuaseOrdenados() {
		for (int i : numeros) {
			System.out.println(
					"------------------------------------------------- \nTeste Vetor Quase Ordernado Tamanho " + i);
			this.vetor1 = GeradorDeSequencias.geradorDeSequenciaQuaseOrdenada(i);
			vetor2 = vetor1.clone();
			vetor3 = vetor1.clone();
			vetor4 = vetor1.clone();
			vetor5 = vetor1.clone();
			bubbleSort.run(vetor1);
			insertionSort.run(vetor2);
			quickSort.run(vetor3);
			selectionSort.run(vetor4);
			mergeSort.run(vetor5);
		}
	}

	/**
	 * Vetores ordenados aleatóriamente com 14 checagens.
	 */
	public void vetoresAleatorios() {
		for (int i : numeros) {
			System.out
					.println("------------------------------------------------- \nTeste Vetor Aleatório Tamanho " + i);
			this.vetor1 = GeradorDeSequencias.geradorDeSequenciaAleatoria(i);
			vetor2 = vetor1.clone();
			vetor3 = vetor1.clone();
			vetor4 = vetor1.clone();
			vetor5 = vetor1.clone();
			bubbleSort.run(vetor1);
			insertionSort.run(vetor2);
			quickSort.run(vetor3);
			selectionSort.run(vetor4);
			mergeSort.run(vetor5);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		InicializarPrograma i = new InicializarPrograma();
		i.vetoresOrdenados();
		i.vetoresInversos();
		for (int n = 0; n < 14; n++) {
			System.out.println("---------- " + (n + 1) + " ----------");
			i.vetoresQuaseOrdenados();
		} 
		for (int n = 0; n < 14; n++) {
			System.out.println("---------- " + (n + 1) + " ----------");
			i.vetoresAleatorios();
		}
	}

}
