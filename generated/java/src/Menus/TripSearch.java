package Menus;

import Turo.Date;
import Turo.DateFactory;
import Turo.Listing;
import Turo.Location;
import org.overture.codegen.runtime.VDMSet;
import sun.applet.Main;

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

        if(listings.size()==0)
        {
            System.out.println("No Results Found");
        }else {
            for(Object listing:listings)
            {
                System.out.println(listing);
            }
        }
    }
}
