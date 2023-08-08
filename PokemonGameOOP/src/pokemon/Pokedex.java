package pokemon;

import java.util.Scanner;

public class Pokedex {
		//Attributes
		private static final int YES = 1;
		private static final int NO = 0;
		private static final int SHIGGY = 1;
		private static final int BISASAM = 0;
		
		//Method
		public static void pokedexMethod(Person person,Bisasam bisasam, Shiggy shiggy) {
			System.out.println("Moechtest du de aktuellen Status deines Pokemons einsehen?");
			System.out.println("Ja 1 / Nein 0 ");
			Scanner sc = new Scanner(System.in);
			int decide;
			decide = sc.nextInt();
			if (decide == YES) {
				System.out.println("Welches Pokemon?: Shiggy 1 / Bisasam 2");
				decide = sc.nextInt();
				
				if (decide == SHIGGY) {
					person.setMyPokemon(shiggy);
					System.out.println(shiggy.toString());
				} 
				else if (decide == BISASAM) {
					person.setMyPokemon(bisasam);
					System.out.println(bisasam.toString());
				} 
				else {
					System.out.println("Falsche Eingabe. Programmabbruch.");
					System.exit(0);
				}
			}
			
			if (decide == NO) {
				System.out.println("Auf Wiedersehen! Programmende.");
				System.exit(0);
			}
			

		}
}
