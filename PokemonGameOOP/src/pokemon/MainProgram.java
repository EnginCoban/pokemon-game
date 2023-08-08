package pokemon;

public class MainProgram {

	public static void main(String[] args) {
		
		// initializing the health of every pokemon and the data of the person.
  		// by executing the try-catch block, it is checked if the given object is the right one.
		// If yes, the shown method is executed, which will lead to executing other methods till the program is over.
		// If no, an exception is caught which will display a message to the user.
		
		Bisasam bisasam = new Bisasam(100);
		Glumanda glumanda = new Glumanda(100);
		Shiggy shiggy = new Shiggy(100);
		Person person = new Person("Ash", "Alabastia", 21);

		try {
			bisasam.givePokemonToPerson(person, bisasam, glumanda, shiggy);
		} catch (WrongPokemonException e) {
			System.out.println(e.getMessage());

		}


	}

}
