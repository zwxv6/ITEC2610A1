/**
 A membership account which can get name and visits of a membership and know which service he/she can get.
 */
public class Membership {
    private String name;
    private int visits = 0;
    private boolean valid;
    boolean isSucceeds;
    boolean isSucceeds1;
    /**
     Construct a base membership
     @param name initialize the name of membership
     @param visits initialize the visits of membership
     */
    public Membership(String name, int visits){
        this.name = name;
        this.visits = visits;
    }
    /**
     Sets the name of the membership.
     @param name the name of membership
     */
    public void setName(String name){
        this.name =name;
    }
    /**
     Gets the name of the membership.
     @return the name
     */
    public String getName(){
        return name;
    }
    /**
     Gets the remaining visits of the membership.
     @return the visits
     */
    public int getRemainingVisits(){
        return visits;
    }
    /**
     Gets the validity of membership.
     @return the boolean value valid
     */
    public boolean isValid(){
        if(visits>0){
            valid = true;
        }else{
            valid = false;
        }
        return valid;
    }
    /**
     Add number of visits to membership.
     @param additionalVisits the number of visits to add
     */
    /**
     Get the entered number if is succeed.
     @return the boolean value
     */
    public boolean topUp (int additionalVisits) {
        if (additionalVisits >= 0) {
            visits = visits + additionalVisits;
            isSucceeds = true;
        } else {
            isSucceeds = false;
        }
        System.out.println(isSucceeds);
        return isSucceeds;
    }
    /**
     Gets if deducting 1 visit of membership is succeeded.
     @return the boolean value
     */
    public boolean charge(){
        if(valid == true){
            visits = visits - 1;
            isSucceeds1 = true;
        }else{
            isSucceeds1 = false;
        }
        System.out.println(isSucceeds1);
        return isSucceeds1;
    }
    /**
     Gets if membership can use equipment.
     @return the boolean value
     */
    public boolean equipmentAllowed(){
        return true;
    }
    /**
     Gets if membership can use fitness classes.
     @return the boolean value
     */
    public boolean classesAllowed(){
        return true;
    }

}
