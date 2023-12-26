import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 A premium membership account which can get name, type and valid period of a membership and know which service he/she can get.
 */
public class PremiumMembership extends BaseMembership{
    private final String type = "Premium";
    private String startDateString;
    long MILLIS_YEAR = 360 * 24 * 60 * 60 * 1000L;
    Date date1 = new Date();
    long gap;
    long start;
    private boolean valid;
    /**
     Construct a base membership
     @param name initialize the name of membership
     @param startDateString initialize the start date of membership
     */
    public PremiumMembership(String name,  String startDateString){
        this.name = name;
        this.startDateString = startDateString;
    }

    /**
     Gets the type of memberships.
     @return the type
     */
    public String getType(){
        return type;
    }
    /**
     Enter start date of membership to transform start date string to a Date type.
     @param startDateString the start date of membership
     */
   /**
    Gets the transformed type of start Date
    @return the date
    */
    public static Date stringToDate(String startDateString) {
        DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date= f.parse(startDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    /**
     Gets if membership is expired.
     @return the boolean value valid
     */
    public boolean isValid(){
        start = stringToDate(startDateString).getTime();
        gap = date1.getTime() - start;
        if(gap > MILLIS_YEAR){
            valid = false;
        }else{
            valid = true;
        }
        return valid;
    }
    /**
     Gets if membership can use fitness classes.
     @return the boolean value
     */
    public boolean classesAllowed(){
        return false;
    }
    /**
     Gets if membership can use pool.
     @return the boolean value
     */
    public boolean poolAllowed(){
        return true;
    }


}
