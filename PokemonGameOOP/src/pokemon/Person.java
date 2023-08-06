package pokemon;

public class Person {
	//Attributes
		private String name;
		private String city;
		private int age;
		private Pokemon myPokemon;
		
		
		// Constructor
		public Person(String name, String city, int age) {
			
			this.name = name;
			this.city = city;
			this.age = age;
			
		}


		//Getter and Setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public Pokemon getMyPokemon() {
			return myPokemon;
		}

		public void setMyPokemon(Pokemon myPokemon) {
			this.myPokemon = myPokemon;
		}
}
