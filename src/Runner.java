import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Soda Sorter");
		Random rand = new Random();
		Soda[] sod = new Soda[24];
		for (int i = 0; i < sod.length; i++) {
			sod[i] = new Soda(rand.nextInt(21));
		}
		Sorter sort = new Sorter(sod);
		sort.sortSodas();
		System.out.println(sort);

	}

}
