public class PhnNumber {
    public static void main(String args[]){
        char[][] phone = {{'1','2','3'},
            {'4','5','6'},
            {'7','8','9'},
            {'*','0','#'}};

        for(char[] row:phone){
            for (char number:row){
                System.out.print(number+"  ");
            }
            System.out.println();
        }
    }
}
