
public class vaargs {
    public static void main(String[] args){
        System.out.println(average(1,2,3,4,5,6,7,8,9));
    }
    static double average(double... numbers){
        double sum = 0;
        if(numbers.length == 0){
            System.out.println("Array is empty");
            return 0;
        }
        for (double num : numbers){
           sum+=num;
        }
        return sum/numbers.length;
    }
}
