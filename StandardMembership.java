/**
 A standard membership account which can get name, type and visits of a membership and know which service he/she can get.
 */
public class StandardMembership extends BaseMembership{

    boolean valid;
    private int visits = 0;
    private final String type = "Standard";
    boolean isSucceeds;
    boolean isSucceeds1;
    /**
     A default constructor
     */
    public StandardMembership(){
    }
    /**
     Construct a base membership
     @param name initialize the name of membership
     @param visits initialize the visits of membership
     */
    public StandardMembership(String name, int visits){
        this.name = name;
        this.visits = visits;
    }
    /**
     Gets the type of memberships.
     @return the type
     */
    public String getType(){
        return type;
    }
    /**
     Gets the remaining visits of memberships.
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
     Gets if the deducting 1 visit of membership is succeeded.
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

}
