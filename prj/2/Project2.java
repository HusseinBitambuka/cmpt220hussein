import java.util.Scanner;
public class Project2{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        long [] number= new long[10]; // the array of the number to be checked
        System.out.println("Enter the number ");
        for(int i=0;i<10;i++){
            number[i]=input.nextLong(); // the input of the number 
        }
        System.out.println(modulor(number)); // the output
    }
       
    public static int modulor(long[]A){
        // the method that checkes how often the numbers are modular 42
        String collector=""; // an empty string that collects the numbers that represent the reminders after doing  modular of 42
        for (int i=0; i< A.length;i++){
            long result=A[i]%42; // checking the modular arithmetic of 42
            String test=String.valueOf(result); // changing the long into a string
            if (collector.contains(test)==false){ // checking if the reminder is already in the string
                collector+=test; // appending the reminder if it's not part of the string
            }
        }
        int distinctNumber=collector.length(); // the number of the reminders obtained after the operation
        if(distinctNumber>1){
            return(distinctNumber-1);
        }
        else{
            return distinctNumber;
        } 
    }
}