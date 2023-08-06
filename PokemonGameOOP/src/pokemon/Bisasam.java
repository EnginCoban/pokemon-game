package pokemon;

public class Bisasam extends Pokemon {
	//Constructor
		public Bisasam(int health) {
			super(health);
			this.setName("Bisasam");
			this.setAttackSkill("Rasierblatt");
			this.setAttackPower(25);
			this.setLevel(5);
			this.setWeakness(PokemonType.FIRE);
			this.setType(PokemonType.PLANT);
			
			}
		
		//Method
		@Override
		public String toString() {
			return "Der Name ist: " + this.getName() + ", der Attackskill ist: " + this.getAttackSkill() + ", die Attackpower ist: " + this.getAttackPower() + ", der Level ist: " + this.getLevel() + ", die Schwaeche ist: " + this.getWeakness() + ", der Typ ist: " + this.getType();
			
		}
}
