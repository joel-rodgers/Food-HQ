package com.example.food_hq.restaurantFoodPanel;

public class Restaurant {

    private String Area,Constituency, ConfirmPassword,EmailID,Vname,Mobile,Password,Postcode;

    public Restaurant(String area, String constituency, String confirmPassword, String emailID, String vname, String mobile, String password, String postcode) {
        this.Area = area;
        this.Constituency = constituency;
        this.ConfirmPassword = confirmPassword;
        this.EmailID = emailID;
        this.Vname = vname;
        this.Mobile = mobile;
        this.Password = password;
        this.Postcode = postcode;

    }

    public Restaurant() {
    }

    public String getArea() {
        return Area;
    }

    public String getConstituency() {
        return Constituency;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getEmailID() {
        return EmailID;
    }

    public String getVname() {
        return Vname;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPassword() {
        return Password;
    }

    public String getPostcode() {
        return Postcode;
    }
}
