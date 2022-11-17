


public class User
{
    //Data Members | Fields | Instance Variables
    private String username;
    private String fullname;
    private String phonenumber;
    private String email;
    private String address;
    private Location location;

    public static String usertype; // class static variable

    private User(String username)
    {
        this.username = username;
        // some initial code before you start using this object
    }

    //Constructor Overloading
    User(String username, String fullname)
    {
        this.username = username;
        this.fullname = fullname;
    }

    //Methods
    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

     void orderFood()
    {

    }

    public void makePayment()
    {
        usertype = "simple";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static String getUsertype() {
        return usertype;
    }
}
