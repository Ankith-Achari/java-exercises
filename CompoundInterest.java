import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double principal,rate,amount;
        int timesCompound,years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest(in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompound = scanner.nextInt();

        System.out.print("Enter the # of year: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1+rate/timesCompound , years*timesCompound);

        System.out.printf("Amount to pay for %d years is Rs %.2f",years,amount);

        scanner.close();
    }
}
