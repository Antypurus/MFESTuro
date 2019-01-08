package Menus;

import Turo.*;
import org.overture.codegen.runtime.VDMSet;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewBookingsMenu
{
    private Renter renter = null;

    public ViewBookingsMenu(User renter)
    {
        this.renter = (Renter)renter;
    }

    public void menu()
    {
        VDMSet bookings = this.renter.getBookings();

        ArrayList<Booking> bks = new ArrayList<>();

        for(Object booking:bookings)
        {
            Booking bk = (Booking) booking;
            System.out.println((bks.size()+1)+":");
            System.out.println("Booked "+bk.getListing().getCar().getName() + " from "+bk.getStartDate()+ " to "+bk.getEndDate());
            bks.add((Booking)booking);
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

        if(op == 0)
        {
            return;
        }

        int selected = op -1;
        System.out.println("0 - Go Back");
        System.out.println("1 - Cancel");

        op = reader.nextInt();

        while(op < 0 || op > 1)
        {
            System.out.println("Invalid Option");
            op = reader.nextInt();
        }

        switch (op)
        {
            case 0: return;
            case 1:
            {
                System.out.print("Current Date (dd/MM/yyyy):");
                String date = reader.next();

                String[] comps = date.split("/");

                Date dt =
                        DateFactory.create_date(Integer.parseInt(comps[0]),Integer.parseInt(comps[1]),Integer.parseInt(comps[2]));
                bks.get(selected).cancel(Turo.currUser,dt);
                System.out.println("Booking Canceled");
                return;
            }
        }
    }
}
