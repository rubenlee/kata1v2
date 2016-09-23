package katav3;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Katav3 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1949,9,24);
        
        person daboi = new person("daboi",date);
        System.out.println(daboi.getName() + " tiene " + daboi.getAge() + " años!");
        
    }
}
