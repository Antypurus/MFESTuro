package Menus;

import Turo.*;
import org.overture.codegen.runtime.VDMSet;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TripSearch
{
    public void menu()
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Country:");
        String country = reader.next();

        System.out.print("City:");
        String city = reader.next();

        System.out.print("Start Date(dd/MM/yyyy):");
        String start_date = reader.next();

        String[] comps = start_date.split("/");
        if(comps.length!=3)
        {
            System.out.println("Wrong Date Format");
        }


        System.out.print("End Date(dd/MM/yyyy):");
        String end_date = reader.next();

        String[] comps2 = end_date.split("/");
        if(comps2.length!=3)
        {
            System.out.println("Wrong Date Format");
        }

        Date sd = DateFactory.create_date(Integer.parseInt(comps[0]),
                Integer.parseInt(comps[1]),Integer.parseInt(comps[2]));

        Date ed = DateFactory.create_date(Integer.parseInt(comps2[0]),
                Integer.parseInt(comps2[1]),Integer.parseInt(comps2[2]));

        Location loc = new Location(country,city);

        VDMSet listings  = MainMenu.system.SearchListing(loc,sd,ed);

        ArrayList<Listing> lsts = new ArrayList<>();

        if(listings.size()==0)
        {
            System.out.println("No Results Found");
        }else {
            for(Object listing:listings)
            {
                System.out.print((lsts.size()+1)+":");
                System.out.println(listing);
                lsts.add((Listing)listing);
            }

            if(Turo.userType.intValue() == 0)
            {
                return;
            }

            System.out.println("Select 0 To Go Back");
            System.out.print("Option:");

            Scanner scanner = new Scanner(System.in);
            int op = scanner.nextInt();

            while(op < 0 || op > lsts.size())
            {
                System.out.println("Invalid Option");
                System.out.print("Option:");
                op = reader.nextInt();
            }

            if(op == 0) return;

            Listing selected = lsts.get(op-1);

            VDMSet extraSet = selected.getExtras();
            System.out.println("Extras:");

            ArrayList<Extra> extras = new ArrayList<>();

            for(Object extra:extraSet)
            {
                System.out.print((extras.size()+1)+":");
                System.out.println(extraSet);
                extras.add((Extra)extra);
            }

            System.out.println("Select 0 To Finish Extra Selection");
            System.out.print("Option:");

            op = scanner.nextInt();

            HashSet<Integer>indexes = new HashSet<>();

            while (op != 0)
            {
                while(op < 0 || op> extras.size())
                {
                    System.out.println("Invalid Option");
                    System.out.print("Option:");
                    op = scanner.nextInt();
                }

                indexes.add(op-1);

                System.out.print("Option:");
                op = scanner.nextInt();
            }

            VDMSet selectedExtras = new VDMSet();
            for(Integer integer:indexes)
            {
                selectedExtras.add(extras.get(integer));
            }

            System.out.print("Current Date (dd/MM/yyyy):");
            String date = reader.next();

            String[] comps3 = date.split("/");

            Date dt =
                    DateFactory.create_date(Integer.parseInt(comps3[0]),
                            Integer.parseInt(comps3[1]),
                            Integer.parseInt(comps3[2]));

            selected.requestBooking((Renter) Turo.currUser,dt,sd,ed,
                    selectedExtras);

            System.out.println("Booking Request Sent");
            return;
        }
    }
}
