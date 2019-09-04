package app;

public class Game {
	public static void main(String[] args){
	Player petani = new Player();
	
	petani.name = "Chrisdiono Gonzalez";
	petani.speed = 69;
	petani.healthPoin = 10;
	
	petani.run();
	
	if(petani.isDead()){
		System.out.println("GAME OVER!!");
		}
	}
}