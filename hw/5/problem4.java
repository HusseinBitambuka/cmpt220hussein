import java.util.*;
public class problem4{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter total seconds: ");
        long seconds=input.nextLong();// the number of seconds to be converted
        System.out.println("The hours, minutes, and seconds for total seconds is "+
       seconds+" "+ format(seconds));
    }
    public static String format (long seconds){
        long hour= seconds/(3600);// conversion from seconds to hours
        long remainder= seconds% 3600;// the remaining seconds after everything is turned into hours
        long minutes= remainder/60;// conversion from second to minutes
        long remainingSeconds=remainder%60;// the remainig second after turning everything into hours and minutes
        String value1=String.format("%02d", hour);
        String value2=String.format("%02d", minutes);
        String value3=String.format("%02d", remainingSeconds);
        String value= value1+": "+value2+": "+value3;
        return value;
    }
}