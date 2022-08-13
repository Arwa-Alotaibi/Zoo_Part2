package zoo_part2;


	public class Bat  extends Mammal{
		
		
		public void fly() {
			energyLevel = energyLevel -50 ;
			System.out.println("sound a bat taking off"+":"+energyLevel);	
		}
		
		public void eatHumans() {
			energyLevel = energyLevel + 25 ;
			System.out.println(" so- well, never mind, just increase its energy by"+":"+energyLevel);

		}
		public void attackTown() {
			energyLevel = energyLevel - 100;
			System.out.println("sound of a town on fire and decrease its energy by"+":"+energyLevel);


		}
		}


