package pokemon;

public class Glumanda extends Pokemon {
	//Constructor
		public Glumanda(int health) {
			super(health);
			this.setName("Glumanda");
			this.setAttackSkill("Glut");
			this.setAttackPower(25);
			this.setLevel(7);
			this.setWeakness(PokemonType.WATER);
			this.setType(PokemonType.FIRE);
			
		}
}
