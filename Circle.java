import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        //Circumference = 2.0 * Math.PI * radius
        //Area = Math.PI * Math.pow(r,2)
        //Volume = (4.0 / 3.0) * Math.PI * Math.pow(radius,3)

        Scanner scanner = new Scanner(System.in);
        System.out.println("CIRCLE(Circumference,Area,Volume)\n");
        System.out.print("Enter the radius: ");
        double r = scanner.nextDouble();

        double C = 2.0 * Math.PI * r;
        double A = Math.PI * Math.pow(r,2);
       double V = (4.0 / 3.0) * Math.PI * Math.pow(r,3);

        System.out.printf("Circumference : %.1fcm\n",C);
        System.out.printf("Area : %.1fcm^2\n",A);
        System.out.printf("Volume : %.1fcm^3\n",V);

        scanner.close();
    }
}
