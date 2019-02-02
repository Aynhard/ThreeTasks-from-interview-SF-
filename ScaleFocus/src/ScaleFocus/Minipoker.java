package ScaleFocus;

import java.util.Arrays;
import java.util.Scanner;

public class Minipoker {

			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				int[] numbers = new int[5];
				boolean checkNumber = false;
				boolean notConsecutive = false;
				do {
					checkNumber = false;
					for(int i=0;i<numbers.length;i++) {
						numbers[i]=s.nextInt();
					}
				
						for (int i = 0; i < numbers.length; i++) {
							
							if (numbers[i] < 1 || numbers[i] > 13) {
								checkNumber = true;
							}
						}
				} while (checkNumber);
				Arrays.sort(numbers);
				for (int i = 0; i < numbers.length - 1; i++) {
					if (numbers[i] + 1 != numbers[i + 1]) {
						notConsecutive = true;
						break;
					}
				}
				if (!notConsecutive) {
					for (int i = 0; i < numbers.length; i++) {
						System.out.print(numbers[i] + " ");
					}
				} else {
					System.out.print(numbers[4]);
				}
			}
}
