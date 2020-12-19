package com.syntax.javaclass22;

public class UserInfo extends UserClass{
    String userAddress;
    UserInfo(String name, String mobile, String userAddress) {
        super(name, mobile);
        this.userAddress = userAddress;
    }
    void userDetails() {
        System.out.println("User name is " + super.name + " has a phone number " + super.mobileNumber + " and lives in " + userAddress);
    }
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Liya", "38237173913", "Brooklyn, NY");
        userInfo.userDetails();
    }
}

