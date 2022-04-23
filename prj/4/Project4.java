import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Project4{
    public static void main(String []args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enther the year" );
        // the year we are searching the name in
        String year=input.next();
        System.out.println("Enther the gender" );
        // the gender of the person we are trying to find
        String gender=input.next();
        System.out.println("Enther the name" );
        // the name of the person to be searched
        String name=input.next();
        // the inital name of each file
        String nameOfFiles="babynameranking";
        //the extension of each file
        String extension=".txt";
        // the file name we are trying to search in
        String fileName=nameOfFiles+year+extension;
        // the array list that will contain the names
        ArrayList<BabyName> names= new ArrayList<>();
        try{
            // check first if the file exist, and if it does, create an array list of the names
            names=loadNames(fileName);
            // use the array list of the name created, the name to be found, and the gender of the person to be searched to find the rank
            BabyName result=findName(name,gender,names);
            if(result==null){
                // if the person is found, print their name and their rank
                System.out.println("The name "+ name+" is not ranked in year "+year);
            }
            else{
                // if they are not found, tell that info
                System.out.println(name+" is ranked #"+result.getRank()+" in year "+ year);
            }
        }
            catch(FileNotFoundException ex){
                // if the file does not exist, throw an error
                System.out.println("the file does not exist ");
            }

    
    }
    private static  ArrayList<BabyName> loadNames(String fileName)throws FileNotFoundException{
        //this method gets the arraylist of the objects of type babynames and add them by following the order of males then females
         ArrayList<BabyName> outer=new ArrayList<>();
         // initializing the arraylist to be returned
        File file=new File(fileName);
        // check if the file exist
        if (file.exists()){
            // if the file exist, proceed to add names in the arraylist
            Scanner input=new Scanner(file);
            while(input.hasNext()){
                // as the data are separeted by the space character in one line,
                // declare the rank, then the Name of the male, then the number of males with the name, then the name of the female, and the number of females with the name
                String rank=input.next();
                String nameMale= input.next();
                String numberOfMales=input.next();
                String nameFemale=input.next();
                String numberOfFemales=input.next();
                // create a male object and add the male data, and then do the same for the female 
                BabyName male=new BabyName(rank,nameMale,numberOfMales);
                BabyName female=new BabyName(rank,nameFemale,numberOfFemales);
                // add the male object in the arraylist
                outer.add(male);
                // add the female object in the arraylist
                outer.add(female);
        }
        }
        else{
            // if the file does not exist, throw the FileNotFoundException
            throw new FileNotFoundException();
    }
    return outer;
    }
    private static BabyName findName(String name, String gender,ArrayList<BabyName> names){
        //this function returns an object if its name matches the name searched
        //check the gender of the person first
        if(gender.equals("M")){
            //if it is a male, check in the class of numbers that has a reminder of zero once divided by two 
            for(int i=0;i<names.size();i++){
                if(i%2==0){
                    if(name.equals(names.get(i).getName())){
                        return names.get(i);
                    }
                }
            }    
        }
        else{
            // if it is a female, then check in the other class of numbers that have a reminder that is different from zero
            for(int i=0;i<names.size();i++){
                if(i%2!=0){
                    if(name.equals(names.get(i).getName())){
                        return names.get(i);
                    }
                }
            }     
        }
        // if the name is not found in both search, return null
        return null;
    }
    
}

class BabyName{
    private String rank;// the rank that the name occupies
    private String name; // the name
    private String numberOfChildren; // the number of people with that name
    BabyName(String rank,String name, String numberOfChildren){
        // this is the args constructor
        this.rank=rank; 
        this.name=name;
        this.numberOfChildren=numberOfChildren;
    }
    String getRank(){
        // the getter method for the rank
        return rank;
    }
    String getName(){
        // the getter method for the name
        return name;
    }
    String getNumberOfChildren(){
        // the getter method for the number of children
        return numberOfChildren;
    }
}