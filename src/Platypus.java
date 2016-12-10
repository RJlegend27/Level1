
	public class Platypus {
		private String name;
		Platypus(String x){
			name = x;
		}
		
		void sayHi(){
			System.out.println("The platypus " + name + " is smarter than your average platypus.");
		}
		
		public static void main(String[] args) {
			//1. Make an instance of your new pet platypus
			Platypus plat = new Platypus("plate");
			Platypus platt = new Platypus("platte");
			Platypus plattt = new Platypus("plattte");
			//2. Call the sayHi method
			plat.sayHi();
			platt.sayHi();
			plattt.sayHi();
			//3. Create a constructor in the platypus class so that you can give your platypus a name.
			
		}
	}



