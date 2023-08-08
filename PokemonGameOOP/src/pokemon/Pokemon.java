package pokemon;

import java.util.Scanner;

public class Pokemon {
		// Attributes
		private static final int CONTINUE = 1;
		private static final int SWITCH = 3;
		private static final int ESCAPE = 2;
		private PokemonType type;
		private int health;
		private int attackPower;
		private String attackSkill = Integer.toString(attackPower);
		private int level;
		private PokemonType weakness;
		private String name;
		

		public PokemonType getType() {
			return type;
		}

		public void setType(PokemonType typ) {
			this.type = typ;
		}

		// Constructor
		public Pokemon(int health) {
			this.health = health;
		}

		//Getter and Setter
		public int getHealth() {
			return health;
		}

		public void setHealth(int health) {
			this.health = health;
		}

		public String getAttackSkill() {
			return attackSkill;
		}

		public void setAttackSkill(String attackSkill) {
			this.attackSkill = attackSkill;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int lvl) {
			this.level = lvl;
		}

		public PokemonType getWeakness() {
			return weakness;
		}

		public void setWeakness(PokemonType weakness) {
			this.weakness = weakness;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAttackPower() {
			return attackPower;
		}

		public void setAttackPower(int ap) {
			this.attackPower = ap;
		}


		//Methods
		public void fight(Bisasam bisasam, Glumanda glumanda, Shiggy shiggy, Person person) {
			Scanner sc = new Scanner(System.in);
			int decide;
			int damagedHealthOfGlumanda;
			int damagedHealthOfBisasam;
			System.out.println("Du hast Pokemon: " + bisasam.getName() + " " + "ausgewaehlt!");
			do {
				System.out.println(bisasam.getName() + " " + "setzt" + " " + bisasam.getAttackSkill() + " " + "ein");
				damagedHealthOfGlumanda = glumanda.getHealth() - bisasam.getAttackPower();
				glumanda.setHealth(damagedHealthOfGlumanda);
				System.out.println(glumanda.getName() + " seine HP betragen: " + glumanda.getHealth());

				if (glumanda.getHealth() < 100 && glumanda.getHealth() > 0) {
					System.out.println(glumanda.getName() + " " + "setzt" + " " + glumanda.getAttackSkill() + " " + "ein");
					damagedHealthOfBisasam = bisasam.getHealth() - glumanda.getAttackPower();
					if (bisasam.getWeakness() == glumanda.getType()) {
					damagedHealthOfBisasam = bisasam.getHealth() - glumanda.getAttackPower() * 2;
					}
					bisasam.setHealth(damagedHealthOfBisasam);
					
					System.out.println(bisasam.getName() + " seine HP betragen: " + bisasam.getHealth());
				}

				

				if (bisasam.getHealth() <= 0) {
					int newLvl = glumanda.getLevel() + 1;
					glumanda.setLevel(newLvl);
					System.out.println(glumanda.getName() + " " + "ist jetzt auf lvl" + " " + glumanda.getLevel());
				}

				System.out.println("1 Weiter / 2 Flucht / Wechsel = 3");
				decide = sc.nextInt();

			} while (bisasam.getHealth() > 0 && glumanda.getHealth() > 0 && decide == CONTINUE);

			while (bisasam.getHealth() <= 0 && decide == CONTINUE) {
				
				System.out.println("Dein Pokemon kann nicht weiterkaempfen! Wechsel = 3 / Flucht = 2");
				decide = sc.nextInt();

				
			}
			while (decide == SWITCH && glumanda.getHealth() <= 0) {
				System.out.println("Du kannst nicht wechseln, weil du keinen Gegner mehr hast. Spiel Ende.");
				decide = sc.nextInt();
			}
			if (decide == ESCAPE) {
				System.out.println("Fluch wird ergriffen!");
				Pokedex.pokedexMethod(person, bisasam, shiggy);
				System.out.println("Spiel Ende");
				System.exit(0);
			
			} 
			else if (decide == SWITCH && glumanda.getHealth() <= 0) {
				System.out.println("Du kannst nicht wechseln, weil du keinen Gegner mehr hast. Spiel Ende.");
				System.exit(0);
			} 
			else if (decide == SWITCH && bisasam.getHealth() > 0 || bisasam.getHealth() <= 0) {
				fight(shiggy, glumanda, bisasam, person);
			}

			else {
				System.out.println("Error. Falsche Eingabe.");
				System.exit(0);
			}

		}

		public void fight(Shiggy shiggy, Glumanda glumanda, Bisasam bisasam, Person person) {
			Scanner sc = new Scanner(System.in);
			int decide;
			int damagedHealthOfGlumanda = glumanda.getHealth();
			int damagedHealthOfShiggy;
			System.out.println("Du hast Pokemon: " + shiggy.getName() + " " + "ausgewaehlt!");
			do {
				System.out.println(shiggy.getName() + " " + "setzt" + " " + shiggy.getAttackSkill() + " " + "ein");
				damagedHealthOfGlumanda = glumanda.getHealth() - shiggy.getAttackPower();
				if (glumanda.getWeakness() == shiggy.getType()) {
					damagedHealthOfGlumanda = glumanda.getHealth() - shiggy.getAttackPower() * 2;
				}
				glumanda.setHealth(damagedHealthOfGlumanda);
				System.out.println(glumanda.getName() + " seine HP betragen: " + glumanda.getHealth());

				if (glumanda.getHealth() <= 0) {
					int newLvl = shiggy.getLevel() + 1;
					shiggy.setLevel(newLvl);
					System.out.println(shiggy.getName() + " " + "ist jetzt auf lvl" + " " + shiggy.getLevel());
				}
				if (glumanda.getHealth() < 100 && glumanda.getHealth() > 0) {
					System.out.println(glumanda.getName() + " " + "setzt" + " " + glumanda.getAttackSkill() + " " + "ein");
				}

				damagedHealthOfShiggy = shiggy.getHealth() - glumanda.getAttackPower();

				shiggy.setHealth(damagedHealthOfShiggy);
				System.out.println(shiggy.getName() + " seine HP betragen: " + shiggy.getHealth());

				System.out.println("1 Weiter / 2 Flucht / 3 Wechsel");
				decide = sc.nextInt();

			} while (glumanda.getHealth() > 0 && decide == CONTINUE);

			while (glumanda.getHealth() <= 0 && decide == CONTINUE) {
			
				System.out.println("Dein Pokemon kann nicht weiterkaempfen! Wechsel = 3 / Flucht = 2");
				decide = sc.nextInt();

			
			}
			if (decide == ESCAPE) {
				System.out.println("Fluch wird ergriffen!");
				Pokedex.pokedexMethod(person, bisasam, shiggy);
				System.out.println("Spiel Ende");
				System.exit(0);
				

			} 
			else if (decide == SWITCH && glumanda.getHealth() <= 0) {
				System.out.println("Du kannst nicht wechseln, weil du keinen Gegner mehr hast. Spiel Ende.");
				
				System.exit(0);
			} 
			else if (decide == SWITCH && glumanda.getHealth() > 0) {
					fight(bisasam, glumanda, shiggy, person);
			} 
			else {
				System.out.println("Error. Falsche Eingabe.");
				System.exit(0);
			}

		}

		

		public void givePokemonToPerson(Person person, Bisasam bisasam, Glumanda glumanda, Shiggy shiggy) throws WrongPokemonException {

			System.out.println("Hallo: " + person.getName() + " " + "aus" + " " + person.getCity() + ", dein Alter ist: " + person.getAge());
			System.out.println("Dein Pokemon ist: " + this.getName());
			person.setMyPokemon(this);
			System.out.println("Diese Daten sind uns bekannt:");
			System.out.println("attackpower: " + this.attackPower);
			System.out.println("attackskill: " + this.attackSkill);
			System.out.println("health: " + this.health);
			System.out.println("level: " + this.level);
			System.out.println("name: " + this.name);
			System.out.println("type: " + this.type);
			System.out.println("weakness: " + this.weakness);
		
			if (this instanceof Bisasam) {
				this.fight(bisasam, glumanda, shiggy, person);
			} 
			else if (this instanceof Shiggy) {
				this.fight(shiggy, glumanda, bisasam, person);
			} 
			else {
				throw new WrongPokemonException("Falsches Pokemon ausgewaehlt. Versuchen Sie es nochmal.");
			}
			System.exit(0);
		}

}
