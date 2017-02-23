package com.emergenseek.michael.emergenseek;

/**
 * Created by ANDREW on 2/18/2017.
 */

public class SignInParse {


    private String username;
    private String password;
    public boolean success;
    public SignInParse(String username,String password){
        this.username = username;
        this.password = password;
        this.success = validation();

    }

    private boolean validation() {
        if ((this.username.length() < 15 && this.username.length() >6) && (this.password.length() >6)){
            return true;
        }else{
            return false;
        }
    }
}
