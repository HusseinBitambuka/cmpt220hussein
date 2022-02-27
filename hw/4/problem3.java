import java.util.Scanner;

import javax.crypto.spec.GCMParameterSpec;
public class problem3{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a genome string: ");
        String genome=input.next(); // the genome 
        String startGenome="ATG"; // the sequence that starts a gene
        String endGenome1="TAG"; // the first sequence that ends a gene
        String endGenome2="TAA"; // the second sequence that ends a gene
        String endGenome3="TGA"; // the third sequence that ends a gene
        for (int i=0; i<=genome.length()-1;i++){
            if (!genome.contains(startGenome)){
                System.out.println("no gene is found");
                break;
            }
            else{
                int positionStartGenome=genome.indexOf(startGenome); // the position of the sequence that starts the gene
                String startGene=genome.substring(positionStartGenome+3, genome.length()-1); // a gene that has yet to have an end
                String incompleGene=genome.substring(positionStartGenome+3, genome.length()); // a statement to be printed out in case of incomplete gene
                if (startGene.contains(endGenome1)){
                    int endGene1=startGene.indexOf(endGenome1); // the position of the first sequence that ends a gene
                    String gene= startGene.substring(0, endGene1); // the gene
                    System.out.println(gene);
                }
                else if (startGene.contains(endGenome2)){
                    int endGene2=startGene.indexOf(endGenome2); // the position of the the second sequence that ends a gene
                    String gene= startGene.substring(0, endGene2); // the gene
                    System.out.println(gene);
                }
                else if (startGene.contains(endGenome3)){ //JA: Of these three, you have to find the closest to the start
                    int endGene3=startGene.indexOf(endGenome3); // the position of the third sequence that ends a gene
                    String gene= startGene.substring(0, endGene3); // the gene
                    System.out.println(gene);
                }
                else{
                    System.out.print("The gene "+ incompleGene+" is not complete.");
                }
                break;
            }
        }
    }
}
    
