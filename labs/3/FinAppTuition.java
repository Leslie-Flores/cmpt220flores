// Leslie Flores
// February 22nd, 2017
// Financial app for tuition after 10 years

public class FinAppTuition {
	public static void main(String[] args) {
		int total = 0, tuition = 10000, tuition10 = 0;

		for (int year = 1; year <= 14; year++){
			tuition += (tuition * 0.05);  
			if (year > 10){
				total += tuition;
			}
			if (year == 10){
			    tuition10 = tuition;
			}			
        }	
		System.out.println("Tuition in ten years: $" + tuition10);
		System.out.println("Total cost for four years after the tenth year: $" + total);
	}
}