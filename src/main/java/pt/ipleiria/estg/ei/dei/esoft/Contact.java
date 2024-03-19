package pt.ipleiria.estg.ei.dei.esoft;

import java.util.Date;

public class Contact {
    private String firstName;
    private String lastName;
    private Date birthday;
    private String phone;
    private String email;

    //CONSTRUCTORS
    public Contact(String firstName, String phone){
        this.firstName = firstName;
        this.phone = phone;
    }
    public Contact(String firstName, String lastName, String phone){
        this(firstName, phone);
        this.lastName = lastName;
    }
    public Contact(String firstName, String lastName, String phone, String email){
        this(firstName, lastName, phone);
        this.email = email;
    }
    public Contact(String firstName, String lastName, String phone, String email, Date birthday){
        this(firstName, lastName, phone, email);
        this.birthday = birthday;
    }

    //GETTERS
    public Date getBirthday() {
        return birthday;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhone() {
        return phone;
    }

    //SETTERS
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
