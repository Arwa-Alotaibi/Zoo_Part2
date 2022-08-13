package zoo_part2;


public class BatTest {

	public static void main(String[] args) {
		Bat a = new Bat();
		a.displayEnergy();
		a.attackTown();
		a.attackTown();
		a.attackTown();
		a.eatHumans();
		a.eatHumans();
		a.fly();
		a.fly();
		a.displayEnergy();
		System.out.println("--b--");
		Bat b = new Bat();
		b.displayEnergy();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		b.displayEnergy();

	}

}

