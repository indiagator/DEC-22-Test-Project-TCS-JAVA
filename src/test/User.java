package test;

import java.util.Objects;

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
        email=null;
        phonenumber=null;
    }

    //Constructor Overloading
    User(String username, String fullname)
    {
        this.username = username;
        this.fullname = fullname;
        email=null;
        phonenumber=null;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!username.equals(user.username)) return false;
        if (!Objects.equals(phonenumber, user.phonenumber)) return false;
        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        int result = username.hashCode();
        result = 31 * result + (phonenumber != null ? phonenumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
