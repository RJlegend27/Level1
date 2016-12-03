
public class HandySmurf {
	/* 
	 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 * 
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
	 * 6. Make a Smurfette and print her name, hat color and girl or boy. */
public static void main(String[] args) {
	 
	Smurf Bobby = new Smurf("Handy");
	Smurf Papa = new Smurf("Papa");
	Smurf Smurfette = new Smurf("Smurfette");
	

	System.out.println(Bobby.getName()); 
	System.out.println(Bobby.getHatColor());
	System.out.println(Bobby.isGirlOrBoy());
	Bobby.eat();
	System.out.println(Papa.getName()); 
	System.out.println(Papa.getHatColor());
	System.out.println(Papa.isGirlOrBoy());
	Papa.eat();
	System.out.println(Smurfette.getName()); 
	System.out.println(Smurfette.getHatColor());
	System.out.println(Smurfette.isGirlOrBoy());
	Smurfette.eat();
	
}

}