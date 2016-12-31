

	public class petP {
		private String name;
		petP(String name){
			this.name = name;
		}
		void sayHi(){
			System.out.println("The platypus " + name + " is smarter than your average platypus.");
		}
		
		public static void main(String[] args) {
			//1. Make an instance of your new pet platypus
			petP plat = new petP("K");
			petP platt = new petP("L");
			petP plattt = new petP("P");
			//2. Call the sayHi method
			plat.sayHi();
			platt.sayHi();
			plattt.sayHi();
			//3. Create a constructor in the platypus class so that you can give your platypus a name.
			
		}
	}



