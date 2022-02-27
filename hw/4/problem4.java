import java.util.Scanner;
public class problem4{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int userInput=input.nextInt();
        int factor=1;
        // JA: You should explain your logic here. I can't follow it.
        for(int i=2; i<=Math.sqrt(userInput); i++){
            if (userInput%i==0){
                userInput/=i;
                    factor*=i;
                    System.out.println(factor);
                while (userInput%i==0){
                    userInput/=i;
                    factor*=i;
                }
            }
        }
        System.out.println(factor);
        System.out.println(userInput);
      
    }
}