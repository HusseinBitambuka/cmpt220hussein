import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Collection;
public class Problem3{
    public static void main(String [] args){
        ArrayList<Flight> flights=new ArrayList<>();
        flights.add(new Flight("US230",
         new GregorianCalendar(2014,4,5,5,5,0)
         ,new GregorianCalendar(2014,4,5,6,15,0)));
         flights.add(new Flight("US235",
         new GregorianCalendar(2014,4,5,6,55,0)
         ,new GregorianCalendar(2014,4,5,7,45,0)));
         flights.add(new Flight("US237",
         new GregorianCalendar(2014,4,5,9,35,0)
         ,new GregorianCalendar(2014,4,5,12,55,0)));
         Itinerary itinerary=new Itinerary(flights);
         System.out.println(itinerary.getTotalTime());
         System.out.println(itinerary.getTotatFlighttime());   
    }
}

class Flight{
    private String flighNo; // number of flight
    private GregorianCalendar departureTime=new GregorianCalendar();
    private GregorianCalendar arrivalTime=new GregorianCalendar();
    Flight(String flighNo, GregorianCalendar departureTime,GregorianCalendar arrivalTime){
        this.flighNo=flighNo;
        setDepartureTime(departureTime);
        setArrivalTime(arrivalTime);
    }
    String getFlighNo(){
        return flighNo;
    }
    GregorianCalendar getDepartureTime(){
        return departureTime;
    }
    void setDepartureTime(GregorianCalendar departureTime){
        this.departureTime=departureTime;
    }
    GregorianCalendar getArrivalTime(){
        return arrivalTime;
    }
    void setArrivalTime(GregorianCalendar arrivalTime){
        this.arrivalTime=arrivalTime;
    }
    long getFlightTime(){
        //converting milliseconds to minutes
        long time=(arrivalTime.getTimeInMillis()-departureTime.getTimeInMillis())/(1000*60);
        return time;
    }
}
class Itinerary{
    private ArrayList<Flight> flights=new ArrayList<>();
    Itinerary(ArrayList<Flight> flights){
        this.flights=flights;
    }
long getTotalTime(){
    // converting milliseconds to minutes
    long time=(flights.get(0).getDepartureTime().getTimeInMillis()-flights.get(flights.size()-1).getArrivalTime().getTimeInMillis())/(1000*60);
    return time;
}
long getTotatFlighttime(){
    // adding all the time spent flying
    long outer=0;
    for(int i=0; i<flights.size();i++){
        outer+=flights.get(i).getFlightTime();
    }
    return outer;
}

}