import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Problem2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of weights: ");
        int number=input.nextInt();
        Integer [] weights=new Integer[number];
        System.out.println("Please enter the weights: ");
        for(int i=0;i<weights.length;i++){
            // get the weights
            weights[i]=Integer.valueOf(input.nextInt());
        }
        ArrayList<Integer> result=containers(weights);// get the container
        for(int i=0; i<weights.length/2;i++){
            System.out.println(" Container " +i+1+" contains" 
            +" objects with weights "+ result.get(i)+" "+result.get(i+1));
        }
    }
    public static ArrayList<Integer> containers( Integer[]B){
        Arrays.sort(B);// sort the array in from the largest to smallest
        ArrayList<Integer> outer =new ArrayList<>(); // the arraylist to be returned
        ArrayList<String> verifier=new ArrayList<>(); // the arraylist that verifies the other weight of the container
        ArrayList<Integer> modifier = new Arraylist<>(Arrays.asList(B)); // convertion of the sorted array into the array list
        for(int i=0;i<B.length;i++){
            // making an arraylist from the arra
            verifier.add(String.valueOf(B[i]));
        }
        for(int j=0;j<B.length;j++){
            Integer element=10-modifier.get(j);// get the other weight of the container
            if(verifier.contains(String.valueOf(element))&& !outer.contains(String.valueOf(element))){
                // checker if the other weight is in the arraylist and if it is not already used in the arraylist to be returned
                outer.add(modifier.get(j));
                // add the first weight to the array list
                outer.add(element);
                //add the other weight
        }

    }
}
}