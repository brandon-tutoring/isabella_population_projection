public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int birth = 1/7*60*60*24*365;
		int death = 1/13*60*60*24*365;
		int immigrant = 1/45*60*60*24*365;
		int current_pop = 312032486;
		for (int x = 0 ; x <= 4 ; x++) 
			System.out.println(current_pop + birth - death + immigrant);
	}
		}