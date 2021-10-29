import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	while(true) {
            System.out.println("Number 1: ");
            int a = scanner.nextInt();
            System.out.println("Number 2: ");
            int b = scanner.nextInt();
            System.out.println("Would you like to add (0) or subtract(1): ");
            int c = scanner.nextInt();

            System.out.println("Answer: ");
            if(c == 0)
                System.out.println(Calculator.add(a, b));
            else if(c == 1)
                System.out.println(Calculator.sub(a, b));
        }
    }

}
