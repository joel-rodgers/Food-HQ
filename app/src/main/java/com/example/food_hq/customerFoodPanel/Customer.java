package com.example.food_hq.customerFoodPanel;

public class Customer {

    private String Constituency,ConfirmPassword,EmailID,FirstName,LastName,Mobileno,Password,LocalAddress,Area;

    public Customer() {


    }

    public Customer(String constituency, String confirmPassword, String emailID, String firstName,String lastName, String mobileno, String password, String area, String localAddress) {
        this.Constituency = constituency;
        ConfirmPassword=confirmPassword;
        EmailID = emailID;
        FirstName=firstName;
        LastName=lastName;
        Mobileno = mobileno;
        Password = password;
        Area = area;
        LocalAddress=localAddress;
    }

    public String getConstituency() {
        return Constituency;
    }

    public void setConstituency(String constituency) {
        Constituency = constituency;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMobileno() {
        return Mobileno;
    }

    public void setMobileno(String mobileno) {
        Mobileno = mobileno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLocalAddress() {
        return LocalAddress;
    }

    public void setLocalAddress(String localAddress) {
        LocalAddress = localAddress;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }
}
