import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Total Bill:");
        int total = scan.nextInt();
        System.out.println("Tip Percentage:");
        double tipPercent = scan.nextDouble();
        System.out.println("Number of People:");
        int peopleNum = scan.nextInt();

        double tip = tipPercent / 100;
        double tipAmount = total * tip;
        double finalTotal = (tipAmount * peopleNum) + total;

        System.out.println("Final Total:" + finalTotal);

    }


    }
