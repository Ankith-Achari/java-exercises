import java.util.Scanner;

public class Quizz {
    public static void main(String[] args){
        //Welcome message
        System.out.println("*************************");
        System.out.println(" WELCOME TO QUIZ SESSION");
        System.out.println("*************************");

        //Questions
        String [] question = {"(1) Which is the largest planet in our Solar System?",
                              "(2) Who is known as the Father of the Indian Constitution?",
                              "(3) What is the capital city of Australia?",
                              "(4) Which river is the longest in the world?",
                              "(5) Which element has the chemical symbol ‘Au’?"};

        String[][] options = {{"1. Earth", "2. Saturn", "3. Jupiter", "4. Mars"},
                {"1. Mahatma Gandhi","2. Jawaharlal Nehru","3. Sardar Vallabhbhai Patel.","4. Dr. B. R. Ambedkar"},
                {"1. Sydney","2. Melbourne","3. Canberra","4. Perth"},
                {"1. Amazon Rive","2. Nile River ","3. Yangtze River","4. Mississippi River"},
                {"1. Silver","2. Gold","3. Copper","4. Aluminium"}};

        //answers
        int[] answer = {3,4,3,2,2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        for(int i=0 ; i<question.length;i++){
            System.out.println(question[i]+"\n");
            for(String option : options[i]){
                System.out.println(option);

            }
            System.out.print("\nEnter your choice: ");
            guess = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("***********");
                System.out.println("... CORRECT ....");
                System.out.println("***********");
                score++;
            }
            else {
                System.out.println("***********");
                System.out.println("... WRONG ....");
                System.out.println("***********");
                System.out.println("Correct answer was "+answer[i]);
                System.out.println();
            }
        }
        System.out.println("You Scored "+score+" out of "+question.length);
        System.out.println("Thank You!!!!");

        scanner.close();

    }
}
