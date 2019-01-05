package Menus;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

import Turo.Turo;

public class MainMenu {

	//unloged options
	private static final String SEARCH = "\t1 - Search For Trip";
	private static final String LOGIN_LISTER = "\t2 - Login As A Lister";
	private static final String LOGIN_RENTER = "\t3 - Login As Renter";
	private static final String REGISTER_LISTER = "\t4 - Register As Lister";
	private static final String REGISTER_RENTER = "\t5 - Register As Renter";
	private static final String EXIT = "\t6- Exit";

	//lister options
	private static final String ADD_LISTING = "\t2 - Add Listing";
	private static final String NOTIFICATIONS = "\t3 - View Notifications";
	private static final String REQUESTS = "\t4 - View Booking Requests";

	//renter options
	private static final String VIEW_REQUESTS = "\t2 - View Requested Books";
	private static final String BOOKINGS = "\t3 - View Bookings";
	
	public static Turo system = new Turo();

	private static void print_menu()
	{
		System.out.println("Main Menu:");
		System.out.println(SEARCH);
		if(Turo.userType.intValue() == 0)
		{
			System.out.println(LOGIN_LISTER);
			System.out.println(LOGIN_RENTER);
			System.out.println(REGISTER_LISTER);
			System.out.println(REGISTER_RENTER);
		}
		else if(Turo.userType.intValue() == 1)
		{
			System.out.println(ADD_LISTING);
			System.out.println(NOTIFICATIONS);
			System.out.println(REQUESTS);
		}
		else if(Turo.userType.intValue() == 2)
		{
			System.out.println(VIEW_REQUESTS);
			System.out.println(BOOKINGS);
		}
		System.out.println(EXIT);
	}

	public static void main(String[] args) throws IOException, InterruptedException
	{
		int op = 0;

		while(op != 6)
		{
			print_menu();

			System.out.print("Option:");
			Scanner reader = new Scanner(System.in);
			op = reader.nextInt();

			while (op > 6 || op < 1)
			{
				System.out.println("Invalid Option\n");

				print_menu();
				System.out.print("Option:");
				op = reader.nextInt();
			}

			switch (op)
			{
				case 1:
				{
					TripSearch menu = new TripSearch();
					menu.menu();
					break;
				}
				case 2:
				{
					if(Turo.userType.intValue() == 0)
					{
						LoginAsLister menu = new LoginAsLister();
						menu.menu();
					}
					else if(Turo.userType.intValue() == 1)
					{
						//ADD LISTING MENU
					}
					else if(Turo.userType.intValue() == 2)
					{
						//VIEW REQUEST MENU
					}
					break;
				}
				case 3:
				{
					if(Turo.userType.intValue() == 0)
					{
						LoginAsRenterMenu menu = new LoginAsRenterMenu();
						menu.menu();
					}
					else if(Turo.userType.intValue() == 1)
					{
						//NOTIFICATIONS
					}
					else if(Turo.userType.intValue() == 2)
					{
						//BOOKINGS
					}
					break;
				}
				case 4:
				{
					if(Turo.userType.intValue() == 0)
					{
						ListerRegisterMenu menu = new ListerRegisterMenu();
						menu.menu();
					}
					else if(Turo.userType.intValue() == 1)
					{
						//REQUESTS
					}
					else if(Turo.userType.intValue() == 2)
					{
						//Invalid Option
						System.out.println("Invalid Option\n");
					}
					break;
				}
				case 5:
				{
					if(Turo.userType.intValue() == 0)
					{
						RenterRegisterMenu menu = new RenterRegisterMenu();
						menu.menu();
					}
					else if(Turo.userType.intValue() == 1)
					{
						//Invalid Option
						System.out.println("Invalid Option\n");
					}
					else if(Turo.userType.intValue() == 2)
					{
						//Invalid Option
						System.out.println("Invalid Option\n");
					}
					break;
				}
			}
		}
	}

}
