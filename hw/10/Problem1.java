import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Problem1{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter time1(hoour minute second )");
        int hour=input.nextInt();
        int minutes=input.nextInt();
        int seconds=input.nextInt();

        Time test=new Time();
        Time time1=new Time(hour,minutes, seconds);
        System.out.println(time1.toString());
        System.out.println("Elapsed seconds in time1: "+time1.getSecond());
        System.out.println("Enter time2(elapsed time): ");
        long seconds1=input.nextLong();
        Time time2=new Time(seconds1);
        System.out.println(time2.toString());
        System.out.println("Elapsed seconds in time2: "+time2.getSecond());
        time1.compareTo(time2);
        Time time3=(Time)time1.clone();
        time1.compareTo(time3);

    }
}
class Time extends Date{
    private long time=System.currentTimeMillis()/1000l;
    Time(){
        super();
    }
    Time(int hour, int minutes,int seconds){
        super(0,0,0,hour,minutes,seconds);
    }
    Time(long elapsedTime){
        super(elapsedTime);
    }
    public int getSecond(){
        return (int) time;
    }
    @Override
    public String toString(){
        return this.getHours()+" Hours "+this.getMinutes()+" minutes "+this.getSeconds()+" Seconds";
    }
}