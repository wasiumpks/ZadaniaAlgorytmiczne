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
		
		
		for(int i = 0; i<tablica.length; i++) {
			for(int j = i; j<tablica[i].length; j++) {
				tablica[i][j] = j+1;
			}
		}
		
		for(int i = 0; i<tablica.length; i++) {
			for (int j = 0; j<i; j++) {
				tablica[i][j] = in.nextInt();
			}
		}
		wypisz(tablica);

		for (int i = 0; i<tablica.length; i++ ) {
			for(int j = 1; j<tablica.length; j++ ) {
				tablica[i][j] += tablica[i][0];
			}
		}
		wypisz(tablica);
	}

}
