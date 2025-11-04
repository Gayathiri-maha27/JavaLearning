package Day2.HW.E6;

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values (separated by space): ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("No values");
        } else {
            System.out.println(input.replace(" ", ","));
        }
    }

}
