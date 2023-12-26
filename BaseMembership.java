/**
 A base membership account which can get name and type of a membership and know which service he/she can get.
 */
public abstract class BaseMembership {
    String name;
    String type;
    /**
     A default constructor
     */
    public BaseMembership(){
    }
    /**
     Construct a base membership
     @param name initialize the name of membership
     @param type initialize the type of membership
     */
    public BaseMembership(String name, String type){
    this.name = name;
    this.type = type;
    }
    /**
     Gets the name of memberships.
     @return the name
     */
    public String getName(){
        return name;
    }
    /**
     Gets the type of memberships.
     @return the type
     */
    public String getType(){
        return type;
    }

    public abstract boolean isValid();
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

