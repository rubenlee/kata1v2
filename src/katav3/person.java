package katav3;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class person {
   private final String name;
   private final Calendar birth;
   private static final long MILISECONDS_PER_YEAR = (long) (1000*60*60*24 * 365.25);

    public person(String name, Calendar birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        Calendar today;
        today = GregorianCalendar.getInstance();
        
        return (int) (milliSecondsToYear(today.getTimeInMillis() - birth.getTimeInMillis()));
    }

    private long milliSecondsToYear (long milles){
        return milles/ MILISECONDS_PER_YEAR;
    }
   
   
}
