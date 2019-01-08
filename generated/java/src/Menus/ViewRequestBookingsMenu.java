package Menus;

import Turo.BookingRequest;
import Turo.Renter;
import Turo.Turo;
import Turo.Date;
import Turo.DateFactory;
import org.overture.codegen.runtime.VDMSet;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewRequestBookingsMenu
{

    private Renter renter = null;

    public ViewRequestBookingsMenu(Renter renter)
    {
        renter = renter;
    }

    public void menu()
    {
        VDMSet requests = this.renter.getRequests();

        ArrayList<BookingRequest> bks = new ArrayList<>();

        for(Object request:requests)
        {
            if(((BookingRequest)request).isActive())
            {
                BookingRequest req = (BookingRequest)request;
                System.out.print((bks.size() + 1) + ":");
                System.out.println(req.getRenter().getUsername() + " " +
                        "Requested" +
                        " to rent "+ req.getListing().getCar().getName() + " " +
                        "from "+ req.getStartDate() + " to "+req.getEndDate());
                bks.add((BookingRequest) request);
            }
        }

        if(bks.size()==0)return;

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
            case 0:return;
            default:
            {
                int selected = op -1;
                System.out.println(bks.get(selected));
                System.out.println("0 - Go Back");
                System.out.println("1 - Cancel");

                System.out.print("Option:");
                op = reader.nextInt();

                while(op < 0 || op > 1)
                {
                    System.out.println("Invalid Option");
                    System.out.println("0 - Go Back");
                    System.out.println("1 - Cancel");

                    System.out.print("Option:");
                    op = reader.nextInt();
                }

                switch (op)
                {
                    case 0:return;
                    case 1:
                    {
                        System.out.print("Current Date (dd/MM/yyyy):");
                        String date = reader.next();

                        String[] comps = date.split("/");

                        Date dt =
                                DateFactory.create_date(Integer.parseInt(comps[0]),Integer.parseInt(comps[1]),Integer.parseInt(comps[2]));
                        bks.get(selected).cancel((Renter)Turo.currUser,dt);
                        System.out.println("Booking Request Cancelled");
                    }
                }
            }
        }
    }

}
