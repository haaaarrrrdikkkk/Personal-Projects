/*/import java.util.Scanner;
class RemDi{
    public static void main(String[] args){

    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the string: ");
    String word = in.nextLine();

    String result="";
    for(int i=0; i<word.length();i++)
    {
        char ch = word.charAt(i);

        for(int j = 0 ; j<=9 ; j++){
            if(ch == j){
                result = result + ch;
            }
        }
    }

    System.out.println("String without Digits: "+ result);
    in.close();
      

 }
}
/*/ 
import java.util.Scanner;
class RemDig{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String word = in.nextLine();

        String result ="";

        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isDigit(ch));
            result += ch;

             System.out.println("The final string without digits = "+ result);
        }
        
        in.close();

    }
}

       

    

        
    
