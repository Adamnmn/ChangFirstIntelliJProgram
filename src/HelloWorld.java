import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What Is The Total Bill:");
        int total = scan.nextInt();
        System.out.println("What Is The Tip Percentage:");
        double tipPercent = scan.nextDouble();
        System.out.println("What Is The Number of People:");
        int peopleNum = scan.nextInt();

        double tip = tipPercent / 100;
        double tipAmount = total * tip;
        double finalTotal = (tipAmount * peopleNum) + total;
        double totalPerPerson =  (tipAmount+total)/peopleNum;
        double totalTip = (tipAmount*peopleNum);


        System.out.println("Total Tip:" + totalTip );
        System.out.println("Tip Per Person:" + tipAmount);
        System.out.println("Total Per Person:" + totalPerPerson);
        System.out.println("Final Total:" + finalTotal);




    }


    }
