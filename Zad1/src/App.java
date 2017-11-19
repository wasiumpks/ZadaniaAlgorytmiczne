import java.util.Scanner;

public class App {

	private static Scanner in;

	public static void wypisz(int tablica[][]) {
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				System.out.print(tablica[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public static void wypisz(int tablica[]) {
		for (int i = 0; i < tablica.length; i++) {
			System.out.print(tablica[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int size = 0;
		in = new Scanner(System.in);
		size = in.nextInt();
		int[][] tablica = new int[size][size];

		wypisz(tablica);

		for (int i = 0; i < tablica.length; i++) {
			tablica[i][0] = i;
		}
		wypisz(tablica);
		for (int i = 0; i < tablica[0].length; i++) {
			tablica[0][i] = i;

		}
		wypisz(tablica);

		for (int i = 1; i < tablica.length; i++) {
			for (int j = 1; j < tablica[i].length; j++) {
				int a = tablica[i - 1][j];
				int b = tablica[i][j - 1];
				int c = Math.abs(a - b) % 20;
				tablica[i][j] = c;
			}
		}
		wypisz(tablica);

		int[] liczbaWystapien = new int[19];

		for (int i = 0; i < tablica.length; i++) {
			for (int j = i + 1; j < tablica[i].length; j++) {
				int liczbaWTbalicy = tablica[i][j];
				liczbaWystapien[liczbaWTbalicy]++;
			}
		}
		wypisz(liczbaWystapien);
	}

}
