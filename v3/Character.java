public class Character {
    
    protected String name;
    
    protected int health;
    
    protected int strength;
    
    protected int defense;
    
    protected double attack;

    public Character (String inputName) {
        name = inputName;
        health = 150;
	strength = 100;
	defense = 40;
	attack = .5;
    }

    public boolean isAlive() {
	return (health > 0);
    }

    public int getDefense() {
	return defense;
    }

    public String getName() {
	return name;
    }

    public void lowerHP (int damage) {
	health = health - damage;
    }

    public void attack (Character enemy) {
	enemy.lowerHP((int)(strength * attack) - enemy.getDefense());
    }
}
