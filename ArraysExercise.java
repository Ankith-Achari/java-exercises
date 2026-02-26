
import java.util.Scanner;

public class ArraysExercise {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;
        System.out.print("Enter # of Foods: ");
        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];
        for (int i = 0;i< foods.length;i++){
            System.out.print("Enter the food: ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("The array of foods are:");
        for(String food : foods){
            System.out.print(food+" ");
        }
    }
}
