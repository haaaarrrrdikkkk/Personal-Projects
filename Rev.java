import java.util.Scanner;
class Rev{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String s= in.nextLine();

        int length =s.length();

        for(int i = 0; i<= length-1; i++){
            char ch= s.charAt(i);
            System.out.println("Reversed word :"+ch);
            
        }
        in.close();
    }
}