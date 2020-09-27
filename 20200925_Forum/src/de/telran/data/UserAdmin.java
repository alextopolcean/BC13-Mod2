package de.telran.data;

public class UserAdmin extends User {
    private  String passwort;

    public UserAdmin(String userName, int age, String passwort) {
        super(userName, age);
        this.passwort = passwort;
    }
    public String getPasswort(){
        return passwort;
    }
}
