public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birth = (60*60*24*365)/7;
		int death = (60*60*24*365)/13;
		int immigrant = (60*60*24*365)/45;
		int current_pop = 312032486;
		int population = (current_pop + birth - death + immigrant);
		System.out.println(population);
		for (int x = 0 ; x <= 3 ; x++){ 
			population = (birth - death + immigrant + population);
			System.out.println(population);

		}
	}
}