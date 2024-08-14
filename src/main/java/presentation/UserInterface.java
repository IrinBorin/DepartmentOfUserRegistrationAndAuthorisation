package presentation;

import java.io.InputStream;
import java.util.Scanner;

public class UserInterface implements IUser {

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    Scanner scanner;

    public void greetUser(){
        System.out.println("Welcome to our website.");
    }

    public Button choose(){
        System.out.println("Type 1, if you want to register. Type 2, if you want to login.");
        int number = scanner.nextInt();
        if (number == 1){
            return Button.REGISTER;
        }
        else {
            return Button.LOGIN;
        }
        //more if conditions are needed
    }
    public String askLogin(){
        System.out.println("Enter your login.");
        return scanner.nextLine();

    }
    public String askPassword(){
        System.out.println("Enter your password.");
        return scanner.nextLine();
    }
    //method successful
    //method something went wrong or is it an exception?


}
