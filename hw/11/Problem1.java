import java.util.Scanner;
public class Problem1{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int numberOfItem=input.nextInt();
        System.out.print("Enter the weights for each item: ");
        double [] weights=new double[numberOfItem];
        for (int i=0; i<numberOfItem;i++){
            weights[0]=input.nextDouble();
        }
        System.out.print("Enter the weight limit for the bag: ");
        double weightLimit=input.nextDouble();
        System.out.println("The maximu weight of the items placed in the bag is "+m(numberOfItem, weightLimit, weights));

    }
    
    public static double m(int i, double weightLimit, double[] w){
        int a=i-1;
        
        if(a<0){
            return 0;
        }
        else if(weightLimit<0){
            return 0;
        }
        else if(w[a]>weightLimit){
            return m(i-1, weightLimit, w);
        }
        else{
            return Double.max(m(i-1, weightLimit, w),w[a]+m(i-1, weightLimit-w[a], w));
        }
    } 
}