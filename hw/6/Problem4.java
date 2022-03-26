import java.util.Scanner;
import java.util.Arrays;
public class Problem4{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        double [][] matrice=new double [2][2]; // the matrix to be computed the inverse from
        System.out.println("Enther a,b,c,d: ");
        for(int k=0; k<matrice.length; k++){ // getting inputs
            for(int a=0; a<matrice.length; a++){
                matrice[k][a]=input.nextDouble();
            }
        }
        String matrix=Arrays.deepToString(inverse(matrice)); // turning the inversed matrix into a string
        if(matrix=="null"){
            System.out.println("No inverse matrix");
        }
        else{
            System.out.println(matrix);
        }
    }
    public static double[][] inverse(double [][]A){
        double[][] result=new double [A.length][A.length]; // the matrix that will result in the inverse
        result[0][0]=A[1][1]; // transformation of the input matrix into its symmetric of the 
        result[0][1]=-A[0][1];
        result[1][0]=-A[1][0];
        result[1][1]=A[0][0];
        double descriminant=(A[0][0]*A[1][1])-(A[0][1]*A[1][0]); // the value that determines the existance of the inverse of the input matrix
        if (descriminant==0){
            return null;
        }
        else{
            for(int i=0; i<A.length; i++){
                for (int j=0; j<A.length; j++){
                    result[i][j]=result[i][j]/descriminant; // filling in the inverse matrix
                }
            }
            return result;
        }
    }
} 