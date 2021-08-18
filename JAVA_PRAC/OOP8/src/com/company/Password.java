package com.company;

public class Password {
    private static final char key=1;
    private final int  encryptedPassword;

    public Password(String password){
        this.encryptedPassword=encryptDecrypt(password);
    }

    private int  encryptDecrypt(String password){
        return Integer.parseInt(password)+key;
    }

    public void storePassword(){
        System.out.println("Saving password "+this.encryptedPassword);
    }

    public boolean letMeIn(String  password){
        if(this.encryptedPassword==encryptDecrypt(password)){
            System.out.println("You are welcome");
            return true;
        }
        else{
            System.out.println("Sorry password wrong :(");
            return false;
        }
    }
}
