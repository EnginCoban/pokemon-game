package pokemon;

public class MainProgram {

	public static void main(String[] args) {
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
