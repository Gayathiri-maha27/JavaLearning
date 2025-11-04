package Day2;

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter company name: ");
        String company1 = sc.nextLine();
        System.out.print("Enter location: ");
        String location1 = sc.nextLine();
        System.out.println(company1 + " Technologies " + location1);

        System.out.println();


        System.out.print("Enter company name: ");
        String company2 = sc.nextLine();
        System.out.print("Enter location: ");
        String location2 = sc.nextLine();
        System.out.println(company2 + " Technologies " + location2);

        sc.close();
    }

}

