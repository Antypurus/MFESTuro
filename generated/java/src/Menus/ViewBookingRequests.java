package Menus;

import Turo.BookingRequest;
import Turo.Lister;
import Turo.Turo;
import Turo.User;
import Turo.Date;
import Turo.DateFactory;
import org.overture.codegen.runtime.VDMSet;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBookingRequests
{
    private Lister lister = null;

    public ViewBookingRequests(User user)
    {
        lister = (Lister)user;
    }

    public void menu()
    {
        VDMSet requests = this.lister.getRequests();

        ArrayList<BookingRequest> bks = new ArrayList<>();

        for(Object request:requests)
        {
            System.out.print((bks.size()+1)+":");
            System.out.println(((BookingRequest)request));
            bks.add((BookingRequest) request);
        }

        if(Turo.userType.intValue() != 2)return;

        System.out.println("Select 0 To Go Back");
        System.out.print("Option:");

        Scanner reader = new Scanner(System.in);
        int op = reader.nextInt();

        while(op < 0 || op > bks.size())
        {
            System.out.println("Invalid Option");
            op = reader.nextInt();
        }

        switch (op)
        {
            case 0: return;
            default:
            {
                int selected = op -1;
                System.out.println(bks.get(selected));
                System.out.println("0 - Go Back");
                System.out.println("1 - Accept");
                System.out.println("2 - Decline");

                System.out.print("Option:");
                op = reader.nextInt();

                while(op < 0 || op > 2)
                {
                    System.out.println("Invalid Option");
                    System.out.println("0 - Go Back");
                    System.out.println("1 - Accept");
                    System.out.println("2 - Decline");

                    System.out.print("Option:");
                    op = reader.nextInt();
                }

                switch (op)
                {
                    case 0:
                    {
                        return;
                    }
                    case 1:
                    {
                        System.out.print("Current Date (dd/MM/yyyy):");
                        String date = reader.next();

                        String[] comps = date.split("/");

                        Date dt =
                                DateFactory.create_date(Integer.parseInt(comps[0]),Integer.parseInt(comps[1]),Integer.parseInt(comps[2]));
                        bks.get(selected).confirm(Turo.currUser,dt);
                        break;
                    }
                    case 2:
                    {
                        System.out.print("Current Date (dd/MM/yyyy):");
                        String date = reader.next();

                        String[] comps = date.split("/");

                        Date dt =
                                DateFactory.create_date(Integer.parseInt(comps[0]),Integer.parseInt(comps[1]),Integer.parseInt(comps[2]));
                        bks.get(selected).decline(Turo.currUser,dt);
                        break;
                    }
                }
            }
        }

    }
}
