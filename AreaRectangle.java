import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double height=0,width=0,area;
        System.out.print("Enter the height:");
        height = in.nextDouble();
        System.out.print("Enter the width:");
        width = in.nextDouble();
        area = height * width;
        System.out.println("Area : "+area+"cm^2");
        in.close();

    }
}

