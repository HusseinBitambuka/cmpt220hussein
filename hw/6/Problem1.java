import java.util.Random;
public class Problem1{
    public static void main(String [] args){
        int[] randNumber=new int[10]; // the array of random numbers
        int[] countingArr=new int[10]; // the counting array
        Random generator= new Random(); // the generator of random numbers
        int tracker=1;
        for(int i=0;i<10;i++){ // the process of generating random numbers
            randNumber[i]=generator.nextInt(9); 
            countingArr[i]=tracker;
            tracker++;
        }
        for (int j=0; j<10;j++){ // the process of displaying the number
            System.out.println(randNumber[j]+ " is the "+countingArr[j]+"s number to be generated");
        }
    }
}