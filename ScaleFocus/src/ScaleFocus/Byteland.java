package ScaleFocus;

import java.util.Scanner;

public class Byteland {

	public static void main(String[] args) {
		System.out.println("You have to enter maximum 10 numbers !!!");
		Scanner s = new Scanner(System.in);
        int numbers = s.nextInt();
        int[] inputs = new int[numbers];
        int[] finalArray = new int[numbers];
        int amount = 0;

        if (numbers <= 10)
        {
            for (int i = 0; i < numbers; i++)
            {
                inputs[i] = s.nextInt();
                amount = (int)Math.floor(((double)inputs[i] / 2) + ((double)inputs[i] / 3) + ((double)inputs[i] / 4));
                finalArray[i] = amount;
            }
            for (int item: finalArray)
            {
                System.out.println(item);
            }          

            
        }
        else
        {
            System.out.println("You can write only 10 numbers!");
        }

	}

}
