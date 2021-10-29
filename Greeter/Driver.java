import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    	while(true) {
            System.out.println("Name: ");
            String a = scanner.next();
            System.out.println("Output: ");
            System.out.println(Greeter.greet(a));
        }
    }

}