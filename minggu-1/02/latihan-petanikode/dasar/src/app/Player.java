package app;

public class Player {
	String name;
	int speed;
	int healthPoin;
	
	void run(){
	System.out.println(name + " sedang berlari...");
	System.out.println("Kecepatan lari: " + speed);
	}
	
	boolean isDead(){
	if (healthPoin <= 25) return true;
	return false;
	}
	
}