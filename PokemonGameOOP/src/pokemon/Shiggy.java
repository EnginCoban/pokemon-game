package pokemon;

public class Shiggy extends Pokemon {
		//Constructor
		public Shiggy(int health) {
			super(health);
			this.setName("Shiggy");
			this.setAttackSkill("Aquaknarre");
			this.setAttackPower(25);
			this.setLevel(10);
			this.setWeakness(PokemonType.PLANT);
			this.setType(PokemonType.WATER);
		}
		
		//Method
		@Override
		public String toString() {
			return "Der Name ist: " + this.getName() + ", der Attackskill ist: " + this.getAttackSkill() + ", die Attackpower ist: " + this.getAttackPower() + ", der Level ist: " + this.getLevel() + ", die Schwaeche ist: " + this.getWeakness() + ", der Typ ist: " + this.getType();
			
		}
}
