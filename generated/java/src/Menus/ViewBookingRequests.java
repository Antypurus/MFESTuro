package Menus;

import Turo.BookingRequest;
import Turo.Lister;
import Turo.User;
import org.overture.codegen.runtime.VDMSet;

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

        for(Object request:requests)
        {
            System.out.println(((BookingRequest)request));
        }
    }
}
