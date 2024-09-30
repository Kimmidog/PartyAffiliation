import java.util.Scanner;

public class Main {
//code is coding
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // create a Scanner in to read from the console
        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String input = in.nextLine().trim().toUpperCase(); // read input and convert to uppercase

        if (input.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (input.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (input.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }

        in.close();
    }
}
