import javax.sound.midi.Soundbank;

public class App {

	public static void wypisz(int tablica[][]) {
		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				System.out.print(tablica[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

	}

	public static void main(String[] args) {
		int n = 2;
		int tablica[][] = new int[n][n * 2];

		for (int i = 0; i < tablica.length; i++) {
			for (int j = 0; j < tablica[i].length; j++) {
				tablica[i][j] = (int) (Math.random() * 20 - 10);
			}
		}
		wypisz(tablica);
		
		int max = -11;
		
		for (int i = 0; i< tablica.length; i++) {
			for(int j = i+1; j<tablica[i].length; j++) {
				if(max<tablica[i][j]) {
					max = tablica[i][j];
				}
			}
		}
		System.out.println(max);
		
		int[] wystopieniaWKolumnie= new int[n*2];
		
		for(int i =0; i<tablica.length; i++) {
			for(int j = 0; j<tablica[i].length; j++) {
				if(tablica[i][j]==max) {
					wystopieniaWKolumnie[j]++;
				}
			}
		}
		
		for(int i = 0; i<wystopieniaWKolumnie.length; i++) {
			if(wystopieniaWKolumnie[i] > 0) {
				System.out.println(i);
			}
		}
		
		

	}

}
