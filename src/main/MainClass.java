package main;

public class MainClass {

	public static void main(String[] args) {

		int n = 200;

		int counter = 0;

		while (counter < n) {
			
			if (counter % 2 == 0) {
				System.out.print(counter+" is even nummber\n");
			}else{
				System.out.print(counter+" is odd nummber\n");
			}

			counter = counter + 1;
		}

	}
}
