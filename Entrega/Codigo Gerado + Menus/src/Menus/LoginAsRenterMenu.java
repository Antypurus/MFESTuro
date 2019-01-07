package Menus;

import java.util.Scanner;

public class LoginAsRenterMenu
{

    public void menu()
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Username:");
        String username = reader.next();

        System.out.print("Password:");
        String password = reader.next();

        boolean res = MainMenu.system.renterLogin(username,password);

        if(res)
        {
            System.out.println("Login Successful");
        }else
        {
            System.out.println("Login Failed");
        }
    }

}
