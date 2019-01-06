package Menus;

import Turo.Booking;
import Turo.Renter;
import Turo.User;
import org.overture.codegen.runtime.VDMSet;

import java.util.HashSet;

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

        for(Object booking:bookings)
        {
            System.out.println(((Booking)booking));
        }
    }
}
