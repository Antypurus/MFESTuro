package Menus;

import Turo.*;
import Turo.quotes.*;
import org.overture.codegen.runtime.VDMSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CreateListingMenu
{

    private Lister lister = null;

    public CreateListingMenu(Lister lister)
    {
        this.lister = lister;
    }

    public void menu()
    {
        System.out.println("Car Type:");
        System.out.println("\t1 - Regular Car");
        System.out.println("\t2 - Truck");
        System.out.println("\t3 - SUV");
        System.out.println("\t4 - MiniVan");
        System.out.println("\t5 - Van");

        Scanner reader = new Scanner(System.in);
        System.out.print("Option:");
        int op = reader.nextInt();

        while(op < 1 || op > 5)
        {
            System.out.println("Invalid Option");
            System.out.print("Option:");
            op = reader.nextInt();
        }

        int car_type = op;

        System.out.print("Car Name:");
        String car_name = reader.next();

        System.out.print("Miles Per Galon:");
        double mpg = reader.nextDouble();

        System.out.print("Number Of Trips:");
        int t_c = reader.nextInt();

        System.out.print("Manufacture Year:");
        int m_year = reader.nextInt();

        System.out.print("Car Color:");
        String color = reader.next();

        System.out.println("Fuel Type:");
        System.out.println("\t1 - Diesel");
        System.out.println("\t2 - Gasoline");
        System.out.println("\t3 - Electric");
        System.out.print("Option:");
        op = reader.nextInt();

        while(op < 1 || op > 3)
        {
            System.out.println("Invalid Option");
            System.out.print("Option:");
            op = reader.nextInt();
        }

        Object f_type = null;
        switch (op)
        {
            case 1:
            {
                f_type = new DIESELQuote();
                break;
            }
            case 2:
            {
                f_type = new GASOLINEQuote();
                break;
            }
            case 3:
            {
                f_type = new ELECTRICQuote();
                break;
            }
        }

        System.out.print("Manufacturer:");
        String man = reader.next();

        Manufacturer manufacturer = new Manufacturer(man);

        ArrayList<Feature> features = new ArrayList<>();

        features.add(new BikeRack());
        features.add(new Bluetooth());
        features.add(new Convertible());
        features.add(new FourByFour());
        features.add(new GPS());
        features.add(new HeatedSeats());
        features.add(new PetFriendly());
        features.add(new SkiRack());
        features.add(new SnowTires());
        features.add(new Sunroof());
        features.add(new USB());

        for(int i = 0;i< features.size();++i)
        {
            System.out.print((i+1)+":");
            System.out.println(features.get(i));
        }
        System.out.println("Enter 0 To Stop Adding Features");
        System.out.print("Select Feature:");

        HashSet<Integer>integers = new HashSet<>();

        op = reader.nextInt();
        while(op != 0)
        {
            integers.add(op-1);
            System.out.print("Select Feature:");
            op = reader.nextInt();
        }

        VDMSet featuresSelected = new VDMSet();
        for(Integer integer:integers)
        {
            featuresSelected.add(features.get(integer));
        }

        Car car = null;
        switch (car_type)
        {
            case 1: car = new RegularCar(car_name,mpg,t_c,m_year,color,f_type
                    ,manufacturer,featuresSelected);break;
            case 2: car = new Truck(car_name,mpg,t_c,m_year,color,f_type
                    ,manufacturer,featuresSelected);break;
            case 3: car = new SUV(car_name,mpg,t_c,m_year,color,f_type
                    ,manufacturer,featuresSelected);break;
            case 4: car = new MiniVan(car_name,mpg,t_c,m_year,color,f_type
                    ,manufacturer,featuresSelected);break;
            case 5: car = new Van(car_name,mpg,t_c,m_year,color,f_type
                    ,manufacturer,featuresSelected);break;
        }

        System.out.print("Listing Country:");
        String country = reader.next();

        System.out.print("Listing City:");
        String city = reader.next();

        Location location = new Location(country,city);

        System.out.println("Choose Delivery Type:");
        System.out.println("\t1 - Airport");
        System.out.println("\t2 - Custom Location");
        System.out.println("\t3 - Owner House");
        System.out.print("Option:");

        op = reader.nextInt();

        while(op < 0 || op > 3)
        {
            System.out.println("Invalid Option");
            System.out.print("Option:");
            op = reader.nextInt();
        }

        VDMSet opt = new VDMSet();
        switch (op)
        {
            case 1:opt.add(new AIRPORTQuote());break;
            case 2:opt.add(new CUSTOM_LOCATIONQuote());break;
            case 3:opt.add(new OWNER_HOUSEQuote());break;
        }
        DeliveryOptions opts = new DeliveryOptions();
        opts = opts.develiveryOptions(opt);

        System.out.println("Choose Protection Plan:");
        System.out.println("\t1 - Comercial");
        System.out.println("\t2 - Basic");
        System.out.println("\t3 - Standard");
        System.out.println("\t4 - Premium");
        System.out.print("Option:");

        op = reader.nextInt();

        while(op < 0 || op > 3)
        {
            System.out.println("Invalid Option");
            System.out.print("Option:");
            op = reader.nextInt();
        }

        ProtectionPlan plan = null;
        switch (op)
        {
            case 1: plan = new ComercialPlan();break;
            case 2: plan = new Basic();break;
            case 3: plan = new Standard();break;
            case 4: plan = new Premium();break;
        }

        System.out.print("Guidelines:");
        String guidelines = reader.next();

        System.out.print("FAQs:");
        String faqs = reader.next();

        System.out.print("Parking Details:");
        String pk = reader.next();

        System.out.println("Enter 0 To Stop Entering Dates:");

        AvailabilityCalendar calendar = new AvailabilityCalendar();

        VDMSet dates = new VDMSet();
        String date ="";
        while (!date.equals("0"))
        {
            System.out.print("Available Date (dd/MM/yyyy):");
            date = reader.next();
            if(!date.equals("0"))
            {
            String[] comps = date.split("/");
            dates.add(DateFactory.create_date(Integer.parseInt(comps[0]),
                    Integer.parseInt(comps[1]),Integer.parseInt(comps[2])));
            }
        }
        calendar.addDates(dates);

        System.out.println("Enter 0 To Stop Entering Extras:");

        VDMSet extras = new VDMSet();
        String name = "";
        while(!name.equals("0"))
        {
            System.out.print("Extra Name:");
            name = reader.next();

            if(!name.equals("0"))
            {

            System.out.print("Extra Description:");
            String desc = reader.next();

            System.out.print("Extra Cost:");
            double cost = reader.nextDouble();

            extras.add(new Extra(name,desc,cost));
            }
        }

        Listing listing = new Listing(location,opts,plan,guidelines,pk,faqs,
                car,calendar,false,(Lister)Turo.currUser,extras);

        MainMenu.system.registerListing(listing);
        return;
    }

}
