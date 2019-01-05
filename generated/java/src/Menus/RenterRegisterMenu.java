package Menus;

import Turo.Lister;
import Turo.Renter;
import Turo.quotes.CREDITQuote;
import Turo.quotes.DEBITQuote;
import Turo.quotes.PAYPALQuote;

import java.util.Scanner;

public class RenterRegisterMenu
{
    public void menu()
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Username:");
        String username = reader.next();

        System.out.print("Password:");
        String password = reader.next();

        System.out.print("Email:");
        String email = reader.next();

        System.out.print("Name:");
        String name = reader.next();

        System.out.print("Insurance Score:");
        int score = reader.nextInt();

        System.out.print("Drivers Licence ID:");
        int dID = reader.nextInt();

        System.out.print("Passport ID:");
        int pID = reader.nextInt();

        System.out.println("Payment Type:");
        System.out.println("\t1 - Credit:");
        System.out.println("\t2 - Debit:");
        System.out.println("\t3 - Paypal:");

        int op = reader.nextInt();

        Object payment = null;

        while (op < 1 || op > 3)
        {
            System.out.println("Invalid Option");

            System.out.println("Payment Type:");
            System.out.println("\t1 - Credit:");
            System.out.println("\t2 - Debit:");
            System.out.println("\t3 - Paypal:");
            op = reader.nextInt();
        }

        switch (op)
        {
            case 1: payment = new CREDITQuote();break;
            case 2: payment = new DEBITQuote();break;
            case 3: payment = new PAYPALQuote();break;
        }

        Renter renter = new Renter(username,password,email,name,score,dID,pID,
                payment);
        MainMenu.system.registerRenter(renter);

        System.out.println("Registered Successfully");
        System.out.flush();
        return;
    }
}
