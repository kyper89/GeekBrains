package training;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int counter, guess, number;
		do {
			counter = 0;
			guess = -1; 
			number = random.nextInt(11);
			while (counter < 5 && guess != number) {
				System.out.print("Guess the number 0...10: ");
				guess = scanner.nextInt();
				if (guess != number) {
					System.out.println("Your number is " + (guess < number? "less" : "greater"));
					counter++;
				}
			}
			System.out.println("Your " + (guess == number? "WON!" : "lose - " + number));
			System.out.print("Repeat? yes - 1, no - 0: ");
		}	while (scanner.nextInt() == 1); 
	}
}