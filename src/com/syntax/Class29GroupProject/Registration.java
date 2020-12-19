package com.syntax.Class29GroupProject;

public class Registration {
    /*Create Registration Class in which you would have variables as email, userName and password that have an access
    scope only within its own class. After creating an object of the class user should be able to call methods and
    in each method separately pass values to set users email, username and password.

    Requirements : A. Valid email consider to be only yahoo B. Valid userName and password cannot be empty and should
    be of length larger than 6 characters. Also valid password cannot contain userName.
     */
    protected String email;

    protected String UserName;

    protected String password;

}

class User extends Registration {
    public User(String email, String Username, String password) {
        this.email = email;
        this.UserName = Username;
        this.password = password;
    }


    void validateDomain(String email) {
        this.email=email;
        if (email.contains("yahoo.com")) {

        } else {
            System.out.println("Invalid domain");
        }

    }
    void validateUsername(String Username) {
        int length=Username.length();
        this.UserName=Username;
        if(length==0){
            System.out.println("invalid Username");
        }else{
        }
    }

    void validatePassword(String password) {
        int length=password.length();
        this.password=password;
        if(length<6|| length==0 && password.toLowerCase().contains(UserName.toLowerCase())){
            System.out.println("invalid password");
        }else{
        }
    }

}
class Main2{
    public static void main(String[] args) {
        User user = new User("techsquad@gmail.com","", "DEEz1234" );

        user.validateDomain(user.email);
        user.validateUsername(user.UserName);
        user.validatePassword(user.password);

    }


}