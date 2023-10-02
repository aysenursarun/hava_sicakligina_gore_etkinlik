package hava_sicakligina_göre_etkinlik_önerme;

import java.util.Scanner;

public class hava_sicakligina_göre_etkinlik_önerme {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Hava sıcaklığını girin: ");
		int sicaklik = scan.nextInt();

		if (sicaklik < 5) {
			System.out.println("Kayak yapabilirsiniz.");
		} 
		
		else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
		}
		
		else if (sicaklik >=15 && sicaklik <=25 ) {
			System.out.println("Pikniğe gidebilirsiniz.");
		} 
		
		else {
			System.out.println("Yüzmeye gidebilirsiniz.");
			
		}
	}

}
