package app;
import java.util.Scanner;

public class Main {
    private static final double KMS_IN_MILE = 1.60934;

    public static void main(String[] args) {
        System.out.println("My SSH application..");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number in miles: ");
        double miles = scanner.nextDouble();
        System.out.println("Kilometers: " + " " + milesToKmsConverter(miles));
        scanner.close();
    }

    private static double milesToKmsConverter(double miles) {
        return miles * KMS_IN_MILE;

    }
}
