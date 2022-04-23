import java.util.Scanner;
import java.util.Random;
public class Problem1{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    System.out.println("Enter the index of the element you want to access: ");
    int index=input.nextInt(); // the index of the number to be printed
    boolean checker=true; // the condiction that prompts the user to keep trying until the valid input is put
    while(checker){
        try{
            randomGenerator(index);
            checker=false; // exist the loop if there is no exception
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Out of bounds"); // the string to be printed  if an exception is caught
            System.out.println("\n Enter the index of the element you want to access: "); 
            index=input.nextInt(); // asking for the new index to try the code again during an exception
        }

    }
    }
    public static void randomGenerator(int index) throws IndexOutOfBoundsException{
        int [] numbers=new int[100];// the empty array that will contain the rundom numbers
        for (int i=0; i<numbers.length; i++){
            numbers[i]=new Random().nextInt(); // generating a hundred random integer 
        }
        if (index<=numbers.length){ // check if the idex is within the array 
            System.out.println(" the Random number at the index "+ index+ " is "+ numbers[index]);
        }
        else{
            //if the index is not within the array, throw exceptio
            throw new IndexOutOfBoundsException();
        }


    } 
}